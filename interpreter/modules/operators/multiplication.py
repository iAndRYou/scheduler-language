from . import operator

multiplication = operator.Operator('*', dict(), '__mul__')

operator.operator_dict['*'] = multiplication