from . import operator

nequal = operator.Operator('!=', dict(), '__neq__')

operator.operator_dict['!='] = nequal
