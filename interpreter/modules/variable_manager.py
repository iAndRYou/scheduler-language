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
    
    # def cast_value(self, type_, value):
    #     if type_ == 'INT':
    #         if not type(value) == int:
    #             value = int(value)
    #     elif type_ == 'BOOL':
    #         if not type(value) == bool:
    #             value = bool(value)
    #     elif type_ == 'STRING':
    #         if not type(value) == str:
    #             value = str(value)
    #     elif type_ == 'DATE':
    #         if not type(value) == date:
    #             value = date(value)
    #     elif type_ == 'TIME': 
    #         if not type(value) == time:
    #             value = time(value)
    #     elif type_ == 'VOID':
    #         value = None
    #     elif (type_ == 'CLASS' and type(value) == Class_) or (type_ == 'DAY' and type(value) == Day) or (type_ == 'WEEK' and type(value) == Week):
    #         pass
    #     elif 'COLLECTION OF' in type_ and type(value) == list:
    #         undertype = type_.replace('COLLECTION OF', '').strip()
    #         for i, elem in enumerate(value):
    #             value[i] = self.cast_value(undertype, elem)
    #     else:
    #         raise Exception(f"Wrong type of variable: {type_}")

    #     return value

    def cast_value(self, type_to, value, type_from=None):
        if type_from is None:
            type_from = determine_type(value)
        if type_to == 'INT':
            if type_from == 'INT':
                pass
            elif type_from == 'BOOL':
                if value:
                    value = 1
                else:
                    value = 0
            elif type_from == 'STRING':
                try:
                    value = int(value)
                except:
                    raise Exception(f"Cannot cast STRING with value \'{value}\' to INT") from None
            else:
                raise Exception(f"Cannot cast {type_from} to {type_to}")
        elif type_to == 'BOOL':
            if type_from == 'INT':
                if value == 0:
                    value = False
                else:
                    value = True
            elif type_from == 'BOOL':
                pass
            elif type_from == 'STRING':
                if value == 'True':
                    value = True
                elif value == 'False':
                    value = False
                else:
                    raise Exception(f"Cannot cast STRING with value \'{value}\' to BOOL")
            else:
                raise Exception(f"Cannot cast {type_from} to {type_to}")
        elif type_to == 'STRING':
            if type_from == 'INT':
                value = str(value)
            elif type_from == 'BOOL':
                value = str(value)
            elif type_from == 'STRING':
                pass
            elif type_from == 'DATE' or type_from == 'TIME':
                value = value.__str__()
            else:
                raise Exception(f"Cannot cast {type_from} to {type_to}")
        elif type_to == 'DATE':
            if type_from == 'DATE':
                pass
            elif type_from == 'STRING':
                value = parse_date(value)
            else:
                raise Exception(f"Cannot cast {type_from} to {type_to}")
        elif type_to == 'TIME':
            if type_from == 'TIME':
                pass
            elif type_from == 'STRING':
                value = parse_time(value)
            else:
                raise Exception(f"Cannot cast {type_from} to {type_to}")
        elif type_to == 'VOID':
            value = None
        elif type_from == type_to:
            pass
        elif 'COLLECTION OF' in type_to and type(value) == list:
            undertype = type_to.replace('COLLECTION OF', '').strip()
            for i, elem in enumerate(value):
                value[i] = self.cast_value(undertype, elem)
        else:
            raise Exception(f"Unknown type of variable: {type_to}")
        return value


    def def_variable(self, type, name, value, declare=False):
        if declare:
            if name in self.vartypes:
                raise Exception(f"Variable \'{name}\' already declared")
            self.vartypes[name] = type
            return
        value = self.cast_value(type, value)
        self.variables[name] = value
        self.vartypes[name] = type
    
    def def_collection(self, type, name, value, declare=False):
        if declare:
            if name in self.vartypes:
                raise Exception(f"Variable \'{name}\' already declared")
            self.vartypes[name] = type
            return
        value = [self.cast_value(type, elem) for elem in value]
        self.variables[name] = value
        self.vartypes[name] = "COLLECTION OF " + type
    
    def def_function(self, type, name, code_node, args, declare=False):
        arg_types = tuple(arg[0] for arg in args)
        key = (name, arg_types)
        if declare:
            if key in self.functypes:
                raise Exception(f"Function \'{name}\' with signature {arg_types} already declared")
            self.functypes[key] = type
            self.funcargs[key] = args
            return
        self.functypes[key] = type
        self.funcnodes[key] = code_node
        self.funcargs[key] = args
            
    
    def def_class(self, name, attrs, declare=False):
        if declare:
            if name in self.vartypes:
                raise Exception(f"Variable \'{name}\' already declared")
            self.vartypes[name] = 'CLASS'
            return
        attrs = {key: self.cast_value(ATTRIBUTES[key], value) for key, value in attrs.items() if key in ATTRIBUTES}
        new_class = Class_(**attrs)
        self.variables[name] = new_class
        self.vartypes[name] = 'CLASS'
    
    def def_day(self, name, classes, declare=False):
        if declare:
            if name in self.vartypes:
                raise Exception(f"Variable \'{name}\' already declared")
            self.vartypes[name] = 'DAY'
            return
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
            raise Exception(f'Invalid variable attribute: \'{attribute}\'')
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
        self.decl_vm = VariableManager()

        # methods where current variable manager needs to be extracted
        cur_vm_methods = (self.def_variable, self.def_collection, self.def_function, self.def_class, self.def_day)
        # methods with the need to extract the specific variable manager where the variable was defined
        variable_vm_methods = (self.assign_variable, self.assign_attribute, self.del_variable)
        function_vm_methods = ()

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
        if name in self.variables:
            return self
        if name in self.decl_vm.vartypes:
            return self.decl_vm
        raise Exception(f'Variable \'{name}\' was not declared in any scope')

    def find_function_vm(self, key):
        if key in self.tmp_vm.functypes:
            return self.tmp_vm
        for vm in self.vms[::-1]:
            if key in vm.functypes:
                return vm
        if key in self.functypes:
            return self
        if key in self.decl_vm.functypes:
            return self.decl_vm
        raise Exception(f'Function \'{key[0]}\' with signature {key[1]} was not declared in any scope')


    def access_variable(self, name):
        vm = self.find_variable_vm(name)
        return (vm.vartypes[name], vm.variables[name])
    
    def access_function(self, name, arg_types):
        key = (name, tuple(arg_types))
        vm = self.find_function_vm(key)
        return (vm.functypes[key], vm.funcnodes[key], vm.funcargs[key])


    @staticmethod
    def get_cur_vm(method):
        def new_method(*args, tmp_vm=False, declare=False, **kwargs):
            self = method.__self__
            if declare:
                vm = self.decl_vm
            elif tmp_vm:
                vm = self.tmp_vm
            else:
                vm = self.cur_vm()
            if isinstance(vm, GlobalVariableManager):
                super_method = getattr(super(GlobalVariableManager, vm), method.__name__)
            else:
                super_method = getattr(vm, method.__name__)
            return super_method(*args, declare=declare, **kwargs)
        return new_method

    @staticmethod
    def get_variable_vm(method):
        def new_method(*args, **kwargs):
            self = method.__self__
            var_name = args[0] # first pos argument
            vm = self.find_variable_vm(var_name)
            if isinstance(vm, GlobalVariableManager):
                super_method = getattr(super(GlobalVariableManager, vm), method.__name__)
            else:
                super_method = getattr(vm, method.__name__)
            return super_method(*args, **kwargs)
        return new_method

    @staticmethod
    def get_function_vm(method):
        def new_method(*args, **kwargs):
            self = method.__self__
            var_name = args[0] # first pos argument
            vm = self.find_function_vm(var_name)
            if isinstance(vm, GlobalVariableManager):
                super_method = getattr(super(GlobalVariableManager, vm), method.__name__)
            else:
                super_method = getattr(vm, method.__name__)
            return super_method(*args, **kwargs)
        return new_method
    
