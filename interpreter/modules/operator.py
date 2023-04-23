class Operator:
    def __init__(self, name, function_map, arity):
        self.name: str = name
        self.function_map: dict = function_map
        self.arity: int = arity
    
    def add_function(self, arg_types, symmetric=False):
        def decorator(func):
            self.function_map[arg_types] = func
            if symmetric:
                self.function_map[arg_types[::-1]] = func
            return func
        return decorator


    def __repr__(self):
        return self.name

    def __call__(self, args: dict):
        if len(args) != self.arity:
            raise Exception(f"Wrong number of arguments for operator {self.name}: {len(args)} instead of {self.arity}")
        for arg_type, arg_value in args:

        return self.function(*args)
    
operators = dict()


operators['+'] = Operator('+', lambda x, y: x + y, 2)