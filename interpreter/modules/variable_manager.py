from dataclasses import dataclass, field
from typing import List, Dict, Tuple, Any
from copy import deepcopy
from .utils import *
from .types_structures import *

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
        elif 'COLLECTION OF' in type_ and type(value) == list:
            undertype = type_.replace('COLLECTION OF', '').strip()
            for i, elem in enumerate(value):
                value[i] = self.cast_value(undertype, elem)
        else:
            raise Exception(f"Wrong type of variable: {type_}")

        return value


    def def_variable(self, type, name, value):
        value = self.cast_value(type, value)
        self.variables[name] = value
        self.vartypes[name] = type
    
    def def_collection(self, type, name, value):
        value = [self.cast_value(type, elem) for elem in value]
        self.variables[name] = value
        self.vartypes[name] = "COLLECTION OF " + type
    
    def def_function(self, type, name, code_node, args):
        self.functypes[name] = type
        self.funcnodes[name] = code_node
        self.funcargs[name] = args
            
    
    def def_class(self, name, attrs):
        attrs = {key: self.cast_value(ATTRIBUTES[key], value) for key, value in attrs.items() if key in ATTRIBUTES}
        new_class = Class_(**attrs)
        self.variables[name] = new_class
        self.vartypes[name] = 'CLASS'
    
    def def_day(self, name, classes):
        new_day = Day()
        for class_ in classes:
            new_day.add_class(class_)
        self.variables[name] = new_day
        self.vartypes[name] = 'DAY'
    
    def assign_variable(self, name, value):
        type = self.vartypes[name]
        value = self.cast_value(type, value)
        self.variables[name] = value
    
    def assign_attribute(self, name, attribute, value):
        if attribute not in ATTRIBUTES:
            raise Exception(f'Invalid variable attribute: {attribute}')
        value = self.cast_value(ATTRIBUTES[attribute], value)
        self.variables[name].__setattr__(attribute, value)
    
    def del_variable(self, name):
        del self.variables[name]
        del self.vartypes[name]

@dataclass
class GlobalVariableManager(VariableManager):
    # vms: List[VariableManager] = field(default_factory=list)
    # tmp_vm: VariableManager = field(default_factory=VariableManager) # variable manager for temporary overhead variables

    def __init__(self):
        super().__init__()
        self.vms: List[VariableManager] = []
        self.tmp_vm: VariableManager = VariableManager()

        # methods where current variable manager needs to be extracted
        cur_vm_methods = (self.def_variable, self.def_collection, self.def_function, self.def_class, self.def_day)
        # methods with the need to extract the specific variable manager where the variable was defined
        variable_vm_methods = (self.assign_variable, self.assign_attribute, self.del_variable)
        function_vm_methods = tuple()

        for method in cur_vm_methods:
            self.__setattr__(method.__name__, GlobalVariableManager.get_cur_vm(method))
        for method in variable_vm_methods:
            self.__setattr__(method.__name__, GlobalVariableManager.get_variable_vm(method))
        for method in function_vm_methods:
            self.__setattr__(method.__name__, GlobalVariableManager.get_function_vm(method))

    def cur_vm(self):
        if len(self.vms) != 0:
            return self.vms[-1]
        else:
            return self

    def find_variable_vm(self, name):
        if name in self.tmp_vm.variables:
            return self.tmp_vm
        for vm in self.vms[::-1]:
            if name in vm.variables:
                return vm
        return self

    def find_function_vm(self, name):
        if name in self.tmp_vm.functypes:
            return self.tmp_vm
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


    @staticmethod
    def get_cur_vm(method):
        def new_method(*args, **kwargs):
            self = method.__self__
            if 'tmp_vm' in kwargs and kwargs['tmp_vm']:
                vm = self.tmp_vm
            else:
                vm = self.cur_vm()
            if isinstance(vm, GlobalVariableManager):
                super_method = getattr(super(GlobalVariableManager, vm), method.__name__)
            else:
                super_method = vm.__getattribute__(method.__name__)
            if 'tmp_vm' in kwargs:
                del kwargs['tmp_vm']
            return super_method(*args, **kwargs)
        return new_method

    @staticmethod
    def get_variable_vm(method):
        def new_method(*args, **kwargs):
            self = method.__self__
            vm = self.find_variable_vm(args[0])
            if isinstance(vm, GlobalVariableManager):
                super_method = getattr(super(GlobalVariableManager, vm), method.__name__)
            else:
                super_method = vm.__getattribute__(method.__name__)
            return super_method(*args, **kwargs)
        return new_method

    @staticmethod
    def get_function_vm(method):
        def new_method(*args, **kwargs):
            self = method.__self__
            vm = self.find_function_vm(args[0])
            if isinstance(vm, GlobalVariableManager):
                super_method = getattr(super(GlobalVariableManager, vm), method.__name__)
            else:
                super_method = vm.__getattribute__(method.__name__)
            return super_method(*args, **kwargs)
        return new_method
    
