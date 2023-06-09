from .. import types_structures, utils, variable_manager
from typing import List

class Operator:
    def __init__(self, name, function_map, default_operator=None, default_types=None):
        self.name: str = name # name of the operator, e.g. '+' for addition
        self.function_map: dict = function_map # map of argument types to functions
        self.default_operator: str | None = default_operator # name of the default operator method, e.g. __add__ for +
        self.default_types: List[str] | None = default_types # list of types that the default operator supports
    
    def add_function(self, func, arg_types, symmetric=False):
        arg_types = tuple(arg_types) # turned into tuple to be hashable
        if func is None:
            # set function to default operator
            func = lambda *args: args[0].__getattribute__(self.default_operator)(*args[1:])
        self.function_map[arg_types] = func
        if symmetric:
            self.function_map[arg_types[::-1]] = func
        return func
    

    def __repr__(self):
        return self.name

    def __call__(self, arg_vals, arg_types):
        if arg_types is None:
            arg_types = tuple(utils.determine_type(arg) for arg in arg_vals) # turned into tuple to be hashable
        else:
            arg_types = tuple(arg_type if arg_type is not None else utils.determine_type(arg) for arg_type, arg in zip(arg_types, arg_vals))

        if arg_types not in self.function_map:
            # all arguments are of the same type supported by the default operator
            if self.default_operator is not None and len(set(arg_types)) == 1 and (self.default_types is None or arg_types[0] in self.default_types): 
                try:
                    result = arg_vals[0].__getattribute__(self.default_operator)(*arg_vals[1:])
                    if arg_types[0] == 'INT':
                        result = int(result)
                    return result
                except:
                    raise Exception(f"Operator {self.name} does not support arguments of types {arg_types}") from None
            else:
                raise Exception(f"Operator {self.name} does not support arguments of types {arg_types}")
        
        return self.function_map[arg_types](*arg_vals)

operator_dict = dict()

def apply_operator(name, arg_vals, arg_types=None):
    return operator_dict[name](arg_vals, arg_types)