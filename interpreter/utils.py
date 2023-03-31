from dataclasses import dataclass, field
from datetime import time, date, timedelta, datetime
from typing import List, Dict, Tuple, Any
from copy import deepcopy

TYPES = set(['INT', 'BOOL', 'STRING', 'DATE', 'TIME'])
ATTRIBUTES = {'start': 'TIME', 'end': 'TIME', 'subject': 'STRING', 'teacher': 'STRING'}

def parse_date(date_str):
    return date(*list(map(int, date_str.split('/')))[::-1])

def parse_time(time_str):
    return time(*map(int, time_str.split(':')))

# override default date and time classes
class time(time):
    def __add__(self, other):
        if isinstance(other, int):
            d = datetime(year=2023, month=1, day=1, minute=self.minute, hour=self.hour) + timedelta(minutes=other)
            return time(d.hour, d.minute)
        else:
            raise NotImplementedError
    def __radd__(self, other):
        return self.__add__(other)
    def __sub__(self, other):
        return self.__add__(-other)

class date(date):
    def __add__(self, other):
        if isinstance(other, int):
            return super().__add__(timedelta(days=other))
        else:
            raise NotImplementedError
    def __radd__(self, other):
        return self.__add__(other)
    def __sub__(self, other):
        return self.__add__(-other)
        

@dataclass
class Class_:
    start: time = None
    end: time = None
    subject: str = None
    teacher: str = None

    def __repr__(self):
        return f"{self.start} - {self.end}, {self.subject}, {self.teacher}"

@dataclass
class Day:
    classes: List[Class_] = field(default_factory=list)

    def add_class(self, class_): # keeps classes chronological
        # binary search on classes
        def bs(a, b, e):
            if b == a+1:
                return a
            m = (a+b)//2
            if self.classes[m].end <= e and (m == len(self.classes) - 1 or self.classes[m+1].end > e):
                return m
            elif self.classes[m].end < e:
                return bs(m, b, e)
            else:
                return bs(a, m, e)
        ind = bs(-1, len(self.classes), class_.start)
        if ind < len(self.classes)-1 and self.classes[ind+1].start < class_.end:
            raise Exception()
        else:
            self.classes.insert(ind+1, class_)

@dataclass
class Week:
    days: List[Day] = field(default_factory=list)


@dataclass
class Canvas:
    days: Dict[date, Day] = field(default_factory=dict)
    start_date: date = None
    end_date: date = None

    def add_day(self, day, date_):
        self.days[date_] = deepcopy(day)
    
    def add_class(self, class_, date_):
        if date_ not in self.days:
            self.days[date_] = Day()
        self.days[date_].add_class(class_)


    def get_all_classes(self):
        return [elem for day in self.days for elem in day.classes]

    def print(self):
        for date_ in sorted(self.days):
            print("DAY:", date_)
            for class_ in self.days[date_].classes:
                print(class_)
            print()

# types: int, bool, string, date, time
# structures: class, day, week

@dataclass
class VariableManager:
    vartypes: Dict[str, str] = field(default_factory=dict)
    variables: Dict[str, Any | None] = field(default_factory=dict)

    functypes: Dict[str, str] = field(default_factory=dict)
    funcnodes: Dict[str, Any] = field(default_factory=dict)
    funcargs: Dict[str, List[Tuple[str, str]]] = field(default_factory=dict)

    def parse_value(self, type, value):
        if type == 'INT':
            value = int(value)
        elif type == 'BOOL':
            value = True if value == 'True' else False
        elif type == 'STRING':
            value = value[1:-1]
        elif type == 'DATE':
            value = parse_date(value)
        elif type == 'TIME':
            value = parse_time(value)
        elif type == 'VOID':
            value = None
        else:
            raise Exception(f"Wrong type of variable: {type}")

        return value
    
    def cast_value(self, type_, value):
        if type_ == 'INT':
            if not type(value) == int:
                value = int(value)
        elif type_ == 'BOOL':
            if not type(value) == bool:
                value = bool(value)
        elif type_ == 'STRING':
            if not type(value) == str:
                value = str(value)
        elif type_ == 'DATE':
            if not type(value) == date:
                value = date(value)
        elif type_ == 'TIME': 
            if not type(value) == time:
                value = time(value)
        elif type_ == 'VOID':
            value = None
        elif (type_ == 'CLASS' and type(value) == Class_) or (type_ == 'DAY' and type(value) == Day) or (type_ == 'WEEK' and type(value) == Week):
            pass
        else:
            raise Exception(f"Wrong type of variable: {type_}")

        return value


    def _def_variable(self, type, name, value):
        value = self.cast_value(type, value)
        self.variables[name] = value
        self.vartypes[name] = type
    
    def _def_collection(self, type, name, value):
        value = [self.cast_value(type, elem) for elem in value]
        self.variables[name] = value
        self.vartypes[name] = "COLLECTION OF " + type
    
    def _def_function(self, type, name, code_node, args):
        self.functypes[name] = type
        self.funcnodes[name] = code_node
        self.funcargs[name] = args
            
    
    def _def_class(self, name, attrs):
        attrs = {key: self.cast_value(ATTRIBUTES[key], value) for key, value in attrs.items() if key in ATTRIBUTES}
        new_class = Class_(**attrs)
        self.variables[name] = new_class
        self.vartypes[name] = 'CLASS'
    
    def _def_day(self, name, classes):
        new_day = Day()
        for class_ in classes:
            new_day.add_class(class_)
        self.variables[name] = new_day
        self.vartypes[name] = 'DAY'
    
    def _assign_variable(self, name, value):
        type = self.vartypes[name]
        value = self.cast_value(type, value)
        self.variables[name] = value
    
    def _assign_attribute(self, name, attribute, value):
        if attribute not in ATTRIBUTES:
            raise Exception(f'Invalid variable attribute: {attribute}')
        value = self.cast_value(ATTRIBUTES[attribute], value)
        self.variables[name].__setattr__(attribute, value)
    
    def _del_variable(self, name):
        del self.variables[name]
        del self.vartypes[name]

@dataclass
class GlobalVariableManager(VariableManager):
    vms: List[VariableManager] = field(default_factory=list)

    def find_variable_vm(self, name):
        for vm in self.vms[::-1]:
            if name in vm.variables:
                return vm
        return self

    def find_function_vm(self, name):
        for vm in self.vms[::-1]:
            if name in vm.functypes:
                return vm
        return self


    def access_variable(self, name):
        vm = self.find_variable_vm(name)
        return (vm.vartypes[name], vm.variables[name])
    
    def access_function(self, name):
        vm = self.find_function_vm(name)
        return (vm.functypes[name], vm.funcnodes[name], vm.funcargs[name])

    
    def cur_vm(self):
        if len(self.vms) != 0:
            return self.vms[-1]
        else:
            return self
    
    def def_variable(self, type, name, value):
        self.cur_vm()._def_variable(type, name, value)

    def def_collection(self, type, name, value):
        self.cur_vm()._def_collection(type, name, value)
    
    def def_function(self, type, name, code_node, args):
        self.cur_vm()._def_function(type, name, code_node, args)

    def def_class(self, name, attrs):
        self.cur_vm()._def_class(name, attrs)

    def def_day(self, name, classes):
        self.cur_vm()._def_day(name, classes)
    
    def assign_variable(self, name, value):
        self.find_variable_vm(name)._assign_variable(name, value)
    
    def assign_attribute(self, name, attribute, value):
        self.find_variable_vm(name)._assign_attribute(name, attribute, value)
    
    def del_variable(self, name):
        self.cur_vm()._del_variable(name)