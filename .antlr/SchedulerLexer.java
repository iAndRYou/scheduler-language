// Generated from c:\Users\AndRYou\Desktop\Studia\Kompilatory\scheduler-language\Scheduler.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchedulerLexer extends Lexer {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, ATTRIBUTE=49, TYPENAME=50, VARNAME=51, SPACE=52, 
		FORCESPACE=53, NEWLINE=54, TAB=55, INT=56, BOOL=57, STRING=58, DATE=59, 
		TIME=60, SUBJECT=61, TEACHER=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "ATTRIBUTE", 
			"TYPENAME", "VARNAME", "SPACE", "FORCESPACE", "NEWLINE", "TAB", "INT", 
			"BOOL", "STRING", "DATE", "TIME", "SUBJECT", "TEACHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'ADD'", "'DATE'", "'UPDATE'", "'TIME'", "'DATES'", "'DELETE'", 
			"'GET'", "'CLASSES'", "'DAYS'", "'{'", "'}'", "'RETURN'", "'BREAK'", 
			"'FOR'", "'IN'", "'WHILE'", "'IF'", "'DEF'", "'('", "')'", "','", "'='", 
			"'COLLECTION OF'", "'.'", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'AND'", "'OR'", "'NOT'", "'#'", "'['", 
			"']'", "'CLASS'", "'SUBJECT'", "'TEACHER'", "'START'", "'END'", "'DAY'", 
			"'WEEK'", null, null, null, null, null, null, "'\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ATTRIBUTE", "TYPENAME", "VARNAME", "SPACE", "FORCESPACE", "NEWLINE", 
			"TAB", "INT", "BOOL", "STRING", "DATE", "TIME", "SUBJECT", "TEACHER"
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


	public SchedulerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scheduler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u01e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%"+
		"\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u015a\n\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u018b\n\63\3\64\6\64\u018e\n\64\r\64\16\64\u018f\3\65\6\65\u0193\n\65"+
		"\r\65\16\65\u0194\3\65\3\65\3\66\6\66\u019a\n\66\r\66\16\66\u019b\3\67"+
		"\6\67\u019f\n\67\r\67\16\67\u01a0\3\67\3\67\38\38\38\38\39\69\u01aa\n"+
		"9\r9\169\u01ab\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u01b7\n:\3;\3;\7;\u01bb\n"+
		";\f;\16;\u01be\13;\3;\3;\3<\5<\u01c3\n<\3<\3<\3<\3<\3<\5<\u01ca\n<\3<"+
		"\3<\5<\u01ce\n<\3<\3<\3<\5<\u01d3\n<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\5="+
		"\u01df\n=\3=\3=\3=\3=\3>\3>\3?\3?\2\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\3\2\r\4\2C\\c|\3\2"+
		"\"\"\4\2\f\f\17\17\3\2\62;\5\2\62;C\\c|\3\2\63;\3\2\63\64\3\2\62\63\3"+
		"\2\62\64\3\2\62\65\3\2\62\67\2\u0200\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2"+
		"\5\u0081\3\2\2\2\7\u0085\3\2\2\2\t\u008a\3\2\2\2\13\u0091\3\2\2\2\r\u0096"+
		"\3\2\2\2\17\u009c\3\2\2\2\21\u00a3\3\2\2\2\23\u00a7\3\2\2\2\25\u00af\3"+
		"\2\2\2\27\u00b4\3\2\2\2\31\u00b6\3\2\2\2\33\u00b8\3\2\2\2\35\u00bf\3\2"+
		"\2\2\37\u00c5\3\2\2\2!\u00c9\3\2\2\2#\u00cc\3\2\2\2%\u00d2\3\2\2\2\'\u00d5"+
		"\3\2\2\2)\u00d9\3\2\2\2+\u00db\3\2\2\2-\u00dd\3\2\2\2/\u00df\3\2\2\2\61"+
		"\u00e1\3\2\2\2\63\u00ef\3\2\2\2\65\u00f1\3\2\2\2\67\u00f3\3\2\2\29\u00f5"+
		"\3\2\2\2;\u00f7\3\2\2\2=\u00f9\3\2\2\2?\u00fc\3\2\2\2A\u00ff\3\2\2\2C"+
		"\u0101\3\2\2\2E\u0103\3\2\2\2G\u0106\3\2\2\2I\u0109\3\2\2\2K\u010d\3\2"+
		"\2\2M\u0110\3\2\2\2O\u0114\3\2\2\2Q\u0116\3\2\2\2S\u0118\3\2\2\2U\u011a"+
		"\3\2\2\2W\u0120\3\2\2\2Y\u0128\3\2\2\2[\u0130\3\2\2\2]\u0136\3\2\2\2_"+
		"\u013a\3\2\2\2a\u013e\3\2\2\2c\u0159\3\2\2\2e\u018a\3\2\2\2g\u018d\3\2"+
		"\2\2i\u0192\3\2\2\2k\u0199\3\2\2\2m\u019e\3\2\2\2o\u01a4\3\2\2\2q\u01a9"+
		"\3\2\2\2s\u01b6\3\2\2\2u\u01b8\3\2\2\2w\u01c9\3\2\2\2y\u01de\3\2\2\2{"+
		"\u01e4\3\2\2\2}\u01e6\3\2\2\2\177\u0080\7=\2\2\u0080\4\3\2\2\2\u0081\u0082"+
		"\7C\2\2\u0082\u0083\7F\2\2\u0083\u0084\7F\2\2\u0084\6\3\2\2\2\u0085\u0086"+
		"\7F\2\2\u0086\u0087\7C\2\2\u0087\u0088\7V\2\2\u0088\u0089\7G\2\2\u0089"+
		"\b\3\2\2\2\u008a\u008b\7W\2\2\u008b\u008c\7R\2\2\u008c\u008d\7F\2\2\u008d"+
		"\u008e\7C\2\2\u008e\u008f\7V\2\2\u008f\u0090\7G\2\2\u0090\n\3\2\2\2\u0091"+
		"\u0092\7V\2\2\u0092\u0093\7K\2\2\u0093\u0094\7O\2\2\u0094\u0095\7G\2\2"+
		"\u0095\f\3\2\2\2\u0096\u0097\7F\2\2\u0097\u0098\7C\2\2\u0098\u0099\7V"+
		"\2\2\u0099\u009a\7G\2\2\u009a\u009b\7U\2\2\u009b\16\3\2\2\2\u009c\u009d"+
		"\7F\2\2\u009d\u009e\7G\2\2\u009e\u009f\7N\2\2\u009f\u00a0\7G\2\2\u00a0"+
		"\u00a1\7V\2\2\u00a1\u00a2\7G\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\7I\2\2\u00a4"+
		"\u00a5\7G\2\2\u00a5\u00a6\7V\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7E\2\2\u00a8"+
		"\u00a9\7N\2\2\u00a9\u00aa\7C\2\2\u00aa\u00ab\7U\2\2\u00ab\u00ac\7U\2\2"+
		"\u00ac\u00ad\7G\2\2\u00ad\u00ae\7U\2\2\u00ae\24\3\2\2\2\u00af\u00b0\7"+
		"F\2\2\u00b0\u00b1\7C\2\2\u00b1\u00b2\7[\2\2\u00b2\u00b3\7U\2\2\u00b3\26"+
		"\3\2\2\2\u00b4\u00b5\7}\2\2\u00b5\30\3\2\2\2\u00b6\u00b7\7\177\2\2\u00b7"+
		"\32\3\2\2\2\u00b8\u00b9\7T\2\2\u00b9\u00ba\7G\2\2\u00ba\u00bb\7V\2\2\u00bb"+
		"\u00bc\7W\2\2\u00bc\u00bd\7T\2\2\u00bd\u00be\7P\2\2\u00be\34\3\2\2\2\u00bf"+
		"\u00c0\7D\2\2\u00c0\u00c1\7T\2\2\u00c1\u00c2\7G\2\2\u00c2\u00c3\7C\2\2"+
		"\u00c3\u00c4\7M\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7H\2\2\u00c6\u00c7\7"+
		"Q\2\2\u00c7\u00c8\7T\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7K\2\2\u00ca\u00cb"+
		"\7P\2\2\u00cb\"\3\2\2\2\u00cc\u00cd\7Y\2\2\u00cd\u00ce\7J\2\2\u00ce\u00cf"+
		"\7K\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d1\7G\2\2\u00d1$\3\2\2\2\u00d2\u00d3"+
		"\7K\2\2\u00d3\u00d4\7H\2\2\u00d4&\3\2\2\2\u00d5\u00d6\7F\2\2\u00d6\u00d7"+
		"\7G\2\2\u00d7\u00d8\7H\2\2\u00d8(\3\2\2\2\u00d9\u00da\7*\2\2\u00da*\3"+
		"\2\2\2\u00db\u00dc\7+\2\2\u00dc,\3\2\2\2\u00dd\u00de\7.\2\2\u00de.\3\2"+
		"\2\2\u00df\u00e0\7?\2\2\u00e0\60\3\2\2\2\u00e1\u00e2\7E\2\2\u00e2\u00e3"+
		"\7Q\2\2\u00e3\u00e4\7N\2\2\u00e4\u00e5\7N\2\2\u00e5\u00e6\7G\2\2\u00e6"+
		"\u00e7\7E\2\2\u00e7\u00e8\7V\2\2\u00e8\u00e9\7K\2\2\u00e9\u00ea\7Q\2\2"+
		"\u00ea\u00eb\7P\2\2\u00eb\u00ec\7\"\2\2\u00ec\u00ed\7Q\2\2\u00ed\u00ee"+
		"\7H\2\2\u00ee\62\3\2\2\2\u00ef\u00f0\7\60\2\2\u00f0\64\3\2\2\2\u00f1\u00f2"+
		"\7,\2\2\u00f2\66\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f48\3\2\2\2\u00f5\u00f6"+
		"\7-\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7/\2\2\u00f8<\3\2\2\2\u00f9\u00fa\7"+
		"?\2\2\u00fa\u00fb\7?\2\2\u00fb>\3\2\2\2\u00fc\u00fd\7#\2\2\u00fd\u00fe"+
		"\7?\2\2\u00fe@\3\2\2\2\u00ff\u0100\7>\2\2\u0100B\3\2\2\2\u0101\u0102\7"+
		"@\2\2\u0102D\3\2\2\2\u0103\u0104\7>\2\2\u0104\u0105\7?\2\2\u0105F\3\2"+
		"\2\2\u0106\u0107\7@\2\2\u0107\u0108\7?\2\2\u0108H\3\2\2\2\u0109\u010a"+
		"\7C\2\2\u010a\u010b\7P\2\2\u010b\u010c\7F\2\2\u010cJ\3\2\2\2\u010d\u010e"+
		"\7Q\2\2\u010e\u010f\7T\2\2\u010fL\3\2\2\2\u0110\u0111\7P\2\2\u0111\u0112"+
		"\7Q\2\2\u0112\u0113\7V\2\2\u0113N\3\2\2\2\u0114\u0115\7%\2\2\u0115P\3"+
		"\2\2\2\u0116\u0117\7]\2\2\u0117R\3\2\2\2\u0118\u0119\7_\2\2\u0119T\3\2"+
		"\2\2\u011a\u011b\7E\2\2\u011b\u011c\7N\2\2\u011c\u011d\7C\2\2\u011d\u011e"+
		"\7U\2\2\u011e\u011f\7U\2\2\u011fV\3\2\2\2\u0120\u0121\7U\2\2\u0121\u0122"+
		"\7W\2\2\u0122\u0123\7D\2\2\u0123\u0124\7L\2\2\u0124\u0125\7G\2\2\u0125"+
		"\u0126\7E\2\2\u0126\u0127\7V\2\2\u0127X\3\2\2\2\u0128\u0129\7V\2\2\u0129"+
		"\u012a\7G\2\2\u012a\u012b\7C\2\2\u012b\u012c\7E\2\2\u012c\u012d\7J\2\2"+
		"\u012d\u012e\7G\2\2\u012e\u012f\7T\2\2\u012fZ\3\2\2\2\u0130\u0131\7U\2"+
		"\2\u0131\u0132\7V\2\2\u0132\u0133\7C\2\2\u0133\u0134\7T\2\2\u0134\u0135"+
		"\7V\2\2\u0135\\\3\2\2\2\u0136\u0137\7G\2\2\u0137\u0138\7P\2\2\u0138\u0139"+
		"\7F\2\2\u0139^\3\2\2\2\u013a\u013b\7F\2\2\u013b\u013c\7C\2\2\u013c\u013d"+
		"\7[\2\2\u013d`\3\2\2\2\u013e\u013f\7Y\2\2\u013f\u0140\7G\2\2\u0140\u0141"+
		"\7G\2\2\u0141\u0142\7M\2\2\u0142b\3\2\2\2\u0143\u0144\7U\2\2\u0144\u0145"+
		"\7V\2\2\u0145\u0146\7C\2\2\u0146\u0147\7T\2\2\u0147\u015a\7V\2\2\u0148"+
		"\u0149\7G\2\2\u0149\u014a\7P\2\2\u014a\u015a\7F\2\2\u014b\u014c\7U\2\2"+
		"\u014c\u014d\7W\2\2\u014d\u014e\7D\2\2\u014e\u014f\7L\2\2\u014f\u0150"+
		"\7G\2\2\u0150\u0151\7E\2\2\u0151\u015a\7V\2\2\u0152\u0153\7V\2\2\u0153"+
		"\u0154\7G\2\2\u0154\u0155\7C\2\2\u0155\u0156\7E\2\2\u0156\u0157\7J\2\2"+
		"\u0157\u0158\7G\2\2\u0158\u015a\7T\2\2\u0159\u0143\3\2\2\2\u0159\u0148"+
		"\3\2\2\2\u0159\u014b\3\2\2\2\u0159\u0152\3\2\2\2\u015ad\3\2\2\2\u015b"+
		"\u015c\7K\2\2\u015c\u015d\7P\2\2\u015d\u018b\7V\2\2\u015e\u015f\7D\2\2"+
		"\u015f\u0160\7Q\2\2\u0160\u0161\7Q\2\2\u0161\u018b\7N\2\2\u0162\u0163"+
		"\7U\2\2\u0163\u0164\7V\2\2\u0164\u0165\7T\2\2\u0165\u0166\7K\2\2\u0166"+
		"\u0167\7P\2\2\u0167\u018b\7I\2\2\u0168\u0169\7F\2\2\u0169\u016a\7C\2\2"+
		"\u016a\u016b\7V\2\2\u016b\u018b\7G\2\2\u016c\u016d\7V\2\2\u016d\u016e"+
		"\7K\2\2\u016e\u016f\7O\2\2\u016f\u018b\7G\2\2\u0170\u0171\7E\2\2\u0171"+
		"\u0172\7N\2\2\u0172\u0173\7C\2\2\u0173\u0174\7U\2\2\u0174\u018b\7U\2\2"+
		"\u0175\u0176\7F\2\2\u0176\u0177\7C\2\2\u0177\u018b\7[\2\2\u0178\u0179"+
		"\7Y\2\2\u0179\u017a\7G\2\2\u017a\u017b\7G\2\2\u017b\u018b\7M\2\2\u017c"+
		"\u017d\7U\2\2\u017d\u017e\7W\2\2\u017e\u017f\7D\2\2\u017f\u0180\7L\2\2"+
		"\u0180\u0181\7G\2\2\u0181\u0182\7E\2\2\u0182\u018b\7V\2\2\u0183\u0184"+
		"\7V\2\2\u0184\u0185\7G\2\2\u0185\u0186\7C\2\2\u0186\u0187\7E\2\2\u0187"+
		"\u0188\7J\2\2\u0188\u0189\7G\2\2\u0189\u018b\7T\2\2\u018a\u015b\3\2\2"+
		"\2\u018a\u015e\3\2\2\2\u018a\u0162\3\2\2\2\u018a\u0168\3\2\2\2\u018a\u016c"+
		"\3\2\2\2\u018a\u0170\3\2\2\2\u018a\u0175\3\2\2\2\u018a\u0178\3\2\2\2\u018a"+
		"\u017c\3\2\2\2\u018a\u0183\3\2\2\2\u018bf\3\2\2\2\u018c\u018e\t\2\2\2"+
		"\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190h\3\2\2\2\u0191\u0193\t\3\2\2\u0192\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0197\b\65\2\2\u0197j\3\2\2\2\u0198\u019a\t\3\2\2\u0199\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"l\3\2\2\2\u019d\u019f\t\4\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2"+
		"\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3"+
		"\b\67\2\2\u01a3n\3\2\2\2\u01a4\u01a5\7\13\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a7\b8\2\2\u01a7p\3\2\2\2\u01a8\u01aa\t\5\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01acr\3\2\2\2"+
		"\u01ad\u01ae\7V\2\2\u01ae\u01af\7t\2\2\u01af\u01b0\7w\2\2\u01b0\u01b7"+
		"\7g\2\2\u01b1\u01b2\7H\2\2\u01b2\u01b3\7c\2\2\u01b3\u01b4\7n\2\2\u01b4"+
		"\u01b5\7u\2\2\u01b5\u01b7\7g\2\2\u01b6\u01ad\3\2\2\2\u01b6\u01b1\3\2\2"+
		"\2\u01b7t\3\2\2\2\u01b8\u01bc\7$\2\2\u01b9\u01bb\t\6\2\2\u01ba\u01b9\3"+
		"\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7$\2\2\u01c0v\3\2\2\2\u01c1"+
		"\u01c3\7\62\2\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3"+
		"\2\2\2\u01c4\u01ca\t\7\2\2\u01c5\u01c6\t\b\2\2\u01c6\u01ca\t\5\2\2\u01c7"+
		"\u01c8\7\65\2\2\u01c8\u01ca\t\t\2\2\u01c9\u01c2\3\2\2\2\u01c9\u01c5\3"+
		"\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01d2\7\61\2\2\u01cc"+
		"\u01ce\7\62\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3"+
		"\2\2\2\u01cf\u01d3\t\7\2\2\u01d0\u01d1\7\63\2\2\u01d1\u01d3\t\n\2\2\u01d2"+
		"\u01cd\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\7\61"+
		"\2\2\u01d5\u01d6\t\5\2\2\u01d6\u01d7\t\5\2\2\u01d7\u01d8\t\5\2\2\u01d8"+
		"\u01d9\t\5\2\2\u01d9x\3\2\2\2\u01da\u01db\t\t\2\2\u01db\u01df\t\5\2\2"+
		"\u01dc\u01dd\7\64\2\2\u01dd\u01df\t\13\2\2\u01de\u01da\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7<\2\2\u01e1\u01e2\t\f\2\2\u01e2"+
		"\u01e3\t\5\2\2\u01e3z\3\2\2\2\u01e4\u01e5\5u;\2\u01e5|\3\2\2\2\u01e6\u01e7"+
		"\5u;\2\u01e7~\3\2\2\2\21\2\u0159\u018a\u018f\u0194\u019b\u01a0\u01ab\u01b6"+
		"\u01bc\u01c2\u01c9\u01cd\u01d2\u01de\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}