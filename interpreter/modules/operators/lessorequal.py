from . import operator

lessorequal = operator.Operator('<=', dict(), '__le__')

operator.operator_dict['<='] = lessorequal
