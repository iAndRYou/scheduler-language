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

    def __init__(self, debug, *args, **kwargs):
        super().__init__(*args, **kwargs)
        self.debug = debug

    # Visit a parse tree produced by SchedulerParser#prog.
    def visitProg(self, ctx:SchedulerParser.ProgContext):
        self.gvm = GlobalVariableManager()
        self.canvas = Canvas()
        self.return_ = False
        self.break_ = False

        self.visitChildren(ctx)
        if self.debug:
            print(self.gvm)
        self.canvas.print()


    # Visit a parse tree produced by SchedulerParser#code.
    def visitCode(self, ctx:SchedulerParser.CodeContext):
        for instr in ctx.children:
            r = self.visit(instr)
            if self.return_:
                return r
            elif self.break_:
                return



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
        self.gvm.vms.append(VariableManager())
        return_val = self.visit(ctx.code())
        del self.gvm.vms[-1]
        return return_val


    # Visit a parse tree produced by SchedulerParser#add.
    def visitAdd(self, ctx:SchedulerParser.AddContext):
        structure = self.visit(ctx.structure())

        dates = []
        if ctx.DATESTOKEN():
            for date_ in self.visit(ctx.expr(1)):
                dates.append(self.gvm.cast_value('DATE', date_))
        else:
            dates.append(self.gvm.cast_value('DATE', self.visit(ctx.expr(1))))

        add_func = self.canvas.add_class if structure == 'CLASS' else (self.canvas.add_day if structure == 'DAY' else None)

        for date_ in dates:
            add_func(self.visit(ctx.expr(0)), date_)


    # Visit a parse tree produced by SchedulerParser#structure.
    def visitStructure(self, ctx:SchedulerParser.StructureContext):
        return ctx.getText()


    # Visit a parse tree produced by SchedulerParser#update.
    def visitUpdate(self, ctx:SchedulerParser.UpdateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#delete.
    def visitDelete(self, ctx:SchedulerParser.DeleteContext):
        condition = ctx.condition()
        is_variable = bool(ctx.VARNAME())
        if is_variable:
            tmp_name = ctx.VARNAME().getText()

        if ctx.CLASSESTOKEN():
            if not condition:
                classes = self.canvas.get_all_classes()
                self.canvas.days = dict()
                return classes

            classes = []
            day_keys_to_del = []
            if is_variable:
                self.gvm.tmp_vm._def_class(tmp_name, dict())
            self.gvm.tmp_vm._def_variable('DATE', 'date', date(2023, 1, 1))

            for date_, day in self.canvas.days.items():
                class_indices_to_del = []
                for j, elem in enumerate(day.classes):
                    if is_variable:
                        self.gvm.tmp_vm._assign_variable(tmp_name, elem)
                    self.gvm.tmp_vm._assign_variable('date', date_)
                    satisfied = self.visit(condition)
                    if satisfied:
                        class_indices_to_del.append(j)
                        classes.append(elem)
                for ind in class_indices_to_del[::-1]:
                    del self.canvas.days[date_].classes[ind]
                if len(self.canvas.days[date_].classes) == 0:
                    day_keys_to_del.append(date_)
            
            for key in day_keys_to_del:
                del self.canvas.days[key]
            
            if is_variable:
                self.gvm.tmp_vm._del_variable(tmp_name)
            self.gvm.tmp_vm._del_variable('date')
            
            return classes


        elif ctx.DAYSTOKEN():
            if not condition:
                days = self.canvas.days.values()
                self.canvas.days = dict()
                return days
            
            day_keys_to_del = []
            days = []
            if is_variable:
                self.gvm.tmp_vm._def_day(tmp_name, [])
            self.gvm.tmp_vm._def_variable('DATE', 'date', date(2023, 1, 1))

            for date_, day in self.canvas.days.items():
                if is_variable:
                    self.gvm.tmp_vm._assign_variable(tmp_name, day)
                self.gvm.tmp_vm._assign_variable('date', date_)
                if self.visit(condition):
                    day_keys_to_del.append(date_)
                    days.append(day)
            
            for key in day_keys_to_del:
                del self.canvas.days[key]
            
            if is_variable:
                self.gvm.tmp_vm._del_variable(tmp_name)
            self.gvm.tmp_vm._del_variable('date')
            
            return days


    # Visit a parse tree produced by SchedulerParser#get.
    def visitGet(self, ctx:SchedulerParser.GetContext):
        condition = ctx.condition()
        is_variable = bool(ctx.VARNAME())
        if is_variable:
            tmp_name = ctx.VARNAME().getText()

        self.gvm.tmp_vm._def_variable('DATE', 'date', date(2023, 1, 1))
        if ctx.CLASSESTOKEN():
            elems = [(date_, class_) for date_, day in self.canvas.days.items() for class_ in day.classes]
            if is_variable:
                self.gvm.tmp_vm._def_class(tmp_name, dict())
        elif ctx.DAYSTOKEN():
            elems = self.canvas.days.items()
            if is_variable:
                self.gvm.tmp_vm._def_day(tmp_name, [])
        else:
            raise Exception()

        result = [] 

        if not condition:
            if ctx.DISTINCT():
                for date_, elem in elems:
                    satisfied = True
                    for r in result:
                        if elem == r:
                            satisfied = False
                            break
                    if satisfied:
                        result.append(elem)
                return result
            else:
                return elems

        for date_, elem in elems:
            if is_variable:
                self.gvm.tmp_vm._assign_variable(tmp_name, elem)
            self.gvm.tmp_vm._assign_variable('date', date_)
            satisfied = self.visit(condition)
            if satisfied and ctx.DISTINCT():
                for r in result:
                    if elem == r:
                        satisfied = False
                        break
            if satisfied:
                result.append(elem)
        
        if is_variable:
            self.gvm.tmp_vm._del_variable(tmp_name)
        self.gvm.tmp_vm._del_variable('date')

        return result


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
        self.return_ = True
        if ctx.expr():
            return self.visit(ctx.expr())
        else:
            return None


    # Visit a parse tree produced by SchedulerParser#Break.
    def visitBreak(self, ctx:SchedulerParser.BreakContext):
        self.break_ = True
        return


    # Visit a parse tree produced by SchedulerParser#for_loop.
    def visitFor_loop(self, ctx:SchedulerParser.For_loopContext):
        type = self.visit(ctx.type_())
        for elem in self.visit(ctx.expr()):
            self.gvm.def_variable(type, ctx.VARNAME().getText(), elem)
            r = self.visit(ctx.block())
            self.gvm.del_variable(ctx.VARNAME().getText())

            if self.break_:
                self.break_ = False
                return
            elif self.return_:
                return r


    # Visit a parse tree produced by SchedulerParser#while_loop.
    def visitWhile_loop(self, ctx:SchedulerParser.While_loopContext):
        while self.visit(ctx.condition()):
            r = self.visit(ctx.block())

            if self.break_:
                self.break_ = False
                return
            elif self.return_:
                return r


    # Visit a parse tree produced by SchedulerParser#if_statement.
    def visitIf_statement(self, ctx:SchedulerParser.If_statementContext):
        conditions, blocks = ctx.condition(), ctx.block()
        for cond, block in zip(conditions, blocks):
            if self.visit(cond):
                return self.visit(block)
        if ctx.ELSE():
            return self.visit(blocks[-1])


    # Visit a parse tree produced by SchedulerParser#condition.
    def visitCondition(self, ctx:SchedulerParser.ConditionContext):
        return self.visit(ctx.expr())


    # Visit a parse tree produced by SchedulerParser#function.
    def visitFunction(self, ctx:SchedulerParser.FunctionContext):
        if ctx.args():
            args = self.visit(ctx.args())
        else:
            args = []
        self.gvm.def_function(self.visit(ctx.type_()), ctx.VARNAME().getText(), ctx.block(), args)


    # Visit a parse tree produced by SchedulerParser#args.
    def visitArgs(self, ctx:SchedulerParser.ArgsContext):
        return [self.visit(node) for node in ctx.arg()]


    # Visit a parse tree produced by SchedulerParser#arg.
    def visitArg(self, ctx:SchedulerParser.ArgContext):
        return (self.visit(ctx.type_()), ctx.VARNAME().getText())


    # Visit a parse tree produced by SchedulerParser#func_call.
    def visitFunc_call(self, ctx:SchedulerParser.Func_callContext):
        name = ctx.VARNAME().getText()
        arg_vals = [self.visit(node) for node in ctx.expr()]
        return_type, node, args = self.gvm.access_function(name)

        for (arg_type, arg_name), arg_val in zip(args, arg_vals):
            self.gvm.def_variable(arg_type, arg_name, arg_val)
        
        return_value = self.visit(node)

        self.return_ = False
        
        for arg_type, arg_name in args:
            self.gvm.del_variable(arg_name)
        
        return self.gvm.cast_value(return_type, return_value)


    # Visit a parse tree produced by SchedulerParser#def.
    def visitDef(self, ctx:SchedulerParser.DefContext):
        if ctx.dayDef() or ctx.classDef() or ctx.weekDef():
            return self.visitChildren(ctx)
        else:
            # collection
            if ctx.COLLECTION_OF():
                self.gvm.def_collection(self.visit(ctx.type_()), ctx.VARNAME().getText(), self.visit(ctx.expr()))
            # variable
            else:
                self.gvm.def_variable(ctx.TYPENAME().getText(), ctx.VARNAME().getText(), self.visit(ctx.expr()))
            return self.gvm.access_variable(ctx.VARNAME().getText())[1]


    # Visit a parse tree produced by SchedulerParser#classDef.
    def visitClassDef(self, ctx:SchedulerParser.ClassDefContext):
        attrs = list(map(lambda x: x.getText().lower(), ctx.CLASS_ATTRIBUTE()))
        attr_values = list(map(lambda x: self.visit(x), ctx.expr()))

        self.gvm.def_class(ctx.VARNAME().getText(), dict(zip(attrs, attr_values)))
        return self.gvm.access_variable(ctx.VARNAME().getText())[1]


    # Visit a parse tree produced by SchedulerParser#dayDef.
    def visitDayDef(self, ctx:SchedulerParser.DayDefContext):
        name = ctx.VARNAME().getText()
        classes = self.visit(ctx.collection())
        self.gvm.def_day(name, classes)
        return self.gvm.access_variable(ctx.VARNAME().getText())[1]


    # Visit a parse tree produced by SchedulerParser#weekDef.
    def visitWeekDef(self, ctx:SchedulerParser.WeekDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#assign.
    def visitAssign(self, ctx:SchedulerParser.AssignContext):
        if ctx.attribute():
            self.gvm.assign_attribute(ctx.VARNAME().getText(), self.visit(ctx.attribute()).lower(), self.visit(ctx.expr()))
        else:
            self.gvm.assign_variable(ctx.VARNAME().getText(), self.visit(ctx.expr()))


    # Visit a parse tree produced by SchedulerParser#attribute.
    def visitAttribute(self, ctx:SchedulerParser.AttributeContext):
        return ctx.getText()


    # Visit a parse tree produced by SchedulerParser#attribute_call.
    def visitAttribute_call(self, ctx:SchedulerParser.Attribute_callContext):
        var_name = ctx.VARNAME().getText()
        attr_name = self.visit(ctx.attribute()).lower()

        var = self.gvm.access_variable(var_name)[1]
        return var.__getattribute__(attr_name)


    # Visit a parse tree produced by SchedulerParser#collection.
    def visitCollection(self, ctx:SchedulerParser.CollectionContext):
        if ctx.collection_elements():
            return self.visit(ctx.collection_elements())
        else:
            return []


    # Visit a parse tree produced by SchedulerParser#collection_elements.
    def visitCollection_elements(self, ctx:SchedulerParser.Collection_elementsContext):
        return [self.visit(col_elem) for col_elem in ctx.collection_element()]


    # Visit a parse tree produced by SchedulerParser#collection_element.
    def visitCollection_element(self, ctx:SchedulerParser.Collection_elementContext):
        return self.visit(ctx.expr())


    # Visit a parse tree produced by SchedulerParser#collection_subscription.
    def visitCollection_subscription(self, ctx:SchedulerParser.Collection_subscriptionContext):
        return self.gvm.access_variable(ctx.VARNAME().getText())[1][self.visit(ctx.expr())]


    # Visit a parse tree produced by SchedulerParser#AndExpr.
    def visitAndExpr(self, ctx:SchedulerParser.AndExprContext):
        return (self.visit(ctx.expr(0)) and self.visit(ctx.expr(1)))


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
        if ctx.op.text == '==':
            return self.visit(ctx.expr(0)) == self.visit(ctx.expr(1))
        else:
            return self.visit(ctx.expr(0)) != self.visit(ctx.expr(1))


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
        if ctx.op.text == '<':
            return (self.visit(ctx.expr(0)) < self.visit(ctx.expr(1)))
        elif ctx.op.text == '<=':
            return (self.visit(ctx.expr(0)) <= self.visit(ctx.expr(1)))
        elif ctx.op.text == '>':
            return (self.visit(ctx.expr(0)) > self.visit(ctx.expr(1)))
        elif ctx.op.text == '>=':
            return (self.visit(ctx.expr(0)) >= self.visit(ctx.expr(1)))


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
    
    def visitType(self, ctx:SchedulerParser.TypeContext):
        s = ""

        if ctx.COLLECTION_OF():
            s += ctx.COLLECTION_OF().getText()

        if ctx.TYPENAME():
            s += ctx.TYPENAME().getText()
        else:
            s += self.visit(ctx.structure())

        return s

    # Visit a parse tree produced by SchedulerParser#print.
    def visitPrint(self, ctx:SchedulerParser.PrintContext):
        print(self.visit(ctx.expr()))



del SchedulerParser