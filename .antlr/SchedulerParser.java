// Generated from d:\KTK\scheduler-language\Scheduler.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, CLASS_ATTRIBUTE=3, TYPENAME=4, CLASSTOKEN=5, DAYTOKEN=6, 
		WEEKTOKEN=7, CLASSESTOKEN=8, DAYSTOKEN=9, MULTIPLY=10, DIVIDE=11, ADD=12, 
		SUBTRACT=13, EQUAL=14, NOT_EQUAL=15, LESS_THAN=16, GREATER_THAN=17, LESS_THAN_OR_EQUAL=18, 
		GREATER_THAN_OR_EQUAL=19, AND=20, OR=21, NOT=22, IN=23, OVERLAP=24, OPEN_PAREN=25, 
		CLOSE_PAREN=26, OPEN_BRACKET=27, CLOSE_BRACKET=28, DOT=29, COMMA=30, COLON=31, 
		SINGLEEQUAL=32, COLLECTION_OF=33, ADD_CANVA=34, UPDATE_CANVA=35, DELETE_CANVA=36, 
		GET_CANVA=37, WHERE=38, DEF=39, IF=40, FOR=41, WHILE=42, RETURN=43, BREAK=44, 
		CURLY_OPEN=45, CURLY_CLOSE=46, INT=47, BOOL=48, STRING=49, DATE=50, TIME=51, 
		WS=52, VARNAME=53;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_instruction = 2, RULE_canvas_instruction = 3, 
		RULE_block = 4, RULE_add = 5, RULE_update = 6, RULE_delete = 7, RULE_get = 8, 
		RULE_get_arg = 9, RULE_transfer_statement = 10, RULE_loop = 11, RULE_for_loop = 12, 
		RULE_while_loop = 13, RULE_if_statement = 14, RULE_condition = 15, RULE_function = 16, 
		RULE_args = 17, RULE_arg = 18, RULE_func_call = 19, RULE_def = 20, RULE_classDef = 21, 
		RULE_dayDef = 22, RULE_weekDef = 23, RULE_assign = 24, RULE_attribute = 25, 
		RULE_attribute_call = 26, RULE_expr = 27, RULE_collection = 28, RULE_elements = 29, 
		RULE_element = 30, RULE_typerule = 31, RULE_value = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "code", "instruction", "canvas_instruction", "block", "add", 
			"update", "delete", "get", "get_arg", "transfer_statement", "loop", "for_loop", 
			"while_loop", "if_statement", "condition", "function", "args", "arg", 
			"func_call", "def", "classDef", "dayDef", "weekDef", "assign", "attribute", 
			"attribute_call", "expr", "collection", "elements", "element", "typerule", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'DATES'", null, null, "'CLASS'", "'DAY'", "'WEEK'", "'CLASSES'", 
			"'DAYS'", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'<'", "'>'", "'<='", 
			"'>='", "'AND'", "'OR'", "'NOT'", "'IN'", "'#'", "'('", "')'", "'['", 
			"']'", "'.'", "','", "':'", "'='", "'COLLECTION OF'", "'ADD'", "'UPDATE'", 
			"'DELETE'", "'GET'", "'WHERE'", "'DEF'", "'IF'", "'FOR'", "'WHILE'", 
			"'RETURN'", "'BREAK'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "CLASS_ATTRIBUTE", "TYPENAME", "CLASSTOKEN", "DAYTOKEN", 
			"WEEKTOKEN", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", "ADD", 
			"SUBTRACT", "EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUAL", 
			"GREATER_THAN_OR_EQUAL", "AND", "OR", "NOT", "IN", "OVERLAP", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "DOT", "COMMA", "COLON", 
			"SINGLEEQUAL", "COLLECTION_OF", "ADD_CANVA", "UPDATE_CANVA", "DELETE_CANVA", 
			"GET_CANVA", "WHERE", "DEF", "IF", "FOR", "WHILE", "RETURN", "BREAK", 
			"CURLY_OPEN", "CURLY_CLOSE", "INT", "BOOL", "STRING", "DATE", "TIME", 
			"WS", "VARNAME"
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
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SchedulerParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			code();
			setState(67);
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
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPENAME:
				case CLASSTOKEN:
				case DAYTOKEN:
				case WEEKTOKEN:
				case COLLECTION_OF:
				case DEF:
				case IF:
				case FOR:
				case WHILE:
				case RETURN:
				case BREAK:
				case VARNAME:
					{
					setState(69);
					instruction();
					}
					break;
				case ADD_CANVA:
				case UPDATE_CANVA:
				case DELETE_CANVA:
				case GET_CANVA:
					{
					setState(70);
					canvas_instruction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73);
				match(T__0);
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPENAME) | (1L << CLASSTOKEN) | (1L << DAYTOKEN) | (1L << WEEKTOKEN) | (1L << COLLECTION_OF) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << DEF) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << VARNAME))) != 0) );
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
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Transfer_statementContext transfer_statement() {
			return getRuleContext(Transfer_statementContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				func_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				transfer_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				loop();
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
		public Canvas_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas_instruction; }
	}

	public final Canvas_instructionContext canvas_instruction() throws RecognitionException {
		Canvas_instructionContext _localctx = new Canvas_instructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_canvas_instruction);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_CANVA:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				add();
				}
				break;
			case UPDATE_CANVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				update();
				}
				break;
			case DELETE_CANVA:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				delete();
				}
				break;
			case GET_CANVA:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				get();
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
		public TerminalNode CURLY_OPEN() { return getToken(SchedulerParser.CURLY_OPEN, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(SchedulerParser.CURLY_CLOSE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(CURLY_OPEN);
			setState(95);
			code();
			setState(96);
			match(CURLY_CLOSE);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TYPENAME() { return getToken(SchedulerParser.TYPENAME, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ADD_CANVA);
			setState(99);
			expr(0);
			setState(100);
			match(TYPENAME);
			setState(101);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TYPENAME() { return getToken(SchedulerParser.TYPENAME, 0); }
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
		enterRule(_localctx, 12, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(UPDATE_CANVA);
			setState(104);
			expr(0);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				{
				setState(105);
				match(TYPENAME);
				setState(106);
				expr(0);
				}
				break;
			case T__1:
				{
				setState(107);
				match(T__1);
				setState(108);
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
		public List<TerminalNode> TYPENAME() { return getTokens(SchedulerParser.TYPENAME); }
		public TerminalNode TYPENAME(int i) {
			return getToken(SchedulerParser.TYPENAME, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public TerminalNode TIME() { return getToken(SchedulerParser.TIME, 0); }
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(DELETE_CANVA);
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				{
				setState(112);
				match(TYPENAME);
				setState(113);
				expr(0);
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(114);
					match(TYPENAME);
					setState(115);
					match(TIME);
					}
					break;
				}
				}
				break;
			case T__1:
				{
				setState(118);
				match(T__1);
				setState(119);
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

	public static class GetContext extends ParserRuleContext {
		public TerminalNode GET_CANVA() { return getToken(SchedulerParser.GET_CANVA, 0); }
		public TerminalNode WHERE() { return getToken(SchedulerParser.WHERE, 0); }
		public TerminalNode CLASSESTOKEN() { return getToken(SchedulerParser.CLASSESTOKEN, 0); }
		public TerminalNode DAYSTOKEN() { return getToken(SchedulerParser.DAYSTOKEN, 0); }
		public List<Get_argContext> get_arg() {
			return getRuleContexts(Get_argContext.class);
		}
		public Get_argContext get_arg(int i) {
			return getRuleContext(Get_argContext.class,i);
		}
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_get);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(GET_CANVA);
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==CLASSESTOKEN || _la==DAYSTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			match(WHERE);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					get_arg();
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Get_argContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TYPENAME() { return getToken(SchedulerParser.TYPENAME, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Get_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_arg; }
	}

	public final Get_argContext get_arg() throws RecognitionException {
		Get_argContext _localctx = new Get_argContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_get_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				{
				setState(131);
				match(TYPENAME);
				}
				break;
			case CLASS_ATTRIBUTE:
				{
				setState(132);
				attribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(135);
			value();
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
		enterRule(_localctx, 20, RULE_transfer_statement);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(RETURN);
				setState(138);
				expr(0);
				}
				break;
			case BREAK:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
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
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForLoopContext extends LoopContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public ForLoopContext(LoopContext ctx) { copyFrom(ctx); }
	}
	public static class WhileLoopContext extends LoopContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public WhileLoopContext(LoopContext ctx) { copyFrom(ctx); }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loop);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				for_loop();
				}
				break;
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
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
		enterRule(_localctx, 24, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(FOR);
			setState(147);
			match(VARNAME);
			setState(148);
			match(IN);
			setState(149);
			expr(0);
			setState(150);
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
		enterRule(_localctx, 26, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(WHILE);
			setState(153);
			condition();
			setState(154);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IF);
			setState(157);
			condition();
			setState(158);
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
		enterRule(_localctx, 30, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		public TerminalNode DEF() { return getToken(SchedulerParser.DEF, 0); }
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
		enterRule(_localctx, 32, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(DEF);
			setState(163);
			match(VARNAME);
			setState(164);
			match(OPEN_PAREN);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPENAME) {
				{
				setState(165);
				args();
				}
			}

			setState(168);
			match(CLOSE_PAREN);
			setState(169);
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
		enterRule(_localctx, 34, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			arg();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				arg();
				}
				}
				setState(178);
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
		public TerminalNode TYPENAME() { return getToken(SchedulerParser.TYPENAME, 0); }
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(TYPENAME);
			setState(180);
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
		enterRule(_localctx, 38, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(VARNAME);
			setState(183);
			match(OPEN_PAREN);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
				{
				setState(184);
				expr(0);
				}
			}

			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(187);
				match(COMMA);
				setState(188);
				expr(0);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
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
		enterRule(_localctx, 40, RULE_def);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(TYPENAME);
				setState(197);
				match(VARNAME);
				setState(198);
				match(SINGLEEQUAL);
				setState(199);
				expr(0);
				}
				break;
			case COLLECTION_OF:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(COLLECTION_OF);
				setState(201);
				match(TYPENAME);
				setState(202);
				match(VARNAME);
				setState(203);
				match(SINGLEEQUAL);
				setState(204);
				expr(0);
				}
				break;
			case DAYTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				dayDef();
				}
				break;
			case CLASSTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				classDef();
				}
				break;
			case WEEKTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
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
		public TerminalNode CLASSTOKEN() { return getToken(SchedulerParser.CLASSTOKEN, 0); }
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
		enterRule(_localctx, 42, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(CLASSTOKEN);
			setState(211);
			match(VARNAME);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS_ATTRIBUTE) {
				{
				{
				setState(212);
				match(CLASS_ATTRIBUTE);
				setState(213);
				expr(0);
				}
				}
				setState(218);
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
		public TerminalNode DAYTOKEN() { return getToken(SchedulerParser.DAYTOKEN, 0); }
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
		enterRule(_localctx, 44, RULE_dayDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(DAYTOKEN);
			setState(220);
			match(VARNAME);
			setState(221);
			match(CLASSESTOKEN);
			setState(222);
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
		public TerminalNode WEEKTOKEN() { return getToken(SchedulerParser.WEEKTOKEN, 0); }
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
		enterRule(_localctx, 46, RULE_weekDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(WEEKTOKEN);
			setState(225);
			match(VARNAME);
			setState(226);
			match(DAYSTOKEN);
			setState(227);
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
		enterRule(_localctx, 48, RULE_assign);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(VARNAME);
				setState(230);
				match(SINGLEEQUAL);
				setState(231);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(VARNAME);
				setState(233);
				match(DOT);
				setState(234);
				attribute();
				setState(235);
				match(SINGLEEQUAL);
				setState(236);
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
		enterRule(_localctx, 50, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		enterRule(_localctx, 52, RULE_attribute_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(VARNAME);
			setState(243);
			match(DOT);
			setState(244);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new CallsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(247);
					func_call();
					}
					break;
				case 2:
					{
					setState(248);
					attribute_call();
					}
					break;
				case 3:
					{
					setState(249);
					canvas_instruction();
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
				setState(252);
				match(NOT);
				setState(253);
				expr(11);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(OPEN_PAREN);
				setState(255);
				expr(0);
				setState(256);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACKET:
					{
					setState(258);
					collection();
					}
					break;
				case INT:
				case BOOL:
				case STRING:
				case DATE:
				case TIME:
					{
					setState(259);
					value();
					}
					break;
				case VARNAME:
					{
					setState(260);
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
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(266);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(269);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBTRACT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(272);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN_OR_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(273);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(275);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(276);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(278);
						match(AND);
						setState(279);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(281);
						match(OR);
						setState(282);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new OverlapExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(284);
						match(OVERLAP);
						setState(285);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new InExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(287);
						match(IN);
						setState(288);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class CollectionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SchedulerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SchedulerParser.CLOSE_BRACKET, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(OPEN_BRACKET);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
				{
				setState(295);
				elements();
				}
			}

			setState(298);
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

	public static class ElementsContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SchedulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SchedulerParser.COMMA, i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			element();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(301);
				match(COMMA);
				setState(302);
				element();
				}
				}
				setState(307);
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

	public static class ElementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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

	public static class TyperuleContext extends ParserRuleContext {
		public TerminalNode TYPENAME() { return getToken(SchedulerParser.TYPENAME, 0); }
		public TerminalNode CLASSTOKEN() { return getToken(SchedulerParser.CLASSTOKEN, 0); }
		public TerminalNode DAYTOKEN() { return getToken(SchedulerParser.DAYTOKEN, 0); }
		public TerminalNode WEEKTOKEN() { return getToken(SchedulerParser.WEEKTOKEN, 0); }
		public TyperuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typerule; }
	}

	public final TyperuleContext typerule() throws RecognitionException {
		TyperuleContext _localctx = new TyperuleContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typerule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPENAME) | (1L << CLASSTOKEN) | (1L << DAYTOKEN) | (1L << WEEKTOKEN))) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u013d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\5\3J\n\3\3\3\3\3\6\3N\n\3\r\3\16\3O\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\5\5_\n\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\5\tw\n\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\7\n\u0081\n\n\f\n"+
		"\16\n\u0084\13\n\3\13\3\13\5\13\u0088\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u008f"+
		"\n\f\3\r\3\r\5\r\u0093\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00a9\n\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00b1\n\23\f\23\16\23\u00b4\13\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00bc\n\25\3\25\3\25\7\25\u00c0\n"+
		"\25\f\25\16\25\u00c3\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00d3\n\26\3\27\3\27\3\27\3\27\7\27\u00d9"+
		"\n\27\f\27\16\27\u00dc\13\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f1\n\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u00fd\n\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0108\n\35\5\35\u010a\n"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0124\n\35"+
		"\f\35\16\35\u0127\13\35\3\36\3\36\5\36\u012b\n\36\3\36\3\36\3\37\3\37"+
		"\3\37\7\37\u0132\n\37\f\37\16\37\u0135\13\37\3 \3 \3!\3!\3\"\3\"\3\"\2"+
		"\38#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"B\2\t\3\2\n\13\3\2\f\r\3\2\16\17\3\2\22\25\3\2\20\21\3\2\6\t\3\2\61\65"+
		"\2\u0148\2D\3\2\2\2\4M\3\2\2\2\6X\3\2\2\2\b^\3\2\2\2\n`\3\2\2\2\fd\3\2"+
		"\2\2\16i\3\2\2\2\20q\3\2\2\2\22|\3\2\2\2\24\u0087\3\2\2\2\26\u008e\3\2"+
		"\2\2\30\u0092\3\2\2\2\32\u0094\3\2\2\2\34\u009a\3\2\2\2\36\u009e\3\2\2"+
		"\2 \u00a2\3\2\2\2\"\u00a4\3\2\2\2$\u00ad\3\2\2\2&\u00b5\3\2\2\2(\u00b8"+
		"\3\2\2\2*\u00d2\3\2\2\2,\u00d4\3\2\2\2.\u00dd\3\2\2\2\60\u00e2\3\2\2\2"+
		"\62\u00f0\3\2\2\2\64\u00f2\3\2\2\2\66\u00f4\3\2\2\28\u0109\3\2\2\2:\u0128"+
		"\3\2\2\2<\u012e\3\2\2\2>\u0136\3\2\2\2@\u0138\3\2\2\2B\u013a\3\2\2\2D"+
		"E\5\4\3\2EF\7\2\2\3F\3\3\2\2\2GJ\5\6\4\2HJ\5\b\5\2IG\3\2\2\2IH\3\2\2\2"+
		"JK\3\2\2\2KL\7\3\2\2LN\3\2\2\2MI\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2"+
		"P\5\3\2\2\2QY\5*\26\2RY\5\62\32\2SY\5\36\20\2TY\5\"\22\2UY\5(\25\2VY\5"+
		"\26\f\2WY\5\30\r\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2X"+
		"V\3\2\2\2XW\3\2\2\2Y\7\3\2\2\2Z_\5\f\7\2[_\5\16\b\2\\_\5\20\t\2]_\5\22"+
		"\n\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\t\3\2\2\2`a\7/\2\2ab\5"+
		"\4\3\2bc\7\60\2\2c\13\3\2\2\2de\7$\2\2ef\58\35\2fg\7\6\2\2gh\58\35\2h"+
		"\r\3\2\2\2ij\7%\2\2jo\58\35\2kl\7\6\2\2lp\58\35\2mn\7\4\2\2np\5:\36\2"+
		"ok\3\2\2\2om\3\2\2\2p\17\3\2\2\2qz\7&\2\2rs\7\6\2\2sv\58\35\2tu\7\6\2"+
		"\2uw\7\65\2\2vt\3\2\2\2vw\3\2\2\2w{\3\2\2\2xy\7\4\2\2y{\5:\36\2zr\3\2"+
		"\2\2zx\3\2\2\2{\21\3\2\2\2|}\7\'\2\2}~\t\2\2\2~\u0082\7(\2\2\177\u0081"+
		"\5\24\13\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\23\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0088\7\6\2"+
		"\2\u0086\u0088\5\64\33\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\5B\"\2\u008a\25\3\2\2\2\u008b\u008c\7-\2\2"+
		"\u008c\u008f\58\35\2\u008d\u008f\7.\2\2\u008e\u008b\3\2\2\2\u008e\u008d"+
		"\3\2\2\2\u008f\27\3\2\2\2\u0090\u0093\5\32\16\2\u0091\u0093\5\34\17\2"+
		"\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\31\3\2\2\2\u0094\u0095"+
		"\7+\2\2\u0095\u0096\7\67\2\2\u0096\u0097\7\31\2\2\u0097\u0098\58\35\2"+
		"\u0098\u0099\5\n\6\2\u0099\33\3\2\2\2\u009a\u009b\7,\2\2\u009b\u009c\5"+
		" \21\2\u009c\u009d\5\n\6\2\u009d\35\3\2\2\2\u009e\u009f\7*\2\2\u009f\u00a0"+
		"\5 \21\2\u00a0\u00a1\5\n\6\2\u00a1\37\3\2\2\2\u00a2\u00a3\58\35\2\u00a3"+
		"!\3\2\2\2\u00a4\u00a5\7)\2\2\u00a5\u00a6\7\67\2\2\u00a6\u00a8\7\33\2\2"+
		"\u00a7\u00a9\5$\23\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ab\7\34\2\2\u00ab\u00ac\5\n\6\2\u00ac#\3\2\2\2\u00ad"+
		"\u00b2\5&\24\2\u00ae\u00af\7 \2\2\u00af\u00b1\5&\24\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"%\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\6\2\2\u00b6\u00b7\7\67\2\2"+
		"\u00b7\'\3\2\2\2\u00b8\u00b9\7\67\2\2\u00b9\u00bb\7\33\2\2\u00ba\u00bc"+
		"\58\35\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c1\3\2\2\2\u00bd"+
		"\u00be\7 \2\2\u00be\u00c0\58\35\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\7\34\2\2\u00c5)\3\2\2\2\u00c6\u00c7\7\6\2\2"+
		"\u00c7\u00c8\7\67\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00d3\58\35\2\u00ca\u00cb"+
		"\7#\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd\7\67\2\2\u00cd\u00ce\7\"\2\2\u00ce"+
		"\u00d3\58\35\2\u00cf\u00d3\5.\30\2\u00d0\u00d3\5,\27\2\u00d1\u00d3\5\60"+
		"\31\2\u00d2\u00c6\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3+\3\2\2\2\u00d4\u00d5\7\7\2\2"+
		"\u00d5\u00da\7\67\2\2\u00d6\u00d7\7\5\2\2\u00d7\u00d9\58\35\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"-\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\b\2\2\u00de\u00df\7\67\2\2"+
		"\u00df\u00e0\7\n\2\2\u00e0\u00e1\5:\36\2\u00e1/\3\2\2\2\u00e2\u00e3\7"+
		"\t\2\2\u00e3\u00e4\7\67\2\2\u00e4\u00e5\7\13\2\2\u00e5\u00e6\5:\36\2\u00e6"+
		"\61\3\2\2\2\u00e7\u00e8\7\67\2\2\u00e8\u00e9\7\"\2\2\u00e9\u00f1\58\35"+
		"\2\u00ea\u00eb\7\67\2\2\u00eb\u00ec\7\37\2\2\u00ec\u00ed\5\64\33\2\u00ed"+
		"\u00ee\7\"\2\2\u00ee\u00ef\58\35\2\u00ef\u00f1\3\2\2\2\u00f0\u00e7\3\2"+
		"\2\2\u00f0\u00ea\3\2\2\2\u00f1\63\3\2\2\2\u00f2\u00f3\7\5\2\2\u00f3\65"+
		"\3\2\2\2\u00f4\u00f5\7\67\2\2\u00f5\u00f6\7\37\2\2\u00f6\u00f7\5\64\33"+
		"\2\u00f7\67\3\2\2\2\u00f8\u00fc\b\35\1\2\u00f9\u00fd\5(\25\2\u00fa\u00fd"+
		"\5\66\34\2\u00fb\u00fd\5\b\5\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2"+
		"\u00fc\u00fb\3\2\2\2\u00fd\u010a\3\2\2\2\u00fe\u00ff\7\30\2\2\u00ff\u010a"+
		"\58\35\r\u0100\u0101\7\33\2\2\u0101\u0102\58\35\2\u0102\u0103\7\34\2\2"+
		"\u0103\u010a\3\2\2\2\u0104\u0108\5:\36\2\u0105\u0108\5B\"\2\u0106\u0108"+
		"\7\67\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2"+
		"\u0108\u010a\3\2\2\2\u0109\u00f8\3\2\2\2\u0109\u00fe\3\2\2\2\u0109\u0100"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u0125\3\2\2\2\u010b\u010c\f\f\2\2\u010c"+
		"\u010d\t\3\2\2\u010d\u0124\58\35\r\u010e\u010f\f\13\2\2\u010f\u0110\t"+
		"\4\2\2\u0110\u0124\58\35\f\u0111\u0112\f\n\2\2\u0112\u0113\t\5\2\2\u0113"+
		"\u0124\58\35\13\u0114\u0115\f\t\2\2\u0115\u0116\t\6\2\2\u0116\u0124\5"+
		"8\35\n\u0117\u0118\f\b\2\2\u0118\u0119\7\26\2\2\u0119\u0124\58\35\t\u011a"+
		"\u011b\f\7\2\2\u011b\u011c\7\27\2\2\u011c\u0124\58\35\b\u011d\u011e\f"+
		"\6\2\2\u011e\u011f\7\32\2\2\u011f\u0124\58\35\7\u0120\u0121\f\5\2\2\u0121"+
		"\u0122\7\31\2\2\u0122\u0124\58\35\6\u0123\u010b\3\2\2\2\u0123\u010e\3"+
		"\2\2\2\u0123\u0111\3\2\2\2\u0123\u0114\3\2\2\2\u0123\u0117\3\2\2\2\u0123"+
		"\u011a\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u0120\3\2\2\2\u0124\u0127\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u01269\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0128\u012a\7\35\2\2\u0129\u012b\5<\37\2\u012a\u0129\3\2\2\2"+
		"\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\36\2\2\u012d;\3"+
		"\2\2\2\u012e\u0133\5> \2\u012f\u0130\7 \2\2\u0130\u0132\5> \2\u0131\u012f"+
		"\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"=\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\58\35\2\u0137?\3\2\2\2\u0138"+
		"\u0139\t\7\2\2\u0139A\3\2\2\2\u013a\u013b\t\b\2\2\u013bC\3\2\2\2\33IO"+
		"X^ovz\u0082\u0087\u008e\u0092\u00a8\u00b2\u00bb\u00c1\u00d2\u00da\u00f0"+
		"\u00fc\u0107\u0109\u0123\u0125\u012a\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}