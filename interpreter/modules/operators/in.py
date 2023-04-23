from . import operator

in_op = operator.Operator('IN', dict())
in_op.add_function(lambda x, y: x in y, ('', 'any'))

operator.operator_dict['IN'] = in_op