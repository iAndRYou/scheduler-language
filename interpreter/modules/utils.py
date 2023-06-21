from dataclasses import dataclass, field
from typing import List, Dict, Tuple, Any
from copy import deepcopy
from . import types_structures


def determine_type(value):
    if type(value) == int:
        val_type = 'INT'
    elif type(value) == bool:
        val_type = 'BOOL'
    elif type(value) == str:
        val_type = 'STRING'
    elif type(value) == types_structures.date:
        val_type = 'DATE'
    elif type(value) == types_structures.time:
        val_type = 'TIME'
    elif type(value) == types_structures.Class_:
        val_type = 'CLASS'
    elif type(value) == types_structures.Day:
        val_type = 'DAY'
    elif type(value) == list:
        if len(value) == 0:
            val_type = 'COLLECTION OF VOID'
        else:
            val_type = 'COLLECTION OF ' + determine_type(value[0])
    elif value is None:
        val_type = 'VOID'
    else:
        raise Exception(f"Unknown type {type(value)}")
    return val_type


def parse_date(date_str):
    return types_structures.date(*list(map(int, date_str.split('/')))[::-1])

def parse_time(time_str):
    return types_structures.time(*map(int, time_str.split(':')))

def decorate_all_methods(decorator):
    def decorate(cls):
        for attr in cls.__dict__: # there's propably a better way to do this
            if callable(getattr(cls, attr)):
                setattr(cls, attr, decorator(getattr(cls, attr)))
        return cls
    return decorate

def get_cur_vm(method):
    def new_method(*args, **kwargs):
        pass


def canvas_to_json(canvas: types_structures.Canvas):
    j = {}
    for date_, day in canvas.days.items():
        date_json = date_.__str__()
        day_json = []
        for class_ in day.classes:
            class_json = {'start': class_.start.__str__(),
                          'end': class_.end.__str__(),
                          'subject': class_.subject,
                          'teacher': class_.teacher}
            day_json.append(class_json)
        j[date_json] = day_json
    return j

def json_to_canvas(j):
    canvas = types_structures.Canvas()
    for date_, day in j.items():
        classes = []
        for class_ in day:
            c = types_structures.Class_()
            c.start = types_structures.time(*list(map(int, class_['start'].split(':'))))
            c.end = types_structures.time(*list(map(int, class_['end'].split(':'))))
            c.subject = class_['subject']
            c.teacher = class_['teacher']
            classes.append(c)
        canvas.days[types_structures.date(*list(map(int, date_.split('/')))[::-1])] = types_structures.Day(classes=classes)
    return canvas