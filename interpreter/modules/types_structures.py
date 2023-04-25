from dataclasses import dataclass, field
from datetime import time, date, timedelta, datetime
from typing import List, Dict, Tuple, Any
from copy import deepcopy

TYPES = set(['INT', 'BOOL', 'STRING', 'DATE', 'TIME'])
STRUCTURES = set(['CLASS', 'DAY'])
ATTRIBUTES = {'start': 'TIME', 'end': 'TIME', 'subject': 'STRING', 'teacher': 'STRING', 'classes': 'COLLECTION OF CLASS'}

class DataClass:
    pass

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
    def __repr__(self):
        return f"{self.hour:02}:{self.minute:02}"
    def __str__(self) -> str:
        return f"{self.hour:02}:{self.minute:02}"


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
    def __repr__(self):
        return f"{self.day}/{self.month}/{self.year}"
    def __str__(self):
        return f"{self.day}/{self.month}/{self.year}"
        

@dataclass
class Class_:
    start: time = field(default_factory=lambda: time(0, 0))
    end: time = field(default_factory=lambda: time(0, 0))
    subject: str = field(default_factory=lambda: "")
    teacher: str = field(default_factory=lambda: "")

    def __repr__(self):
        return f"{self.start} - {self.end}" + (f", {self.subject}" if self.subject else "") + (f", {self.teacher}" if self.teacher else "")
    def __matmul__(self, other): # overlap operator
        if self.start >= other.end:
            return False
        elif self.end <= other.start:
            return False
        else:
            return True

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
            print(f"Exception: Classes '{class_.subject}' and '{self.classes[ind+1].subject}' overlap")
            exit()
            # raise Exception("Classes overlap")
        else:
            self.classes.insert(ind+1, deepcopy(class_))
    
    def __add__(self, other):
        new_day = deepcopy(self)
        for class_ in other.classes:
            if class_ in self.classes:
                continue
            new_day.add_class(class_)
        return new_day

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
        return [elem for day in self.days.values() for elem in day.classes]

    def print(self):
        for date_ in sorted(self.days):
            print("DATE:", date_)
            for class_ in self.days[date_].classes:
                print(class_)
            print()