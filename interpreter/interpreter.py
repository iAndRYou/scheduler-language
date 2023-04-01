import sys
from antlr4 import *
from SchedulerLexer import SchedulerLexer
from SchedulerParser import SchedulerParser
from VisitorImpl import VisitorImpl
from antlr4.error.ErrorListener import ErrorListener

class ErrorListenerImpl(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        exit()

    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
        pass

    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        pass

    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        pass
 
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = SchedulerLexer(input_stream)
    el = ErrorListenerImpl()
    lexer.addErrorListener(el)
    stream = CommonTokenStream(lexer)
    parser = SchedulerParser(stream)
    parser.addErrorListener(el)
    tree = parser.prog()

    el = ErrorListener()

    visitor = VisitorImpl()
    visitor.visit(tree)

 
if __name__ == '__main__':
    main(sys.argv)