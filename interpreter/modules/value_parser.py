from . import utils

class ValueParser:
    def parse_value(self, type, value):
        if type == 'INT':
            value = int(value)
        elif type == 'BOOL':
            value = True if value == 'True' else False
        elif type == 'STRING':
            value = value[1:-1]
        elif type == 'DATE':
            value = utils.parse_date(value)
        elif type == 'TIME':
            value = utils.parse_time(value)
        elif type == 'VOID':
            value = None
        else:
            raise Exception(f"Wrong type of variable: {type}")

        return value