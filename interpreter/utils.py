from dataclasses import dataclass, field
from datetime import time, date
from typing import List, Dict, Tuple, Any
from copy import deepcopy

TYPES = ('INT', 'BOOL', 'STRING', 'DATE', 'TIME')
ATTRIBUTES = ('start', 'end', 'subject', 'teacher')


def parse_date(date_str):
    return date(*list(map(int, date_str.split('/')))[::-1])

def parse_time(time_str):
    return time(*map(int, time_str.split(':')))

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
        else:
            raise Exception(f"Wrong type of variable: {type}")

        return value
    
    def cast_value(self, type, value):
        if type == 'INT':
            value = int(value)
        elif type == 'BOOL':
            value = bool(value)
        elif type == 'STRING':
            value = str(value)
        elif type == 'DATE':
            value = date(value)
        elif type == 'TIME':
            value = time(value)
        else:
            raise Exception(f"Wrong type of variable: {type}")

        return value


    def _def_variable(self, type, name, value):
        self.variables[name] = value
        self.vartypes[name] = type
    
    def _def_class(self, name, attrs):
        attrs = {key: value for key, value in attrs.items() if key in ATTRIBUTES}
        attrs['start'] = parse_time(attrs['start'])
        attrs['end'] = parse_time(attrs['end'])
        new_class = Class_(**attrs)
        self._def_variable('CLASS', name, new_class)
    
    def _assign_variable(self, name, value):
        self.variables[name] = value
    
    def _assign_attribute(self, name, attribute, value):
        if attribute not in ATTRIBUTES:
            raise Exception()
        self.variables[name].__setattr__(attribute, value)
    
    def _del_variable(self, name):
        del self.variables[name]
        del self.vartypes[name]

@dataclass
class GlobalVariableManager(VariableManager):
    vms: List[VariableManager] = field(default_factory=list)

    def access_variable(self, name):
        for vm in self.vms[::-1]:
            if name in vm.variables:
                return (vm.vartypes[name], vm.variables[name])
        return (self.vartypes[name], self.variables[name])
    
    def cur_vm(self):
        if len(self.vms) != 0:
            return self.vms[-1]
        else:
            return self
    
    def def_variable(self, type, name, value):
        self.cur_vm()._def_variable(type, name, value)
    
    def def_class(self, name, attrs):
        self.cur_vm()._def_class(name, attrs)
    
    def assign_variable(self, name, value):
        self.cur_vm()._assign_variable(name, value)
    
    def assign_attribute(self, name, attribute, value):
        self.cur_vm()._assign_attribute(name, attribute, value)
    
    def del_variable(self, name):
        self.cur_vm()._del_variable(name)
