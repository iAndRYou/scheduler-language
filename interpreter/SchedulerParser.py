# Generated from ../Scheduler.g4 by ANTLR 4.12.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,61,368,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,
        2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,
        7,33,2,34,7,34,2,35,7,35,2,36,7,36,2,37,7,37,1,0,3,0,78,8,0,1,0,
        1,0,1,1,1,1,3,1,84,8,1,1,1,1,1,1,1,1,1,4,1,90,8,1,11,1,12,1,91,1,
        2,1,2,1,2,1,2,3,2,98,8,2,1,3,1,3,1,3,3,3,103,8,3,1,4,1,4,1,4,1,4,
        1,4,1,4,3,4,111,8,4,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,
        1,7,1,7,1,7,1,7,1,7,3,7,129,8,7,1,8,1,8,1,8,1,8,1,8,3,8,136,8,8,
        1,8,5,8,139,8,8,10,8,12,8,142,9,8,1,9,1,9,1,9,1,9,1,9,3,9,149,8,
        9,1,9,5,9,152,8,9,10,9,12,9,155,9,9,1,10,1,10,1,10,1,11,1,11,1,11,
        1,12,1,12,3,12,165,8,12,1,12,3,12,168,8,12,1,13,1,13,3,13,172,8,
        13,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,15,1,15,1,15,1,15,1,16,1,
        16,1,16,1,16,1,16,1,16,1,16,5,16,192,8,16,10,16,12,16,195,9,16,1,
        16,1,16,3,16,199,8,16,1,17,1,17,1,18,1,18,1,18,1,18,3,18,207,8,18,
        1,18,1,18,1,18,1,19,1,19,1,19,5,19,215,8,19,10,19,12,19,218,9,19,
        1,20,1,20,1,20,1,21,1,21,1,21,3,21,226,8,21,1,21,1,21,5,21,230,8,
        21,10,21,12,21,233,9,21,1,21,1,21,1,22,1,22,1,22,1,22,1,22,1,22,
        1,22,1,22,1,22,1,22,1,22,1,22,1,22,3,22,250,8,22,1,23,1,23,1,23,
        1,23,5,23,256,8,23,10,23,12,23,259,9,23,1,24,1,24,1,24,1,24,1,24,
        1,25,1,25,1,25,1,25,1,25,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,
        1,26,3,26,280,8,26,1,27,1,27,1,28,1,28,1,28,1,28,1,29,1,29,3,29,
        290,8,29,1,29,1,29,1,30,1,30,1,30,5,30,297,8,30,10,30,12,30,300,
        9,30,1,31,1,31,1,32,1,32,1,32,1,32,1,32,1,33,1,33,1,33,1,33,1,33,
        3,33,314,8,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,3,33,
        325,8,33,3,33,327,8,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,
        33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,
        33,1,33,1,33,5,33,353,8,33,10,33,12,33,356,9,33,1,34,1,34,3,34,360,
        8,34,1,35,1,35,1,36,1,36,1,37,1,37,1,37,0,1,66,38,0,2,4,6,8,10,12,
        14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,
        58,60,62,64,66,68,70,72,74,0,8,1,0,10,11,1,0,12,13,1,0,14,15,1,0,
        18,21,1,0,16,17,1,0,7,9,1,0,53,57,1,0,60,61,383,0,77,1,0,0,0,2,89,
        1,0,0,0,4,97,1,0,0,0,6,102,1,0,0,0,8,110,1,0,0,0,10,112,1,0,0,0,
        12,116,1,0,0,0,14,123,1,0,0,0,16,130,1,0,0,0,18,143,1,0,0,0,20,156,
        1,0,0,0,22,159,1,0,0,0,24,167,1,0,0,0,26,171,1,0,0,0,28,173,1,0,
        0,0,30,180,1,0,0,0,32,184,1,0,0,0,34,200,1,0,0,0,36,202,1,0,0,0,
        38,211,1,0,0,0,40,219,1,0,0,0,42,222,1,0,0,0,44,249,1,0,0,0,46,251,
        1,0,0,0,48,260,1,0,0,0,50,265,1,0,0,0,52,279,1,0,0,0,54,281,1,0,
        0,0,56,283,1,0,0,0,58,287,1,0,0,0,60,293,1,0,0,0,62,301,1,0,0,0,
        64,303,1,0,0,0,66,326,1,0,0,0,68,359,1,0,0,0,70,361,1,0,0,0,72,363,
        1,0,0,0,74,365,1,0,0,0,76,78,3,2,1,0,77,76,1,0,0,0,77,78,1,0,0,0,
        78,79,1,0,0,0,79,80,5,0,0,1,80,1,1,0,0,0,81,84,3,4,2,0,82,84,3,8,
        4,0,83,81,1,0,0,0,83,82,1,0,0,0,84,85,1,0,0,0,85,86,5,1,0,0,86,90,
        1,0,0,0,87,90,3,6,3,0,88,90,3,74,37,0,89,83,1,0,0,0,89,87,1,0,0,
        0,89,88,1,0,0,0,90,91,1,0,0,0,91,89,1,0,0,0,91,92,1,0,0,0,92,3,1,
        0,0,0,93,98,3,44,22,0,94,98,3,52,26,0,95,98,3,66,33,0,96,98,3,24,
        12,0,97,93,1,0,0,0,97,94,1,0,0,0,97,95,1,0,0,0,97,96,1,0,0,0,98,
        5,1,0,0,0,99,103,3,32,16,0,100,103,3,36,18,0,101,103,3,26,13,0,102,
        99,1,0,0,0,102,100,1,0,0,0,102,101,1,0,0,0,103,7,1,0,0,0,104,111,
        3,12,6,0,105,111,3,14,7,0,106,111,3,16,8,0,107,111,3,18,9,0,108,
        111,3,20,10,0,109,111,3,22,11,0,110,104,1,0,0,0,110,105,1,0,0,0,
        110,106,1,0,0,0,110,107,1,0,0,0,110,108,1,0,0,0,110,109,1,0,0,0,
        111,9,1,0,0,0,112,113,5,51,0,0,113,114,3,2,1,0,114,115,5,52,0,0,
        115,11,1,0,0,0,116,117,5,36,0,0,117,118,3,70,35,0,118,119,3,66,33,
        0,119,120,5,42,0,0,120,121,5,6,0,0,121,122,3,66,33,0,122,13,1,0,
        0,0,123,128,5,37,0,0,124,125,5,56,0,0,125,129,3,66,33,0,126,127,
        5,2,0,0,127,129,3,58,29,0,128,124,1,0,0,0,128,126,1,0,0,0,129,15,
        1,0,0,0,130,131,5,38,0,0,131,135,7,0,0,0,132,133,5,59,0,0,133,134,
        5,41,0,0,134,136,3,34,17,0,135,132,1,0,0,0,135,136,1,0,0,0,136,140,
        1,0,0,0,137,139,3,34,17,0,138,137,1,0,0,0,139,142,1,0,0,0,140,138,
        1,0,0,0,140,141,1,0,0,0,141,17,1,0,0,0,142,140,1,0,0,0,143,144,5,
        39,0,0,144,148,7,0,0,0,145,146,5,59,0,0,146,147,5,41,0,0,147,149,
        3,34,17,0,148,145,1,0,0,0,148,149,1,0,0,0,149,153,1,0,0,0,150,152,
        3,34,17,0,151,150,1,0,0,0,152,155,1,0,0,0,153,151,1,0,0,0,153,154,
        1,0,0,0,154,19,1,0,0,0,155,153,1,0,0,0,156,157,5,3,0,0,157,158,5,
        56,0,0,158,21,1,0,0,0,159,160,5,4,0,0,160,161,5,56,0,0,161,23,1,
        0,0,0,162,164,5,49,0,0,163,165,3,66,33,0,164,163,1,0,0,0,164,165,
        1,0,0,0,165,168,1,0,0,0,166,168,5,50,0,0,167,162,1,0,0,0,167,166,
        1,0,0,0,168,25,1,0,0,0,169,172,3,28,14,0,170,172,3,30,15,0,171,169,
        1,0,0,0,171,170,1,0,0,0,172,27,1,0,0,0,173,174,5,47,0,0,174,175,
        3,68,34,0,175,176,5,59,0,0,176,177,5,25,0,0,177,178,3,66,33,0,178,
        179,3,10,5,0,179,29,1,0,0,0,180,181,5,48,0,0,181,182,3,34,17,0,182,
        183,3,10,5,0,183,31,1,0,0,0,184,185,5,44,0,0,185,186,3,34,17,0,186,
        193,3,10,5,0,187,188,5,45,0,0,188,189,3,34,17,0,189,190,3,10,5,0,
        190,192,1,0,0,0,191,187,1,0,0,0,192,195,1,0,0,0,193,191,1,0,0,0,
        193,194,1,0,0,0,194,198,1,0,0,0,195,193,1,0,0,0,196,197,5,46,0,0,
        197,199,3,10,5,0,198,196,1,0,0,0,198,199,1,0,0,0,199,33,1,0,0,0,
        200,201,3,66,33,0,201,35,1,0,0,0,202,203,3,68,34,0,203,204,5,59,
        0,0,204,206,5,27,0,0,205,207,3,38,19,0,206,205,1,0,0,0,206,207,1,
        0,0,0,207,208,1,0,0,0,208,209,5,28,0,0,209,210,3,10,5,0,210,37,1,
        0,0,0,211,216,3,40,20,0,212,213,5,32,0,0,213,215,3,40,20,0,214,212,
        1,0,0,0,215,218,1,0,0,0,216,214,1,0,0,0,216,217,1,0,0,0,217,39,1,
        0,0,0,218,216,1,0,0,0,219,220,3,68,34,0,220,221,5,59,0,0,221,41,
        1,0,0,0,222,223,5,59,0,0,223,225,5,27,0,0,224,226,3,66,33,0,225,
        224,1,0,0,0,225,226,1,0,0,0,226,231,1,0,0,0,227,228,5,32,0,0,228,
        230,3,66,33,0,229,227,1,0,0,0,230,233,1,0,0,0,231,229,1,0,0,0,231,
        232,1,0,0,0,232,234,1,0,0,0,233,231,1,0,0,0,234,235,5,28,0,0,235,
        43,1,0,0,0,236,237,5,6,0,0,237,238,5,59,0,0,238,239,5,34,0,0,239,
        250,3,66,33,0,240,241,5,35,0,0,241,242,3,68,34,0,242,243,5,59,0,
        0,243,244,5,34,0,0,244,245,3,66,33,0,245,250,1,0,0,0,246,250,3,48,
        24,0,247,250,3,46,23,0,248,250,3,50,25,0,249,236,1,0,0,0,249,240,
        1,0,0,0,249,246,1,0,0,0,249,247,1,0,0,0,249,248,1,0,0,0,250,45,1,
        0,0,0,251,252,5,7,0,0,252,257,5,59,0,0,253,254,5,5,0,0,254,256,3,
        66,33,0,255,253,1,0,0,0,256,259,1,0,0,0,257,255,1,0,0,0,257,258,
        1,0,0,0,258,47,1,0,0,0,259,257,1,0,0,0,260,261,5,8,0,0,261,262,5,
        59,0,0,262,263,5,10,0,0,263,264,3,58,29,0,264,49,1,0,0,0,265,266,
        5,9,0,0,266,267,5,59,0,0,267,268,5,11,0,0,268,269,3,58,29,0,269,
        51,1,0,0,0,270,271,5,59,0,0,271,272,5,34,0,0,272,280,3,66,33,0,273,
        274,5,59,0,0,274,275,5,31,0,0,275,276,3,54,27,0,276,277,5,34,0,0,
        277,278,3,66,33,0,278,280,1,0,0,0,279,270,1,0,0,0,279,273,1,0,0,
        0,280,53,1,0,0,0,281,282,5,5,0,0,282,55,1,0,0,0,283,284,5,59,0,0,
        284,285,5,31,0,0,285,286,3,54,27,0,286,57,1,0,0,0,287,289,5,29,0,
        0,288,290,3,60,30,0,289,288,1,0,0,0,289,290,1,0,0,0,290,291,1,0,
        0,0,291,292,5,30,0,0,292,59,1,0,0,0,293,298,3,62,31,0,294,295,5,
        32,0,0,295,297,3,62,31,0,296,294,1,0,0,0,297,300,1,0,0,0,298,296,
        1,0,0,0,298,299,1,0,0,0,299,61,1,0,0,0,300,298,1,0,0,0,301,302,3,
        66,33,0,302,63,1,0,0,0,303,304,5,59,0,0,304,305,5,29,0,0,305,306,
        3,66,33,0,306,307,5,30,0,0,307,65,1,0,0,0,308,313,6,33,-1,0,309,
        314,3,42,21,0,310,314,3,56,28,0,311,314,3,8,4,0,312,314,3,64,32,
        0,313,309,1,0,0,0,313,310,1,0,0,0,313,311,1,0,0,0,313,312,1,0,0,
        0,314,327,1,0,0,0,315,316,5,24,0,0,316,327,3,66,33,11,317,318,5,
        27,0,0,318,319,3,66,33,0,319,320,5,28,0,0,320,327,1,0,0,0,321,325,
        3,58,29,0,322,325,3,72,36,0,323,325,5,59,0,0,324,321,1,0,0,0,324,
        322,1,0,0,0,324,323,1,0,0,0,325,327,1,0,0,0,326,308,1,0,0,0,326,
        315,1,0,0,0,326,317,1,0,0,0,326,324,1,0,0,0,327,354,1,0,0,0,328,
        329,10,10,0,0,329,330,7,1,0,0,330,353,3,66,33,11,331,332,10,9,0,
        0,332,333,7,2,0,0,333,353,3,66,33,10,334,335,10,8,0,0,335,336,7,
        3,0,0,336,353,3,66,33,9,337,338,10,7,0,0,338,339,7,4,0,0,339,353,
        3,66,33,8,340,341,10,6,0,0,341,342,5,22,0,0,342,353,3,66,33,7,343,
        344,10,5,0,0,344,345,5,23,0,0,345,353,3,66,33,6,346,347,10,4,0,0,
        347,348,5,26,0,0,348,353,3,66,33,5,349,350,10,3,0,0,350,351,5,25,
        0,0,351,353,3,66,33,4,352,328,1,0,0,0,352,331,1,0,0,0,352,334,1,
        0,0,0,352,337,1,0,0,0,352,340,1,0,0,0,352,343,1,0,0,0,352,346,1,
        0,0,0,352,349,1,0,0,0,353,356,1,0,0,0,354,352,1,0,0,0,354,355,1,
        0,0,0,355,67,1,0,0,0,356,354,1,0,0,0,357,360,5,6,0,0,358,360,3,70,
        35,0,359,357,1,0,0,0,359,358,1,0,0,0,360,69,1,0,0,0,361,362,7,5,
        0,0,362,71,1,0,0,0,363,364,7,6,0,0,364,73,1,0,0,0,365,366,7,7,0,
        0,366,75,1,0,0,0,32,77,83,89,91,97,102,110,128,135,140,148,153,164,
        167,171,193,198,206,216,225,231,249,257,279,289,298,313,324,326,
        352,354,359
    ]

