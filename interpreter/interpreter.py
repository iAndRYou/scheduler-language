import sys
import os.path
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
    full_path = argv[1]
    el = ErrorListenerImpl()
    input_stream = FileStream(full_path)
    lexer = SchedulerLexer(input_stream)
    lexer.addErrorListener(el)
    stream = CommonTokenStream(lexer)
    parser = SchedulerParser(stream)
    parser.addErrorListener(el)
    tree = parser.prog()

    el = ErrorListener()

    visitor = VisitorImpl(debug=False, path=os.path.dirname(full_path))
    visitor.visit(tree)

 
if __name__ == '__main__':
    main(sys.argv)