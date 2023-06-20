// Generated from ./src/antlr/Scheduler.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

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
 * This interface defines a complete listener for a parse tree produced by
 * `SchedulerParser`.
 */
export interface SchedulerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the `Return`
	 * labeled alternative in `SchedulerParser.transfer_statement`.
	 * @param ctx the parse tree
	 */
	enterReturn?: (ctx: ReturnContext) => void;
	/**
	 * Exit a parse tree produced by the `Return`
	 * labeled alternative in `SchedulerParser.transfer_statement`.
	 * @param ctx the parse tree
	 */
	exitReturn?: (ctx: ReturnContext) => void;

	/**
	 * Enter a parse tree produced by the `Break`
	 * labeled alternative in `SchedulerParser.transfer_statement`.
	 * @param ctx the parse tree
	 */
	enterBreak?: (ctx: BreakContext) => void;
	/**
	 * Exit a parse tree produced by the `Break`
	 * labeled alternative in `SchedulerParser.transfer_statement`.
	 * @param ctx the parse tree
	 */
	exitBreak?: (ctx: BreakContext) => void;

	/**
	 * Enter a parse tree produced by the `Calls`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterCalls?: (ctx: CallsContext) => void;
	/**
	 * Exit a parse tree produced by the `Calls`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitCalls?: (ctx: CallsContext) => void;

	/**
	 * Enter a parse tree produced by the `NotExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterNotExpr?: (ctx: NotExprContext) => void;
	/**
	 * Exit a parse tree produced by the `NotExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitNotExpr?: (ctx: NotExprContext) => void;

	/**
	 * Enter a parse tree produced by the `MultDiv`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterMultDiv?: (ctx: MultDivContext) => void;
	/**
	 * Exit a parse tree produced by the `MultDiv`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitMultDiv?: (ctx: MultDivContext) => void;

	/**
	 * Enter a parse tree produced by the `AddSub`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterAddSub?: (ctx: AddSubContext) => void;
	/**
	 * Exit a parse tree produced by the `AddSub`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitAddSub?: (ctx: AddSubContext) => void;

	/**
	 * Enter a parse tree produced by the `Compare`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterCompare?: (ctx: CompareContext) => void;
	/**
	 * Exit a parse tree produced by the `Compare`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitCompare?: (ctx: CompareContext) => void;

	/**
	 * Enter a parse tree produced by the `EqualExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterEqualExpr?: (ctx: EqualExprContext) => void;
	/**
	 * Exit a parse tree produced by the `EqualExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitEqualExpr?: (ctx: EqualExprContext) => void;

	/**
	 * Enter a parse tree produced by the `AndExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterAndExpr?: (ctx: AndExprContext) => void;
	/**
	 * Exit a parse tree produced by the `AndExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitAndExpr?: (ctx: AndExprContext) => void;

	/**
	 * Enter a parse tree produced by the `OrExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterOrExpr?: (ctx: OrExprContext) => void;
	/**
	 * Exit a parse tree produced by the `OrExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitOrExpr?: (ctx: OrExprContext) => void;

	/**
	 * Enter a parse tree produced by the `OverlapExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterOverlapExpr?: (ctx: OverlapExprContext) => void;
	/**
	 * Exit a parse tree produced by the `OverlapExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitOverlapExpr?: (ctx: OverlapExprContext) => void;

	/**
	 * Enter a parse tree produced by the `InExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterInExpr?: (ctx: InExprContext) => void;
	/**
	 * Exit a parse tree produced by the `InExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitInExpr?: (ctx: InExprContext) => void;

	/**
	 * Enter a parse tree produced by the `Parenthesis`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterParenthesis?: (ctx: ParenthesisContext) => void;
	/**
	 * Exit a parse tree produced by the `Parenthesis`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitParenthesis?: (ctx: ParenthesisContext) => void;

	/**
	 * Enter a parse tree produced by the `ValueExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterValueExpr?: (ctx: ValueExprContext) => void;
	/**
	 * Exit a parse tree produced by the `ValueExpr`
	 * labeled alternative in `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitValueExpr?: (ctx: ValueExprContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.prog`.
	 * @param ctx the parse tree
	 */
	enterProg?: (ctx: ProgContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.prog`.
	 * @param ctx the parse tree
	 */
	exitProg?: (ctx: ProgContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.code`.
	 * @param ctx the parse tree
	 */
	enterCode?: (ctx: CodeContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.code`.
	 * @param ctx the parse tree
	 */
	exitCode?: (ctx: CodeContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.instruction`.
	 * @param ctx the parse tree
	 */
	enterInstruction?: (ctx: InstructionContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.instruction`.
	 * @param ctx the parse tree
	 */
	exitInstruction?: (ctx: InstructionContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.instruction_without_semicolon`.
	 * @param ctx the parse tree
	 */
	enterInstruction_without_semicolon?: (ctx: Instruction_without_semicolonContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.instruction_without_semicolon`.
	 * @param ctx the parse tree
	 */
	exitInstruction_without_semicolon?: (ctx: Instruction_without_semicolonContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.canvas_instruction`.
	 * @param ctx the parse tree
	 */
	enterCanvas_instruction?: (ctx: Canvas_instructionContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.canvas_instruction`.
	 * @param ctx the parse tree
	 */
	exitCanvas_instruction?: (ctx: Canvas_instructionContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.block`.
	 * @param ctx the parse tree
	 */
	enterBlock?: (ctx: BlockContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.block`.
	 * @param ctx the parse tree
	 */
	exitBlock?: (ctx: BlockContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.print`.
	 * @param ctx the parse tree
	 */
	enterPrint?: (ctx: PrintContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.print`.
	 * @param ctx the parse tree
	 */
	exitPrint?: (ctx: PrintContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.load`.
	 * @param ctx the parse tree
	 */
	enterLoad?: (ctx: LoadContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.load`.
	 * @param ctx the parse tree
	 */
	exitLoad?: (ctx: LoadContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.dump`.
	 * @param ctx the parse tree
	 */
	enterDump?: (ctx: DumpContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.dump`.
	 * @param ctx the parse tree
	 */
	exitDump?: (ctx: DumpContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.file_path`.
	 * @param ctx the parse tree
	 */
	enterFile_path?: (ctx: File_pathContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.file_path`.
	 * @param ctx the parse tree
	 */
	exitFile_path?: (ctx: File_pathContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.add`.
	 * @param ctx the parse tree
	 */
	enterAdd?: (ctx: AddContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.add`.
	 * @param ctx the parse tree
	 */
	exitAdd?: (ctx: AddContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.update`.
	 * @param ctx the parse tree
	 */
	enterUpdate?: (ctx: UpdateContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.update`.
	 * @param ctx the parse tree
	 */
	exitUpdate?: (ctx: UpdateContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.delete`.
	 * @param ctx the parse tree
	 */
	enterDelete?: (ctx: DeleteContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.delete`.
	 * @param ctx the parse tree
	 */
	exitDelete?: (ctx: DeleteContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.get`.
	 * @param ctx the parse tree
	 */
	enterGet?: (ctx: GetContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.get`.
	 * @param ctx the parse tree
	 */
	exitGet?: (ctx: GetContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.start_date`.
	 * @param ctx the parse tree
	 */
	enterStart_date?: (ctx: Start_dateContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.start_date`.
	 * @param ctx the parse tree
	 */
	exitStart_date?: (ctx: Start_dateContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.end_date`.
	 * @param ctx the parse tree
	 */
	enterEnd_date?: (ctx: End_dateContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.end_date`.
	 * @param ctx the parse tree
	 */
	exitEnd_date?: (ctx: End_dateContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.transfer_statement`.
	 * @param ctx the parse tree
	 */
	enterTransfer_statement?: (ctx: Transfer_statementContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.transfer_statement`.
	 * @param ctx the parse tree
	 */
	exitTransfer_statement?: (ctx: Transfer_statementContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.loop`.
	 * @param ctx the parse tree
	 */
	enterLoop?: (ctx: LoopContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.loop`.
	 * @param ctx the parse tree
	 */
	exitLoop?: (ctx: LoopContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.for_loop`.
	 * @param ctx the parse tree
	 */
	enterFor_loop?: (ctx: For_loopContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.for_loop`.
	 * @param ctx the parse tree
	 */
	exitFor_loop?: (ctx: For_loopContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.while_loop`.
	 * @param ctx the parse tree
	 */
	enterWhile_loop?: (ctx: While_loopContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.while_loop`.
	 * @param ctx the parse tree
	 */
	exitWhile_loop?: (ctx: While_loopContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.if_statement`.
	 * @param ctx the parse tree
	 */
	enterIf_statement?: (ctx: If_statementContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.if_statement`.
	 * @param ctx the parse tree
	 */
	exitIf_statement?: (ctx: If_statementContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.condition`.
	 * @param ctx the parse tree
	 */
	enterCondition?: (ctx: ConditionContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.condition`.
	 * @param ctx the parse tree
	 */
	exitCondition?: (ctx: ConditionContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.function`.
	 * @param ctx the parse tree
	 */
	enterFunction?: (ctx: FunctionContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.function`.
	 * @param ctx the parse tree
	 */
	exitFunction?: (ctx: FunctionContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.args`.
	 * @param ctx the parse tree
	 */
	enterArgs?: (ctx: ArgsContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.args`.
	 * @param ctx the parse tree
	 */
	exitArgs?: (ctx: ArgsContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.arg`.
	 * @param ctx the parse tree
	 */
	enterArg?: (ctx: ArgContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.arg`.
	 * @param ctx the parse tree
	 */
	exitArg?: (ctx: ArgContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.func_call`.
	 * @param ctx the parse tree
	 */
	enterFunc_call?: (ctx: Func_callContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.func_call`.
	 * @param ctx the parse tree
	 */
	exitFunc_call?: (ctx: Func_callContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.def`.
	 * @param ctx the parse tree
	 */
	enterDef?: (ctx: DefContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.def`.
	 * @param ctx the parse tree
	 */
	exitDef?: (ctx: DefContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.classDef`.
	 * @param ctx the parse tree
	 */
	enterClassDef?: (ctx: ClassDefContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.classDef`.
	 * @param ctx the parse tree
	 */
	exitClassDef?: (ctx: ClassDefContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.dayDef`.
	 * @param ctx the parse tree
	 */
	enterDayDef?: (ctx: DayDefContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.dayDef`.
	 * @param ctx the parse tree
	 */
	exitDayDef?: (ctx: DayDefContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.assign`.
	 * @param ctx the parse tree
	 */
	enterAssign?: (ctx: AssignContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.assign`.
	 * @param ctx the parse tree
	 */
	exitAssign?: (ctx: AssignContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.attribute`.
	 * @param ctx the parse tree
	 */
	enterAttribute?: (ctx: AttributeContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.attribute`.
	 * @param ctx the parse tree
	 */
	exitAttribute?: (ctx: AttributeContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.attribute_call`.
	 * @param ctx the parse tree
	 */
	enterAttribute_call?: (ctx: Attribute_callContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.attribute_call`.
	 * @param ctx the parse tree
	 */
	exitAttribute_call?: (ctx: Attribute_callContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.day_attribute`.
	 * @param ctx the parse tree
	 */
	enterDay_attribute?: (ctx: Day_attributeContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.day_attribute`.
	 * @param ctx the parse tree
	 */
	exitDay_attribute?: (ctx: Day_attributeContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.collection`.
	 * @param ctx the parse tree
	 */
	enterCollection?: (ctx: CollectionContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.collection`.
	 * @param ctx the parse tree
	 */
	exitCollection?: (ctx: CollectionContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.collection_elements`.
	 * @param ctx the parse tree
	 */
	enterCollection_elements?: (ctx: Collection_elementsContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.collection_elements`.
	 * @param ctx the parse tree
	 */
	exitCollection_elements?: (ctx: Collection_elementsContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.collection_element`.
	 * @param ctx the parse tree
	 */
	enterCollection_element?: (ctx: Collection_elementContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.collection_element`.
	 * @param ctx the parse tree
	 */
	exitCollection_element?: (ctx: Collection_elementContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.collection_subscription`.
	 * @param ctx the parse tree
	 */
	enterCollection_subscription?: (ctx: Collection_subscriptionContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.collection_subscription`.
	 * @param ctx the parse tree
	 */
	exitCollection_subscription?: (ctx: Collection_subscriptionContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	enterExpr?: (ctx: ExprContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.expr`.
	 * @param ctx the parse tree
	 */
	exitExpr?: (ctx: ExprContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.type`.
	 * @param ctx the parse tree
	 */
	enterType?: (ctx: TypeContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.type`.
	 * @param ctx the parse tree
	 */
	exitType?: (ctx: TypeContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.structure`.
	 * @param ctx the parse tree
	 */
	enterStructure?: (ctx: StructureContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.structure`.
	 * @param ctx the parse tree
	 */
	exitStructure?: (ctx: StructureContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.value`.
	 * @param ctx the parse tree
	 */
	enterValue?: (ctx: ValueContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.value`.
	 * @param ctx the parse tree
	 */
	exitValue?: (ctx: ValueContext) => void;

	/**
	 * Enter a parse tree produced by `SchedulerParser.comments`.
	 * @param ctx the parse tree
	 */
	enterComments?: (ctx: CommentsContext) => void;
	/**
	 * Exit a parse tree produced by `SchedulerParser.comments`.
	 * @param ctx the parse tree
	 */
	exitComments?: (ctx: CommentsContext) => void;
}

