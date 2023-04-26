from . import operator

overlap = operator.Operator('@', dict(), '__matmul__')

operator.operator_dict['@'] = overlap
