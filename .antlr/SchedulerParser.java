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
		T__0=1, T__1=2, T__2=3, T__3=4, CLASS_ATTRIBUTE=5, TYPENAME=6, CLASSNAME=7, 
		DAYNAME=8, WEEKNAME=9, CLASSESTOKEN=10, DAYSTOKEN=11, MULTIPLY=12, DIVIDE=13, 
		ADD=14, SUBTRACT=15, EQUAL=16, NOT_EQUAL=17, LESS_THAN=18, GREATER_THAN=19, 
		LESS_THAN_OR_EQUAL=20, GREATER_THAN_OR_EQUAL=21, AND=22, OR=23, NOT=24, 
		IN=25, OVERLAP=26, OPEN_PAREN=27, CLOSE_PAREN=28, OPEN_BRACKET=29, CLOSE_BRACKET=30, 
		DOT=31, COMMA=32, COLON=33, SINGLEEQUAL=34, COLLECTION_OF=35, ADD_CANVA=36, 
		UPDATE_CANVA=37, DELETE_CANVA=38, GET_CANVA=39, WHERE=40, SATISFYING=41, 
		AT=42, DEF=43, IF=44, ELIF=45, ELSE=46, FOR=47, WHILE=48, RETURN=49, BREAK=50, 
		OPEN_CURLY=51, CLOSE_CURLY=52, INT=53, BOOL=54, STRING=55, DATE=56, TIME=57, 
		WS=58, VARNAME=59, COMMENT_LINE=60, COMMENT=61;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_instruction = 2, RULE_instruction_without_semicolon = 3, 
		RULE_canvas_instruction = 4, RULE_block = 5, RULE_add = 6, RULE_update = 7, 
		RULE_delete = 8, RULE_get = 9, RULE_start_date = 10, RULE_end_date = 11, 
		RULE_transfer_statement = 12, RULE_loop = 13, RULE_for_loop = 14, RULE_while_loop = 15, 
		RULE_if_statement = 16, RULE_condition = 17, RULE_function = 18, RULE_args = 19, 
		RULE_arg = 20, RULE_func_call = 21, RULE_def = 22, RULE_classDef = 23, 
		RULE_dayDef = 24, RULE_weekDef = 25, RULE_assign = 26, RULE_attribute = 27, 
		RULE_attribute_call = 28, RULE_collection = 29, RULE_collection_elements = 30, 
		RULE_collection_element = 31, RULE_collection_subscription = 32, RULE_expr = 33, 
		RULE_type = 34, RULE_structure = 35, RULE_value = 36, RULE_comments = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "code", "instruction", "instruction_without_semicolon", "canvas_instruction", 
			"block", "add", "update", "delete", "get", "start_date", "end_date", 
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
			null, "';'", "'DATES'", "'START DATE'", "'END DATE'", null, null, "'CLASS'", 
			"'DAY'", "'WEEK'", "'CLASSES'", "'DAYS'", "'*'", "'/'", "'+'", "'-'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'AND'", "'OR'", "'NOT'", 
			"'IN'", "'#'", "'('", "')'", "'['", "']'", "'.'", "','", "':'", "'='", 
			"'COLLECTION OF'", "'ADD'", "'UPDATE'", "'DELETE'", "'GET'", "'WHERE'", 
			"'SATISFYING'", "'AT'", "'DEF'", "'IF'", "'ELIF'", "'ELSE'", "'FOR'", 
			"'WHILE'", "'RETURN'", "'BREAK'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "CLASS_ATTRIBUTE", "TYPENAME", "CLASSNAME", 
			"DAYNAME", "WEEKNAME", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", 
			"ADD", "SUBTRACT", "EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", 
			"LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", "AND", "OR", "NOT", "IN", 
			"OVERLAP", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"DOT", "COMMA", "COLON", "SINGLEEQUAL", "COLLECTION_OF", "ADD_CANVA", 
			"UPDATE_CANVA", "DELETE_CANVA", "GET_CANVA", "WHERE", "SATISFYING", "AT", 
			"DEF", "IF", "ELIF", "ELSE", "FOR", "WHILE", "RETURN", "BREAK", "OPEN_CURLY", 
			"CLOSE_CURLY", "INT", "BOOL", "STRING", "DATE", "TIME", "WS", "VARNAME", 
			"COMMENT_LINE", "COMMENT"
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << TYPENAME) | (1L << CLASSNAME) | (1L << DAYNAME) | (1L << WEEKNAME) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << COLLECTION_OF) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME) | (1L << COMMENT_LINE) | (1L << COMMENT))) != 0)) {
				{
				setState(76);
				code();
				}
			}

			setState(79);
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
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(81);
						instruction();
						}
						break;
					case 2:
						{
						setState(82);
						canvas_instruction();
						}
						break;
					}
					setState(85);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(87);
					instruction_without_semicolon();
					}
					break;
				case 3:
					{
					setState(88);
					comments();
					}
					break;
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << TYPENAME) | (1L << CLASSNAME) | (1L << DAYNAME) | (1L << WEEKNAME) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << COLLECTION_OF) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << BREAK) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME) | (1L << COMMENT_LINE) | (1L << COMMENT))) != 0) );
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
				setState(93);
				def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				transfer_statement();
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				if_statement();
				}
				break;
			case TYPENAME:
			case CLASSNAME:
			case DAYNAME:
			case WEEKNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				function();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_CANVA:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				add();
				}
				break;
			case UPDATE_CANVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				update();
				}
				break;
			case DELETE_CANVA:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				delete();
				}
				break;
			case GET_CANVA:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				get();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				start_date();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
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
			setState(112);
			match(OPEN_CURLY);
			setState(113);
			code();
			setState(114);
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
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AT() { return getToken(SchedulerParser.AT, 0); }
		public TerminalNode TYPENAME() { return getToken(SchedulerParser.TYPENAME, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ADD_CANVA);
			setState(117);
			structure();
			setState(118);
			expr(0);
			setState(119);
			match(AT);
			setState(120);
			match(TYPENAME);
			setState(121);
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
		enterRule(_localctx, 14, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(UPDATE_CANVA);
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
				{
				setState(124);
				match(DATE);
				setState(125);
				expr(0);
				}
				break;
			case T__1:
				{
				setState(126);
				match(T__1);
				setState(127);
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
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_delete);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(DELETE_CANVA);
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==CLASSESTOKEN || _la==DAYSTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(132);
				match(VARNAME);
				setState(133);
				match(SATISFYING);
				setState(134);
				condition();
				}
				break;
			}
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					condition();
					}
					} 
				}
				setState(142);
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

	public static class GetContext extends ParserRuleContext {
		public TerminalNode GET_CANVA() { return getToken(SchedulerParser.GET_CANVA, 0); }
		public TerminalNode CLASSESTOKEN() { return getToken(SchedulerParser.CLASSESTOKEN, 0); }
		public TerminalNode DAYSTOKEN() { return getToken(SchedulerParser.DAYSTOKEN, 0); }
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode SATISFYING() { return getToken(SchedulerParser.SATISFYING, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_get);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(GET_CANVA);
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==CLASSESTOKEN || _la==DAYSTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(145);
				match(VARNAME);
				setState(146);
				match(SATISFYING);
				setState(147);
				condition();
				}
				break;
			}
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					condition();
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 20, RULE_start_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__2);
			setState(157);
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
			setState(159);
			match(T__3);
			setState(160);
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
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(RETURN);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
					{
					setState(163);
					expr(0);
					}
				}

				}
				break;
			case BREAK:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
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
		enterRule(_localctx, 26, RULE_loop);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
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
		enterRule(_localctx, 28, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(FOR);
			setState(174);
			type();
			setState(175);
			match(VARNAME);
			setState(176);
			match(IN);
			setState(177);
			expr(0);
			setState(178);
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
			setState(180);
			match(WHILE);
			setState(181);
			condition();
			setState(182);
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
		enterRule(_localctx, 32, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(IF);
			setState(185);
			condition();
			setState(186);
			block();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(187);
				match(ELIF);
				setState(188);
				condition();
				setState(189);
				block();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(196);
				match(ELSE);
				setState(197);
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
		enterRule(_localctx, 34, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 36, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			type();
			setState(203);
			match(VARNAME);
			setState(204);
			match(OPEN_PAREN);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPENAME) | (1L << CLASSNAME) | (1L << DAYNAME) | (1L << WEEKNAME))) != 0)) {
				{
				setState(205);
				args();
				}
			}

			setState(208);
			match(CLOSE_PAREN);
			setState(209);
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
			setState(211);
			arg();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(212);
				match(COMMA);
				setState(213);
				arg();
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
		enterRule(_localctx, 40, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			type();
			setState(220);
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
			setState(222);
			match(VARNAME);
			setState(223);
			match(OPEN_PAREN);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
				{
				setState(224);
				expr(0);
				}
			}

			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(227);
				match(COMMA);
				setState(228);
				expr(0);
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
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
		enterRule(_localctx, 44, RULE_def);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(TYPENAME);
				setState(237);
				match(VARNAME);
				setState(238);
				match(SINGLEEQUAL);
				setState(239);
				expr(0);
				}
				break;
			case COLLECTION_OF:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(COLLECTION_OF);
				setState(241);
				type();
				setState(242);
				match(VARNAME);
				setState(243);
				match(SINGLEEQUAL);
				setState(244);
				expr(0);
				}
				break;
			case DAYNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				dayDef();
				}
				break;
			case CLASSNAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				classDef();
				}
				break;
			case WEEKNAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
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
		enterRule(_localctx, 46, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(CLASSNAME);
			setState(252);
			match(VARNAME);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS_ATTRIBUTE) {
				{
				{
				setState(253);
				match(CLASS_ATTRIBUTE);
				setState(254);
				expr(0);
				}
				}
				setState(259);
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
		enterRule(_localctx, 48, RULE_dayDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(DAYNAME);
			setState(261);
			match(VARNAME);
			setState(262);
			match(CLASSESTOKEN);
			setState(263);
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
		enterRule(_localctx, 50, RULE_weekDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(WEEKNAME);
			setState(266);
			match(VARNAME);
			setState(267);
			match(DAYSTOKEN);
			setState(268);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(VARNAME);
				setState(271);
				match(SINGLEEQUAL);
				setState(272);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(VARNAME);
				setState(274);
				match(DOT);
				setState(275);
				attribute();
				setState(276);
				match(SINGLEEQUAL);
				setState(277);
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
			setState(281);
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
			setState(283);
			match(VARNAME);
			setState(284);
			match(DOT);
			setState(285);
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
			setState(287);
			match(OPEN_BRACKET);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << ADD_CANVA) | (1L << UPDATE_CANVA) | (1L << DELETE_CANVA) | (1L << GET_CANVA) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << DATE) | (1L << TIME) | (1L << VARNAME))) != 0)) {
				{
				setState(288);
				collection_elements();
				}
			}

			setState(291);
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
			setState(293);
			collection_element();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				collection_element();
				}
				}
				setState(300);
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
			setState(301);
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
			setState(303);
			match(VARNAME);
			setState(304);
			match(OPEN_BRACKET);
			setState(305);
			expr(0);
			setState(306);
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
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new CallsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(309);
					func_call();
					}
					break;
				case 2:
					{
					setState(310);
					attribute_call();
					}
					break;
				case 3:
					{
					setState(311);
					canvas_instruction();
					}
					break;
				case 4:
					{
					setState(312);
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
				setState(315);
				match(NOT);
				setState(316);
				expr(11);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(OPEN_PAREN);
				setState(318);
				expr(0);
				setState(319);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACKET:
					{
					setState(321);
					collection();
					}
					break;
				case INT:
				case BOOL:
				case STRING:
				case DATE:
				case TIME:
					{
					setState(322);
					value();
					}
					break;
				case VARNAME:
					{
					setState(323);
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
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(352);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(328);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(329);
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
						setState(330);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(331);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(332);
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
						setState(333);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(334);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(335);
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
						setState(336);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(337);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(338);
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
						setState(339);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(340);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(341);
						match(AND);
						setState(342);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(343);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(344);
						match(OR);
						setState(345);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new OverlapExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(346);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(347);
						match(OVERLAP);
						setState(348);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new InExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(349);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(350);
						match(IN);
						setState(351);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(TYPENAME);
				}
				break;
			case CLASSNAME:
			case DAYNAME:
			case WEEKNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				structure();
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
		enterRule(_localctx, 70, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 72, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
		enterRule(_localctx, 74, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0172\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\5\2P\n\2\3\2\3\2\3\3\3"+
		"\3\5\3V\n\3\3\3\3\3\3\3\3\3\6\3\\\n\3\r\3\16\3]\3\4\3\4\3\4\3\4\5\4d\n"+
		"\4\3\5\3\5\3\5\5\5i\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u008a\n\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\13\7\13\u009a\n\13\f\13\16\13\u009d"+
		"\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\5\16\u00a7\n\16\3\16\5\16\u00aa"+
		"\n\16\3\17\3\17\5\17\u00ae\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00c2\n\22\f\22"+
		"\16\22\u00c5\13\22\3\22\3\22\5\22\u00c9\n\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\5\24\u00d1\n\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00d9\n\25\f"+
		"\25\16\25\u00dc\13\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00e4\n\27\3"+
		"\27\3\27\7\27\u00e8\n\27\f\27\16\27\u00eb\13\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fc\n\30"+
		"\3\31\3\31\3\31\3\31\7\31\u0102\n\31\f\31\16\31\u0105\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u011a\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\5\37\u0124\n\37\3\37\3\37\3 \3 \3 \7 \u012b\n \f \16 \u012e\13 \3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u013c\n#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u0147\n#\5#\u0149\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0163\n#\f#\16#\u0166\13#\3$\3$\5"+
		"$\u016a\n$\3%\3%\3&\3&\3\'\3\'\3\'\2\3D(\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\n\3\2\f\r\3\2\16\17\3\2\20"+
		"\21\3\2\24\27\3\2\22\23\3\2\t\13\3\2\67;\3\2>?\2\u0181\2O\3\2\2\2\4[\3"+
		"\2\2\2\6c\3\2\2\2\bh\3\2\2\2\np\3\2\2\2\fr\3\2\2\2\16v\3\2\2\2\20}\3\2"+
		"\2\2\22\u0084\3\2\2\2\24\u0091\3\2\2\2\26\u009e\3\2\2\2\30\u00a1\3\2\2"+
		"\2\32\u00a9\3\2\2\2\34\u00ad\3\2\2\2\36\u00af\3\2\2\2 \u00b6\3\2\2\2\""+
		"\u00ba\3\2\2\2$\u00ca\3\2\2\2&\u00cc\3\2\2\2(\u00d5\3\2\2\2*\u00dd\3\2"+
		"\2\2,\u00e0\3\2\2\2.\u00fb\3\2\2\2\60\u00fd\3\2\2\2\62\u0106\3\2\2\2\64"+
		"\u010b\3\2\2\2\66\u0119\3\2\2\28\u011b\3\2\2\2:\u011d\3\2\2\2<\u0121\3"+
		"\2\2\2>\u0127\3\2\2\2@\u012f\3\2\2\2B\u0131\3\2\2\2D\u0148\3\2\2\2F\u0169"+
		"\3\2\2\2H\u016b\3\2\2\2J\u016d\3\2\2\2L\u016f\3\2\2\2NP\5\4\3\2ON\3\2"+
		"\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\2\2\3R\3\3\2\2\2SV\5\6\4\2TV\5\n\6\2US\3"+
		"\2\2\2UT\3\2\2\2VW\3\2\2\2WX\7\3\2\2X\\\3\2\2\2Y\\\5\b\5\2Z\\\5L\'\2["+
		"U\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\5\3\2\2"+
		"\2_d\5.\30\2`d\5\66\34\2ad\5D#\2bd\5\32\16\2c_\3\2\2\2c`\3\2\2\2ca\3\2"+
		"\2\2cb\3\2\2\2d\7\3\2\2\2ei\5\"\22\2fi\5&\24\2gi\5\34\17\2he\3\2\2\2h"+
		"f\3\2\2\2hg\3\2\2\2i\t\3\2\2\2jq\5\16\b\2kq\5\20\t\2lq\5\22\n\2mq\5\24"+
		"\13\2nq\5\26\f\2oq\5\30\r\2pj\3\2\2\2pk\3\2\2\2pl\3\2\2\2pm\3\2\2\2pn"+
		"\3\2\2\2po\3\2\2\2q\13\3\2\2\2rs\7\65\2\2st\5\4\3\2tu\7\66\2\2u\r\3\2"+
		"\2\2vw\7&\2\2wx\5H%\2xy\5D#\2yz\7,\2\2z{\7\b\2\2{|\5D#\2|\17\3\2\2\2}"+
		"\u0082\7\'\2\2~\177\7:\2\2\177\u0083\5D#\2\u0080\u0081\7\4\2\2\u0081\u0083"+
		"\5<\37\2\u0082~\3\2\2\2\u0082\u0080\3\2\2\2\u0083\21\3\2\2\2\u0084\u0085"+
		"\7(\2\2\u0085\u0089\t\2\2\2\u0086\u0087\7=\2\2\u0087\u0088\7+\2\2\u0088"+
		"\u008a\5$\23\2\u0089\u0086\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\3\2"+
		"\2\2\u008b\u008d\5$\23\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\23\3\2\2\2\u0090\u008e\3\2\2"+
		"\2\u0091\u0092\7)\2\2\u0092\u0096\t\2\2\2\u0093\u0094\7=\2\2\u0094\u0095"+
		"\7+\2\2\u0095\u0097\5$\23\2\u0096\u0093\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u009b\3\2\2\2\u0098\u009a\5$\23\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\25\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u009f\7\5\2\2\u009f\u00a0\7:\2\2\u00a0\27\3\2\2\2\u00a1"+
		"\u00a2\7\6\2\2\u00a2\u00a3\7:\2\2\u00a3\31\3\2\2\2\u00a4\u00a6\7\63\2"+
		"\2\u00a5\u00a7\5D#\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00aa\7\64\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a8\3\2\2\2"+
		"\u00aa\33\3\2\2\2\u00ab\u00ae\5\36\20\2\u00ac\u00ae\5 \21\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\35\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0"+
		"\u00b1\5F$\2\u00b1\u00b2\7=\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\5D#\2"+
		"\u00b4\u00b5\5\f\7\2\u00b5\37\3\2\2\2\u00b6\u00b7\7\62\2\2\u00b7\u00b8"+
		"\5$\23\2\u00b8\u00b9\5\f\7\2\u00b9!\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb\u00bc"+
		"\5$\23\2\u00bc\u00c3\5\f\7\2\u00bd\u00be\7/\2\2\u00be\u00bf\5$\23\2\u00bf"+
		"\u00c0\5\f\7\2\u00c0\u00c2\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\7\60\2\2\u00c7\u00c9\5\f\7\2\u00c8\u00c6\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9#\3\2\2\2\u00ca\u00cb\5D#\2\u00cb%\3\2"+
		"\2\2\u00cc\u00cd\5F$\2\u00cd\u00ce\7=\2\2\u00ce\u00d0\7\35\2\2\u00cf\u00d1"+
		"\5(\25\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\7\36\2\2\u00d3\u00d4\5\f\7\2\u00d4\'\3\2\2\2\u00d5\u00da\5*\26"+
		"\2\u00d6\u00d7\7\"\2\2\u00d7\u00d9\5*\26\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db)\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\5F$\2\u00de\u00df\7=\2\2\u00df+\3\2\2\2\u00e0"+
		"\u00e1\7=\2\2\u00e1\u00e3\7\35\2\2\u00e2\u00e4\5D#\2\u00e3\u00e2\3\2\2"+
		"\2\u00e3\u00e4\3\2\2\2\u00e4\u00e9\3\2\2\2\u00e5\u00e6\7\"\2\2\u00e6\u00e8"+
		"\5D#\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7\36"+
		"\2\2\u00ed-\3\2\2\2\u00ee\u00ef\7\b\2\2\u00ef\u00f0\7=\2\2\u00f0\u00f1"+
		"\7$\2\2\u00f1\u00fc\5D#\2\u00f2\u00f3\7%\2\2\u00f3\u00f4\5F$\2\u00f4\u00f5"+
		"\7=\2\2\u00f5\u00f6\7$\2\2\u00f6\u00f7\5D#\2\u00f7\u00fc\3\2\2\2\u00f8"+
		"\u00fc\5\62\32\2\u00f9\u00fc\5\60\31\2\u00fa\u00fc\5\64\33\2\u00fb\u00ee"+
		"\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc/\3\2\2\2\u00fd\u00fe\7\t\2\2\u00fe\u0103\7=\2\2\u00ff"+
		"\u0100\7\7\2\2\u0100\u0102\5D#\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2"+
		"\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\61\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0107\7\n\2\2\u0107\u0108\7=\2\2\u0108\u0109\7\f\2\2\u0109"+
		"\u010a\5<\37\2\u010a\63\3\2\2\2\u010b\u010c\7\13\2\2\u010c\u010d\7=\2"+
		"\2\u010d\u010e\7\r\2\2\u010e\u010f\5<\37\2\u010f\65\3\2\2\2\u0110\u0111"+
		"\7=\2\2\u0111\u0112\7$\2\2\u0112\u011a\5D#\2\u0113\u0114\7=\2\2\u0114"+
		"\u0115\7!\2\2\u0115\u0116\58\35\2\u0116\u0117\7$\2\2\u0117\u0118\5D#\2"+
		"\u0118\u011a\3\2\2\2\u0119\u0110\3\2\2\2\u0119\u0113\3\2\2\2\u011a\67"+
		"\3\2\2\2\u011b\u011c\7\7\2\2\u011c9\3\2\2\2\u011d\u011e\7=\2\2\u011e\u011f"+
		"\7!\2\2\u011f\u0120\58\35\2\u0120;\3\2\2\2\u0121\u0123\7\37\2\2\u0122"+
		"\u0124\5> \2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2"+
		"\2\u0125\u0126\7 \2\2\u0126=\3\2\2\2\u0127\u012c\5@!\2\u0128\u0129\7\""+
		"\2\2\u0129\u012b\5@!\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d?\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0130\5D#\2\u0130A\3\2\2\2\u0131\u0132\7=\2\2\u0132\u0133\7\37\2\2\u0133"+
		"\u0134\5D#\2\u0134\u0135\7 \2\2\u0135C\3\2\2\2\u0136\u013b\b#\1\2\u0137"+
		"\u013c\5,\27\2\u0138\u013c\5:\36\2\u0139\u013c\5\n\6\2\u013a\u013c\5B"+
		"\"\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013c\u0149\3\2\2\2\u013d\u013e\7\32\2\2\u013e\u0149\5"+
		"D#\r\u013f\u0140\7\35\2\2\u0140\u0141\5D#\2\u0141\u0142\7\36\2\2\u0142"+
		"\u0149\3\2\2\2\u0143\u0147\5<\37\2\u0144\u0147\5J&\2\u0145\u0147\7=\2"+
		"\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0149"+
		"\3\2\2\2\u0148\u0136\3\2\2\2\u0148\u013d\3\2\2\2\u0148\u013f\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u0164\3\2\2\2\u014a\u014b\f\f\2\2\u014b\u014c\t\3"+
		"\2\2\u014c\u0163\5D#\r\u014d\u014e\f\13\2\2\u014e\u014f\t\4\2\2\u014f"+
		"\u0163\5D#\f\u0150\u0151\f\n\2\2\u0151\u0152\t\5\2\2\u0152\u0163\5D#\13"+
		"\u0153\u0154\f\t\2\2\u0154\u0155\t\6\2\2\u0155\u0163\5D#\n\u0156\u0157"+
		"\f\b\2\2\u0157\u0158\7\30\2\2\u0158\u0163\5D#\t\u0159\u015a\f\7\2\2\u015a"+
		"\u015b\7\31\2\2\u015b\u0163\5D#\b\u015c\u015d\f\6\2\2\u015d\u015e\7\34"+
		"\2\2\u015e\u0163\5D#\7\u015f\u0160\f\5\2\2\u0160\u0161\7\33\2\2\u0161"+
		"\u0163\5D#\6\u0162\u014a\3\2\2\2\u0162\u014d\3\2\2\2\u0162\u0150\3\2\2"+
		"\2\u0162\u0153\3\2\2\2\u0162\u0156\3\2\2\2\u0162\u0159\3\2\2\2\u0162\u015c"+
		"\3\2\2\2\u0162\u015f\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165E\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u016a\7\b\2\2"+
		"\u0168\u016a\5H%\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016aG\3\2"+
		"\2\2\u016b\u016c\t\7\2\2\u016cI\3\2\2\2\u016d\u016e\t\b\2\2\u016eK\3\2"+
		"\2\2\u016f\u0170\t\t\2\2\u0170M\3\2\2\2\"OU[]chp\u0082\u0089\u008e\u0096"+
		"\u009b\u00a6\u00a9\u00ad\u00c3\u00c8\u00d0\u00da\u00e3\u00e9\u00fb\u0103"+
		"\u0119\u0123\u012c\u013b\u0146\u0148\u0162\u0164\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}