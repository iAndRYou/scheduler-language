# Generated from ./scheduler-language/Scheduler.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SchedulerParser import SchedulerParser
    from .SchedulerVisitor import SchedulerVisitor
    from .utils import *
else:
    from SchedulerParser import SchedulerParser
    from SchedulerVisitor import SchedulerVisitor
    from utils import *

# This class defines a complete generic visitor for a parse tree produced by SchedulerParser.

class VisitorImpl(SchedulerVisitor):

    # Visit a parse tree produced by SchedulerParser#prog.
    def visitProg(self, ctx:SchedulerParser.ProgContext):
        self.gvm = GlobalVariableManager()
        self.canvas = Canvas()

        self.visitChildren(ctx)
        print(self.gvm)
        self.canvas.print()


    # Visit a parse tree produced by SchedulerParser#code.
    def visitCode(self, ctx:SchedulerParser.CodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#instruction.
    def visitInstruction(self, ctx:SchedulerParser.InstructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#canvas_instruction.
    def visitCanvas_instruction(self, ctx:SchedulerParser.Canvas_instructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#block.
    def visitBlock(self, ctx:SchedulerParser.BlockContext):
        self.gvm.vms.append(VariableManager())
        self.visitChildren(ctx)
        del self.gvm.vms[-1]


    # Visit a parse tree produced by SchedulerParser#add.
    def visitAdd(self, ctx:SchedulerParser.AddContext):
        get_args = dict([self.visit(elem) for elem in ctx.get_arg()])

        if self.visit(ctx.structure()) == 'CLASS':
            class_name, class_date = self.visit(ctx.expr()), parse_date(get_args['DATE'])
            class_ = self.gvm.access_variable(class_name)[1]
            self.canvas.add_class(class_, class_date)


    # Visit a parse tree produced by SchedulerParser#structure.
    def visitStructure(self, ctx:SchedulerParser.StructureContext):
        return ctx.getText()


    # Visit a parse tree produced by SchedulerParser#update.
    def visitUpdate(self, ctx:SchedulerParser.UpdateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#delete.
    def visitDelete(self, ctx:SchedulerParser.DeleteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#get.
    def visitGet(self, ctx:SchedulerParser.GetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#get_arg.
    def visitGet_arg(self, ctx:SchedulerParser.Get_argContext):
        if ctx.TYPENAME():
            return (ctx.TYPENAME().getText(), self.visit(ctx.value()))
        else:
            return (self.visit(ctx.attribute()), self.visit(ctx.value()))


    # Visit a parse tree produced by SchedulerParser#start_date.
    def visitStart_date(self, ctx:SchedulerParser.Start_dateContext):
        date_ = ctx.DATE().getText()
        self.canvas.start_date = parse_date(date_)


    # Visit a parse tree produced by SchedulerParser#end_date.
    def visitEnd_date(self, ctx:SchedulerParser.End_dateContext):
        date_ = ctx.DATE().getText()
        self.canvas.end_date = parse_date(date_)


    # Visit a parse tree produced by SchedulerParser#Return.
    def visitReturn(self, ctx:SchedulerParser.ReturnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#Break.
    def visitBreak(self, ctx:SchedulerParser.BreakContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#ForLoop.
    def visitForLoop(self, ctx:SchedulerParser.ForLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#WhileLoop.
    def visitWhileLoop(self, ctx:SchedulerParser.WhileLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#for_loop.
    def visitFor_loop(self, ctx:SchedulerParser.For_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#while_loop.
    def visitWhile_loop(self, ctx:SchedulerParser.While_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#if_statement.
    def visitIf_statement(self, ctx:SchedulerParser.If_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#condition.
    def visitCondition(self, ctx:SchedulerParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#function.
    def visitFunction(self, ctx:SchedulerParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#args.
    def visitArgs(self, ctx:SchedulerParser.ArgsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#arg.
    def visitArg(self, ctx:SchedulerParser.ArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#func_call.
    def visitFunc_call(self, ctx:SchedulerParser.Func_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#def.
    def visitDef(self, ctx:SchedulerParser.DefContext):
        if ctx.dayDef() or ctx.classDef() or ctx.weekDef():
            self.visitChildren(ctx)
        else:
            # collection
            if ctx.COLLECTION_OF():
                pass
            # variable
            else:
                self.gvm.def_variable(ctx.TYPENAME().getText(), ctx.VARNAME().getText(), self.visit(ctx.expr()))


    # Visit a parse tree produced by SchedulerParser#classDef.
    def visitClassDef(self, ctx:SchedulerParser.ClassDefContext):
        attrs = list(map(lambda x: x.getText().lower(), ctx.CLASS_ATTRIBUTE()))
        attr_values = list(map(lambda x: x.getText(), ctx.expr()))

        self.gvm.def_class(ctx.VARNAME().getText(), dict(zip(attrs, attr_values)))


    # Visit a parse tree produced by SchedulerParser#dayDef.
    def visitDayDef(self, ctx:SchedulerParser.DayDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#weekDef.
    def visitWeekDef(self, ctx:SchedulerParser.WeekDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#assign.
    def visitAssign(self, ctx:SchedulerParser.AssignContext):
        if ctx.attribute() is None:
            self.gvm.assign_variable(ctx.VARNAME().getText(), self.visit(ctx.expr()))
        else:
            self.gvm.assign_attribute(ctx.VARNAME().getText(), self.visit(ctx.attribute()).lower(), self.visit(ctx.expr()))


    # Visit a parse tree produced by SchedulerParser#attribute.
    def visitAttribute(self, ctx:SchedulerParser.AttributeContext):
        return ctx.getText()


    # Visit a parse tree produced by SchedulerParser#attribute_call.
    def visitAttribute_call(self, ctx:SchedulerParser.Attribute_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#collection.
    def visitCollection(self, ctx:SchedulerParser.CollectionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#collection_elements.
    def visitCollection_elements(self, ctx:SchedulerParser.Collection_elementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#collection_element.
    def visitCollection_element(self, ctx:SchedulerParser.Collection_elementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#collection_subscription.
    def visitCollection_subscription(self, ctx:SchedulerParser.Collection_subscriptionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#AndExpr.
    def visitAndExpr(self, ctx:SchedulerParser.AndExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#ValueExpr.
    def visitValueExpr(self, ctx:SchedulerParser.ValueExprContext):
        if ctx.collection():
            return self.visit(ctx.collection())
        elif ctx.value():
            return self.visit(ctx.value())
        else:
            return self.gvm.access_variable(ctx.VARNAME().getText())[1] # return the value of the variable


    # Visit a parse tree produced by SchedulerParser#EqualExpr.
    def visitEqualExpr(self, ctx:SchedulerParser.EqualExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#Parenthesis.
    def visitParenthesis(self, ctx:SchedulerParser.ParenthesisContext):
        return self.visit(ctx.expr())


    # Visit a parse tree produced by SchedulerParser#AddSub.
    def visitAddSub(self, ctx:SchedulerParser.AddSubContext):
        if ctx.op.text == '+':
            return self.visit(ctx.expr(0)) + self.visit(ctx.expr(1))
        else:
            return self.visit(ctx.expr(0)) - self.visit(ctx.expr(1))


    # Visit a parse tree produced by SchedulerParser#Calls.
    def visitCalls(self, ctx:SchedulerParser.CallsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#OverlapExpr.
    def visitOverlapExpr(self, ctx:SchedulerParser.OverlapExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#Compare.
    def visitCompare(self, ctx:SchedulerParser.CompareContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#NotExpr.
    def visitNotExpr(self, ctx:SchedulerParser.NotExprContext):
        return not self.visit(ctx.expr()) 


    # Visit a parse tree produced by SchedulerParser#InExpr.
    def visitInExpr(self, ctx:SchedulerParser.InExprContext):
        return (self.visit(ctx.expr(0)) in self.visit(ctx.expr(1)))


    # Visit a parse tree produced by SchedulerParser#OrExpr.
    def visitOrExpr(self, ctx:SchedulerParser.OrExprContext):
        return (self.visit(ctx.expr(0)) or self.visit(ctx.expr(1)))


    # Visit a parse tree produced by SchedulerParser#MultDiv.
    def visitMultDiv(self, ctx:SchedulerParser.MultDivContext):
        if ctx.op.text == '*':
            return self.visit(ctx.expr(0)) * self.visit(ctx.expr(1))
        else:
            return self.visit(ctx.expr(0)) / self.visit(ctx.expr(1))


    # Visit a parse tree produced by SchedulerParser#value.
    def visitValue(self, ctx:SchedulerParser.ValueContext):
        for type in TYPES:
            if ctx.__getattribute__(type)() is not None:
                return self.gvm.parse_value(type, ctx.getText())


    # Visit a parse tree produced by SchedulerParser#comments.
    def visitComments(self, ctx:SchedulerParser.CommentsContext):
        return self.visitChildren(ctx)



del SchedulerParser