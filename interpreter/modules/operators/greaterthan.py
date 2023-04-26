from . import operator

greaterthan = operator.Operator('>', dict(), '__gt__')

operator.operator_dict['>'] = greaterthan
