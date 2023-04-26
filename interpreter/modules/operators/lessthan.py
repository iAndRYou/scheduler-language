from . import operator

lessthan = operator.Operator('<', dict(), '__lt__')

operator.operator_dict['<'] = lessthan
