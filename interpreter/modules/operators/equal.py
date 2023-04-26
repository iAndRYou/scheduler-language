from . import operator

equal = operator.Operator('==', dict(), '__eq__')

operator.operator_dict['=='] = equal