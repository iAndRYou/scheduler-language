// Generated from ./src/antlr/Scheduler.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { ReturnContext } from "./SchedulerParser";
import { BreakContext } from "./SchedulerParser";
import { CallsContext } from "./SchedulerParser";
import { NotExprContext } from "./SchedulerParser";
import { MultDivContext } from "./SchedulerParser";
import { AddSubContext } from "./SchedulerParser";
import { CompareContext } from "./SchedulerParser";
import { EqualExprContext } from "./SchedulerParser";
import { AndExprContext } from "./SchedulerParser";
import { OrExprContext } from "./SchedulerParser";
import { OverlapExprContext } from "./SchedulerParser";
import { InExprContext } from "./SchedulerParser";
import { ParenthesisContext } from "./SchedulerParser";
import { ValueExprContext } from "./SchedulerParser";
import { ProgContext } from "./SchedulerParser";
import { CodeContext } from "./SchedulerParser";
import { InstructionContext } from "./SchedulerParser";
import { Instruction_without_semicolonContext } from "./SchedulerParser";
import { Canvas_instructionContext } from "./SchedulerParser";
import { BlockContext } from "./SchedulerParser";
import { PrintContext } from "./SchedulerParser";
import { LoadContext } from "./SchedulerParser";
import { DumpContext } from "./SchedulerParser";
import { File_pathContext } from "./SchedulerParser";
import { AddContext } from "./SchedulerParser";
import { UpdateContext } from "./SchedulerParser";
import { DeleteContext } from "./SchedulerParser";
import { GetContext } from "./SchedulerParser";
import { Start_dateContext } from "./SchedulerParser";
import { End_dateContext } from "./SchedulerParser";
import { Transfer_statementContext } from "./SchedulerParser";
import { LoopContext } from "./SchedulerParser";
import { For_loopContext } from "./SchedulerParser";
import { While_loopContext } from "./SchedulerParser";
import { If_statementContext } from "./SchedulerParser";
import { ConditionContext } from "./SchedulerParser";
import { FunctionContext } from "./SchedulerParser";
import { ArgsContext } from "./SchedulerParser";
import { ArgContext } from "./SchedulerParser";
import { Func_callContext } from "./SchedulerParser";
import { DefContext } from "./SchedulerParser";
import { ClassDefContext } from "./SchedulerParser";
import { DayDefContext } from "./SchedulerParser";
import { AssignContext } from "./SchedulerParser";
import { AttributeContext } from "./SchedulerParser";
import { Attribute_callContext } from "./SchedulerParser";
import { Day_attributeContext } from "./SchedulerParser";
import { CollectionContext } from "./SchedulerParser";
import { Collection_elementsContext } from "./SchedulerParser";
import { Collection_elementContext } from "./SchedulerParser";
import { Collection_subscriptionContext } from "./SchedulerParser";
import { ExprContext } from "./SchedulerParser";
import { TypeContext } from "./SchedulerParser";
import { StructureContext } from "./SchedulerParser";
import { ValueContext } from "./SchedulerParser";
import { CommentsContext } from "./SchedulerParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `SchedulerParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface SchedulerVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by the `Return`
	 * labeled alternative in `SchedulerParser.transfer_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReturn?: (ctx: ReturnContext) => Result;

	/**
	 * Visit a parse tree produced by the `Break`
	 * labeled alternative in `SchedulerParser.transfer_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBreak?: (ctx: BreakContext) => Result;

	/**
	 * Visit a parse tree produced by the `Calls`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCalls?: (ctx: CallsContext) => Result;

	/**
	 * Visit a parse tree produced by the `NotExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNotExpr?: (ctx: NotExprContext) => Result;

	/**
	 * Visit a parse tree produced by the `MultDiv`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMultDiv?: (ctx: MultDivContext) => Result;

	/**
	 * Visit a parse tree produced by the `AddSub`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAddSub?: (ctx: AddSubContext) => Result;

	/**
	 * Visit a parse tree produced by the `Compare`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCompare?: (ctx: CompareContext) => Result;

	/**
	 * Visit a parse tree produced by the `EqualExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEqualExpr?: (ctx: EqualExprContext) => Result;

	/**
	 * Visit a parse tree produced by the `AndExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAndExpr?: (ctx: AndExprContext) => Result;

	/**
	 * Visit a parse tree produced by the `OrExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOrExpr?: (ctx: OrExprContext) => Result;

	/**
	 * Visit a parse tree produced by the `OverlapExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOverlapExpr?: (ctx: OverlapExprContext) => Result;

	/**
	 * Visit a parse tree produced by the `InExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInExpr?: (ctx: InExprContext) => Result;

	/**
	 * Visit a parse tree produced by the `Parenthesis`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParenthesis?: (ctx: ParenthesisContext) => Result;

	/**
	 * Visit a parse tree produced by the `ValueExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValueExpr?: (ctx: ValueExprContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.prog`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProg?: (ctx: ProgContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.code`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCode?: (ctx: CodeContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.instruction`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInstruction?: (ctx: InstructionContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.instruction_without_semicolon`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInstruction_without_semicolon?: (ctx: Instruction_without_semicolonContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.canvas_instruction`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCanvas_instruction?: (ctx: Canvas_instructionContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.block`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlock?: (ctx: BlockContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.print`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrint?: (ctx: PrintContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.load`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLoad?: (ctx: LoadContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.dump`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDump?: (ctx: DumpContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.file_path`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFile_path?: (ctx: File_pathContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.add`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAdd?: (ctx: AddContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.update`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUpdate?: (ctx: UpdateContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.delete`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDelete?: (ctx: DeleteContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.get`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGet?: (ctx: GetContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.start_date`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStart_date?: (ctx: Start_dateContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.end_date`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEnd_date?: (ctx: End_dateContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.transfer_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTransfer_statement?: (ctx: Transfer_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.loop`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLoop?: (ctx: LoopContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.for_loop`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFor_loop?: (ctx: For_loopContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.while_loop`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhile_loop?: (ctx: While_loopContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.if_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIf_statement?: (ctx: If_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.condition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCondition?: (ctx: ConditionContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.function`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunction?: (ctx: FunctionContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.args`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArgs?: (ctx: ArgsContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.arg`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArg?: (ctx: ArgContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.func_call`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunc_call?: (ctx: Func_callContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.def`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDef?: (ctx: DefContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.classDef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClassDef?: (ctx: ClassDefContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.dayDef`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDayDef?: (ctx: DayDefContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.assign`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssign?: (ctx: AssignContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.attribute`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttribute?: (ctx: AttributeContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.attribute_call`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAttribute_call?: (ctx: Attribute_callContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.day_attribute`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDay_attribute?: (ctx: Day_attributeContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.collection`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCollection?: (ctx: CollectionContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.collection_elements`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCollection_elements?: (ctx: Collection_elementsContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.collection_element`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCollection_element?: (ctx: Collection_elementContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.collection_subscription`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCollection_subscription?: (ctx: Collection_subscriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpr?: (ctx: ExprContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.type`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitType?: (ctx: TypeContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.structure`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStructure?: (ctx: StructureContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValue?: (ctx: ValueContext) => Result;

	/**
	 * Visit a parse tree produced by `SchedulerParser.comments`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComments?: (ctx: CommentsContext) => Result;
}

