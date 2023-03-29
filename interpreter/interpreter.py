import sys
from antlr4 import *
from SchedulerLexer import SchedulerLexer
from SchedulerParser import SchedulerParser
from VisitorImpl import VisitorImpl
 
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = SchedulerLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = SchedulerParser(stream)
    tree = parser.prog()

    visitor = VisitorImpl()
    visitor.visit(tree)

 
if __name__ == '__main__':
    main(sys.argv)