class SchedulerParser ( Parser ):

    grammarFileName = "Scheduler.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "';'", "'DATES'", "'START DATE'", "'END DATE'", 
                     "<INVALID>", "<INVALID>", "'CLASS'", "'DAY'", "'WEEK'", 
                     "'CLASSES'", "'DAYS'", "'*'", "'/'", "'+'", "'-'", 
                     "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'AND'", 
                     "'OR'", "'NOT'", "'IN'", "'#'", "'('", "')'", "'['", 
                     "']'", "'.'", "','", "':'", "'='", "'COLLECTION OF'", 
                     "'ADD'", "'UPDATE'", "'DELETE'", "'GET'", "'WHERE'", 
                     "'SATISFYING'", "'AT'", "'DEF'", "'IF'", "'ELIF'", 
                     "'ELSE'", "'FOR'", "'WHILE'", "'RETURN'", "'BREAK'", 
                     "'{'", "'}'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "CLASS_ATTRIBUTE", "TYPENAME", "CLASSNAME", 
                      "DAYNAME", "WEEKNAME", "CLASSESTOKEN", "DAYSTOKEN", 
                      "MULTIPLY", "DIVIDE", "ADD", "SUBTRACT", "EQUAL", 
                      "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUAL", 
                      "GREATER_THAN_OR_EQUAL", "AND", "OR", "NOT", "IN", 
                      "OVERLAP", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", 
                      "CLOSE_BRACKET", "DOT", "COMMA", "COLON", "SINGLEEQUAL", 
                      "COLLECTION_OF", "ADD_CANVA", "UPDATE_CANVA", "DELETE_CANVA", 
                      "GET_CANVA", "WHERE", "SATISFYING", "AT", "DEF", "IF", 
                      "ELIF", "ELSE", "FOR", "WHILE", "RETURN", "BREAK", 
                      "OPEN_CURLY", "CLOSE_CURLY", "INT", "BOOL", "STRING", 
                      "DATE", "TIME", "WS", "VARNAME", "COMMENT_LINE", "COMMENT" ]

    RULE_prog = 0
    RULE_code = 1
    RULE_instruction = 2
    RULE_instruction_without_semicolon = 3
    RULE_canvas_instruction = 4
    RULE_block = 5
    RULE_add = 6
    RULE_update = 7
    RULE_delete = 8
    RULE_get = 9
    RULE_start_date = 10
    RULE_end_date = 11
    RULE_transfer_statement = 12
    RULE_loop = 13
    RULE_for_loop = 14
    RULE_while_loop = 15
    RULE_if_statement = 16
    RULE_condition = 17
    RULE_function = 18
    RULE_args = 19
    RULE_arg = 20
    RULE_func_call = 21
    RULE_def = 22
    RULE_classDef = 23
    RULE_dayDef = 24
    RULE_weekDef = 25
    RULE_assign = 26
    RULE_attribute = 27
    RULE_attribute_call = 28
    RULE_collection = 29
    RULE_collection_elements = 30
    RULE_collection_element = 31
    RULE_collection_subscription = 32
    RULE_expr = 33
    RULE_type = 34
    RULE_structure = 35
    RULE_value = 36
    RULE_comments = 37

    ruleNames =  [ "prog", "code", "instruction", "instruction_without_semicolon", 
                   "canvas_instruction", "block", "add", "update", "delete", 
                   "get", "start_date", "end_date", "transfer_statement", 
                   "loop", "for_loop", "while_loop", "if_statement", "condition", 
                   "function", "args", "arg", "func_call", "def", "classDef", 
                   "dayDef", "weekDef", "assign", "attribute", "attribute_call", 
                   "collection", "collection_elements", "collection_element", 
                   "collection_subscription", "expr", "type", "structure", 
                   "value", "comments" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    CLASS_ATTRIBUTE=5
    TYPENAME=6
    CLASSNAME=7
    DAYNAME=8
    WEEKNAME=9
    CLASSESTOKEN=10
    DAYSTOKEN=11
    MULTIPLY=12
    DIVIDE=13
    ADD=14
    SUBTRACT=15
    EQUAL=16
    NOT_EQUAL=17
    LESS_THAN=18
    GREATER_THAN=19
    LESS_THAN_OR_EQUAL=20
    GREATER_THAN_OR_EQUAL=21
    AND=22
    OR=23
    NOT=24
    IN=25
    OVERLAP=26
    OPEN_PAREN=27
    CLOSE_PAREN=28
    OPEN_BRACKET=29
    CLOSE_BRACKET=30
    DOT=31
    COMMA=32
    COLON=33
    SINGLEEQUAL=34
    COLLECTION_OF=35
    ADD_CANVA=36
    UPDATE_CANVA=37
    DELETE_CANVA=38
    GET_CANVA=39
    WHERE=40
    SATISFYING=41
    AT=42
    DEF=43
    IF=44
    ELIF=45
    ELSE=46
    FOR=47
    WHILE=48
    RETURN=49
    BREAK=50
    OPEN_CURLY=51
    CLOSE_CURLY=52
    INT=53
    BOOL=54
    STRING=55
    DATE=56
    TIME=57
    WS=58
    VARNAME=59
    COMMENT_LINE=60
    COMMENT=61

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.12.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(SchedulerParser.EOF, 0)

        def code(self):
            return self.getTypedRuleContext(SchedulerParser.CodeContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_prog

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProg" ):
                return visitor.visitProg(self)
            else:
                return visitor.visitChildren(self)




    def prog(self):

        localctx = SchedulerParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 77
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 4316578163372065752) != 0):
                self.state = 76
                self.code()


            self.state = 79
            self.match(SchedulerParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CodeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def instruction_without_semicolon(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.Instruction_without_semicolonContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.Instruction_without_semicolonContext,i)


        def comments(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.CommentsContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.CommentsContext,i)


        def instruction(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.InstructionContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.InstructionContext,i)


        def canvas_instruction(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.Canvas_instructionContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.Canvas_instructionContext,i)


        def getRuleIndex(self):
            return SchedulerParser.RULE_code

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCode" ):
                return visitor.visitCode(self)
            else:
                return visitor.visitChildren(self)




    def code(self):

        localctx = SchedulerParser.CodeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_code)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 89 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 89
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                if la_ == 1:
                    self.state = 83
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
                    if la_ == 1:
                        self.state = 81
                        self.instruction()
                        pass

                    elif la_ == 2:
                        self.state = 82
                        self.canvas_instruction()
                        pass


                    self.state = 85
                    self.match(SchedulerParser.T__0)
                    pass

                elif la_ == 2:
                    self.state = 87
                    self.instruction_without_semicolon()
                    pass

                elif la_ == 3:
                    self.state = 88
                    self.comments()
                    pass


                self.state = 91 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 4316578163372065752) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InstructionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def def_(self):
            return self.getTypedRuleContext(SchedulerParser.DefContext,0)


        def assign(self):
            return self.getTypedRuleContext(SchedulerParser.AssignContext,0)


        def expr(self):
            return self.getTypedRuleContext(SchedulerParser.ExprContext,0)


        def transfer_statement(self):
            return self.getTypedRuleContext(SchedulerParser.Transfer_statementContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_instruction

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInstruction" ):
                return visitor.visitInstruction(self)
            else:
                return visitor.visitChildren(self)




    def instruction(self):

        localctx = SchedulerParser.InstructionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_instruction)
        try:
            self.state = 97
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 93
                self.def_()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 94
                self.assign()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 95
                self.expr(0)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 96
                self.transfer_statement()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Instruction_without_semicolonContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def if_statement(self):
            return self.getTypedRuleContext(SchedulerParser.If_statementContext,0)


        def function(self):
            return self.getTypedRuleContext(SchedulerParser.FunctionContext,0)


        def loop(self):
            return self.getTypedRuleContext(SchedulerParser.LoopContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_instruction_without_semicolon

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInstruction_without_semicolon" ):
                return visitor.visitInstruction_without_semicolon(self)
            else:
                return visitor.visitChildren(self)




    def instruction_without_semicolon(self):

        localctx = SchedulerParser.Instruction_without_semicolonContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_instruction_without_semicolon)
        try:
            self.state = 102
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [44]:
                self.enterOuterAlt(localctx, 1)
                self.state = 99
                self.if_statement()
                pass
            elif token in [6, 7, 8, 9]:
                self.enterOuterAlt(localctx, 2)
                self.state = 100
                self.function()
                pass
            elif token in [47, 48]:
                self.enterOuterAlt(localctx, 3)
                self.state = 101
                self.loop()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Canvas_instructionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def add(self):
            return self.getTypedRuleContext(SchedulerParser.AddContext,0)


        def update(self):
            return self.getTypedRuleContext(SchedulerParser.UpdateContext,0)


        def delete(self):
            return self.getTypedRuleContext(SchedulerParser.DeleteContext,0)


        def get(self):
            return self.getTypedRuleContext(SchedulerParser.GetContext,0)


        def start_date(self):
            return self.getTypedRuleContext(SchedulerParser.Start_dateContext,0)


        def end_date(self):
            return self.getTypedRuleContext(SchedulerParser.End_dateContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_canvas_instruction

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCanvas_instruction" ):
                return visitor.visitCanvas_instruction(self)
            else:
                return visitor.visitChildren(self)




    def canvas_instruction(self):

        localctx = SchedulerParser.Canvas_instructionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_canvas_instruction)
        try:
            self.state = 110
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [36]:
                self.enterOuterAlt(localctx, 1)
                self.state = 104
                self.add()
                pass
            elif token in [37]:
                self.enterOuterAlt(localctx, 2)
                self.state = 105
                self.update()
                pass
            elif token in [38]:
                self.enterOuterAlt(localctx, 3)
                self.state = 106
                self.delete()
                pass
            elif token in [39]:
                self.enterOuterAlt(localctx, 4)
                self.state = 107
                self.get()
                pass
            elif token in [3]:
                self.enterOuterAlt(localctx, 5)
                self.state = 108
                self.start_date()
                pass
            elif token in [4]:
                self.enterOuterAlt(localctx, 6)
                self.state = 109
                self.end_date()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPEN_CURLY(self):
            return self.getToken(SchedulerParser.OPEN_CURLY, 0)

        def code(self):
            return self.getTypedRuleContext(SchedulerParser.CodeContext,0)


        def CLOSE_CURLY(self):
            return self.getToken(SchedulerParser.CLOSE_CURLY, 0)

        def getRuleIndex(self):
            return SchedulerParser.RULE_block

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBlock" ):
                return visitor.visitBlock(self)
            else:
                return visitor.visitChildren(self)




    def block(self):

        localctx = SchedulerParser.BlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_block)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 112
            self.match(SchedulerParser.OPEN_CURLY)
            self.state = 113
            self.code()
            self.state = 114
            self.match(SchedulerParser.CLOSE_CURLY)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AddContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ADD_CANVA(self):
            return self.getToken(SchedulerParser.ADD_CANVA, 0)

        def structure(self):
            return self.getTypedRuleContext(SchedulerParser.StructureContext,0)


        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ExprContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ExprContext,i)


        def AT(self):
            return self.getToken(SchedulerParser.AT, 0)

        def TYPENAME(self):
            return self.getToken(SchedulerParser.TYPENAME, 0)

        def getRuleIndex(self):
            return SchedulerParser.RULE_add

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAdd" ):
                return visitor.visitAdd(self)
            else:
                return visitor.visitChildren(self)




    def add(self):

        localctx = SchedulerParser.AddContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_add)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 116
            self.match(SchedulerParser.ADD_CANVA)
            self.state = 117
            self.structure()
            self.state = 118
            self.expr(0)
            self.state = 119
            self.match(SchedulerParser.AT)
            self.state = 120
            self.match(SchedulerParser.TYPENAME)
            self.state = 121
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class UpdateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def UPDATE_CANVA(self):
            return self.getToken(SchedulerParser.UPDATE_CANVA, 0)

        def DATE(self):
            return self.getToken(SchedulerParser.DATE, 0)

        def expr(self):
            return self.getTypedRuleContext(SchedulerParser.ExprContext,0)


        def collection(self):
            return self.getTypedRuleContext(SchedulerParser.CollectionContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_update

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUpdate" ):
                return visitor.visitUpdate(self)
            else:
                return visitor.visitChildren(self)




    def update(self):

        localctx = SchedulerParser.UpdateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_update)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 123
            self.match(SchedulerParser.UPDATE_CANVA)
            self.state = 128
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [56]:
                self.state = 124
                self.match(SchedulerParser.DATE)
                self.state = 125
                self.expr(0)
                pass
            elif token in [2]:
                self.state = 126
                self.match(SchedulerParser.T__1)
                self.state = 127
                self.collection()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeleteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DELETE_CANVA(self):
            return self.getToken(SchedulerParser.DELETE_CANVA, 0)

        def CLASSESTOKEN(self):
            return self.getToken(SchedulerParser.CLASSESTOKEN, 0)

        def DAYSTOKEN(self):
            return self.getToken(SchedulerParser.DAYSTOKEN, 0)

        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def SATISFYING(self):
            return self.getToken(SchedulerParser.SATISFYING, 0)

        def condition(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ConditionContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ConditionContext,i)


        def getRuleIndex(self):
            return SchedulerParser.RULE_delete

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDelete" ):
                return visitor.visitDelete(self)
            else:
                return visitor.visitChildren(self)




    def delete(self):

        localctx = SchedulerParser.DeleteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_delete)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 130
            self.match(SchedulerParser.DELETE_CANVA)
            self.state = 131
            _la = self._input.LA(1)
            if not(_la==10 or _la==11):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 135
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
            if la_ == 1:
                self.state = 132
                self.match(SchedulerParser.VARNAME)
                self.state = 133
                self.match(SchedulerParser.SATISFYING)
                self.state = 134
                self.condition()


            self.state = 140
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,9,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 137
                    self.condition() 
                self.state = 142
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,9,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class GetContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GET_CANVA(self):
            return self.getToken(SchedulerParser.GET_CANVA, 0)

        def CLASSESTOKEN(self):
            return self.getToken(SchedulerParser.CLASSESTOKEN, 0)

        def DAYSTOKEN(self):
            return self.getToken(SchedulerParser.DAYSTOKEN, 0)

        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def SATISFYING(self):
            return self.getToken(SchedulerParser.SATISFYING, 0)

        def condition(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ConditionContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ConditionContext,i)


        def getRuleIndex(self):
            return SchedulerParser.RULE_get

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGet" ):
                return visitor.visitGet(self)
            else:
                return visitor.visitChildren(self)




    def get(self):

        localctx = SchedulerParser.GetContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_get)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 143
            self.match(SchedulerParser.GET_CANVA)
            self.state = 144
            _la = self._input.LA(1)
            if not(_la==10 or _la==11):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 148
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
            if la_ == 1:
                self.state = 145
                self.match(SchedulerParser.VARNAME)
                self.state = 146
                self.match(SchedulerParser.SATISFYING)
                self.state = 147
                self.condition()


            self.state = 153
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,11,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 150
                    self.condition() 
                self.state = 155
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,11,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Start_dateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DATE(self):
            return self.getToken(SchedulerParser.DATE, 0)

        def getRuleIndex(self):
            return SchedulerParser.RULE_start_date

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStart_date" ):
                return visitor.visitStart_date(self)
            else:
                return visitor.visitChildren(self)




    def start_date(self):

        localctx = SchedulerParser.Start_dateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_start_date)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 156
            self.match(SchedulerParser.T__2)
            self.state = 157
            self.match(SchedulerParser.DATE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class End_dateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DATE(self):
            return self.getToken(SchedulerParser.DATE, 0)

        def getRuleIndex(self):
            return SchedulerParser.RULE_end_date

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEnd_date" ):
                return visitor.visitEnd_date(self)
            else:
                return visitor.visitChildren(self)




    def end_date(self):

        localctx = SchedulerParser.End_dateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_end_date)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 159
            self.match(SchedulerParser.T__3)
            self.state = 160
            self.match(SchedulerParser.DATE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Transfer_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return SchedulerParser.RULE_transfer_statement

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class ReturnContext(Transfer_statementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.Transfer_statementContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def RETURN(self):
            return self.getToken(SchedulerParser.RETURN, 0)
        def expr(self):
            return self.getTypedRuleContext(SchedulerParser.ExprContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitReturn" ):
                return visitor.visitReturn(self)
            else:
                return visitor.visitChildren(self)


    class BreakContext(Transfer_statementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.Transfer_statementContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def BREAK(self):
            return self.getToken(SchedulerParser.BREAK, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBreak" ):
                return visitor.visitBreak(self)
            else:
                return visitor.visitChildren(self)



    def transfer_statement(self):

        localctx = SchedulerParser.Transfer_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_transfer_statement)
        self._la = 0 # Token type
        try:
            self.state = 167
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [49]:
                localctx = SchedulerParser.ReturnContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 162
                self.match(SchedulerParser.RETURN)
                self.state = 164
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & 855684960680411160) != 0):
                    self.state = 163
                    self.expr(0)


                pass
            elif token in [50]:
                localctx = SchedulerParser.BreakContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 166
                self.match(SchedulerParser.BREAK)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LoopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def for_loop(self):
            return self.getTypedRuleContext(SchedulerParser.For_loopContext,0)


        def while_loop(self):
            return self.getTypedRuleContext(SchedulerParser.While_loopContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_loop

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLoop" ):
                return visitor.visitLoop(self)
            else:
                return visitor.visitChildren(self)




    def loop(self):

        localctx = SchedulerParser.LoopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_loop)
        try:
            self.state = 171
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [47]:
                self.enterOuterAlt(localctx, 1)
                self.state = 169
                self.for_loop()
                pass
            elif token in [48]:
                self.enterOuterAlt(localctx, 2)
                self.state = 170
                self.while_loop()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class For_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(SchedulerParser.FOR, 0)

        def type_(self):
            return self.getTypedRuleContext(SchedulerParser.TypeContext,0)


        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def IN(self):
            return self.getToken(SchedulerParser.IN, 0)

        def expr(self):
            return self.getTypedRuleContext(SchedulerParser.ExprContext,0)


        def block(self):
            return self.getTypedRuleContext(SchedulerParser.BlockContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_for_loop

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFor_loop" ):
                return visitor.visitFor_loop(self)
            else:
                return visitor.visitChildren(self)




    def for_loop(self):

        localctx = SchedulerParser.For_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_for_loop)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 173
            self.match(SchedulerParser.FOR)
            self.state = 174
            self.type_()
            self.state = 175
            self.match(SchedulerParser.VARNAME)
            self.state = 176
            self.match(SchedulerParser.IN)
            self.state = 177
            self.expr(0)
            self.state = 178
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class While_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHILE(self):
            return self.getToken(SchedulerParser.WHILE, 0)

        def condition(self):
            return self.getTypedRuleContext(SchedulerParser.ConditionContext,0)


        def block(self):
            return self.getTypedRuleContext(SchedulerParser.BlockContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_while_loop

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhile_loop" ):
                return visitor.visitWhile_loop(self)
            else:
                return visitor.visitChildren(self)




    def while_loop(self):

        localctx = SchedulerParser.While_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_while_loop)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 180
            self.match(SchedulerParser.WHILE)
            self.state = 181
            self.condition()
            self.state = 182
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class If_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(SchedulerParser.IF, 0)

        def condition(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ConditionContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ConditionContext,i)


        def block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.BlockContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.BlockContext,i)


        def ELIF(self, i:int=None):
            if i is None:
                return self.getTokens(SchedulerParser.ELIF)
            else:
                return self.getToken(SchedulerParser.ELIF, i)

        def ELSE(self):
            return self.getToken(SchedulerParser.ELSE, 0)

        def getRuleIndex(self):
            return SchedulerParser.RULE_if_statement

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIf_statement" ):
                return visitor.visitIf_statement(self)
            else:
                return visitor.visitChildren(self)




    def if_statement(self):

        localctx = SchedulerParser.If_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_if_statement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 184
            self.match(SchedulerParser.IF)
            self.state = 185
            self.condition()
            self.state = 186
            self.block()
            self.state = 193
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==45:
                self.state = 187
                self.match(SchedulerParser.ELIF)
                self.state = 188
                self.condition()
                self.state = 189
                self.block()
                self.state = 195
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 198
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==46:
                self.state = 196
                self.match(SchedulerParser.ELSE)
                self.state = 197
                self.block()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(SchedulerParser.ExprContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_condition

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)




    def condition(self):

        localctx = SchedulerParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_condition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 200
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_(self):
            return self.getTypedRuleContext(SchedulerParser.TypeContext,0)


        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def OPEN_PAREN(self):
            return self.getToken(SchedulerParser.OPEN_PAREN, 0)

        def CLOSE_PAREN(self):
            return self.getToken(SchedulerParser.CLOSE_PAREN, 0)

        def block(self):
            return self.getTypedRuleContext(SchedulerParser.BlockContext,0)


        def args(self):
            return self.getTypedRuleContext(SchedulerParser.ArgsContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_function

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction" ):
                return visitor.visitFunction(self)
            else:
                return visitor.visitChildren(self)




    def function(self):

        localctx = SchedulerParser.FunctionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_function)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 202
            self.type_()
            self.state = 203
            self.match(SchedulerParser.VARNAME)
            self.state = 204
            self.match(SchedulerParser.OPEN_PAREN)
            self.state = 206
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 960) != 0):
                self.state = 205
                self.args()


            self.state = 208
            self.match(SchedulerParser.CLOSE_PAREN)
            self.state = 209
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def arg(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ArgContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ArgContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(SchedulerParser.COMMA)
            else:
                return self.getToken(SchedulerParser.COMMA, i)

        def getRuleIndex(self):
            return SchedulerParser.RULE_args

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArgs" ):
                return visitor.visitArgs(self)
            else:
                return visitor.visitChildren(self)




    def args(self):

        localctx = SchedulerParser.ArgsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_args)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 211
            self.arg()
            self.state = 216
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==32:
                self.state = 212
                self.match(SchedulerParser.COMMA)
                self.state = 213
                self.arg()
                self.state = 218
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_(self):
            return self.getTypedRuleContext(SchedulerParser.TypeContext,0)


        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def getRuleIndex(self):
            return SchedulerParser.RULE_arg

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArg" ):
                return visitor.visitArg(self)
            else:
                return visitor.visitChildren(self)




    def arg(self):

        localctx = SchedulerParser.ArgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_arg)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 219
            self.type_()
            self.state = 220
            self.match(SchedulerParser.VARNAME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Func_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def OPEN_PAREN(self):
            return self.getToken(SchedulerParser.OPEN_PAREN, 0)

        def CLOSE_PAREN(self):
            return self.getToken(SchedulerParser.CLOSE_PAREN, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ExprContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ExprContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(SchedulerParser.COMMA)
            else:
                return self.getToken(SchedulerParser.COMMA, i)

        def getRuleIndex(self):
            return SchedulerParser.RULE_func_call

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunc_call" ):
                return visitor.visitFunc_call(self)
            else:
                return visitor.visitChildren(self)




    def func_call(self):

        localctx = SchedulerParser.Func_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_func_call)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 222
            self.match(SchedulerParser.VARNAME)
            self.state = 223
            self.match(SchedulerParser.OPEN_PAREN)
            self.state = 225
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 855684960680411160) != 0):
                self.state = 224
                self.expr(0)


            self.state = 231
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==32:
                self.state = 227
                self.match(SchedulerParser.COMMA)
                self.state = 228
                self.expr(0)
                self.state = 233
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 234
            self.match(SchedulerParser.CLOSE_PAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TYPENAME(self):
            return self.getToken(SchedulerParser.TYPENAME, 0)

        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def SINGLEEQUAL(self):
            return self.getToken(SchedulerParser.SINGLEEQUAL, 0)

        def expr(self):
            return self.getTypedRuleContext(SchedulerParser.ExprContext,0)


        def COLLECTION_OF(self):
            return self.getToken(SchedulerParser.COLLECTION_OF, 0)

        def type_(self):
            return self.getTypedRuleContext(SchedulerParser.TypeContext,0)


        def dayDef(self):
            return self.getTypedRuleContext(SchedulerParser.DayDefContext,0)


        def classDef(self):
            return self.getTypedRuleContext(SchedulerParser.ClassDefContext,0)


        def weekDef(self):
            return self.getTypedRuleContext(SchedulerParser.WeekDefContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_def

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDef" ):
                return visitor.visitDef(self)
            else:
                return visitor.visitChildren(self)




    def def_(self):

        localctx = SchedulerParser.DefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_def)
        try:
            self.state = 249
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6]:
                self.enterOuterAlt(localctx, 1)
                self.state = 236
                self.match(SchedulerParser.TYPENAME)
                self.state = 237
                self.match(SchedulerParser.VARNAME)
                self.state = 238
                self.match(SchedulerParser.SINGLEEQUAL)
                self.state = 239
                self.expr(0)
                pass
            elif token in [35]:
                self.enterOuterAlt(localctx, 2)
                self.state = 240
                self.match(SchedulerParser.COLLECTION_OF)
                self.state = 241
                self.type_()
                self.state = 242
                self.match(SchedulerParser.VARNAME)
                self.state = 243
                self.match(SchedulerParser.SINGLEEQUAL)
                self.state = 244
                self.expr(0)
                pass
            elif token in [8]:
                self.enterOuterAlt(localctx, 3)
                self.state = 246
                self.dayDef()
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 4)
                self.state = 247
                self.classDef()
                pass
            elif token in [9]:
                self.enterOuterAlt(localctx, 5)
                self.state = 248
                self.weekDef()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ClassDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CLASSNAME(self):
            return self.getToken(SchedulerParser.CLASSNAME, 0)

        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def CLASS_ATTRIBUTE(self, i:int=None):
            if i is None:
                return self.getTokens(SchedulerParser.CLASS_ATTRIBUTE)
            else:
                return self.getToken(SchedulerParser.CLASS_ATTRIBUTE, i)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ExprContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ExprContext,i)


        def getRuleIndex(self):
            return SchedulerParser.RULE_classDef

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClassDef" ):
                return visitor.visitClassDef(self)
            else:
                return visitor.visitChildren(self)




    def classDef(self):

        localctx = SchedulerParser.ClassDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_classDef)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 251
            self.match(SchedulerParser.CLASSNAME)
            self.state = 252
            self.match(SchedulerParser.VARNAME)
            self.state = 257
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==5:
                self.state = 253
                self.match(SchedulerParser.CLASS_ATTRIBUTE)
                self.state = 254
                self.expr(0)
                self.state = 259
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DayDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DAYNAME(self):
            return self.getToken(SchedulerParser.DAYNAME, 0)

        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def CLASSESTOKEN(self):
            return self.getToken(SchedulerParser.CLASSESTOKEN, 0)

        def collection(self):
            return self.getTypedRuleContext(SchedulerParser.CollectionContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_dayDef

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDayDef" ):
                return visitor.visitDayDef(self)
            else:
                return visitor.visitChildren(self)




    def dayDef(self):

        localctx = SchedulerParser.DayDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_dayDef)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 260
            self.match(SchedulerParser.DAYNAME)
            self.state = 261
            self.match(SchedulerParser.VARNAME)
            self.state = 262
            self.match(SchedulerParser.CLASSESTOKEN)
            self.state = 263
            self.collection()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WeekDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WEEKNAME(self):
            return self.getToken(SchedulerParser.WEEKNAME, 0)

        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def DAYSTOKEN(self):
            return self.getToken(SchedulerParser.DAYSTOKEN, 0)

        def collection(self):
            return self.getTypedRuleContext(SchedulerParser.CollectionContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_weekDef

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWeekDef" ):
                return visitor.visitWeekDef(self)
            else:
                return visitor.visitChildren(self)




    def weekDef(self):

        localctx = SchedulerParser.WeekDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_weekDef)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 265
            self.match(SchedulerParser.WEEKNAME)
            self.state = 266
            self.match(SchedulerParser.VARNAME)
            self.state = 267
            self.match(SchedulerParser.DAYSTOKEN)
            self.state = 268
            self.collection()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def SINGLEEQUAL(self):
            return self.getToken(SchedulerParser.SINGLEEQUAL, 0)

        def expr(self):
            return self.getTypedRuleContext(SchedulerParser.ExprContext,0)


        def DOT(self):
            return self.getToken(SchedulerParser.DOT, 0)

        def attribute(self):
            return self.getTypedRuleContext(SchedulerParser.AttributeContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_assign

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssign" ):
                return visitor.visitAssign(self)
            else:
                return visitor.visitChildren(self)




    def assign(self):

        localctx = SchedulerParser.AssignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_assign)
        try:
            self.state = 279
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,23,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 270
                self.match(SchedulerParser.VARNAME)
                self.state = 271
                self.match(SchedulerParser.SINGLEEQUAL)
                self.state = 272
                self.expr(0)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 273
                self.match(SchedulerParser.VARNAME)
                self.state = 274
                self.match(SchedulerParser.DOT)
                self.state = 275
                self.attribute()
                self.state = 276
                self.match(SchedulerParser.SINGLEEQUAL)
                self.state = 277
                self.expr(0)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AttributeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CLASS_ATTRIBUTE(self):
            return self.getToken(SchedulerParser.CLASS_ATTRIBUTE, 0)

        def getRuleIndex(self):
            return SchedulerParser.RULE_attribute

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAttribute" ):
                return visitor.visitAttribute(self)
            else:
                return visitor.visitChildren(self)




    def attribute(self):

        localctx = SchedulerParser.AttributeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_attribute)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 281
            self.match(SchedulerParser.CLASS_ATTRIBUTE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Attribute_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def DOT(self):
            return self.getToken(SchedulerParser.DOT, 0)

        def attribute(self):
            return self.getTypedRuleContext(SchedulerParser.AttributeContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_attribute_call

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAttribute_call" ):
                return visitor.visitAttribute_call(self)
            else:
                return visitor.visitChildren(self)




    def attribute_call(self):

        localctx = SchedulerParser.Attribute_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_attribute_call)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 283
            self.match(SchedulerParser.VARNAME)
            self.state = 284
            self.match(SchedulerParser.DOT)
            self.state = 285
            self.attribute()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CollectionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPEN_BRACKET(self):
            return self.getToken(SchedulerParser.OPEN_BRACKET, 0)

        def CLOSE_BRACKET(self):
            return self.getToken(SchedulerParser.CLOSE_BRACKET, 0)

        def collection_elements(self):
            return self.getTypedRuleContext(SchedulerParser.Collection_elementsContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_collection

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCollection" ):
                return visitor.visitCollection(self)
            else:
                return visitor.visitChildren(self)




    def collection(self):

        localctx = SchedulerParser.CollectionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_collection)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 287
            self.match(SchedulerParser.OPEN_BRACKET)
            self.state = 289
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 855684960680411160) != 0):
                self.state = 288
                self.collection_elements()


            self.state = 291
            self.match(SchedulerParser.CLOSE_BRACKET)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Collection_elementsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def collection_element(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.Collection_elementContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.Collection_elementContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(SchedulerParser.COMMA)
            else:
                return self.getToken(SchedulerParser.COMMA, i)

        def getRuleIndex(self):
            return SchedulerParser.RULE_collection_elements

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCollection_elements" ):
                return visitor.visitCollection_elements(self)
            else:
                return visitor.visitChildren(self)




    def collection_elements(self):

        localctx = SchedulerParser.Collection_elementsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_collection_elements)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 293
            self.collection_element()
            self.state = 298
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==32:
                self.state = 294
                self.match(SchedulerParser.COMMA)
                self.state = 295
                self.collection_element()
                self.state = 300
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Collection_elementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(SchedulerParser.ExprContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_collection_element

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCollection_element" ):
                return visitor.visitCollection_element(self)
            else:
                return visitor.visitChildren(self)




    def collection_element(self):

        localctx = SchedulerParser.Collection_elementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_collection_element)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 301
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Collection_subscriptionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def OPEN_BRACKET(self):
            return self.getToken(SchedulerParser.OPEN_BRACKET, 0)

        def expr(self):
            return self.getTypedRuleContext(SchedulerParser.ExprContext,0)


        def CLOSE_BRACKET(self):
            return self.getToken(SchedulerParser.CLOSE_BRACKET, 0)

        def getRuleIndex(self):
            return SchedulerParser.RULE_collection_subscription

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCollection_subscription" ):
                return visitor.visitCollection_subscription(self)
            else:
                return visitor.visitChildren(self)




    def collection_subscription(self):

        localctx = SchedulerParser.Collection_subscriptionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_collection_subscription)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 303
            self.match(SchedulerParser.VARNAME)
            self.state = 304
            self.match(SchedulerParser.OPEN_BRACKET)
            self.state = 305
            self.expr(0)
            self.state = 306
            self.match(SchedulerParser.CLOSE_BRACKET)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return SchedulerParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class AndExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ExprContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ExprContext,i)

        def AND(self):
            return self.getToken(SchedulerParser.AND, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAndExpr" ):
                return visitor.visitAndExpr(self)
            else:
                return visitor.visitChildren(self)


    class ValueExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def collection(self):
            return self.getTypedRuleContext(SchedulerParser.CollectionContext,0)

        def value(self):
            return self.getTypedRuleContext(SchedulerParser.ValueContext,0)

        def VARNAME(self):
            return self.getToken(SchedulerParser.VARNAME, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValueExpr" ):
                return visitor.visitValueExpr(self)
            else:
                return visitor.visitChildren(self)


    class EqualExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ExprContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ExprContext,i)

        def EQUAL(self):
            return self.getToken(SchedulerParser.EQUAL, 0)
        def NOT_EQUAL(self):
            return self.getToken(SchedulerParser.NOT_EQUAL, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEqualExpr" ):
                return visitor.visitEqualExpr(self)
            else:
                return visitor.visitChildren(self)


    class ParenthesisContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def OPEN_PAREN(self):
            return self.getToken(SchedulerParser.OPEN_PAREN, 0)
        def expr(self):
            return self.getTypedRuleContext(SchedulerParser.ExprContext,0)

        def CLOSE_PAREN(self):
            return self.getToken(SchedulerParser.CLOSE_PAREN, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParenthesis" ):
                return visitor.visitParenthesis(self)
            else:
                return visitor.visitChildren(self)


    class AddSubContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ExprContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ExprContext,i)

        def ADD(self):
            return self.getToken(SchedulerParser.ADD, 0)
        def SUBTRACT(self):
            return self.getToken(SchedulerParser.SUBTRACT, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAddSub" ):
                return visitor.visitAddSub(self)
            else:
                return visitor.visitChildren(self)


    class CallsContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def func_call(self):
            return self.getTypedRuleContext(SchedulerParser.Func_callContext,0)

        def attribute_call(self):
            return self.getTypedRuleContext(SchedulerParser.Attribute_callContext,0)

        def canvas_instruction(self):
            return self.getTypedRuleContext(SchedulerParser.Canvas_instructionContext,0)

        def collection_subscription(self):
            return self.getTypedRuleContext(SchedulerParser.Collection_subscriptionContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCalls" ):
                return visitor.visitCalls(self)
            else:
                return visitor.visitChildren(self)


    class OverlapExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ExprContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ExprContext,i)

        def OVERLAP(self):
            return self.getToken(SchedulerParser.OVERLAP, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOverlapExpr" ):
                return visitor.visitOverlapExpr(self)
            else:
                return visitor.visitChildren(self)


    class CompareContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ExprContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ExprContext,i)

        def LESS_THAN(self):
            return self.getToken(SchedulerParser.LESS_THAN, 0)
        def LESS_THAN_OR_EQUAL(self):
            return self.getToken(SchedulerParser.LESS_THAN_OR_EQUAL, 0)
        def GREATER_THAN(self):
            return self.getToken(SchedulerParser.GREATER_THAN, 0)
        def GREATER_THAN_OR_EQUAL(self):
            return self.getToken(SchedulerParser.GREATER_THAN_OR_EQUAL, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCompare" ):
                return visitor.visitCompare(self)
            else:
                return visitor.visitChildren(self)


    class NotExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NOT(self):
            return self.getToken(SchedulerParser.NOT, 0)
        def expr(self):
            return self.getTypedRuleContext(SchedulerParser.ExprContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNotExpr" ):
                return visitor.visitNotExpr(self)
            else:
                return visitor.visitChildren(self)


    class InExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ExprContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ExprContext,i)

        def IN(self):
            return self.getToken(SchedulerParser.IN, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInExpr" ):
                return visitor.visitInExpr(self)
            else:
                return visitor.visitChildren(self)


    class OrExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ExprContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ExprContext,i)

        def OR(self):
            return self.getToken(SchedulerParser.OR, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOrExpr" ):
                return visitor.visitOrExpr(self)
            else:
                return visitor.visitChildren(self)


    class MultDivContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a SchedulerParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SchedulerParser.ExprContext)
            else:
                return self.getTypedRuleContext(SchedulerParser.ExprContext,i)

        def MULTIPLY(self):
            return self.getToken(SchedulerParser.MULTIPLY, 0)
        def DIVIDE(self):
            return self.getToken(SchedulerParser.DIVIDE, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMultDiv" ):
                return visitor.visitMultDiv(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = SchedulerParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 66
        self.enterRecursionRule(localctx, 66, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 326
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,28,self._ctx)
            if la_ == 1:
                localctx = SchedulerParser.CallsContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 313
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,26,self._ctx)
                if la_ == 1:
                    self.state = 309
                    self.func_call()
                    pass

                elif la_ == 2:
                    self.state = 310
                    self.attribute_call()
                    pass

                elif la_ == 3:
                    self.state = 311
                    self.canvas_instruction()
                    pass

                elif la_ == 4:
                    self.state = 312
                    self.collection_subscription()
                    pass


                pass

            elif la_ == 2:
                localctx = SchedulerParser.NotExprContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 315
                self.match(SchedulerParser.NOT)
                self.state = 316
                self.expr(11)
                pass

            elif la_ == 3:
                localctx = SchedulerParser.ParenthesisContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 317
                self.match(SchedulerParser.OPEN_PAREN)
                self.state = 318
                self.expr(0)
                self.state = 319
                self.match(SchedulerParser.CLOSE_PAREN)
                pass

            elif la_ == 4:
                localctx = SchedulerParser.ValueExprContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 324
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [29]:
                    self.state = 321
                    self.collection()
                    pass
                elif token in [53, 54, 55, 56, 57]:
                    self.state = 322
                    self.value()
                    pass
                elif token in [59]:
                    self.state = 323
                    self.match(SchedulerParser.VARNAME)
                    pass
                else:
                    raise NoViableAltException(self)

                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 354
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,30,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 352
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,29,self._ctx)
                    if la_ == 1:
                        localctx = SchedulerParser.MultDivContext(self, SchedulerParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 328
                        if not self.precpred(self._ctx, 10):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 10)")
                        self.state = 329
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==12 or _la==13):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 330
                        self.expr(11)
                        pass

                    elif la_ == 2:
                        localctx = SchedulerParser.AddSubContext(self, SchedulerParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 331
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 332
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==14 or _la==15):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 333
                        self.expr(10)
                        pass

                    elif la_ == 3:
                        localctx = SchedulerParser.CompareContext(self, SchedulerParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 334
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                        self.state = 335
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 3932160) != 0)):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 336
                        self.expr(9)
                        pass

                    elif la_ == 4:
                        localctx = SchedulerParser.EqualExprContext(self, SchedulerParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 337
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 338
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==16 or _la==17):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 339
                        self.expr(8)
                        pass

                    elif la_ == 5:
                        localctx = SchedulerParser.AndExprContext(self, SchedulerParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 340
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 341
                        self.match(SchedulerParser.AND)
                        self.state = 342
                        self.expr(7)
                        pass

                    elif la_ == 6:
                        localctx = SchedulerParser.OrExprContext(self, SchedulerParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 343
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 344
                        self.match(SchedulerParser.OR)
                        self.state = 345
                        self.expr(6)
                        pass

                    elif la_ == 7:
                        localctx = SchedulerParser.OverlapExprContext(self, SchedulerParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 346
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 347
                        self.match(SchedulerParser.OVERLAP)
                        self.state = 348
                        self.expr(5)
                        pass

                    elif la_ == 8:
                        localctx = SchedulerParser.InExprContext(self, SchedulerParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 349
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 350
                        self.match(SchedulerParser.IN)
                        self.state = 351
                        self.expr(4)
                        pass

             
                self.state = 356
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,30,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class TypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TYPENAME(self):
            return self.getToken(SchedulerParser.TYPENAME, 0)

        def structure(self):
            return self.getTypedRuleContext(SchedulerParser.StructureContext,0)


        def getRuleIndex(self):
            return SchedulerParser.RULE_type

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitType" ):
                return visitor.visitType(self)
            else:
                return visitor.visitChildren(self)




    def type_(self):

        localctx = SchedulerParser.TypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_type)
        try:
            self.state = 359
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6]:
                self.enterOuterAlt(localctx, 1)
                self.state = 357
                self.match(SchedulerParser.TYPENAME)
                pass
            elif token in [7, 8, 9]:
                self.enterOuterAlt(localctx, 2)
                self.state = 358
                self.structure()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StructureContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CLASSNAME(self):
            return self.getToken(SchedulerParser.CLASSNAME, 0)

        def DAYNAME(self):
            return self.getToken(SchedulerParser.DAYNAME, 0)

        def WEEKNAME(self):
            return self.getToken(SchedulerParser.WEEKNAME, 0)

        def getRuleIndex(self):
            return SchedulerParser.RULE_structure

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStructure" ):
                return visitor.visitStructure(self)
            else:
                return visitor.visitChildren(self)




    def structure(self):

        localctx = SchedulerParser.StructureContext(self, self._ctx, self.state)
        self.enterRule(localctx, 70, self.RULE_structure)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 361
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 896) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ValueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(SchedulerParser.INT, 0)

        def BOOL(self):
            return self.getToken(SchedulerParser.BOOL, 0)

        def STRING(self):
            return self.getToken(SchedulerParser.STRING, 0)

        def DATE(self):
            return self.getToken(SchedulerParser.DATE, 0)

        def TIME(self):
            return self.getToken(SchedulerParser.TIME, 0)

        def getRuleIndex(self):
            return SchedulerParser.RULE_value

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValue" ):
                return visitor.visitValue(self)
            else:
                return visitor.visitChildren(self)




    def value(self):

        localctx = SchedulerParser.ValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 72, self.RULE_value)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 363
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 279223176896970752) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommentsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMMENT_LINE(self):
            return self.getToken(SchedulerParser.COMMENT_LINE, 0)

        def COMMENT(self):
            return self.getToken(SchedulerParser.COMMENT, 0)

        def getRuleIndex(self):
            return SchedulerParser.RULE_comments

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComments" ):
                return visitor.visitComments(self)
            else:
                return visitor.visitChildren(self)




    def comments(self):

        localctx = SchedulerParser.CommentsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 74, self.RULE_comments)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 365
            _la = self._input.LA(1)
            if not(_la==60 or _la==61):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[33] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 10)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 9)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 8)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 7)
         

            if predIndex == 4:
                return self.precpred(self._ctx, 6)
         

            if predIndex == 5:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 6:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 7:
                return self.precpred(self._ctx, 3)
         




