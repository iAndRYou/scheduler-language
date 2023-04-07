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
		CLASSESTOKEN=8, DAYSTOKEN=9, MULTIPLY=10, DIVIDE=11, ADD=12, SUBTRACT=13, 
		EQUAL=14, NOT_EQUAL=15, LESS_THAN=16, GREATER_THAN=17, LESS_THAN_OR_EQUAL=18, 
		GREATER_THAN_OR_EQUAL=19, AND=20, OR=21, NOT=22, IN=23, OVERLAP=24, OPEN_PAREN=25, 
		CLOSE_PAREN=26, OPEN_BRACKET=27, CLOSE_BRACKET=28, DOT=29, COMMA=30, COLON=31, 
		SINGLEEQUAL=32, COLLECTION_OF=33, ADD_CANVA=34, UPDATE_CANVA=35, DELETE_CANVA=36, 
		GET_CANVA=37, WHERE=38, SATISFYING=39, AT=40, ON=41, DEF=42, IF=43, ELIF=44, 
		ELSE=45, FOR=46, WHILE=47, RETURN=48, BREAK=49, OPEN_CURLY=50, CLOSE_CURLY=51, 
		DISTINCT=52, PRINT=53, DATESTOKEN=54, LOADTOKEN=55, DUMPTOKEN=56, INT=57, 
		BOOL=58, STRING=59, DATE=60, TIME=61, WS=62, VARNAME=63, COMMENT_LINE=64, 
		COMMENT=65;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_instruction = 2, RULE_instruction_without_semicolon = 3, 
		RULE_canvas_instruction = 4, RULE_block = 5, RULE_print = 6, RULE_load = 7, 
		RULE_dump = 8, RULE_file_path = 9, RULE_add = 10, RULE_update = 11, RULE_delete = 12, 
		RULE_get = 13, RULE_start_date = 14, RULE_end_date = 15, RULE_transfer_statement = 16, 
		RULE_loop = 17, RULE_for_loop = 18, RULE_while_loop = 19, RULE_if_statement = 20, 
		RULE_condition = 21, RULE_function = 22, RULE_args = 23, RULE_arg = 24, 
		RULE_func_call = 25, RULE_def = 26, RULE_classDef = 27, RULE_dayDef = 28, 
		RULE_assign = 29, RULE_attribute = 30, RULE_attribute_call = 31, RULE_collection = 32, 
		RULE_collection_elements = 33, RULE_collection_element = 34, RULE_collection_subscription = 35, 
		RULE_expr = 36, RULE_type = 37, RULE_structure = 38, RULE_value = 39, 
		RULE_comments = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "code", "instruction", "instruction_without_semicolon", "canvas_instruction", 
			"block", "print", "load", "dump", "file_path", "add", "update", "delete", 
			"get", "start_date", "end_date", "transfer_statement", "loop", "for_loop", 
			"while_loop", "if_statement", "condition", "function", "args", "arg", 
			"func_call", "def", "classDef", "dayDef", "assign", "attribute", "attribute_call", 
			"collection", "collection_elements", "collection_element", "collection_subscription", 
			"expr", "type", "structure", "value", "comments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'START DATE'", "'END DATE'", null, null, "'CLASS'", "'DAY'", 
			"'CLASSES'", "'DAYS'", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'AND'", "'OR'", "'NOT'", "'IN'", "'@'", "'('", 
			"')'", "'['", "']'", "'.'", "','", "':'", "'='", "'COLLECTION OF'", "'ADD'", 
			"'UPDATE'", "'DELETE'", "'GET'", "'WHERE'", "'SATISFYING'", "'AT'", "'ON'", 
			"'DEF'", "'IF'", "'ELIF'", "'ELSE'", "'FOR'", "'WHILE'", "'RETURN'", 
			"'BREAK'", "'{'", "'}'", "'DISTINCT'", "'PRINT'", "'DATES'", "'LOAD'", 
			"'DUMP'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "CLASS_ATTRIBUTE", "TYPENAME", "CLASSNAME", "DAYNAME", 
			"CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", "ADD", "SUBTRACT", 
			"EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUAL", 
			"GREATER_THAN_OR_EQUAL", "AND", "OR", "NOT", "IN", "OVERLAP", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "DOT", "COMMA", "COLON", 
			"SINGLEEQUAL", "COLLECTION_OF", "ADD_CANVA", "UPDATE_CANVA", "DELETE_CANVA", 
			"GET_CANVA", "WHERE", "SATISFYING", "AT", "ON", "DEF", "IF", "ELIF", 
			"ELSE", "FOR", "WHILE", "RETURN", "BREAK", "OPEN_CURLY", "CLOSE_CURLY", 
			"DISTINCT", "PRINT", "DATESTOKEN", "LOADTOKEN", "DUMPTOKEN", "INT", "BOOL", 
			"STRING", "DATE", "TIME", "WS", "VARNAME", "COMMENT_LINE", "COMMENT"
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__2 - 2)) | (1L << (TYPENAME - 2)) | (1L << (CLASSNAME - 2)) | (1L << (DAYNAME - 2)) | (1L << (NOT - 2)) | (1L << (OPEN_PAREN - 2)) | (1L << (OPEN_BRACKET - 2)) | (1L << (COLLECTION_OF - 2)) | (1L << (ADD_CANVA - 2)) | (1L << (UPDATE_CANVA - 2)) | (1L << (DELETE_CANVA - 2)) | (1L << (GET_CANVA - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (WHILE - 2)) | (1L << (RETURN - 2)) | (1L << (BREAK - 2)) | (1L << (PRINT - 2)) | (1L << (LOADTOKEN - 2)) | (1L << (DUMPTOKEN - 2)) | (1L << (INT - 2)) | (1L << (BOOL - 2)) | (1L << (STRING - 2)) | (1L << (DATE - 2)) | (1L << (TIME - 2)) | (1L << (VARNAME - 2)) | (1L << (COMMENT_LINE - 2)) | (1L << (COMMENT - 2)))) != 0)) {
				{
				setState(82);
				code();
				}
			}

			setState(85);
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
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(87);
						instruction();
						}
						break;
					case 2:
						{
						setState(88);
						canvas_instruction();
						}
						break;
					}
					setState(91);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(93);
					instruction_without_semicolon();
					}
					break;
				case 3:
					{
					setState(94);
					comments();
					}
					break;
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__2 - 2)) | (1L << (TYPENAME - 2)) | (1L << (CLASSNAME - 2)) | (1L << (DAYNAME - 2)) | (1L << (NOT - 2)) | (1L << (OPEN_PAREN - 2)) | (1L << (OPEN_BRACKET - 2)) | (1L << (COLLECTION_OF - 2)) | (1L << (ADD_CANVA - 2)) | (1L << (UPDATE_CANVA - 2)) | (1L << (DELETE_CANVA - 2)) | (1L << (GET_CANVA - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (WHILE - 2)) | (1L << (RETURN - 2)) | (1L << (BREAK - 2)) | (1L << (PRINT - 2)) | (1L << (LOADTOKEN - 2)) | (1L << (DUMPTOKEN - 2)) | (1L << (INT - 2)) | (1L << (BOOL - 2)) | (1L << (STRING - 2)) | (1L << (DATE - 2)) | (1L << (TIME - 2)) | (1L << (VARNAME - 2)) | (1L << (COMMENT_LINE - 2)) | (1L << (COMMENT - 2)))) != 0) );
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				transfer_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
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
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				if_statement();
				}
				break;
			case TYPENAME:
			case CLASSNAME:
			case DAYNAME:
			case COLLECTION_OF:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				function();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
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
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public DumpContext dump() {
			return getRuleContext(DumpContext.class,0);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_CANVA:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				add();
				}
				break;
			case UPDATE_CANVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				update();
				}
				break;
			case DELETE_CANVA:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				delete();
				}
				break;
			case GET_CANVA:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				get();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				start_date();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				end_date();
				}
				break;
			case LOADTOKEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				load();
				}
				break;
			case DUMPTOKEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				dump();
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
			setState(121);
			match(OPEN_CURLY);
			setState(122);
			code();
			setState(123);
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
			setState(125);
			match(PRINT);
			setState(126);
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

	public static class LoadContext extends ParserRuleContext {
		public TerminalNode LOADTOKEN() { return getToken(SchedulerParser.LOADTOKEN, 0); }
		public File_pathContext file_path() {
			return getRuleContext(File_pathContext.class,0);
		}
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_load);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(LOADTOKEN);
			setState(129);
			file_path();
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

	public static class DumpContext extends ParserRuleContext {
		public TerminalNode DUMPTOKEN() { return getToken(SchedulerParser.DUMPTOKEN, 0); }
		public File_pathContext file_path() {
			return getRuleContext(File_pathContext.class,0);
		}
		public DumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dump; }
	}

	public final DumpContext dump() throws RecognitionException {
		DumpContext _localctx = new DumpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dump);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(DUMPTOKEN);
			setState(132);
			file_path();
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

	public static class File_pathContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SchedulerParser.STRING, 0); }
		public File_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_path; }
	}

	public final File_pathContext file_path() throws RecognitionException {
		File_pathContext _localctx = new File_pathContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_file_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(STRING);
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
		enterRule(_localctx, 20, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ADD_CANVA);
			setState(137);
			structure();
			setState(138);
			expr(0);
			setState(139);
			match(ON);
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==TYPENAME || _la==DATESTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(141);
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
		enterRule(_localctx, 22, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(UPDATE_CANVA);
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
				{
				setState(144);
				match(DATE);
				setState(145);
				expr(0);
				}
				break;
			case DATESTOKEN:
				{
				setState(146);
				match(DATESTOKEN);
				setState(147);
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
		enterRule(_localctx, 24, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(DELETE_CANVA);
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==CLASSESTOKEN || _la==DAYSTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(152);
				match(VARNAME);
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(155);
				match(SATISFYING);
				setState(156);
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
		enterRule(_localctx, 26, RULE_get);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(GET_CANVA);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(160);
				match(DISTINCT);
				}
			}

			setState(163);
			_la = _input.LA(1);
			if ( !(_la==CLASSESTOKEN || _la==DAYSTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(164);
				match(VARNAME);
				}
				break;
			}
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(167);
				match(SATISFYING);
				setState(168);
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
		enterRule(_localctx, 28, RULE_start_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__1);
			setState(172);
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
		enterRule(_localctx, 30, RULE_end_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__2);
			setState(175);
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
		enterRule(_localctx, 32, RULE_transfer_statement);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(RETURN);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << LOADTOKEN) | (1L << DUMPTOKEN) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
					{
					setState(178);
					expr(0);
					}
				}

				}
				break;
			case BREAK:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
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
		enterRule(_localctx, 34, RULE_loop);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
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
		enterRule(_localctx, 36, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(FOR);
			setState(189);
			type();
			setState(190);
			match(VARNAME);
			setState(191);
			match(IN);
			setState(192);
			expr(0);
			setState(193);
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
		enterRule(_localctx, 38, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(WHILE);
			setState(196);
			condition();
			setState(197);
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
		enterRule(_localctx, 40, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IF);
			setState(200);
			condition();
			setState(201);
			block();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(202);
				match(ELIF);
				setState(203);
				condition();
				setState(204);
				block();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(211);
				match(ELSE);
				setState(212);
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
		enterRule(_localctx, 42, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		enterRule(_localctx, 44, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			type();
			setState(218);
			match(VARNAME);
			setState(219);
			match(OPEN_PAREN);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPENAME) | (1L << CLASSNAME) | (1L << DAYNAME) | (1L << COLLECTION_OF))) != 0)) {
				{
				setState(220);
				args();
				}
			}

			setState(223);
			match(CLOSE_PAREN);
			setState(224);
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
		enterRule(_localctx, 46, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			arg();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(227);
				match(COMMA);
				setState(228);
				arg();
				}
				}
				setState(233);
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
		enterRule(_localctx, 48, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			type();
			setState(235);
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
		enterRule(_localctx, 50, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(VARNAME);
			setState(238);
			match(OPEN_PAREN);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << LOADTOKEN) | (1L << DUMPTOKEN) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
				{
				setState(239);
				expr(0);
				}
			}

			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				expr(0);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
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
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_def);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(TYPENAME);
				setState(252);
				match(VARNAME);
				setState(253);
				match(SINGLEEQUAL);
				setState(254);
				expr(0);
				}
				break;
			case COLLECTION_OF:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(COLLECTION_OF);
				setState(256);
				type();
				setState(257);
				match(VARNAME);
				setState(258);
				match(SINGLEEQUAL);
				setState(259);
				expr(0);
				}
				break;
			case DAYNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				dayDef();
				}
				break;
			case CLASSNAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				classDef();
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
		enterRule(_localctx, 54, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(CLASSNAME);
			setState(266);
			match(VARNAME);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS_ATTRIBUTE) {
				{
				{
				setState(267);
				match(CLASS_ATTRIBUTE);
				setState(268);
				expr(0);
				}
				}
				setState(273);
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
		enterRule(_localctx, 56, RULE_dayDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(DAYNAME);
			setState(275);
			match(VARNAME);
			setState(276);
			match(CLASSESTOKEN);
			setState(277);
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
		enterRule(_localctx, 58, RULE_assign);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(VARNAME);
				setState(280);
				match(SINGLEEQUAL);
				setState(281);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(VARNAME);
				setState(283);
				match(DOT);
				setState(284);
				attribute();
				setState(285);
				match(SINGLEEQUAL);
				setState(286);
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
		enterRule(_localctx, 60, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
		enterRule(_localctx, 62, RULE_attribute_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(VARNAME);
			setState(293);
			match(DOT);
			setState(294);
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
		enterRule(_localctx, 64, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(OPEN_BRACKET);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << LOADTOKEN) | (1L << DUMPTOKEN) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
				{
				setState(297);
				collection_elements();
				}
			}

			setState(300);
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
		enterRule(_localctx, 66, RULE_collection_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			collection_element();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(303);
				match(COMMA);
				setState(304);
				collection_element();
				}
				}
				setState(309);
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
		enterRule(_localctx, 68, RULE_collection_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
		enterRule(_localctx, 70, RULE_collection_subscription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(VARNAME);
			setState(313);
			match(OPEN_BRACKET);
			setState(314);
			expr(0);
			setState(315);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new CallsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(318);
					func_call();
					}
					break;
				case 2:
					{
					setState(319);
					attribute_call();
					}
					break;
				case 3:
					{
					setState(320);
					canvas_instruction();
					}
					break;
				case 4:
					{
					setState(321);
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
				setState(324);
				match(NOT);
				setState(325);
				expr(11);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				match(OPEN_PAREN);
				setState(327);
				expr(0);
				setState(328);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACKET:
					{
					setState(330);
					collection();
					}
					break;
				case INT:
				case BOOL:
				case STRING:
				case DATE:
				case TIME:
					{
					setState(331);
					value();
					}
					break;
				case VARNAME:
					{
					setState(332);
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
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(337);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(338);
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
						setState(339);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(340);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(341);
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
						setState(342);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(343);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(344);
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
						setState(345);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(346);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(347);
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
						setState(348);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(349);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(350);
						match(AND);
						setState(351);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(352);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(353);
						match(OR);
						setState(354);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new OverlapExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(355);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(356);
						match(OVERLAP);
						setState(357);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new InExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(358);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(359);
						match(IN);
						setState(360);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(365);
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
		enterRule(_localctx, 74, RULE_type);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(TYPENAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				structure();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(COLLECTION_OF);
				setState(369);
				match(TYPENAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				match(COLLECTION_OF);
				setState(371);
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
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if ( !(_la==CLASSNAME || _la==DAYNAME) ) {
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
		enterRule(_localctx, 78, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		enterRule(_localctx, 80, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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
		case 36:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u017f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\5\2"+
		"V\n\2\3\2\3\2\3\3\3\3\5\3\\\n\3\3\3\3\3\3\3\3\3\6\3b\n\3\r\3\16\3c\3\4"+
		"\3\4\3\4\3\4\3\4\5\4k\n\4\3\5\3\5\3\5\5\5p\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6z\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0097\n"+
		"\r\3\16\3\16\3\16\5\16\u009c\n\16\3\16\3\16\5\16\u00a0\n\16\3\17\3\17"+
		"\5\17\u00a4\n\17\3\17\3\17\5\17\u00a8\n\17\3\17\3\17\5\17\u00ac\n\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\5\22\u00b6\n\22\3\22\5\22\u00b9"+
		"\n\22\3\23\3\23\5\23\u00bd\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00d1\n\26\f\26"+
		"\16\26\u00d4\13\26\3\26\3\26\5\26\u00d8\n\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\5\30\u00e0\n\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u00e8\n\31\f"+
		"\31\16\31\u00eb\13\31\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u00f3\n\33\3"+
		"\33\3\33\7\33\u00f7\n\33\f\33\16\33\u00fa\13\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u010a\n\34\3\35"+
		"\3\35\3\35\3\35\7\35\u0110\n\35\f\35\16\35\u0113\13\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0123\n\37"+
		"\3 \3 \3!\3!\3!\3!\3\"\3\"\5\"\u012d\n\"\3\"\3\"\3#\3#\3#\7#\u0134\n#"+
		"\f#\16#\u0137\13#\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\5&\u0145\n&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\5&\u0150\n&\5&\u0152\n&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u016c\n&\f&\16&\u016f"+
		"\13&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0177\n\'\3(\3(\3)\3)\3*\3*\3*\2\3J+"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPR\2\13\4\2\7\788\3\2\n\13\3\2\f\r\3\2\16\17\3\2\22\25\3\2\20\21\3"+
		"\2\b\t\3\2;?\3\2BC\2\u0190\2U\3\2\2\2\4a\3\2\2\2\6j\3\2\2\2\bo\3\2\2\2"+
		"\ny\3\2\2\2\f{\3\2\2\2\16\177\3\2\2\2\20\u0082\3\2\2\2\22\u0085\3\2\2"+
		"\2\24\u0088\3\2\2\2\26\u008a\3\2\2\2\30\u0091\3\2\2\2\32\u0098\3\2\2\2"+
		"\34\u00a1\3\2\2\2\36\u00ad\3\2\2\2 \u00b0\3\2\2\2\"\u00b8\3\2\2\2$\u00bc"+
		"\3\2\2\2&\u00be\3\2\2\2(\u00c5\3\2\2\2*\u00c9\3\2\2\2,\u00d9\3\2\2\2."+
		"\u00db\3\2\2\2\60\u00e4\3\2\2\2\62\u00ec\3\2\2\2\64\u00ef\3\2\2\2\66\u0109"+
		"\3\2\2\28\u010b\3\2\2\2:\u0114\3\2\2\2<\u0122\3\2\2\2>\u0124\3\2\2\2@"+
		"\u0126\3\2\2\2B\u012a\3\2\2\2D\u0130\3\2\2\2F\u0138\3\2\2\2H\u013a\3\2"+
		"\2\2J\u0151\3\2\2\2L\u0176\3\2\2\2N\u0178\3\2\2\2P\u017a\3\2\2\2R\u017c"+
		"\3\2\2\2TV\5\4\3\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\2\2\3X\3\3\2\2\2"+
		"Y\\\5\6\4\2Z\\\5\n\6\2[Y\3\2\2\2[Z\3\2\2\2\\]\3\2\2\2]^\7\3\2\2^b\3\2"+
		"\2\2_b\5\b\5\2`b\5R*\2a[\3\2\2\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2d\5\3\2\2\2ek\5\66\34\2fk\5<\37\2gk\5J&\2hk\5\"\22\2ik\5\16"+
		"\b\2je\3\2\2\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\7\3\2\2\2lp\5"+
		"*\26\2mp\5.\30\2np\5$\23\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\t\3\2\2\2qz"+
		"\5\26\f\2rz\5\30\r\2sz\5\32\16\2tz\5\34\17\2uz\5\36\20\2vz\5 \21\2wz\5"+
		"\20\t\2xz\5\22\n\2yq\3\2\2\2yr\3\2\2\2ys\3\2\2\2yt\3\2\2\2yu\3\2\2\2y"+
		"v\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\13\3\2\2\2{|\7\64\2\2|}\5\4\3\2}~\7\65"+
		"\2\2~\r\3\2\2\2\177\u0080\7\67\2\2\u0080\u0081\5J&\2\u0081\17\3\2\2\2"+
		"\u0082\u0083\79\2\2\u0083\u0084\5\24\13\2\u0084\21\3\2\2\2\u0085\u0086"+
		"\7:\2\2\u0086\u0087\5\24\13\2\u0087\23\3\2\2\2\u0088\u0089\7=\2\2\u0089"+
		"\25\3\2\2\2\u008a\u008b\7$\2\2\u008b\u008c\5N(\2\u008c\u008d\5J&\2\u008d"+
		"\u008e\7+\2\2\u008e\u008f\t\2\2\2\u008f\u0090\5J&\2\u0090\27\3\2\2\2\u0091"+
		"\u0096\7%\2\2\u0092\u0093\7>\2\2\u0093\u0097\5J&\2\u0094\u0095\78\2\2"+
		"\u0095\u0097\5B\"\2\u0096\u0092\3\2\2\2\u0096\u0094\3\2\2\2\u0097\31\3"+
		"\2\2\2\u0098\u0099\7&\2\2\u0099\u009b\t\3\2\2\u009a\u009c\7A\2\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009e\7)"+
		"\2\2\u009e\u00a0\5,\27\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\33\3\2\2\2\u00a1\u00a3\7\'\2\2\u00a2\u00a4\7\66\2\2\u00a3\u00a2\3\2\2"+
		"\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a8"+
		"\7A\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00aa\7)\2\2\u00aa\u00ac\5,\27\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\35\3\2\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00af\7>\2\2\u00af\37"+
		"\3\2\2\2\u00b0\u00b1\7\5\2\2\u00b1\u00b2\7>\2\2\u00b2!\3\2\2\2\u00b3\u00b5"+
		"\7\62\2\2\u00b4\u00b6\5J&\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b9\7\63\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9#\3\2\2\2\u00ba\u00bd\5&\24\2\u00bb\u00bd\5(\25\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd%\3\2\2\2\u00be\u00bf\7\60\2\2\u00bf"+
		"\u00c0\5L\'\2\u00c0\u00c1\7A\2\2\u00c1\u00c2\7\31\2\2\u00c2\u00c3\5J&"+
		"\2\u00c3\u00c4\5\f\7\2\u00c4\'\3\2\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7"+
		"\5,\27\2\u00c7\u00c8\5\f\7\2\u00c8)\3\2\2\2\u00c9\u00ca\7-\2\2\u00ca\u00cb"+
		"\5,\27\2\u00cb\u00d2\5\f\7\2\u00cc\u00cd\7.\2\2\u00cd\u00ce\5,\27\2\u00ce"+
		"\u00cf\5\f\7\2\u00cf\u00d1\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d7\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7/\2\2\u00d6\u00d8\5\f\7\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8+\3\2\2\2\u00d9\u00da\5J&\2\u00da-\3\2\2"+
		"\2\u00db\u00dc\5L\'\2\u00dc\u00dd\7A\2\2\u00dd\u00df\7\33\2\2\u00de\u00e0"+
		"\5\60\31\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2"+
		"\u00e1\u00e2\7\34\2\2\u00e2\u00e3\5\f\7\2\u00e3/\3\2\2\2\u00e4\u00e9\5"+
		"\62\32\2\u00e5\u00e6\7 \2\2\u00e6\u00e8\5\62\32\2\u00e7\u00e5\3\2\2\2"+
		"\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\61"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\5L\'\2\u00ed\u00ee\7A\2\2\u00ee"+
		"\63\3\2\2\2\u00ef\u00f0\7A\2\2\u00f0\u00f2\7\33\2\2\u00f1\u00f3\5J&\2"+
		"\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f8\3\2\2\2\u00f4\u00f5"+
		"\7 \2\2\u00f5\u00f7\5J&\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fc\7\34\2\2\u00fc\65\3\2\2\2\u00fd\u00fe\7\7\2\2\u00fe\u00ff"+
		"\7A\2\2\u00ff\u0100\7\"\2\2\u0100\u010a\5J&\2\u0101\u0102\7#\2\2\u0102"+
		"\u0103\5L\'\2\u0103\u0104\7A\2\2\u0104\u0105\7\"\2\2\u0105\u0106\5J&\2"+
		"\u0106\u010a\3\2\2\2\u0107\u010a\5:\36\2\u0108\u010a\58\35\2\u0109\u00fd"+
		"\3\2\2\2\u0109\u0101\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\67\3\2\2\2\u010b\u010c\7\b\2\2\u010c\u0111\7A\2\2\u010d\u010e\7\6\2\2"+
		"\u010e\u0110\5J&\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u01129\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0115\7\t\2\2\u0115\u0116\7A\2\2\u0116\u0117\7\n\2\2\u0117\u0118\5B\""+
		"\2\u0118;\3\2\2\2\u0119\u011a\7A\2\2\u011a\u011b\7\"\2\2\u011b\u0123\5"+
		"J&\2\u011c\u011d\7A\2\2\u011d\u011e\7\37\2\2\u011e\u011f\5> \2\u011f\u0120"+
		"\7\"\2\2\u0120\u0121\5J&\2\u0121\u0123\3\2\2\2\u0122\u0119\3\2\2\2\u0122"+
		"\u011c\3\2\2\2\u0123=\3\2\2\2\u0124\u0125\7\6\2\2\u0125?\3\2\2\2\u0126"+
		"\u0127\7A\2\2\u0127\u0128\7\37\2\2\u0128\u0129\5> \2\u0129A\3\2\2\2\u012a"+
		"\u012c\7\35\2\2\u012b\u012d\5D#\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7\36\2\2\u012fC\3\2\2\2\u0130\u0135"+
		"\5F$\2\u0131\u0132\7 \2\2\u0132\u0134\5F$\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136E\3\2\2\2"+
		"\u0137\u0135\3\2\2\2\u0138\u0139\5J&\2\u0139G\3\2\2\2\u013a\u013b\7A\2"+
		"\2\u013b\u013c\7\35\2\2\u013c\u013d\5J&\2\u013d\u013e\7\36\2\2\u013eI"+
		"\3\2\2\2\u013f\u0144\b&\1\2\u0140\u0145\5\64\33\2\u0141\u0145\5@!\2\u0142"+
		"\u0145\5\n\6\2\u0143\u0145\5H%\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2\2"+
		"\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0152\3\2\2\2\u0146\u0147"+
		"\7\30\2\2\u0147\u0152\5J&\r\u0148\u0149\7\33\2\2\u0149\u014a\5J&\2\u014a"+
		"\u014b\7\34\2\2\u014b\u0152\3\2\2\2\u014c\u0150\5B\"\2\u014d\u0150\5P"+
		")\2\u014e\u0150\7A\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e"+
		"\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u013f\3\2\2\2\u0151\u0146\3\2\2\2\u0151"+
		"\u0148\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u016d\3\2\2\2\u0153\u0154\f\f"+
		"\2\2\u0154\u0155\t\4\2\2\u0155\u016c\5J&\r\u0156\u0157\f\13\2\2\u0157"+
		"\u0158\t\5\2\2\u0158\u016c\5J&\f\u0159\u015a\f\n\2\2\u015a\u015b\t\6\2"+
		"\2\u015b\u016c\5J&\13\u015c\u015d\f\t\2\2\u015d\u015e\t\7\2\2\u015e\u016c"+
		"\5J&\n\u015f\u0160\f\b\2\2\u0160\u0161\7\26\2\2\u0161\u016c\5J&\t\u0162"+
		"\u0163\f\7\2\2\u0163\u0164\7\27\2\2\u0164\u016c\5J&\b\u0165\u0166\f\6"+
		"\2\2\u0166\u0167\7\32\2\2\u0167\u016c\5J&\7\u0168\u0169\f\5\2\2\u0169"+
		"\u016a\7\31\2\2\u016a\u016c\5J&\6\u016b\u0153\3\2\2\2\u016b\u0156\3\2"+
		"\2\2\u016b\u0159\3\2\2\2\u016b\u015c\3\2\2\2\u016b\u015f\3\2\2\2\u016b"+
		"\u0162\3\2\2\2\u016b\u0165\3\2\2\2\u016b\u0168\3\2\2\2\u016c\u016f\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016eK\3\2\2\2\u016f\u016d"+
		"\3\2\2\2\u0170\u0177\7\7\2\2\u0171\u0177\5N(\2\u0172\u0173\7#\2\2\u0173"+
		"\u0177\7\7\2\2\u0174\u0175\7#\2\2\u0175\u0177\5N(\2\u0176\u0170\3\2\2"+
		"\2\u0176\u0171\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0174\3\2\2\2\u0177M"+
		"\3\2\2\2\u0178\u0179\t\b\2\2\u0179O\3\2\2\2\u017a\u017b\t\t\2\2\u017b"+
		"Q\3\2\2\2\u017c\u017d\t\n\2\2\u017dS\3\2\2\2#U[acjoy\u0096\u009b\u009f"+
		"\u00a3\u00a7\u00ab\u00b5\u00b8\u00bc\u00d2\u00d7\u00df\u00e9\u00f2\u00f8"+
		"\u0109\u0111\u0122\u012c\u0135\u0144\u014f\u0151\u016b\u016d\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}