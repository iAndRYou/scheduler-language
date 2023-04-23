from . import operator

multiplication = operator.Operator('*', dict(), '__mult__')

operator.operator_dict['*'] = multiplication