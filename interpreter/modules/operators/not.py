from . import operator

not_op = operator.Operator('NOT', dict())
not_op.add_function(lambda x: not x, ['BOOL'])

operator.operator_dict['NOT'] = not_op