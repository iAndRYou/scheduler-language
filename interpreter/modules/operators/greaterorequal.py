from . import operator

greaterorequal = operator.Operator('>=', dict(), '__ge__')

operator.operator_dict['>='] = greaterorequal
