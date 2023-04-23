from . import operator

and_op = operator.Operator('AND', dict(), '__and__', default_types=['BOOL'])

operator.operator_dict['AND'] = and_op
