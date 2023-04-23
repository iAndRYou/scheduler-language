from . import operator

addition = operator.Operator('+', dict(), '__add__')

addition.add_function(None, ('DATE', 'INT'), symmetric=True)
addition.add_function(None, ('TIME', 'INT'), symmetric=True)

operator.operator_dict['+'] = addition