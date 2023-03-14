// Generated from c:\Users\AndRYou\Desktop\Studia\Język\scheduler-language\Scheduler.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, TYPENAME=43, VARNAME=44, SPACE=45, 
		FORCESPACE=46, NEWLINE=47, TAB=48, INT=49, BOOL=50, STRING=51, DATE=52, 
		TIME=53, SUBJECT=54, TEACHER=55;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_instruction = 2, RULE_canvas_instruction = 3, 
		RULE_block = 4, RULE_transfer_statement = 5, RULE_loop = 6, RULE_for_loop = 7, 
		RULE_while_loop = 8, RULE_if_statement = 9, RULE_condition = 10, RULE_funcion = 11, 
		RULE_args = 12, RULE_arg = 13, RULE_func_call = 14, RULE_def = 15, RULE_assign = 16, 
		RULE_expr = 17, RULE_collection = 18, RULE_elements = 19, RULE_element = 20, 
		RULE_classDef = 21, RULE_dayDef = 22, RULE_weekDef = 23, RULE_value = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "code", "instruction", "canvas_instruction", "block", "transfer_statement", 
			"loop", "for_loop", "while_loop", "if_statement", "condition", "funcion", 
			"args", "arg", "func_call", "def", "assign", "expr", "collection", "elements", 
			"element", "classDef", "dayDef", "weekDef", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'not_implemented'", "'{'", "'}'", "'RETURN'", "'BREAK'", 
			"'FOR'", "'IN'", "'WHILE'", "'IF'", "'DEF'", "'('", "')'", "','", "'='", 
			"'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"'AND'", "'OR'", "'NOT'", "'#'", "'['", "']'", "'CLASS'", "'SUBJECT'", 
			"'TEACHER'", "'START'", "'END'", "'DAY'", "'DATE'", "'CLASSES'", "'WEEK'", 
			"'STARTDATE'", "'DAYS'", null, null, null, null, null, "'\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TYPENAME", "VARNAME", "SPACE", 
			"FORCESPACE", "NEWLINE", "TAB", "INT", "BOOL", "STRING", "DATE", "TIME", 
			"SUBJECT", "TEACHER"
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
			setState(50);
			code(0);
			setState(51);
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
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Canvas_instructionContext canvas_instruction() {
			return getRuleContext(Canvas_instructionContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		return code(0);
	}

	private CodeContext code(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CodeContext _localctx = new CodeContext(_ctx, _parentState);
		CodeContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_code, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__8:
			case T__9:
			case T__10:
			case T__31:
			case T__36:
			case T__39:
			case TYPENAME:
			case VARNAME:
				{
				setState(54);
				instruction();
				}
				break;
			case T__1:
				{
				setState(55);
				canvas_instruction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(58);
			match(T__0);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CodeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_code);
					setState(60);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(61);
					code(2);
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				funcion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				func_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				transfer_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
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
		public Canvas_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas_instruction; }
	}

	public final Canvas_instructionContext canvas_instruction() throws RecognitionException {
		Canvas_instructionContext _localctx = new Canvas_instructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_canvas_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__1);
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
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SchedulerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SchedulerParser.NEWLINE, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__2);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(79);
				match(NEWLINE);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			code(0);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(86);
				match(NEWLINE);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(T__3);
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
		public TerminalNode SPACE() { return getToken(SchedulerParser.SPACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(Transfer_statementContext ctx) { copyFrom(ctx); }
	}
	public static class BreakContext extends Transfer_statementContext {
		public BreakContext(Transfer_statementContext ctx) { copyFrom(ctx); }
	}

	public final Transfer_statementContext transfer_statement() throws RecognitionException {
		Transfer_statementContext _localctx = new Transfer_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_transfer_statement);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__4);
				setState(95);
				match(SPACE);
				setState(96);
				expr(0);
				}
				break;
			case T__5:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__5);
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
		enterRule(_localctx, 12, RULE_loop);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				for_loop();
				}
				break;
			case T__8:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
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
		public List<TerminalNode> SPACE() { return getTokens(SchedulerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SchedulerParser.SPACE, i);
		}
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SchedulerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SchedulerParser.NEWLINE, i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__6);
			setState(105);
			match(SPACE);
			setState(106);
			match(VARNAME);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(107);
				match(SPACE);
				}
			}

			setState(110);
			match(T__7);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(111);
				match(SPACE);
				}
			}

			setState(114);
			expr(0);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(115);
				match(SPACE);
				}
			}

			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(118);
				match(NEWLINE);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
		public List<TerminalNode> SPACE() { return getTokens(SchedulerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SchedulerParser.SPACE, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SchedulerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SchedulerParser.NEWLINE, i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__8);
			setState(127);
			match(SPACE);
			setState(128);
			condition();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(129);
				match(SPACE);
				}
			}

			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(132);
				match(NEWLINE);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
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
		public List<TerminalNode> SPACE() { return getTokens(SchedulerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SchedulerParser.SPACE, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SchedulerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SchedulerParser.NEWLINE, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__9);
			setState(141);
			match(SPACE);
			setState(142);
			condition();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(143);
				match(SPACE);
				}
			}

			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(146);
				match(NEWLINE);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
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
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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

	public static class FuncionContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(SchedulerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SchedulerParser.SPACE, i);
		}
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SchedulerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SchedulerParser.NEWLINE, i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__10);
			setState(157);
			match(SPACE);
			setState(158);
			match(VARNAME);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(159);
				match(SPACE);
				}
			}

			setState(162);
			match(T__11);
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(163);
				match(SPACE);
				}
				break;
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPENAME) {
				{
				setState(166);
				args();
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(169);
				match(SPACE);
				}
			}

			setState(172);
			match(T__12);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(173);
				match(NEWLINE);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(SchedulerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SchedulerParser.SPACE, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_args);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			arg();
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(182);
						match(SPACE);
						}
					}

					setState(185);
					match(T__13);
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(186);
						match(SPACE);
						}
					}

					setState(189);
					arg();
					}
					} 
				}
				setState(194);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode TYPENAME() { return getToken(SchedulerParser.TYPENAME, 0); }
		public TerminalNode SPACE() { return getToken(SchedulerParser.SPACE, 0); }
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(TYPENAME);
			setState(196);
			match(SPACE);
			setState(197);
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
		public List<TerminalNode> SPACE() { return getTokens(SchedulerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SchedulerParser.SPACE, i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(VARNAME);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(200);
				match(SPACE);
				}
			}

			setState(203);
			match(T__11);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(204);
				match(SPACE);
				}
				break;
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPENAME) {
				{
				setState(207);
				args();
				}
			}

			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(210);
				match(SPACE);
				}
			}

			setState(213);
			match(T__12);
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
		public List<TerminalNode> SPACE() { return getTokens(SchedulerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SchedulerParser.SPACE, i);
		}
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 30, RULE_def);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(TYPENAME);
				setState(216);
				match(SPACE);
				setState(217);
				match(VARNAME);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(218);
					match(SPACE);
					}
				}

				setState(221);
				match(T__14);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(222);
					match(SPACE);
					}
				}

				setState(225);
				expr(0);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				dayDef();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				classDef();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(SchedulerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SchedulerParser.SPACE, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(VARNAME);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(232);
				match(SPACE);
				}
			}

			setState(235);
			match(T__14);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(236);
				match(SPACE);
				}
			}

			setState(239);
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
	public static class MultiplicationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AdditionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NotEqualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessThanOrEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanOrEqualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VariableNameContext extends ExprContext {
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public VariableNameContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OverlapContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OverlapContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterThanOrEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanOrEqualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SubtractionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubtractionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionValueContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionValueContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivisionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallContext extends ExprContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(242);
				match(T__27);
				setState(243);
				expr(6);
				}
				break;
			case 2:
				{
				_localctx = new OverlapContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(T__28);
				setState(245);
				expr(5);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				match(T__11);
				setState(247);
				expr(0);
				setState(248);
				match(T__12);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				func_call();
				}
				break;
			case 5:
				{
				_localctx = new ExpressionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				value();
				}
				break;
			case 6:
				{
				_localctx = new VariableNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(VARNAME);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(256);
						match(T__15);
						setState(257);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(258);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(259);
						match(T__16);
						setState(260);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(262);
						match(T__17);
						setState(263);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(265);
						match(T__18);
						setState(266);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(268);
						match(T__19);
						setState(269);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new NotEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(271);
						match(T__20);
						setState(272);
						expr(14);
						}
						break;
					case 7:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(274);
						match(T__21);
						setState(275);
						expr(13);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(277);
						match(T__22);
						setState(278);
						expr(12);
						}
						break;
					case 9:
						{
						_localctx = new LessThanOrEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(280);
						match(T__23);
						setState(281);
						expr(11);
						}
						break;
					case 10:
						{
						_localctx = new GreaterThanOrEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(283);
						match(T__24);
						setState(284);
						expr(10);
						}
						break;
					case 11:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(286);
						match(T__25);
						setState(287);
						expr(9);
						}
						break;
					case 12:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(289);
						match(T__26);
						setState(290);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public List<TerminalNode> SPACE() { return getTokens(SchedulerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SchedulerParser.SPACE, i);
		}
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
		enterRule(_localctx, 36, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__29);
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(297);
				match(SPACE);
				}
				break;
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARNAME) {
				{
				setState(300);
				elements();
				}
			}

			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(303);
				match(SPACE);
				}
			}

			setState(306);
			match(T__30);
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
		public List<TerminalNode> SPACE() { return getTokens(SchedulerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(SchedulerParser.SPACE, i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			element();
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(309);
						match(SPACE);
						}
					}

					setState(312);
					match(T__13);
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(313);
						match(SPACE);
						}
					}

					setState(316);
					element();
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
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

	public static class ClassDefContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(SchedulerParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(SchedulerParser.VARNAME, i);
		}
		public List<TerminalNode> TIME() { return getTokens(SchedulerParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(SchedulerParser.TIME, i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__31);
			setState(325);
			match(VARNAME);
			setState(326);
			match(T__32);
			setState(327);
			match(VARNAME);
			setState(328);
			match(T__33);
			setState(329);
			match(VARNAME);
			setState(330);
			match(T__34);
			setState(331);
			match(TIME);
			setState(332);
			match(T__35);
			setState(333);
			match(TIME);
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
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode DATE() { return getToken(SchedulerParser.DATE, 0); }
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
			setState(335);
			match(T__36);
			setState(336);
			match(VARNAME);
			setState(337);
			match(T__37);
			setState(338);
			match(DATE);
			setState(339);
			match(T__38);
			setState(340);
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
		public TerminalNode VARNAME() { return getToken(SchedulerParser.VARNAME, 0); }
		public TerminalNode DATE() { return getToken(SchedulerParser.DATE, 0); }
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
			setState(342);
			match(T__39);
			setState(343);
			match(VARNAME);
			setState(344);
			match(T__40);
			setState(345);
			match(DATE);
			setState(346);
			match(T__41);
			setState(347);
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
		enterRule(_localctx, 48, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		case 1:
			return code_sempred((CodeContext)_localctx, predIndex);
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean code_sempred(CodeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0162\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\3\3\3\7\3A\n\3\f"+
		"\3\16\3D\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\6\3\6\7\6"+
		"S\n\6\f\6\16\6V\13\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\5\7e\n\7\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\5\to\n\t\3\t\3\t\5\t"+
		"s\n\t\3\t\3\t\5\tw\n\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\n\u0085\n\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\5\13\u0093\n\13\3\13\7\13\u0096\n\13\f\13\16\13\u0099"+
		"\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00a3\n\r\3\r\3\r\5\r\u00a7"+
		"\n\r\3\r\5\r\u00aa\n\r\3\r\5\r\u00ad\n\r\3\r\3\r\7\r\u00b1\n\r\f\r\16"+
		"\r\u00b4\13\r\3\r\3\r\3\16\3\16\5\16\u00ba\n\16\3\16\3\16\5\16\u00be\n"+
		"\16\3\16\7\16\u00c1\n\16\f\16\16\16\u00c4\13\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\5\20\u00cc\n\20\3\20\3\20\5\20\u00d0\n\20\3\20\5\20\u00d3\n\20"+
		"\3\20\5\20\u00d6\n\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00de\n\21\3"+
		"\21\3\21\5\21\u00e2\n\21\3\21\3\21\3\21\3\21\5\21\u00e8\n\21\3\22\3\22"+
		"\5\22\u00ec\n\22\3\22\3\22\5\22\u00f0\n\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0100\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0126\n\23\f\23\16\23\u0129\13\23"+
		"\3\24\3\24\5\24\u012d\n\24\3\24\5\24\u0130\n\24\3\24\5\24\u0133\n\24\3"+
		"\24\3\24\3\25\3\25\5\25\u0139\n\25\3\25\3\25\5\25\u013d\n\25\3\25\7\25"+
		"\u0140\n\25\f\25\16\25\u0143\13\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\2\4\4$\33\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\3\3\2\63\67\2\u0186\2\64\3\2"+
		"\2\2\4\67\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\fd\3\2\2\2\16h\3\2"+
		"\2\2\20j\3\2\2\2\22\u0080\3\2\2\2\24\u008e\3\2\2\2\26\u009c\3\2\2\2\30"+
		"\u009e\3\2\2\2\32\u00b7\3\2\2\2\34\u00c5\3\2\2\2\36\u00c9\3\2\2\2 \u00e7"+
		"\3\2\2\2\"\u00e9\3\2\2\2$\u00ff\3\2\2\2&\u012a\3\2\2\2(\u0136\3\2\2\2"+
		"*\u0144\3\2\2\2,\u0146\3\2\2\2.\u0151\3\2\2\2\60\u0158\3\2\2\2\62\u015f"+
		"\3\2\2\2\64\65\5\4\3\2\65\66\7\2\2\3\66\3\3\2\2\2\67:\b\3\1\28;\5\6\4"+
		"\29;\5\b\5\2:8\3\2\2\2:9\3\2\2\2;<\3\2\2\2<=\7\3\2\2=B\3\2\2\2>?\f\3\2"+
		"\2?A\5\4\3\4@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DB\3\2"+
		"\2\2EM\5 \21\2FM\5\"\22\2GM\5\24\13\2HM\5\30\r\2IM\5\36\20\2JM\5\f\7\2"+
		"KM\5\16\b\2LE\3\2\2\2LF\3\2\2\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2"+
		"\2LK\3\2\2\2M\7\3\2\2\2NO\7\4\2\2O\t\3\2\2\2PT\7\5\2\2QS\7\61\2\2RQ\3"+
		"\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2W[\5\4\3\2XZ\7"+
		"\61\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2"+
		"^_\7\6\2\2_\13\3\2\2\2`a\7\7\2\2ab\7/\2\2be\5$\23\2ce\7\b\2\2d`\3\2\2"+
		"\2dc\3\2\2\2e\r\3\2\2\2fi\5\20\t\2gi\5\22\n\2hf\3\2\2\2hg\3\2\2\2i\17"+
		"\3\2\2\2jk\7\t\2\2kl\7/\2\2ln\7.\2\2mo\7/\2\2nm\3\2\2\2no\3\2\2\2op\3"+
		"\2\2\2pr\7\n\2\2qs\7/\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\5$\23\2uw\7"+
		"/\2\2vu\3\2\2\2vw\3\2\2\2w{\3\2\2\2xz\7\61\2\2yx\3\2\2\2z}\3\2\2\2{y\3"+
		"\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\5\n\6\2\177\21\3\2\2\2\u0080"+
		"\u0081\7\13\2\2\u0081\u0082\7/\2\2\u0082\u0084\5\26\f\2\u0083\u0085\7"+
		"/\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0089\3\2\2\2\u0086"+
		"\u0088\7\61\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\5\n\6\2\u008d\23\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090\7/\2\2"+
		"\u0090\u0092\5\26\f\2\u0091\u0093\7/\2\2\u0092\u0091\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0097\3\2\2\2\u0094\u0096\7\61\2\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\5\n\6\2\u009b\25\3\2\2\2\u009c"+
		"\u009d\5$\23\2\u009d\27\3\2\2\2\u009e\u009f\7\r\2\2\u009f\u00a0\7/\2\2"+
		"\u00a0\u00a2\7.\2\2\u00a1\u00a3\7/\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\16\2\2\u00a5\u00a7\7/\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa\5\32"+
		"\16\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u00ad\7/\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b2\7\17\2\2\u00af\u00b1\7\61\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\5\n\6\2\u00b6\31\3\2\2\2\u00b7\u00c2"+
		"\5\34\17\2\u00b8\u00ba\7/\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00bd\7\20\2\2\u00bc\u00be\7/\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\5\34\17\2"+
		"\u00c0\u00b9\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\33\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6"+
		"\u00c7\7/\2\2\u00c7\u00c8\7.\2\2\u00c8\35\3\2\2\2\u00c9\u00cb\7.\2\2\u00ca"+
		"\u00cc\7/\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cf\7\16\2\2\u00ce\u00d0\7/\2\2\u00cf\u00ce\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00d3\5\32\16\2\u00d2\u00d1\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d6\7/\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\17"+
		"\2\2\u00d8\37\3\2\2\2\u00d9\u00da\7-\2\2\u00da\u00db\7/\2\2\u00db\u00dd"+
		"\7.\2\2\u00dc\u00de\7/\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\7\21\2\2\u00e0\u00e2\7/\2\2\u00e1\u00e0\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e8\5$\23\2\u00e4"+
		"\u00e8\5.\30\2\u00e5\u00e8\5,\27\2\u00e6\u00e8\5\60\31\2\u00e7\u00d9\3"+
		"\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"!\3\2\2\2\u00e9\u00eb\7.\2\2\u00ea\u00ec\7/\2\2\u00eb\u00ea\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\7\21\2\2\u00ee\u00f0\7"+
		"/\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\5$\23\2\u00f2#\3\2\2\2\u00f3\u00f4\b\23\1\2\u00f4\u00f5\7\36\2"+
		"\2\u00f5\u0100\5$\23\b\u00f6\u00f7\7\37\2\2\u00f7\u0100\5$\23\7\u00f8"+
		"\u00f9\7\16\2\2\u00f9\u00fa\5$\23\2\u00fa\u00fb\7\17\2\2\u00fb\u0100\3"+
		"\2\2\2\u00fc\u0100\5\36\20\2\u00fd\u0100\5\62\32\2\u00fe\u0100\7.\2\2"+
		"\u00ff\u00f3\3\2\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00fc"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0127\3\2\2\2\u0101"+
		"\u0102\f\24\2\2\u0102\u0103\7\22\2\2\u0103\u0126\5$\23\25\u0104\u0105"+
		"\f\23\2\2\u0105\u0106\7\23\2\2\u0106\u0126\5$\23\24\u0107\u0108\f\22\2"+
		"\2\u0108\u0109\7\24\2\2\u0109\u0126\5$\23\23\u010a\u010b\f\21\2\2\u010b"+
		"\u010c\7\25\2\2\u010c\u0126\5$\23\22\u010d\u010e\f\20\2\2\u010e\u010f"+
		"\7\26\2\2\u010f\u0126\5$\23\21\u0110\u0111\f\17\2\2\u0111\u0112\7\27\2"+
		"\2\u0112\u0126\5$\23\20\u0113\u0114\f\16\2\2\u0114\u0115\7\30\2\2\u0115"+
		"\u0126\5$\23\17\u0116\u0117\f\r\2\2\u0117\u0118\7\31\2\2\u0118\u0126\5"+
		"$\23\16\u0119\u011a\f\f\2\2\u011a\u011b\7\32\2\2\u011b\u0126\5$\23\r\u011c"+
		"\u011d\f\13\2\2\u011d\u011e\7\33\2\2\u011e\u0126\5$\23\f\u011f\u0120\f"+
		"\n\2\2\u0120\u0121\7\34\2\2\u0121\u0126\5$\23\13\u0122\u0123\f\t\2\2\u0123"+
		"\u0124\7\35\2\2\u0124\u0126\5$\23\n\u0125\u0101\3\2\2\2\u0125\u0104\3"+
		"\2\2\2\u0125\u0107\3\2\2\2\u0125\u010a\3\2\2\2\u0125\u010d\3\2\2\2\u0125"+
		"\u0110\3\2\2\2\u0125\u0113\3\2\2\2\u0125\u0116\3\2\2\2\u0125\u0119\3\2"+
		"\2\2\u0125\u011c\3\2\2\2\u0125\u011f\3\2\2\2\u0125\u0122\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128%\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u012a\u012c\7 \2\2\u012b\u012d\7/\2\2\u012c\u012b"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0130\5(\25\2\u012f"+
		"\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0133\7/"+
		"\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\7!\2\2\u0135\'\3\2\2\2\u0136\u0141\5*\26\2\u0137\u0139\7/\2\2\u0138"+
		"\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\7\20"+
		"\2\2\u013b\u013d\7/\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0140\5*\26\2\u013f\u0138\3\2\2\2\u0140\u0143\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142)\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0144\u0145\7.\2\2\u0145+\3\2\2\2\u0146\u0147\7\"\2\2\u0147\u0148"+
		"\7.\2\2\u0148\u0149\7#\2\2\u0149\u014a\7.\2\2\u014a\u014b\7$\2\2\u014b"+
		"\u014c\7.\2\2\u014c\u014d\7%\2\2\u014d\u014e\7\67\2\2\u014e\u014f\7&\2"+
		"\2\u014f\u0150\7\67\2\2\u0150-\3\2\2\2\u0151\u0152\7\'\2\2\u0152\u0153"+
		"\7.\2\2\u0153\u0154\7(\2\2\u0154\u0155\7\66\2\2\u0155\u0156\7)\2\2\u0156"+
		"\u0157\5&\24\2\u0157/\3\2\2\2\u0158\u0159\7*\2\2\u0159\u015a\7.\2\2\u015a"+
		"\u015b\7+\2\2\u015b\u015c\7\66\2\2\u015c\u015d\7,\2\2\u015d\u015e\5&\24"+
		"\2\u015e\61\3\2\2\2\u015f\u0160\t\2\2\2\u0160\63\3\2\2\2+:BLT[dhnrv{\u0084"+
		"\u0089\u0092\u0097\u00a2\u00a6\u00a9\u00ac\u00b2\u00b9\u00bd\u00c2\u00cb"+
		"\u00cf\u00d2\u00d5\u00dd\u00e1\u00e7\u00eb\u00ef\u00ff\u0125\u0127\u012c"+
		"\u012f\u0132\u0138\u013c\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}