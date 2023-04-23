from . import operator

division = operator.Operator('/', dict(), '__truediv__')

operator.operator_dict['/'] = division