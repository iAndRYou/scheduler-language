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
		T__0=1, T__1=2, T__2=3, T__3=4, CLASS_ATTRIBUTE=5, TYPENAME=6, CLASSTOKEN=7, 
		DAYTOKEN=8, WEEKTOKEN=9, CLASSESTOKEN=10, DAYSTOKEN=11, MULTIPLY=12, DIVIDE=13, 
		ADD=14, SUBTRACT=15, EQUAL=16, NOT_EQUAL=17, LESS_THAN=18, GREATER_THAN=19, 
		LESS_THAN_OR_EQUAL=20, GREATER_THAN_OR_EQUAL=21, AND=22, OR=23, NOT=24, 
		IN=25, OVERLAP=26, OPEN_PAREN=27, CLOSE_PAREN=28, OPEN_BRACKET=29, CLOSE_BRACKET=30, 
		DOT=31, COMMA=32, COLON=33, SINGLEEQUAL=34, COLLECTION_OF=35, ADD_CANVA=36, 
		UPDATE_CANVA=37, DELETE_CANVA=38, GET_CANVA=39, WHERE=40, DEF=41, IF=42, 
		FOR=43, WHILE=44, RETURN=45, BREAK=46, OPEN_CURLY=47, CLOSE_CURLY=48, 
		INT=49, BOOL=50, STRING=51, DATE=52, TIME=53, WS=54, VARNAME=55, COMMENT_LINE=56, 
		COMMENT=57;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_instruction = 2, RULE_canvas_instruction = 3, 
		RULE_block = 4, RULE_add = 5, RULE_update = 6, RULE_delete = 7, RULE_get = 8, 
		RULE_get_arg = 9, RULE_start_date = 10, RULE_end_date = 11, RULE_transfer_statement = 12, 
		RULE_loop = 13, RULE_for_loop = 14, RULE_while_loop = 15, RULE_if_statement = 16, 
		RULE_condition = 17, RULE_function = 18, RULE_args = 19, RULE_arg = 20, 
		RULE_func_call = 21, RULE_def = 22, RULE_classDef = 23, RULE_dayDef = 24, 
		RULE_weekDef = 25, RULE_assign = 26, RULE_attribute = 27, RULE_attribute_call = 28, 
		RULE_collection = 29, RULE_collection_elements = 30, RULE_collection_element = 31, 
		RULE_collection_subscription = 32, RULE_expr = 33, RULE_typerule = 34, 
		RULE_value = 35, RULE_comments = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "code", "instruction", "canvas_instruction", "block", "add", 
			"update", "delete", "get", "get_arg", "start_date", "end_date", "transfer_statement", 
			"loop", "for_loop", "while_loop", "if_statement", "condition", "function", 
			"args", "arg", "func_call", "def", "classDef", "dayDef", "weekDef", "assign", 
			"attribute", "attribute_call", "collection", "collection_elements", "collection_element", 
			"collection_subscription", "expr", "typerule", "value", "comments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'DATES'", "'START DATE'", "'END DATE'", null, null, "'CLASS'", 
			"'DAY'", "'WEEK'", "'CLASSES'", "'DAYS'", "'*'", "'/'", "'+'", "'-'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'AND'", "'OR'", "'NOT'", 
			"'IN'", "'#'", "'('", "')'", "'['", "']'", "'.'", "','", "':'", "'='", 
			"'COLLECTION OF'", "'ADD'", "'UPDATE'", "'DELETE'", "'GET'", "'WHERE'", 
			"'DEF'", "'IF'", "'FOR'", "'WHILE'", "'RETURN'", "'BREAK'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "CLASS_ATTRIBUTE", "TYPENAME", "CLASSTOKEN", 
			"DAYTOKEN", "WEEKTOKEN", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", 
			"ADD", "SUBTRACT", "EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", 
			"LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", "AND", "OR", "NOT", "IN", 
			"OVERLAP", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"DOT", "COMMA", "COLON", "SINGLEEQUAL", "COLLECTION_OF", "ADD_CANVA", 
			"UPDATE_CANVA", "DELETE_CANVA", "GET_CANVA", "WHERE", "DEF", "IF", "FOR", 
			"WHILE", "RETURN", "BREAK", "OPEN_CURLY", "CLOSE_CURLY", "INT", "BOOL", 
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << TYPENAME) | (1L << CLASSTOKEN) | (1L << DAYTOKEN) | (1L << WEEKTOKEN) | (1L << COLLECTION_OF) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << DEF) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << VARNAME) | (1L << COMMENT_LINE) | (1L << COMMENT))) != 0)) {
				{
				setState(74);
				code();
				}
			}

			setState(77);
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
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__3:
				case TYPENAME:
				case CLASSTOKEN:
				case DAYTOKEN:
				case WEEKTOKEN:
				case COLLECTION_OF:
				case ADD_CANVA:
				case UPDATE_CANVA:
				case DELETE_CANVA:
				case GET_CANVA:
				case DEF:
				case IF:
				case FOR:
				case WHILE:
				case RETURN:
				case BREAK:
				case VARNAME:
					{
					setState(81);
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
						setState(79);
						instruction();
						}
						break;
					case T__2:
					case T__3:
					case ADD_CANVA:
					case UPDATE_CANVA:
					case DELETE_CANVA:
					case GET_CANVA:
						{
						setState(80);
						canvas_instruction();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(83);
					match(T__0);
					}
					break;
				case COMMENT_LINE:
				case COMMENT:
					{
					setState(85);
					comments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << TYPENAME) | (1L << CLASSTOKEN) | (1L << DAYTOKEN) | (1L << WEEKTOKEN) | (1L << COLLECTION_OF) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << DEF) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << VARNAME) | (1L << COMMENT_LINE) | (1L << COMMENT))) != 0) );
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				func_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				transfer_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
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
		enterRule(_localctx, 6, RULE_canvas_instruction);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_CANVA:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				add();
				}
				break;
			case UPDATE_CANVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				update();
				}
				break;
			case DELETE_CANVA:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				delete();
				}
				break;
			case GET_CANVA:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				get();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				start_date();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
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
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(OPEN_CURLY);
			setState(108);
			code();
			setState(109);
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
			setState(111);
			match(ADD_CANVA);
			setState(112);
			expr(0);
			setState(113);
			match(TYPENAME);
			setState(114);
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
			setState(116);
			match(UPDATE_CANVA);
			setState(117);
			expr(0);
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				{
				setState(118);
				match(TYPENAME);
				setState(119);
				expr(0);
				}
				break;
			case T__1:
				{
				setState(120);
				match(T__1);
				setState(121);
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
			setState(124);
			match(DELETE_CANVA);
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				{
				setState(125);
				match(TYPENAME);
				setState(126);
				expr(0);
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(127);
					match(TYPENAME);
					setState(128);
					match(TIME);
					}
					break;
				}
				}
				break;
			case T__1:
				{
				setState(131);
				match(T__1);
				setState(132);
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
			setState(135);
			match(GET_CANVA);
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==CLASSESTOKEN || _la==DAYSTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(137);
			match(WHERE);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					get_arg();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				{
				setState(144);
				match(TYPENAME);
				}
				break;
			case CLASS_ATTRIBUTE:
				{
				setState(145);
				attribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(148);
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

	public static class Start_dateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(SchedulerParser.DATE, 0); }
		public Start_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_date; }
	}

	public final Start_dateContext start_date() throws RecognitionException {
		Start_dateContext _localctx = new Start_dateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_start_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__2);
			setState(151);
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
		enterRule(_localctx, 22, RULE_end_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__3);
			setState(154);
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
		enterRule(_localctx, 24, RULE_transfer_statement);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(RETURN);
				setState(157);
				expr(0);
				}
				break;
			case BREAK:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
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
		enterRule(_localctx, 26, RULE_loop);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				for_loop();
				}
				break;
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
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
		enterRule(_localctx, 28, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(FOR);
			setState(166);
			match(VARNAME);
			setState(167);
			match(IN);
			setState(168);
			expr(0);
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
		enterRule(_localctx, 30, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(WHILE);
			setState(172);
			condition();
			setState(173);
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
		enterRule(_localctx, 32, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(IF);
			setState(176);
			condition();
			setState(177);
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
		enterRule(_localctx, 34, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 36, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(DEF);
			setState(182);
			match(VARNAME);
			setState(183);
			match(OPEN_PAREN);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPENAME) {
				{
				setState(184);
				args();
				}
			}

			setState(187);
			match(CLOSE_PAREN);
			setState(188);
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
		enterRule(_localctx, 38, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			arg();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(191);
				match(COMMA);
				setState(192);
				arg();
				}
				}
				setState(197);
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
		enterRule(_localctx, 40, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(TYPENAME);
			setState(199);
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
		enterRule(_localctx, 42, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(VARNAME);
			setState(202);
			match(OPEN_PAREN);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
				{
				setState(203);
				expr(0);
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(207);
				expr(0);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
		enterRule(_localctx, 44, RULE_def);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(TYPENAME);
				setState(216);
				match(VARNAME);
				setState(217);
				match(SINGLEEQUAL);
				setState(218);
				expr(0);
				}
				break;
			case COLLECTION_OF:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(COLLECTION_OF);
				setState(220);
				match(TYPENAME);
				setState(221);
				match(VARNAME);
				setState(222);
				match(SINGLEEQUAL);
				setState(223);
				expr(0);
				}
				break;
			case DAYTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				dayDef();
				}
				break;
			case CLASSTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				classDef();
				}
				break;
			case WEEKTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
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
		enterRule(_localctx, 46, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(CLASSTOKEN);
			setState(230);
			match(VARNAME);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS_ATTRIBUTE) {
				{
				{
				setState(231);
				match(CLASS_ATTRIBUTE);
				setState(232);
				expr(0);
				}
				}
				setState(237);
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
		enterRule(_localctx, 48, RULE_dayDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(DAYTOKEN);
			setState(239);
			match(VARNAME);
			setState(240);
			match(CLASSESTOKEN);
			setState(241);
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
		enterRule(_localctx, 50, RULE_weekDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(WEEKTOKEN);
			setState(244);
			match(VARNAME);
			setState(245);
			match(DAYSTOKEN);
			setState(246);
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
		enterRule(_localctx, 52, RULE_assign);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(VARNAME);
				setState(249);
				match(SINGLEEQUAL);
				setState(250);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(VARNAME);
				setState(252);
				match(DOT);
				setState(253);
				attribute();
				setState(254);
				match(SINGLEEQUAL);
				setState(255);
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
		enterRule(_localctx, 54, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
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
		enterRule(_localctx, 56, RULE_attribute_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(VARNAME);
			setState(262);
			match(DOT);
			setState(263);
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
		enterRule(_localctx, 58, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(OPEN_BRACKET);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
				{
				setState(266);
				collection_elements();
				}
			}

			setState(269);
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
		enterRule(_localctx, 60, RULE_collection_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			collection_element();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(272);
				match(COMMA);
				setState(273);
				collection_element();
				}
				}
				setState(278);
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
		enterRule(_localctx, 62, RULE_collection_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		enterRule(_localctx, 64, RULE_collection_subscription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(VARNAME);
			setState(282);
			match(OPEN_BRACKET);
			setState(283);
			expr(0);
			setState(284);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new CallsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(287);
					func_call();
					}
					break;
				case 2:
					{
					setState(288);
					attribute_call();
					}
					break;
				case 3:
					{
					setState(289);
					canvas_instruction();
					}
					break;
				case 4:
					{
					setState(290);
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
				setState(293);
				match(NOT);
				setState(294);
				expr(11);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(OPEN_PAREN);
				setState(296);
				expr(0);
				setState(297);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACKET:
					{
					setState(299);
					collection();
					}
					break;
				case INT:
				case BOOL:
				case STRING:
				case DATE:
				case TIME:
					{
					setState(300);
					value();
					}
					break;
				case VARNAME:
					{
					setState(301);
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
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(306);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(307);
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
						setState(308);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(309);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(310);
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
						setState(311);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(313);
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
						setState(314);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(316);
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
						setState(317);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(319);
						match(AND);
						setState(320);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(322);
						match(OR);
						setState(323);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new OverlapExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(325);
						match(OVERLAP);
						setState(326);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new InExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(328);
						match(IN);
						setState(329);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 68, RULE_typerule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		enterRule(_localctx, 70, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
		enterRule(_localctx, 72, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		case 33:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0158\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\5\2N\n\2\3\2\3\2\3\3\3\3\5\3T"+
		"\n\3\3\3\3\3\3\3\6\3Y\n\3\r\3\16\3Z\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4d\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b}\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0084\n\t"+
		"\3\t\3\t\5\t\u0088\n\t\3\n\3\n\3\n\3\n\7\n\u008e\n\n\f\n\16\n\u0091\13"+
		"\n\3\13\3\13\5\13\u0095\n\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\5\16\u00a2\n\16\3\17\3\17\5\17\u00a6\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\5\24\u00bc\n\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00c4\n"+
		"\25\f\25\16\25\u00c7\13\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00cf\n"+
		"\27\3\27\3\27\7\27\u00d3\n\27\f\27\16\27\u00d6\13\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e6\n\30"+
		"\3\31\3\31\3\31\3\31\7\31\u00ec\n\31\f\31\16\31\u00ef\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0104\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\5\37\u010e\n\37\3\37\3\37\3 \3 \3 \7 \u0115\n \f \16 \u0118\13 \3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u0126\n#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u0131\n#\5#\u0133\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u014d\n#\f#\16#\u0150\13#\3$\3$\3"+
		"%\3%\3&\3&\3&\2\3D\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJ\2\n\3\2\f\r\3\2\16\17\3\2\20\21\3\2\24\27\3\2\22\23"+
		"\3\2\b\13\3\2\63\67\3\2:;\2\u0164\2M\3\2\2\2\4X\3\2\2\2\6c\3\2\2\2\bk"+
		"\3\2\2\2\nm\3\2\2\2\fq\3\2\2\2\16v\3\2\2\2\20~\3\2\2\2\22\u0089\3\2\2"+
		"\2\24\u0094\3\2\2\2\26\u0098\3\2\2\2\30\u009b\3\2\2\2\32\u00a1\3\2\2\2"+
		"\34\u00a5\3\2\2\2\36\u00a7\3\2\2\2 \u00ad\3\2\2\2\"\u00b1\3\2\2\2$\u00b5"+
		"\3\2\2\2&\u00b7\3\2\2\2(\u00c0\3\2\2\2*\u00c8\3\2\2\2,\u00cb\3\2\2\2."+
		"\u00e5\3\2\2\2\60\u00e7\3\2\2\2\62\u00f0\3\2\2\2\64\u00f5\3\2\2\2\66\u0103"+
		"\3\2\2\28\u0105\3\2\2\2:\u0107\3\2\2\2<\u010b\3\2\2\2>\u0111\3\2\2\2@"+
		"\u0119\3\2\2\2B\u011b\3\2\2\2D\u0132\3\2\2\2F\u0151\3\2\2\2H\u0153\3\2"+
		"\2\2J\u0155\3\2\2\2LN\5\4\3\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\2\2\3"+
		"P\3\3\2\2\2QT\5\6\4\2RT\5\b\5\2SQ\3\2\2\2SR\3\2\2\2TU\3\2\2\2UV\7\3\2"+
		"\2VY\3\2\2\2WY\5J&\2XS\3\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[\5\3\2\2\2\\d\5.\30\2]d\5\66\34\2^d\5\"\22\2_d\5&\24\2`d\5,\27\2ad\5"+
		"\32\16\2bd\5\34\17\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2c`\3\2\2"+
		"\2ca\3\2\2\2cb\3\2\2\2d\7\3\2\2\2el\5\f\7\2fl\5\16\b\2gl\5\20\t\2hl\5"+
		"\22\n\2il\5\26\f\2jl\5\30\r\2ke\3\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2"+
		"ki\3\2\2\2kj\3\2\2\2l\t\3\2\2\2mn\7\61\2\2no\5\4\3\2op\7\62\2\2p\13\3"+
		"\2\2\2qr\7&\2\2rs\5D#\2st\7\b\2\2tu\5D#\2u\r\3\2\2\2vw\7\'\2\2w|\5D#\2"+
		"xy\7\b\2\2y}\5D#\2z{\7\4\2\2{}\5<\37\2|x\3\2\2\2|z\3\2\2\2}\17\3\2\2\2"+
		"~\u0087\7(\2\2\177\u0080\7\b\2\2\u0080\u0083\5D#\2\u0081\u0082\7\b\2\2"+
		"\u0082\u0084\7\67\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0088"+
		"\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u0088\5<\37\2\u0087\177\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\21\3\2\2\2\u0089\u008a\7)\2\2\u008a\u008b\t\2\2\2"+
		"\u008b\u008f\7*\2\2\u008c\u008e\5\24\13\2\u008d\u008c\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\23\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0095\7\b\2\2\u0093\u0095\58\35\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\5H%\2\u0097\25"+
		"\3\2\2\2\u0098\u0099\7\5\2\2\u0099\u009a\7\66\2\2\u009a\27\3\2\2\2\u009b"+
		"\u009c\7\6\2\2\u009c\u009d\7\66\2\2\u009d\31\3\2\2\2\u009e\u009f\7/\2"+
		"\2\u009f\u00a2\5D#\2\u00a0\u00a2\7\60\2\2\u00a1\u009e\3\2\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a2\33\3\2\2\2\u00a3\u00a6\5\36\20\2\u00a4\u00a6\5 \21\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\7-\2\2"+
		"\u00a8\u00a9\79\2\2\u00a9\u00aa\7\33\2\2\u00aa\u00ab\5D#\2\u00ab\u00ac"+
		"\5\n\6\2\u00ac\37\3\2\2\2\u00ad\u00ae\7.\2\2\u00ae\u00af\5$\23\2\u00af"+
		"\u00b0\5\n\6\2\u00b0!\3\2\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b3\5$\23\2\u00b3"+
		"\u00b4\5\n\6\2\u00b4#\3\2\2\2\u00b5\u00b6\5D#\2\u00b6%\3\2\2\2\u00b7\u00b8"+
		"\7+\2\2\u00b8\u00b9\79\2\2\u00b9\u00bb\7\35\2\2\u00ba\u00bc\5(\25\2\u00bb"+
		"\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\36"+
		"\2\2\u00be\u00bf\5\n\6\2\u00bf\'\3\2\2\2\u00c0\u00c5\5*\26\2\u00c1\u00c2"+
		"\7\"\2\2\u00c2\u00c4\5*\26\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6)\3\2\2\2\u00c7\u00c5\3\2\2\2"+
		"\u00c8\u00c9\7\b\2\2\u00c9\u00ca\79\2\2\u00ca+\3\2\2\2\u00cb\u00cc\79"+
		"\2\2\u00cc\u00ce\7\35\2\2\u00cd\u00cf\5D#\2\u00ce\u00cd\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d3\5D"+
		"#\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\36"+
		"\2\2\u00d8-\3\2\2\2\u00d9\u00da\7\b\2\2\u00da\u00db\79\2\2\u00db\u00dc"+
		"\7$\2\2\u00dc\u00e6\5D#\2\u00dd\u00de\7%\2\2\u00de\u00df\7\b\2\2\u00df"+
		"\u00e0\79\2\2\u00e0\u00e1\7$\2\2\u00e1\u00e6\5D#\2\u00e2\u00e6\5\62\32"+
		"\2\u00e3\u00e6\5\60\31\2\u00e4\u00e6\5\64\33\2\u00e5\u00d9\3\2\2\2\u00e5"+
		"\u00dd\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2"+
		"\2\2\u00e6/\3\2\2\2\u00e7\u00e8\7\t\2\2\u00e8\u00ed\79\2\2\u00e9\u00ea"+
		"\7\7\2\2\u00ea\u00ec\5D#\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\61\3\2\2\2\u00ef\u00ed\3\2\2"+
		"\2\u00f0\u00f1\7\n\2\2\u00f1\u00f2\79\2\2\u00f2\u00f3\7\f\2\2\u00f3\u00f4"+
		"\5<\37\2\u00f4\63\3\2\2\2\u00f5\u00f6\7\13\2\2\u00f6\u00f7\79\2\2\u00f7"+
		"\u00f8\7\r\2\2\u00f8\u00f9\5<\37\2\u00f9\65\3\2\2\2\u00fa\u00fb\79\2\2"+
		"\u00fb\u00fc\7$\2\2\u00fc\u0104\5D#\2\u00fd\u00fe\79\2\2\u00fe\u00ff\7"+
		"!\2\2\u00ff\u0100\58\35\2\u0100\u0101\7$\2\2\u0101\u0102\5D#\2\u0102\u0104"+
		"\3\2\2\2\u0103\u00fa\3\2\2\2\u0103\u00fd\3\2\2\2\u0104\67\3\2\2\2\u0105"+
		"\u0106\7\7\2\2\u01069\3\2\2\2\u0107\u0108\79\2\2\u0108\u0109\7!\2\2\u0109"+
		"\u010a\58\35\2\u010a;\3\2\2\2\u010b\u010d\7\37\2\2\u010c\u010e\5> \2\u010d"+
		"\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7 "+
		"\2\2\u0110=\3\2\2\2\u0111\u0116\5@!\2\u0112\u0113\7\"\2\2\u0113\u0115"+
		"\5@!\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117?\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\5D#\2\u011a"+
		"A\3\2\2\2\u011b\u011c\79\2\2\u011c\u011d\7\37\2\2\u011d\u011e\5D#\2\u011e"+
		"\u011f\7 \2\2\u011fC\3\2\2\2\u0120\u0125\b#\1\2\u0121\u0126\5,\27\2\u0122"+
		"\u0126\5:\36\2\u0123\u0126\5\b\5\2\u0124\u0126\5B\"\2\u0125\u0121\3\2"+
		"\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0133\3\2\2\2\u0127\u0128\7\32\2\2\u0128\u0133\5D#\r\u0129\u012a\7\35"+
		"\2\2\u012a\u012b\5D#\2\u012b\u012c\7\36\2\2\u012c\u0133\3\2\2\2\u012d"+
		"\u0131\5<\37\2\u012e\u0131\5H%\2\u012f\u0131\79\2\2\u0130\u012d\3\2\2"+
		"\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0120"+
		"\3\2\2\2\u0132\u0127\3\2\2\2\u0132\u0129\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u014e\3\2\2\2\u0134\u0135\f\f\2\2\u0135\u0136\t\3\2\2\u0136\u014d\5D"+
		"#\r\u0137\u0138\f\13\2\2\u0138\u0139\t\4\2\2\u0139\u014d\5D#\f\u013a\u013b"+
		"\f\n\2\2\u013b\u013c\t\5\2\2\u013c\u014d\5D#\13\u013d\u013e\f\t\2\2\u013e"+
		"\u013f\t\6\2\2\u013f\u014d\5D#\n\u0140\u0141\f\b\2\2\u0141\u0142\7\30"+
		"\2\2\u0142\u014d\5D#\t\u0143\u0144\f\7\2\2\u0144\u0145\7\31\2\2\u0145"+
		"\u014d\5D#\b\u0146\u0147\f\6\2\2\u0147\u0148\7\34\2\2\u0148\u014d\5D#"+
		"\7\u0149\u014a\f\5\2\2\u014a\u014b\7\33\2\2\u014b\u014d\5D#\6\u014c\u0134"+
		"\3\2\2\2\u014c\u0137\3\2\2\2\u014c\u013a\3\2\2\2\u014c\u013d\3\2\2\2\u014c"+
		"\u0140\3\2\2\2\u014c\u0143\3\2\2\2\u014c\u0146\3\2\2\2\u014c\u0149\3\2"+
		"\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"E\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\t\7\2\2\u0152G\3\2\2\2\u0153"+
		"\u0154\t\b\2\2\u0154I\3\2\2\2\u0155\u0156\t\t\2\2\u0156K\3\2\2\2\35MS"+
		"XZck|\u0083\u0087\u008f\u0094\u00a1\u00a5\u00bb\u00c5\u00ce\u00d4\u00e5"+
		"\u00ed\u0103\u010d\u0116\u0125\u0130\u0132\u014c\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}