from . import operator

or_op = operator.Operator('OR', dict(), '__or__', default_types=['BOOL'])

operator.operator_dict['OR'] = or_op