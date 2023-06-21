# Generated from ./scheduler-language/Scheduler.g4 by ANTLR 4.12.0
from antlr4 import *
import os.path
import json
if __name__ is not None and "." in __name__:
    from .SchedulerParser import SchedulerParser
    from .SchedulerVisitor import SchedulerVisitor
    from .modules.types_structures import *
    from .modules.utils import *
    from .modules.variable_manager import *
    from .modules.operators.operator import operator_dict, apply_operator
else:
    from SchedulerParser import SchedulerParser
    from SchedulerVisitor import SchedulerVisitor
    from modules.types_structures import *
    from modules.utils import *
    from modules.variable_manager import *
    from modules.operators.operator import operator_dict, apply_operator

# This class defines a complete generic visitor for a parse tree produced by SchedulerParser.

class VisitorImpl(SchedulerVisitor):

    def __init__(self, debug, path, *args, gvm=None, **kwargs):
        super().__init__(*args, **kwargs)
        self.debug = debug
        self.path = path
        if gvm is None:
            self.gvm = GlobalVariableManager()
        else:
            self.gvm = gvm

    # Visit a parse tree produced by SchedulerParser#prog.
    def visitProg(self, ctx:SchedulerParser.ProgContext):
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
            for date_ in self.visit(ctx.expr(1))[1]:
                dates.append(self.gvm.cast_value('DATE', date_))
        else:
            dates.append(self.gvm.cast_value('DATE', self.visit(ctx.expr(1))[1]))

        add_func = self.canvas.add_class if structure == 'CLASS' else (self.canvas.add_day if structure == 'DAY' else None)

        for date_ in dates:
            add_func(self.visit(ctx.expr(0))[1], date_)


    # Visit a parse tree produced by SchedulerParser#structure.
    def visitStructure(self, ctx:SchedulerParser.StructureContext):
        return ctx.getText()


    # Visit a parse tree produced by SchedulerParser#update.
    def visitUpdate(self, ctx:SchedulerParser.UpdateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#delete.
    def visitDelete(self, ctx:SchedulerParser.DeleteContext):
        condition = ctx.condition()
        tmp_variable = bool(ctx.VARNAME())
        if tmp_variable:
            tmp_name = ctx.VARNAME().getText()

        if ctx.CLASSESTOKEN():
            if not condition:
                classes = self.canvas.get_all_classes()
                self.canvas.days = dict()
                return classes

            classes = []
            day_keys_to_del = []

            if tmp_variable:
                self.gvm.def_class(tmp_name, dict(), tmp_vm=True)
            self.gvm.def_variable('DATE', 'date', date(2023, 1, 1), tmp_vm=True)

            for date_, day in self.canvas.days.items():
                class_indices_to_del = []
                for j, elem in enumerate(day.classes):
                    if tmp_variable:
                        self.gvm.assign_variable(tmp_name, elem)
                    self.gvm.assign_variable('date', date_)
                    satisfied = self.visit(condition)
                    if satisfied:
                        class_indices_to_del.append(j)
                        classes.append(elem)

                # delete classes in reverse order
                for ind in class_indices_to_del[::-1]:
                    del self.canvas.days[date_].classes[ind]

                # if day is empty, queue it for deletion
                if len(self.canvas.days[date_].classes) == 0:
                    day_keys_to_del.append(date_)
            
            # delete empty days
            for key in day_keys_to_del:
                del self.canvas.days[key]
            
            if tmp_variable:
                self.gvm.del_variable(tmp_name)
            self.gvm.del_variable('date')
            
            return classes


        elif ctx.DAYSTOKEN():
            if not condition:
                days = self.canvas.days.values()
                self.canvas.days = dict()
                return days
            
            day_keys_to_del = []
            days = []
            if tmp_variable:
                self.gvm.def_day(tmp_name, [], tmp_vm=True)
            self.gvm.def_variable('DATE', 'date', date(2023, 1, 1), tmp_vm=True)

            for date_, day in self.canvas.days.items():
                if tmp_variable:
                    self.gvm.assign_variable(tmp_name, day)
                self.gvm.assign_variable('date', date_)
                if self.visit(condition):
                    day_keys_to_del.append(date_)
                    days.append(day)
            
            for key in day_keys_to_del:
                del self.canvas.days[key]
            
            if tmp_variable:
                self.gvm.del_variable(tmp_name)
            self.gvm.del_variable('date')
            
            return days


    # Visit a parse tree produced by SchedulerParser#get.
    def visitGet(self, ctx:SchedulerParser.GetContext):
        condition = ctx.condition()
        tmp_variable = bool(ctx.VARNAME())
        if tmp_variable:
            tmp_var_name = ctx.VARNAME().getText()

        self.gvm.def_variable('DATE', 'date', date(2023, 1, 1), tmp_vm=True)
        if ctx.CLASSESTOKEN():
            rtype = 'COLLECTION OF CLASS'
            dates_elems = [(date_, class_) for date_, day in self.canvas.days.items() for class_ in day.classes]
            if tmp_variable:
                self.gvm.def_class(tmp_var_name, dict(), tmp_vm=True)
        elif ctx.DAYSTOKEN():
            rtype = 'COLLECTION OF DAY'
            dates_elems = self.canvas.days.items()
            if tmp_variable:
                self.gvm.def_day(tmp_var_name, [], tmp_vm=True)
        else:
            raise Exception()

        result = [] 

        if not condition:
            if ctx.DISTINCT():
                for date_, elem in dates_elems:
                    if elem not in result:
                        result.append(elem)
                return result
            else:
                return [elem[1] for elem in dates_elems]

        for date_, elem in dates_elems:
            if tmp_variable:
                self.gvm.assign_variable(tmp_var_name, elem)
            self.gvm.assign_variable('date', date_)
            satisfied = self.visit(condition)
            if ctx.DISTINCT():
                satisfied = satisfied and elem not in result
            if satisfied:
                result.append(elem)
        
        if tmp_variable:
            self.gvm.del_variable(tmp_var_name)
        self.gvm.del_variable('date')

        return [rtype, result]


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
        if ctx.expr():
            return_value = self.visit(ctx.expr())[1]
            self.return_ = True
            return return_value
        else:
            self.return_ = True
            return None


    # Visit a parse tree produced by SchedulerParser#Break.
    def visitBreak(self, ctx:SchedulerParser.BreakContext):
        self.break_ = True
        return


    # Visit a parse tree produced by SchedulerParser#for_loop.
    def visitFor_loop(self, ctx:SchedulerParser.For_loopContext):
        type = self.visit(ctx.type_())
        for elem in self.visit(ctx.expr())[1]:
            elem = elem[1]
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
        return self.visit(ctx.expr())[1]


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
        arg_types_vals = [self.visit(node) for node in ctx.expr()]
        arg_vals = [arg_val for arg_type, arg_val in arg_types_vals]
        arg_types = [arg_type if arg_type is not None else determine_type(arg_val) for arg_type, arg_val in arg_types_vals] 
        return_type, node, args = self.gvm.access_function(name, arg_types)

        # define variables in the new scope
        for (arg_type, arg_name), arg_val in zip(args, arg_vals):
            self.gvm.def_variable(arg_type, arg_name, arg_val)

        return_value = self.visit(node)

        self.return_ = False

        # delete all variables while leaving the scope 
        for arg_type, arg_name in args:
            self.gvm.del_variable(arg_name)
        
        return [return_type, self.gvm.cast_value(return_type, return_value)]


    # Visit a parse tree produced by SchedulerParser#def.
    def visitDef(self, ctx:SchedulerParser.DefContext):
        if ctx.dayDef() or ctx.classDef():
            return self.visitChildren(ctx)
        else:
            # collection
            if ctx.COLLECTION_OF():
                self.gvm.def_collection(self.visit(ctx.type_()), ctx.VARNAME().getText(), self.visit(ctx.expr())[1])
            # variable
            else:
                self.gvm.def_variable(ctx.TYPENAME().getText(), ctx.VARNAME().getText(), self.visit(ctx.expr())[1])
            return self.gvm.access_variable(ctx.VARNAME().getText())[1]


    # Visit a parse tree produced by SchedulerParser#classDef.
    def visitClassDef(self, ctx:SchedulerParser.ClassDefContext):
        attrs = list(map(lambda x: x.getText().lower(), ctx.CLASS_ATTRIBUTE()))
        attr_values = list(map(lambda x: self.visit(x)[1], ctx.expr()))

        self.gvm.def_class(ctx.VARNAME().getText(), dict(zip(attrs, attr_values)))
        return self.gvm.access_variable(ctx.VARNAME().getText())[1]


    # Visit a parse tree produced by SchedulerParser#dayDef.
    def visitDayDef(self, ctx:SchedulerParser.DayDefContext):
        name = ctx.VARNAME().getText()
        if ctx.expr():
            classes = self.gvm.cast_value("COLLECTION OF CLASS", self.visit(ctx.expr())[1])
        else:
            classes = []
        self.gvm.def_day(name, classes)
        return self.gvm.access_variable(ctx.VARNAME().getText())[1]


    # Visit a parse tree produced by SchedulerParser#assign.
    def visitAssign(self, ctx:SchedulerParser.AssignContext):
        if ctx.attribute():
            self.gvm.assign_attribute(ctx.VARNAME().getText(), self.visit(ctx.attribute()).lower(), self.visit(ctx.expr())[1])
        else:
            self.gvm.assign_variable(ctx.VARNAME().getText(), self.visit(ctx.expr())[1])


    # Visit a parse tree produced by SchedulerParser#attribute.
    def visitAttribute(self, ctx:SchedulerParser.AttributeContext):
        if ctx.day_attribute(): # day attribute
            return self.visit(ctx.day_attribute())
        else: # class attribute
            return ctx.getText()


    # Visit a parse tree produced by SchedulerParser#attribute_call.
    def visitAttribute_call(self, ctx:SchedulerParser.Attribute_callContext):
        var_name = ctx.VARNAME().getText()
        attr_name = self.visit(ctx.attribute()).lower()

        var = self.gvm.access_variable(var_name)[1]
        return [ATTRIBUTES[attr_name], var.__getattribute__(attr_name)]


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
        return self.visit(ctx.expr())[1]


    # Visit a parse tree produced by SchedulerParser#collection_subscription.
    def visitCollection_subscription(self, ctx:SchedulerParser.Collection_subscriptionContext):
        return self.gvm.access_variable(ctx.VARNAME().getText())[1][self.visit(ctx.expr())[1]]


    # Visit a parse tree produced by SchedulerParser#AndExpr.
    def visitAndExpr(self, ctx:SchedulerParser.AndExprContext):
        a_type, a = self.visit(ctx.expr(0))
        b_type, b = self.visit(ctx.expr(1))
        return [None, apply_operator('AND', [a, b], arg_types=[a_type, b_type])]
        # return (self.visit(ctx.expr(0)) and self.visit(ctx.expr(1)))


    # Visit a parse tree produced by SchedulerParser#ValueExpr.
    def visitValueExpr(self, ctx:SchedulerParser.ValueExprContext):
        if ctx.collection():
            return [None, self.visit(ctx.collection())]
        elif ctx.value():
            return [None, self.visit(ctx.value())]
        else:
            var_type, value = self.gvm.access_variable(ctx.VARNAME().getText())
            return [var_type, value]


    # Visit a parse tree produced by SchedulerParser#EqualExpr.
    def visitEqualExpr(self, ctx:SchedulerParser.EqualExprContext):
        a_type, a = self.visit(ctx.expr(0))
        b_type, b = self.visit(ctx.expr(1))
        return [None, apply_operator(ctx.op.text, [a, b], arg_types=[a_type, b_type])]


    # Visit a parse tree produced by SchedulerParser#Parenthesis.
    def visitParenthesis(self, ctx:SchedulerParser.ParenthesisContext):
        t, v = self.visit(ctx.expr())
        return [t, v]


    # Visit a parse tree produced by SchedulerParser#AddSub.
    def visitAddSub(self, ctx:SchedulerParser.AddSubContext):
        a_type, a = self.visit(ctx.expr(0))
        b_type, b = self.visit(ctx.expr(1))
        return [None, apply_operator(ctx.op.text, [a, b], arg_types=[a_type, b_type])]

    # Visit a parse tree produced by SchedulerParser#Calls.
    def visitCalls(self, ctx:SchedulerParser.CallsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SchedulerParser#OverlapExpr.
    def visitOverlapExpr(self, ctx:SchedulerParser.OverlapExprContext):
        a_type, a = self.visit(ctx.expr(0))
        b_type, b = self.visit(ctx.expr(1))
        return [None, apply_operator('@', [a, b], arg_types=[a_type, b_type])]
        # return (self.visit(ctx.expr(0)) @ self.visit(ctx.expr(1)))


    # Visit a parse tree produced by SchedulerParser#Compare.
    def visitCompare(self, ctx:SchedulerParser.CompareContext):
        a_type, a = self.visit(ctx.expr(0))
        b_type, b = self.visit(ctx.expr(1))
        return [None, apply_operator(ctx.op.text, [a, b], arg_types=[a_type, b_type])]


    # Visit a parse tree produced by SchedulerParser#NotExpr.
    def visitNotExpr(self, ctx:SchedulerParser.NotExprContext):
        a_type, a = self.visit(ctx.expr())
        return [None, apply_operator('NOT', [a], arg_types=[a_type])]
        # return not self.visit(ctx.expr()) 


    # Visit a parse tree produced by SchedulerParser#InExpr.
    def visitInExpr(self, ctx:SchedulerParser.InExprContext):
        a_type, a = self.visit(ctx.expr(0))
        b_type, b = self.visit(ctx.expr(1))
        if a_type is None:
            a_type = determine_type(a)
        if b_type is None:
            b_type = determine_type(b)
        if 'COLLECTION OF' in b_type:
            return [None, a in b]
        else:
            raise Exception('Cannot use IN operator on non-collection type')


    # Visit a parse tree produced by SchedulerParser#OrExpr.
    def visitOrExpr(self, ctx:SchedulerParser.OrExprContext):
        a_type, a = self.visit(ctx.expr(0))
        b_type, b = self.visit(ctx.expr(1))
        return [None, apply_operator('OR', [a, b], arg_types=[a_type, b_type])]
        # return (self.visit(ctx.expr(0)) or self.visit(ctx.expr(1)))


    # Visit a parse tree produced by SchedulerParser#MultDiv.
    def visitMultDiv(self, ctx:SchedulerParser.MultDivContext):
        a_type, a = self.visit(ctx.expr(0))
        b_type, b = self.visit(ctx.expr(1))
        return [None, apply_operator(ctx.op.text, [a, b], arg_types=[a_type, b_type])]


    # Visit a parse tree produced by SchedulerParser#value.
    def visitValue(self, ctx:SchedulerParser.ValueContext):
        for type in TYPES:
            if ctx.__getattribute__(type)() is not None:
                return self.gvm.parse_value(type, ctx.getText())


    # Visit a parse tree produced by SchedulerParser#comments.
    def visitComments(self, ctx:SchedulerParser.CommentsContext):
        return self.visitChildren(ctx)
    
    def visitType(self, ctx:SchedulerParser.TypeContext):
        types = []

        if ctx.COLLECTION_OF():
            types.append(ctx.COLLECTION_OF().getText())

        if ctx.TYPENAME():
            types.append(ctx.TYPENAME().getText())
        else:
            types.append(self.visit(ctx.structure()))

        return " ".join(types)

    # Visit a parse tree produced by SchedulerParser#print.
    def visitPrint(self, ctx:SchedulerParser.PrintContext):
        print(self.visit(ctx.expr())[1])


    # Visit a parse tree produced by SchedulerParser#load.
    def visitLoad(self, ctx:SchedulerParser.LoadContext):
        file_path = self.gvm.cast_value('STRING', self.visit(ctx.file_path()))
        if '/' in file_path:
            file_path = os.path.join(*file_path.split('/'))
        with open(os.path.join(self.path, file_path + '.json'), 'r') as file:
            self.canvas = json_to_canvas(json.load(file))


    # Visit a parse tree produced by SchedulerParser#dump.
    def visitDump(self, ctx:SchedulerParser.DumpContext):
        file_path = self.gvm.cast_value('STRING', self.visit(ctx.file_path()))
        if '/' in file_path:
            file_path = os.path.join(*file_path.split('/'))
        with open(os.path.join(self.path, file_path + '.json'), 'w') as file:
            json.dump(canvas_to_json(self.canvas), file)


    # Visit a parse tree produced by SchedulerParser#file_path.
    def visitFile_path(self, ctx:SchedulerParser.File_pathContext):
        return self.visit(ctx.expr())[1]


    # Visit a parse tree produced by SchedulerParser#day_attribute.
    def visitDay_attribute(self, ctx:SchedulerParser.Day_attributeContext):
        return ctx.getText()


del SchedulerParser