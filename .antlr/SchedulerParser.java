// Generated from c:\Users\kkost\Desktop\kompilatory\scheduler-language\Scheduler.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchedulerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, CLASS_ATTRIBUTE=4, TYPENAME=5, CLASSNAME=6, DAYNAME=7, 
		WEEKNAME=8, CLASSESTOKEN=9, DAYSTOKEN=10, MULTIPLY=11, DIVIDE=12, ADD=13, 
		SUBTRACT=14, EQUAL=15, NOT_EQUAL=16, LESS_THAN=17, GREATER_THAN=18, LESS_THAN_OR_EQUAL=19, 
		GREATER_THAN_OR_EQUAL=20, AND=21, OR=22, NOT=23, IN=24, OVERLAP=25, OPEN_PAREN=26, 
		CLOSE_PAREN=27, OPEN_BRACKET=28, CLOSE_BRACKET=29, DOT=30, COMMA=31, COLON=32, 
		SINGLEEQUAL=33, COLLECTION_OF=34, ADD_CANVA=35, UPDATE_CANVA=36, DELETE_CANVA=37, 
		GET_CANVA=38, WHERE=39, SATISFYING=40, AT=41, ON=42, DEF=43, IF=44, ELIF=45, 
		ELSE=46, FOR=47, WHILE=48, RETURN=49, BREAK=50, OPEN_CURLY=51, CLOSE_CURLY=52, 
		DISTINCT=53, PRINT=54, DATESTOKEN=55, INT=56, BOOL=57, STRING=58, DATE=59, 
		TIME=60, WS=61, VARNAME=62, COMMENT_LINE=63, COMMENT=64;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_instruction = 2, RULE_instruction_without_semicolon = 3, 
		RULE_canvas_instruction = 4, RULE_block = 5, RULE_print = 6, RULE_add = 7, 
		RULE_update = 8, RULE_delete = 9, RULE_get = 10, RULE_start_date = 11, 
		RULE_end_date = 12, RULE_transfer_statement = 13, RULE_loop = 14, RULE_for_loop = 15, 
		RULE_while_loop = 16, RULE_if_statement = 17, RULE_condition = 18, RULE_function = 19, 
		RULE_args = 20, RULE_arg = 21, RULE_func_call = 22, RULE_def = 23, RULE_classDef = 24, 
		RULE_dayDef = 25, RULE_weekDef = 26, RULE_assign = 27, RULE_attribute = 28, 
		RULE_attribute_call = 29, RULE_collection = 30, RULE_collection_elements = 31, 
		RULE_collection_element = 32, RULE_collection_subscription = 33, RULE_expr = 34, 
		RULE_type = 35, RULE_structure = 36, RULE_value = 37, RULE_comments = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "code", "instruction", "instruction_without_semicolon", "canvas_instruction", 
			"block", "print", "add", "update", "delete", "get", "start_date", "end_date", 
			"transfer_statement", "loop", "for_loop", "while_loop", "if_statement", 
			"condition", "function", "args", "arg", "func_call", "def", "classDef", 
			"dayDef", "weekDef", "assign", "attribute", "attribute_call", "collection", 
			"collection_elements", "collection_element", "collection_subscription", 
			"expr", "type", "structure", "value", "comments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'START DATE'", "'END DATE'", null, null, "'CLASS'", "'DAY'", 
			"'WEEK'", "'CLASSES'", "'DAYS'", "'*'", "'/'", "'+'", "'-'", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'AND'", "'OR'", "'NOT'", "'IN'", 
			"'#'", "'('", "')'", "'['", "']'", "'.'", "','", "':'", "'='", "'COLLECTION OF'", 
			"'ADD'", "'UPDATE'", "'DELETE'", "'GET'", "'WHERE'", "'SATISFYING'", 
			"'AT'", "'ON'", "'DEF'", "'IF'", "'ELIF'", "'ELSE'", "'FOR'", "'WHILE'", 
			"'RETURN'", "'BREAK'", "'{'", "'}'", "'DISTINCT'", "'PRINT'", "'DATES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "CLASS_ATTRIBUTE", "TYPENAME", "CLASSNAME", "DAYNAME", 
			"WEEKNAME", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", "ADD", 
			"SUBTRACT", "EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUAL", 
			"GREATER_THAN_OR_EQUAL", "AND", "OR", "NOT", "IN", "OVERLAP", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "DOT", "COMMA", "COLON", 
			"SINGLEEQUAL", "COLLECTION_OF", "ADD_CANVA", "UPDATE_CANVA", "DELETE_CANVA", 
			"GET_CANVA", "WHERE", "SATISFYING", "AT", "ON", "DEF", "IF", "ELIF", 
			"ELSE", "FOR", "WHILE", "RETURN", "BREAK", "OPEN_CURLY", "CLOSE_CURLY", 
			"DISTINCT", "PRINT", "DATESTOKEN", "INT", "BOOL", "STRING", "DATE", "TIME", 
			"WS", "VARNAME", "COMMENT_LINE", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Scheduler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SchedulerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SchedulerParser.EOF, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__2 - 2)) | (1L << (TYPENAME - 2)) | (1L << (CLASSNAME - 2)) | (1L << (DAYNAME - 2)) | (1L << (WEEKNAME - 2)) | (1L << (NOT - 2)) | (1L << (OPEN_PAREN - 2)) | (1L << (OPEN_BRACKET - 2)) | (1L << (COLLECTION_OF - 2)) | (1L << (ADD_CANVA - 2)) | (1L << (UPDATE_CANVA - 2)) | (1L << (DELETE_CANVA - 2)) | (1L << (GET_CANVA - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (WHILE - 2)) | (1L << (RETURN - 2)) | (1L << (BREAK - 2)) | (1L << (PRINT - 2)) | (1L << (INT - 2)) | (1L << (BOOL - 2)) | (1L << (STRING - 2)) | (1L << (DATE - 2)) | (1L << (TIME - 2)) | (1L << (VARNAME - 2)) | (1L << (COMMENT_LINE - 2)) | (1L << (COMMENT - 2)))) != 0)) {
				{
				setState(78);
				code();
				}
			}

			setState(81);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public List<Instruction_without_semicolonContext> instruction_without_semicolon() {
			return getRuleContexts(Instruction_without_semicolonContext.class);
		}
		public Instruction_without_semicolonContext instruction_without_semicolon(int i) {
			return getRuleContext(Instruction_without_semicolonContext.class,i);
		}
		public List<CommentsContext> comments() {
			return getRuleContexts(CommentsContext.class);
		}
		public CommentsContext comments(int i) {
			return getRuleContext(CommentsContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<Canvas_instructionContext> canvas_instruction() {
			return getRuleContexts(Canvas_instructionContext.class);
		}
		public Canvas_instructionContext canvas_instruction(int i) {
			return getRuleContext(Canvas_instructionContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(83);
						instruction();
						}
						break;
					case 2:
						{
						setState(84);
						canvas_instruction();
						}
						break;
					}
					setState(87);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(89);
					instruction_without_semicolon();
					}
					break;
				case 3:
					{
					setState(90);
					comments();
					}
					break;
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__2 - 2)) | (1L << (TYPENAME - 2)) | (1L << (CLASSNAME - 2)) | (1L << (DAYNAME - 2)) | (1L << (WEEKNAME - 2)) | (1L << (NOT - 2)) | (1L << (OPEN_PAREN - 2)) | (1L << (OPEN_BRACKET - 2)) | (1L << (COLLECTION_OF - 2)) | (1L << (ADD_CANVA - 2)) | (1L << (UPDATE_CANVA - 2)) | (1L << (DELETE_CANVA - 2)) | (1L << (GET_CANVA - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (WHILE - 2)) | (1L << (RETURN - 2)) | (1L << (BREAK - 2)) | (1L << (PRINT - 2)) | (1L << (INT - 2)) | (1L << (BOOL - 2)) | (1L << (STRING - 2)) | (1L << (DATE - 2)) | (1L << (TIME - 2)) | (1L << (VARNAME - 2)) | (1L << (COMMENT_LINE - 2)) | (1L << (COMMENT - 2)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Transfer_statementContext transfer_statement() {
			return getRuleContext(Transfer_statementContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				transfer_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				print();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instruction_without_semicolonContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public Instruction_without_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_without_semicolon; }
	}

	public final Instruction_without_semicolonContext instruction_without_semicolon() throws RecognitionException {
		Instruction_without_semicolonContext _localctx = new Instruction_without_semicolonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction_without_semicolon);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				if_statement();
				}
				break;
			case TYPENAME:
			case CLASSNAME:
			case DAYNAME:
			case WEEKNAME:
			case COLLECTION_OF:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				function();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				loop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Canvas_instructionContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public GetContext get() {
			return getRuleContext(GetContext.class,0);
		}
		public Start_dateContext start_date() {
			return getRuleContext(Start_dateContext.class,0);
		}
		public End_dateContext end_date() {
			return getRuleContext(End_dateContext.class,0);
		}
		public Canvas_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas_instruction; }
	}

	public final Canvas_instructionContext canvas_instruction() throws RecognitionException {
		Canvas_instructionContext _localctx = new Canvas_instructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_canvas_instruction);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_CANVA:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				add();
				}
				break;
			case UPDATE_CANVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				update();
				}
				break;
			case DELETE_CANVA:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				delete();
				}
				break;
			case GET_CANVA:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				get();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				start_date();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				end_date();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(SchedulerParser.OPEN_CURLY, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(SchedulerParser.CLOSE_CURLY, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(OPEN_CURLY);
			setState(116);
			code();
			setState(117);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SchedulerParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(PRINT);
			setState(120);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD_CANVA() { return getToken(SchedulerParser.ADD_CANVA, 0); }
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ON() { return getToken(SchedulerParser.ON, 0); }
		public TerminalNode TYPENAME() { return getToken(SchedulerParser.TYPENAME, 0); }
		public TerminalNode DATESTOKEN() { return getToken(SchedulerParser.DATESTOKEN, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ADD_CANVA);
			setState(123);
			structure();
			setState(124);
			expr(0);
			setState(125);
			match(ON);
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==TYPENAME || _la==DATESTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE_CANVA() { return getToken(SchedulerParser.UPDATE_CANVA, 0); }
		public TerminalNode DATE() { return getToken(SchedulerParser.DATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DATESTOKEN() { return getToken(SchedulerParser.DATESTOKEN, 0); }
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(UPDATE_CANVA);
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
				{
				setState(130);
				match(DATE);
				setState(131);
				expr(0);
				}
				break;
			case DATESTOKEN:
				{
				setState(132);
				match(DATESTOKEN);
				setState(133);
				collection();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE_CANVA() { return getToken(SchedulerParser.DELETE_CANVA, 0); }
		public TerminalNode CLASSESTOKEN() { return getToken(SchedulerParser.CLASSESTOKEN, 0); }
		public TerminalNode DAYSTOKEN() { return getToken(SchedulerParser.DAYSTOKEN, 0); }
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode SATISFYING() { return getToken(SchedulerParser.SATISFYING, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(DELETE_CANVA);
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==CLASSESTOKEN || _la==DAYSTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(138);
				match(VARNAME);
				}
				break;
			}
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(141);
				match(SATISFYING);
				setState(142);
				condition();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetContext extends ParserRuleContext {
		public TerminalNode GET_CANVA() { return getToken(SchedulerParser.GET_CANVA, 0); }
		public TerminalNode CLASSESTOKEN() { return getToken(SchedulerParser.CLASSESTOKEN, 0); }
		public TerminalNode DAYSTOKEN() { return getToken(SchedulerParser.DAYSTOKEN, 0); }
		public TerminalNode DISTINCT() { return getToken(SchedulerParser.DISTINCT, 0); }
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode SATISFYING() { return getToken(SchedulerParser.SATISFYING, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_get);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(GET_CANVA);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(146);
				match(DISTINCT);
				}
			}

			setState(149);
			_la = _input.LA(1);
			if ( !(_la==CLASSESTOKEN || _la==DAYSTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(150);
				match(VARNAME);
				}
				break;
			}
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(153);
				match(SATISFYING);
				setState(154);
				condition();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_dateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(SchedulerParser.DATE, 0); }
		public Start_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_date; }
	}

	public final Start_dateContext start_date() throws RecognitionException {
		Start_dateContext _localctx = new Start_dateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_start_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__1);
			setState(158);
			match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_dateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(SchedulerParser.DATE, 0); }
		public End_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_date; }
	}

	public final End_dateContext end_date() throws RecognitionException {
		End_dateContext _localctx = new End_dateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_end_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__2);
			setState(161);
			match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transfer_statementContext extends ParserRuleContext {
		public Transfer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transfer_statement; }
	 
		public Transfer_statementContext() { }
		public void copyFrom(Transfer_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnContext extends Transfer_statementContext {
		public TerminalNode RETURN() { return getToken(SchedulerParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(Transfer_statementContext ctx) { copyFrom(ctx); }
	}
	public static class BreakContext extends Transfer_statementContext {
		public TerminalNode BREAK() { return getToken(SchedulerParser.BREAK, 0); }
		public BreakContext(Transfer_statementContext ctx) { copyFrom(ctx); }
	}

	public final Transfer_statementContext transfer_statement() throws RecognitionException {
		Transfer_statementContext _localctx = new Transfer_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_transfer_statement);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(RETURN);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
					{
					setState(164);
					expr(0);
					}
				}

				}
				break;
			case BREAK:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(BREAK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loop);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				while_loop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SchedulerParser.FOR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode IN() { return getToken(SchedulerParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(FOR);
			setState(175);
			type();
			setState(176);
			match(VARNAME);
			setState(177);
			match(IN);
			setState(178);
			expr(0);
			setState(179);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SchedulerParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WHILE);
			setState(182);
			condition();
			setState(183);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SchedulerParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(SchedulerParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(SchedulerParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(SchedulerParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IF);
			setState(186);
			condition();
			setState(187);
			block();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(188);
				match(ELIF);
				setState(189);
				condition();
				setState(190);
				block();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(197);
				match(ELSE);
				setState(198);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(SchedulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(SchedulerParser.CLOSE_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			type();
			setState(204);
			match(VARNAME);
			setState(205);
			match(OPEN_PAREN);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPENAME) | (1L << CLASSNAME) | (1L << DAYNAME) | (1L << WEEKNAME) | (1L << COLLECTION_OF))) != 0)) {
				{
				setState(206);
				args();
				}
			}

			setState(209);
			match(CLOSE_PAREN);
			setState(210);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SchedulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SchedulerParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			arg();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(213);
				match(COMMA);
				setState(214);
				arg();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			type();
			setState(221);
			match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(SchedulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(SchedulerParser.CLOSE_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SchedulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SchedulerParser.COMMA, i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(VARNAME);
			setState(224);
			match(OPEN_PAREN);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
				{
				setState(225);
				expr(0);
				}
			}

			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(228);
				match(COMMA);
				setState(229);
				expr(0);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefContext extends ParserRuleContext {
		public TerminalNode TYPENAME() { return getToken(SchedulerParser.TYPENAME, 0); }
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode SINGLEEQUAL() { return getToken(SchedulerParser.SINGLEEQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLECTION_OF() { return getToken(SchedulerParser.COLLECTION_OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DayDefContext dayDef() {
			return getRuleContext(DayDefContext.class,0);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public WeekDefContext weekDef() {
			return getRuleContext(WeekDefContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_def);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(TYPENAME);
				setState(238);
				match(VARNAME);
				setState(239);
				match(SINGLEEQUAL);
				setState(240);
				expr(0);
				}
				break;
			case COLLECTION_OF:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(COLLECTION_OF);
				setState(242);
				type();
				setState(243);
				match(VARNAME);
				setState(244);
				match(SINGLEEQUAL);
				setState(245);
				expr(0);
				}
				break;
			case DAYNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				dayDef();
				}
				break;
			case CLASSNAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				classDef();
				}
				break;
			case WEEKNAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				weekDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode CLASSNAME() { return getToken(SchedulerParser.CLASSNAME, 0); }
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public List<TerminalNode> CLASS_ATTRIBUTE() { return getTokens(SchedulerParser.CLASS_ATTRIBUTE); }
		public TerminalNode CLASS_ATTRIBUTE(int i) {
			return getToken(SchedulerParser.CLASS_ATTRIBUTE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(CLASSNAME);
			setState(253);
			match(VARNAME);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS_ATTRIBUTE) {
				{
				{
				setState(254);
				match(CLASS_ATTRIBUTE);
				setState(255);
				expr(0);
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DayDefContext extends ParserRuleContext {
		public TerminalNode DAYNAME() { return getToken(SchedulerParser.DAYNAME, 0); }
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode CLASSESTOKEN() { return getToken(SchedulerParser.CLASSESTOKEN, 0); }
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public DayDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dayDef; }
	}

	public final DayDefContext dayDef() throws RecognitionException {
		DayDefContext _localctx = new DayDefContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dayDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(DAYNAME);
			setState(262);
			match(VARNAME);
			setState(263);
			match(CLASSESTOKEN);
			setState(264);
			collection();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeekDefContext extends ParserRuleContext {
		public TerminalNode WEEKNAME() { return getToken(SchedulerParser.WEEKNAME, 0); }
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode DAYSTOKEN() { return getToken(SchedulerParser.DAYSTOKEN, 0); }
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public WeekDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weekDef; }
	}

	public final WeekDefContext weekDef() throws RecognitionException {
		WeekDefContext _localctx = new WeekDefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_weekDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(WEEKNAME);
			setState(267);
			match(VARNAME);
			setState(268);
			match(DAYSTOKEN);
			setState(269);
			collection();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode SINGLEEQUAL() { return getToken(SchedulerParser.SINGLEEQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SchedulerParser.DOT, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assign);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(VARNAME);
				setState(272);
				match(SINGLEEQUAL);
				setState(273);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(VARNAME);
				setState(275);
				match(DOT);
				setState(276);
				attribute();
				setState(277);
				match(SINGLEEQUAL);
				setState(278);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode CLASS_ATTRIBUTE() { return getToken(SchedulerParser.CLASS_ATTRIBUTE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(CLASS_ATTRIBUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_callContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode DOT() { return getToken(SchedulerParser.DOT, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Attribute_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_call; }
	}

	public final Attribute_callContext attribute_call() throws RecognitionException {
		Attribute_callContext _localctx = new Attribute_callContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_attribute_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(VARNAME);
			setState(285);
			match(DOT);
			setState(286);
			attribute();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SchedulerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SchedulerParser.CLOSE_BRACKET, 0); }
		public Collection_elementsContext collection_elements() {
			return getRuleContext(Collection_elementsContext.class,0);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(OPEN_BRACKET);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
				{
				setState(289);
				collection_elements();
				}
			}

			setState(292);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_elementsContext extends ParserRuleContext {
		public List<Collection_elementContext> collection_element() {
			return getRuleContexts(Collection_elementContext.class);
		}
		public Collection_elementContext collection_element(int i) {
			return getRuleContext(Collection_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SchedulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SchedulerParser.COMMA, i);
		}
		public Collection_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_elements; }
	}

	public final Collection_elementsContext collection_elements() throws RecognitionException {
		Collection_elementsContext _localctx = new Collection_elementsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_collection_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			collection_element();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(295);
				match(COMMA);
				setState(296);
				collection_element();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_elementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Collection_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_element; }
	}

	public final Collection_elementContext collection_element() throws RecognitionException {
		Collection_elementContext _localctx = new Collection_elementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_collection_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_subscriptionContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(SchedulerParser.OPEN_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(SchedulerParser.CLOSE_BRACKET, 0); }
		public Collection_subscriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_subscription; }
	}

	public final Collection_subscriptionContext collection_subscription() throws RecognitionException {
		Collection_subscriptionContext _localctx = new Collection_subscriptionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_collection_subscription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(VARNAME);
			setState(305);
			match(OPEN_BRACKET);
			setState(306);
			expr(0);
			setState(307);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(SchedulerParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ValueExprContext extends ExprContext {
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public ValueExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(SchedulerParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SchedulerParser.NOT_EQUAL, 0); }
		public EqualExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisContext extends ExprContext {
		public TerminalNode OPEN_PAREN() { return getToken(SchedulerParser.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SchedulerParser.CLOSE_PAREN, 0); }
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(SchedulerParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(SchedulerParser.SUBTRACT, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CallsContext extends ExprContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Attribute_callContext attribute_call() {
			return getRuleContext(Attribute_callContext.class,0);
		}
		public Canvas_instructionContext canvas_instruction() {
			return getRuleContext(Canvas_instructionContext.class,0);
		}
		public Collection_subscriptionContext collection_subscription() {
			return getRuleContext(Collection_subscriptionContext.class,0);
		}
		public CallsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OverlapExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OVERLAP() { return getToken(SchedulerParser.OVERLAP, 0); }
		public OverlapExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CompareContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(SchedulerParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(SchedulerParser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SchedulerParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(SchedulerParser.GREATER_THAN_OR_EQUAL, 0); }
		public CompareContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(SchedulerParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class InExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(SchedulerParser.IN, 0); }
		public InExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(SchedulerParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(SchedulerParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(SchedulerParser.DIVIDE, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new CallsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(310);
					func_call();
					}
					break;
				case 2:
					{
					setState(311);
					attribute_call();
					}
					break;
				case 3:
					{
					setState(312);
					canvas_instruction();
					}
					break;
				case 4:
					{
					setState(313);
					collection_subscription();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				match(NOT);
				setState(317);
				expr(11);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
				match(OPEN_PAREN);
				setState(319);
				expr(0);
				setState(320);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACKET:
					{
					setState(322);
					collection();
					}
					break;
				case INT:
				case BOOL:
				case STRING:
				case DATE:
				case TIME:
					{
					setState(323);
					value();
					}
					break;
				case VARNAME:
					{
					setState(324);
					match(VARNAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(353);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(330);
						((MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
							((MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(331);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(333);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBTRACT) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(334);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(335);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(336);
						((CompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN_OR_EQUAL))) != 0)) ) {
							((CompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(337);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(338);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(339);
						((EqualExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
							((EqualExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(340);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(341);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(342);
						match(AND);
						setState(343);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(345);
						match(OR);
						setState(346);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new OverlapExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(347);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(348);
						match(OVERLAP);
						setState(349);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new InExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(350);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(351);
						match(IN);
						setState(352);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPENAME() { return getToken(SchedulerParser.TYPENAME, 0); }
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public TerminalNode COLLECTION_OF() { return getToken(SchedulerParser.COLLECTION_OF, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(TYPENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				structure();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(COLLECTION_OF);
				setState(361);
				match(TYPENAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(COLLECTION_OF);
				setState(363);
				structure();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructureContext extends ParserRuleContext {
		public TerminalNode CLASSNAME() { return getToken(SchedulerParser.CLASSNAME, 0); }
		public TerminalNode DAYNAME() { return getToken(SchedulerParser.DAYNAME, 0); }
		public TerminalNode WEEKNAME() { return getToken(SchedulerParser.WEEKNAME, 0); }
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSNAME) | (1L << DAYNAME) | (1L << WEEKNAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SchedulerParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SchedulerParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(SchedulerParser.STRING, 0); }
		public TerminalNode DATE() { return getToken(SchedulerParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SchedulerParser.TIME, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentsContext extends ParserRuleContext {
		public TerminalNode COMMENT_LINE() { return getToken(SchedulerParser.COMMENT_LINE, 0); }
		public TerminalNode COMMENT() { return getToken(SchedulerParser.COMMENT, 0); }
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==COMMENT_LINE || _la==COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\5\2R\n\2\3\2\3\2"+
		"\3\3\3\3\5\3X\n\3\3\3\3\3\3\3\3\3\6\3^\n\3\r\3\16\3_\3\4\3\4\3\4\3\4\3"+
		"\4\5\4g\n\4\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6t\n\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0089\n\n\3\13\3\13\3\13\5\13\u008e\n\13\3\13\3\13\5\13\u0092\n"+
		"\13\3\f\3\f\5\f\u0096\n\f\3\f\3\f\5\f\u009a\n\f\3\f\3\f\5\f\u009e\n\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\5\17\u00a8\n\17\3\17\5\17\u00ab"+
		"\n\17\3\20\3\20\5\20\u00af\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00c3\n\23\f\23"+
		"\16\23\u00c6\13\23\3\23\3\23\5\23\u00ca\n\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\5\25\u00d2\n\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u00da\n\26\f"+
		"\26\16\26\u00dd\13\26\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u00e5\n\30\3"+
		"\30\3\30\7\30\u00e9\n\30\f\30\16\30\u00ec\13\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00fd\n\31"+
		"\3\32\3\32\3\32\3\32\7\32\u0103\n\32\f\32\16\32\u0106\13\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u011b\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \5"+
		" \u0125\n \3 \3 \3!\3!\3!\7!\u012c\n!\f!\16!\u012f\13!\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\5$\u013d\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0148"+
		"\n$\5$\u014a\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\7$\u0164\n$\f$\16$\u0167\13$\3%\3%\3%\3%\3%\3%\5%\u016f"+
		"\n%\3&\3&\3\'\3\'\3(\3(\3(\2\3F)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\13\4\2\7\799\3\2\13\f\3\2\r\16\3\2"+
		"\17\20\3\2\23\26\3\2\21\22\3\2\b\n\3\2:>\3\2AB\2\u0189\2Q\3\2\2\2\4]\3"+
		"\2\2\2\6f\3\2\2\2\bk\3\2\2\2\ns\3\2\2\2\fu\3\2\2\2\16y\3\2\2\2\20|\3\2"+
		"\2\2\22\u0083\3\2\2\2\24\u008a\3\2\2\2\26\u0093\3\2\2\2\30\u009f\3\2\2"+
		"\2\32\u00a2\3\2\2\2\34\u00aa\3\2\2\2\36\u00ae\3\2\2\2 \u00b0\3\2\2\2\""+
		"\u00b7\3\2\2\2$\u00bb\3\2\2\2&\u00cb\3\2\2\2(\u00cd\3\2\2\2*\u00d6\3\2"+
		"\2\2,\u00de\3\2\2\2.\u00e1\3\2\2\2\60\u00fc\3\2\2\2\62\u00fe\3\2\2\2\64"+
		"\u0107\3\2\2\2\66\u010c\3\2\2\28\u011a\3\2\2\2:\u011c\3\2\2\2<\u011e\3"+
		"\2\2\2>\u0122\3\2\2\2@\u0128\3\2\2\2B\u0130\3\2\2\2D\u0132\3\2\2\2F\u0149"+
		"\3\2\2\2H\u016e\3\2\2\2J\u0170\3\2\2\2L\u0172\3\2\2\2N\u0174\3\2\2\2P"+
		"R\5\4\3\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\2\2\3T\3\3\2\2\2UX\5\6\4\2"+
		"VX\5\n\6\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YZ\7\3\2\2Z^\3\2\2\2[^\5\b\5\2"+
		"\\^\5N(\2]W\3\2\2\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2"+
		"`\5\3\2\2\2ag\5\60\31\2bg\58\35\2cg\5F$\2dg\5\34\17\2eg\5\16\b\2fa\3\2"+
		"\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\7\3\2\2\2hl\5$\23\2il\5"+
		"(\25\2jl\5\36\20\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\t\3\2\2\2mt\5\20\t\2"+
		"nt\5\22\n\2ot\5\24\13\2pt\5\26\f\2qt\5\30\r\2rt\5\32\16\2sm\3\2\2\2sn"+
		"\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\13\3\2\2\2uv\7\65\2"+
		"\2vw\5\4\3\2wx\7\66\2\2x\r\3\2\2\2yz\78\2\2z{\5F$\2{\17\3\2\2\2|}\7%\2"+
		"\2}~\5J&\2~\177\5F$\2\177\u0080\7,\2\2\u0080\u0081\t\2\2\2\u0081\u0082"+
		"\5F$\2\u0082\21\3\2\2\2\u0083\u0088\7&\2\2\u0084\u0085\7=\2\2\u0085\u0089"+
		"\5F$\2\u0086\u0087\79\2\2\u0087\u0089\5> \2\u0088\u0084\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\23\3\2\2\2\u008a\u008b\7\'\2\2\u008b\u008d\t\3\2"+
		"\2\u008c\u008e\7@\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u0090\7*\2\2\u0090\u0092\5&\24\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\25\3\2\2\2\u0093\u0095\7(\2\2\u0094\u0096\7\67\2"+
		"\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099"+
		"\t\3\2\2\u0098\u009a\7@\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u009c\7*\2\2\u009c\u009e\5&\24\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a1"+
		"\7=\2\2\u00a1\31\3\2\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a4\7=\2\2\u00a4"+
		"\33\3\2\2\2\u00a5\u00a7\7\63\2\2\u00a6\u00a8\5F$\2\u00a7\u00a6\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00ab\7\64\2\2\u00aa\u00a5"+
		"\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\35\3\2\2\2\u00ac\u00af\5 \21\2\u00ad"+
		"\u00af\5\"\22\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\37\3\2\2"+
		"\2\u00b0\u00b1\7\61\2\2\u00b1\u00b2\5H%\2\u00b2\u00b3\7@\2\2\u00b3\u00b4"+
		"\7\32\2\2\u00b4\u00b5\5F$\2\u00b5\u00b6\5\f\7\2\u00b6!\3\2\2\2\u00b7\u00b8"+
		"\7\62\2\2\u00b8\u00b9\5&\24\2\u00b9\u00ba\5\f\7\2\u00ba#\3\2\2\2\u00bb"+
		"\u00bc\7.\2\2\u00bc\u00bd\5&\24\2\u00bd\u00c4\5\f\7\2\u00be\u00bf\7/\2"+
		"\2\u00bf\u00c0\5&\24\2\u00c0\u00c1\5\f\7\2\u00c1\u00c3\3\2\2\2\u00c2\u00be"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c9\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\60\2\2\u00c8\u00ca\5"+
		"\f\7\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca%\3\2\2\2\u00cb\u00cc"+
		"\5F$\2\u00cc\'\3\2\2\2\u00cd\u00ce\5H%\2\u00ce\u00cf\7@\2\2\u00cf\u00d1"+
		"\7\34\2\2\u00d0\u00d2\5*\26\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\35\2\2\u00d4\u00d5\5\f\7\2\u00d5)\3"+
		"\2\2\2\u00d6\u00db\5,\27\2\u00d7\u00d8\7!\2\2\u00d8\u00da\5,\27\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc+\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\5H%\2\u00df\u00e0"+
		"\7@\2\2\u00e0-\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2\u00e4\7\34\2\2\u00e3\u00e5"+
		"\5F$\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ea\3\2\2\2\u00e6"+
		"\u00e7\7!\2\2\u00e7\u00e9\5F$\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2"+
		"\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ed\u00ee\7\35\2\2\u00ee/\3\2\2\2\u00ef\u00f0\7\7\2\2\u00f0"+
		"\u00f1\7@\2\2\u00f1\u00f2\7#\2\2\u00f2\u00fd\5F$\2\u00f3\u00f4\7$\2\2"+
		"\u00f4\u00f5\5H%\2\u00f5\u00f6\7@\2\2\u00f6\u00f7\7#\2\2\u00f7\u00f8\5"+
		"F$\2\u00f8\u00fd\3\2\2\2\u00f9\u00fd\5\64\33\2\u00fa\u00fd\5\62\32\2\u00fb"+
		"\u00fd\5\66\34\2\u00fc\u00ef\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fc\u00f9\3"+
		"\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\61\3\2\2\2\u00fe"+
		"\u00ff\7\b\2\2\u00ff\u0104\7@\2\2\u0100\u0101\7\6\2\2\u0101\u0103\5F$"+
		"\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\63\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\t\2\2\u0108"+
		"\u0109\7@\2\2\u0109\u010a\7\13\2\2\u010a\u010b\5> \2\u010b\65\3\2\2\2"+
		"\u010c\u010d\7\n\2\2\u010d\u010e\7@\2\2\u010e\u010f\7\f\2\2\u010f\u0110"+
		"\5> \2\u0110\67\3\2\2\2\u0111\u0112\7@\2\2\u0112\u0113\7#\2\2\u0113\u011b"+
		"\5F$\2\u0114\u0115\7@\2\2\u0115\u0116\7 \2\2\u0116\u0117\5:\36\2\u0117"+
		"\u0118\7#\2\2\u0118\u0119\5F$\2\u0119\u011b\3\2\2\2\u011a\u0111\3\2\2"+
		"\2\u011a\u0114\3\2\2\2\u011b9\3\2\2\2\u011c\u011d\7\6\2\2\u011d;\3\2\2"+
		"\2\u011e\u011f\7@\2\2\u011f\u0120\7 \2\2\u0120\u0121\5:\36\2\u0121=\3"+
		"\2\2\2\u0122\u0124\7\36\2\2\u0123\u0125\5@!\2\u0124\u0123\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\37\2\2\u0127?\3\2\2\2"+
		"\u0128\u012d\5B\"\2\u0129\u012a\7!\2\2\u012a\u012c\5B\"\2\u012b\u0129"+
		"\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"A\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\5F$\2\u0131C\3\2\2\2\u0132\u0133"+
		"\7@\2\2\u0133\u0134\7\36\2\2\u0134\u0135\5F$\2\u0135\u0136\7\37\2\2\u0136"+
		"E\3\2\2\2\u0137\u013c\b$\1\2\u0138\u013d\5.\30\2\u0139\u013d\5<\37\2\u013a"+
		"\u013d\5\n\6\2\u013b\u013d\5D#\2\u013c\u0138\3\2\2\2\u013c\u0139\3\2\2"+
		"\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\u014a\3\2\2\2\u013e\u013f"+
		"\7\31\2\2\u013f\u014a\5F$\r\u0140\u0141\7\34\2\2\u0141\u0142\5F$\2\u0142"+
		"\u0143\7\35\2\2\u0143\u014a\3\2\2\2\u0144\u0148\5> \2\u0145\u0148\5L\'"+
		"\2\u0146\u0148\7@\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146"+
		"\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0137\3\2\2\2\u0149\u013e\3\2\2\2\u0149"+
		"\u0140\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u0165\3\2\2\2\u014b\u014c\f\f"+
		"\2\2\u014c\u014d\t\4\2\2\u014d\u0164\5F$\r\u014e\u014f\f\13\2\2\u014f"+
		"\u0150\t\5\2\2\u0150\u0164\5F$\f\u0151\u0152\f\n\2\2\u0152\u0153\t\6\2"+
		"\2\u0153\u0164\5F$\13\u0154\u0155\f\t\2\2\u0155\u0156\t\7\2\2\u0156\u0164"+
		"\5F$\n\u0157\u0158\f\b\2\2\u0158\u0159\7\27\2\2\u0159\u0164\5F$\t\u015a"+
		"\u015b\f\7\2\2\u015b\u015c\7\30\2\2\u015c\u0164\5F$\b\u015d\u015e\f\6"+
		"\2\2\u015e\u015f\7\33\2\2\u015f\u0164\5F$\7\u0160\u0161\f\5\2\2\u0161"+
		"\u0162\7\32\2\2\u0162\u0164\5F$\6\u0163\u014b\3\2\2\2\u0163\u014e\3\2"+
		"\2\2\u0163\u0151\3\2\2\2\u0163\u0154\3\2\2\2\u0163\u0157\3\2\2\2\u0163"+
		"\u015a\3\2\2\2\u0163\u015d\3\2\2\2\u0163\u0160\3\2\2\2\u0164\u0167\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166G\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0168\u016f\7\7\2\2\u0169\u016f\5J&\2\u016a\u016b\7$\2\2\u016b"+
		"\u016f\7\7\2\2\u016c\u016d\7$\2\2\u016d\u016f\5J&\2\u016e\u0168\3\2\2"+
		"\2\u016e\u0169\3\2\2\2\u016e\u016a\3\2\2\2\u016e\u016c\3\2\2\2\u016fI"+
		"\3\2\2\2\u0170\u0171\t\b\2\2\u0171K\3\2\2\2\u0172\u0173\t\t\2\2\u0173"+
		"M\3\2\2\2\u0174\u0175\t\n\2\2\u0175O\3\2\2\2#QW]_fks\u0088\u008d\u0091"+
		"\u0095\u0099\u009d\u00a7\u00aa\u00ae\u00c4\u00c9\u00d1\u00db\u00e4\u00ea"+
		"\u00fc\u0104\u011a\u0124\u012d\u013c\u0147\u0149\u0163\u0165\u016e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}