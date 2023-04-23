from . import operator

subtraction = operator.Operator('-', dict(), '__sub__')
subtraction.add_function(None, ('DATE', 'INT'), symmetric=False)
subtraction.add_function(None, ('TIME', 'INT'), symmetric=False)

operator.operator_dict['-'] = subtraction