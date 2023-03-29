from dataclasses import dataclass, field
from datetime import time, date
from typing import List, Dict, Tuple
from copy import deepcopy

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


class VariableManager:
    vartypes: Dict[str, str] = dict()
    variables = dict()

    def _def_variable(self, type, name, value):
        self.variables[name] = value
        self.vartypes[name] = type
    
    def _def_class(self, name, attrs):
        attrs = {key: value for key, value in attrs.items() if key in ('start', 'end', 'subject', 'teacher')}
        attrs['start'] = parse_time(attrs['start'])
        attrs['end'] = parse_time(attrs['end'])
        new_class = Class_(**attrs)
        self.def_variable('CLASS', name, new_class)
    
    def _assign_variable(self, name, value):
        self.variables[name] = value
    
    def _del_variable(self, name):
        del self.variables[name]
        del self.vartypes[name]

class GlobalVariableManager(VariableManager):
    vms: List[VariableManager] = []

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
    
    def del_variable(self, name):
        self.cur_vm()._del_variable(name)
