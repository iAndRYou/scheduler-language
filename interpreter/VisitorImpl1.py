# Generated from ../Scheduler.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SchedulerParser import SchedulerParser
    from .SchedulerVisitor import SchedulerVisitor
    from .modules.types_structures import *
    from .modules.utils import *
    from .modules.variable_manager import *
    from .modules.operators.operator import operator_dict, apply_operator
    import os.path
    import json
else:
    from SchedulerParser import SchedulerParser
    from SchedulerVisitor import SchedulerVisitor
    from modules.types_structures import *
    from modules.utils import *
    from modules.variable_manager import *
    from modules.operators.operator import operator_dict, apply_operator
    import os.path
    import json

# This class defines a complete generic visitor for a parse tree produced by SchedulerParser.

class VisitorImpl1(SchedulerVisitor):

    def __init__(self, *args, gvm=None, **kwargs):
        if gvm is None:
            self.gvm = GlobalVariableManager()
        else:
            self.gvm = gvm

    # Visit a parse tree produced by SchedulerParser#prog.
    def visitProg(self, ctx:SchedulerParser.ProgContext):
        self.gvm = GlobalVariableManager()
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#code.
    def visitCode(self, ctx:SchedulerParser.CodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#instruction.
    def visitInstruction(self, ctx:SchedulerParser.InstructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#instruction_without_semicolon.
    def visitInstruction_without_semicolon(self, ctx:SchedulerParser.Instruction_without_semicolonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#canvas_instruction.
    def visitCanvas_instruction(self, ctx:SchedulerParser.Canvas_instructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#block.
    def visitBlock(self, ctx:SchedulerParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#print.
    def visitPrint(self, ctx:SchedulerParser.PrintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#load.
    def visitLoad(self, ctx:SchedulerParser.LoadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#dump.
    def visitDump(self, ctx:SchedulerParser.DumpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#file_path.
    def visitFile_path(self, ctx:SchedulerParser.File_pathContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#add.
    def visitAdd(self, ctx:SchedulerParser.AddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#update.
    def visitUpdate(self, ctx:SchedulerParser.UpdateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#delete.
    def visitDelete(self, ctx:SchedulerParser.DeleteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#get.
    def visitGet(self, ctx:SchedulerParser.GetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#start_date.
    def visitStart_date(self, ctx:SchedulerParser.Start_dateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#end_date.
    def visitEnd_date(self, ctx:SchedulerParser.End_dateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#Return.
    def visitReturn(self, ctx:SchedulerParser.ReturnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#Break.
    def visitBreak(self, ctx:SchedulerParser.BreakContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#loop.
    def visitLoop(self, ctx:SchedulerParser.LoopContext):
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
        if ctx.args():
            args = self.visit(ctx.args())
        else:
            args = []
        self.gvm.def_function(self.visit(ctx.type_()), ctx.VARNAME().getText(), ctx.block(), args, declare=True)


    # Visit a parse tree produced by SchedulerParser#args.
    def visitArgs(self, ctx:SchedulerParser.ArgsContext):
        return [self.visit(node) for node in ctx.arg()]


    # Visit a parse tree produced by SchedulerParser#arg.
    def visitArg(self, ctx:SchedulerParser.ArgContext):
        return (self.visit(ctx.type_()), ctx.VARNAME().getText())


    # Visit a parse tree produced by SchedulerParser#func_call.
    def visitFunc_call(self, ctx:SchedulerParser.Func_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#def.
    def visitDef(self, ctx:SchedulerParser.DefContext):
        if ctx.dayDef() or ctx.classDef():
            return self.visitChildren(ctx)
        else:
            name = ctx.VARNAME().getText()
            if ctx.COLLECTION_OF(): # collection
                self.gvm.def_collection(self.visit(ctx.type_()), name, None, declare=True)
            else: # variable
                self.gvm.def_variable(ctx.TYPENAME().getText(), name, None, declare=True)


    # Visit a parse tree produced by SchedulerParser#classDef.
    def visitClassDef(self, ctx:SchedulerParser.ClassDefContext):
        name = ctx.VARNAME().getText()
        self.gvm.def_class(name, None, declare=True)


    # Visit a parse tree produced by SchedulerParser#dayDef.
    def visitDayDef(self, ctx:SchedulerParser.DayDefContext):
        name = ctx.VARNAME().getText()
        self.gvm.def_day(name, None, declare=True)


    # Visit a parse tree produced by SchedulerParser#assign.
    def visitAssign(self, ctx:SchedulerParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#attribute.
    def visitAttribute(self, ctx:SchedulerParser.AttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#attribute_call.
    def visitAttribute_call(self, ctx:SchedulerParser.Attribute_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#day_attribute.
    def visitDay_attribute(self, ctx:SchedulerParser.Day_attributeContext):
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
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#EqualExpr.
    def visitEqualExpr(self, ctx:SchedulerParser.EqualExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#Parenthesis.
    def visitParenthesis(self, ctx:SchedulerParser.ParenthesisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#AddSub.
    def visitAddSub(self, ctx:SchedulerParser.AddSubContext):
        return self.visitChildren(ctx)


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
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#InExpr.
    def visitInExpr(self, ctx:SchedulerParser.InExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#OrExpr.
    def visitOrExpr(self, ctx:SchedulerParser.OrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#MultDiv.
    def visitMultDiv(self, ctx:SchedulerParser.MultDivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#type.
    def visitType(self, ctx:SchedulerParser.TypeContext):
        types = []

        if ctx.COLLECTION_OF():
            types.append(ctx.COLLECTION_OF().getText())

        if ctx.TYPENAME():
            types.append(ctx.TYPENAME().getText())
        else:
            types.append(self.visit(ctx.structure()))

        return " ".join(types)


    # Visit a parse tree produced by SchedulerParser#structure.
    def visitStructure(self, ctx:SchedulerParser.StructureContext):
        return ctx.getText()


    # Visit a parse tree produced by SchedulerParser#value.
    def visitValue(self, ctx:SchedulerParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#comments.
    def visitComments(self, ctx:SchedulerParser.CommentsContext):
        return self.visitChildren(ctx)



del SchedulerParser