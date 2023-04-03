// Generated from c:\Users\kkost\Desktop\kompilatory\scheduler-language\Scheduler.g4 by ANTLR 4.9.2
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "CLASS_ATTRIBUTE", "TYPENAME", "CLASSNAME", "DAYNAME", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u0207\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b0"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00cb\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\59\u019e\n9\3"+
		"9\69\u01a1\n9\r9\169\u01a2\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u01ae\n:\3;\3"+
		";\7;\u01b2\n;\f;\16;\u01b5\13;\3;\3;\3<\5<\u01ba\n<\3<\3<\3<\3<\3<\5<"+
		"\u01c1\n<\3<\3<\5<\u01c5\n<\3<\3<\3<\5<\u01ca\n<\3<\3<\3<\3<\3<\3<\3="+
		"\3=\3=\3=\5=\u01d6\n=\3=\3=\3=\3=\3>\6>\u01dd\n>\r>\16>\u01de\3>\3>\3"+
		"?\3?\7?\u01e5\n?\f?\16?\u01e8\13?\3@\3@\3@\3@\7@\u01ee\n@\f@\16@\u01f1"+
		"\13@\3@\5@\u01f4\n@\3@\3@\3@\3@\3A\3A\3A\3A\7A\u01fe\nA\fA\16A\u0201\13"+
		"A\3A\3A\3A\3A\3A\4\u01ef\u01ff\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\3\2\r\3\2\62"+
		";\6\2\"\"\62;C\\c|\3\2\63;\3\2\63\64\3\2\62\63\3\2\62\64\3\2\62\65\3\2"+
		"\62\67\5\2\13\f\17\17\"\"\4\2C\\c|\5\2\62;C\\c|\2\u021d\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u0085\3\2\2\2\7"+
		"\u0090\3\2\2\2\t\u00af\3\2\2\2\13\u00ca\3\2\2\2\r\u00cc\3\2\2\2\17\u00d2"+
		"\3\2\2\2\21\u00d6\3\2\2\2\23\u00db\3\2\2\2\25\u00e3\3\2\2\2\27\u00e8\3"+
		"\2\2\2\31\u00ea\3\2\2\2\33\u00ec\3\2\2\2\35\u00ee\3\2\2\2\37\u00f0\3\2"+
		"\2\2!\u00f3\3\2\2\2#\u00f6\3\2\2\2%\u00f8\3\2\2\2\'\u00fa\3\2\2\2)\u00fd"+
		"\3\2\2\2+\u0100\3\2\2\2-\u0104\3\2\2\2/\u0107\3\2\2\2\61\u010b\3\2\2\2"+
		"\63\u010e\3\2\2\2\65\u0110\3\2\2\2\67\u0112\3\2\2\29\u0114\3\2\2\2;\u0116"+
		"\3\2\2\2=\u0118\3\2\2\2?\u011a\3\2\2\2A\u011c\3\2\2\2C\u011e\3\2\2\2E"+
		"\u0120\3\2\2\2G\u012e\3\2\2\2I\u0132\3\2\2\2K\u0139\3\2\2\2M\u0140\3\2"+
		"\2\2O\u0144\3\2\2\2Q\u014a\3\2\2\2S\u0155\3\2\2\2U\u0158\3\2\2\2W\u015b"+
		"\3\2\2\2Y\u015f\3\2\2\2[\u0162\3\2\2\2]\u0167\3\2\2\2_\u016c\3\2\2\2a"+
		"\u0170\3\2\2\2c\u0176\3\2\2\2e\u017d\3\2\2\2g\u0183\3\2\2\2i\u0185\3\2"+
		"\2\2k\u0187\3\2\2\2m\u0190\3\2\2\2o\u0196\3\2\2\2q\u019d\3\2\2\2s\u01ad"+
		"\3\2\2\2u\u01af\3\2\2\2w\u01c0\3\2\2\2y\u01d5\3\2\2\2{\u01dc\3\2\2\2}"+
		"\u01e2\3\2\2\2\177\u01e9\3\2\2\2\u0081\u01f9\3\2\2\2\u0083\u0084\7=\2"+
		"\2\u0084\4\3\2\2\2\u0085\u0086\7U\2\2\u0086\u0087\7V\2\2\u0087\u0088\7"+
		"C\2\2\u0088\u0089\7T\2\2\u0089\u008a\7V\2\2\u008a\u008b\7\"\2\2\u008b"+
		"\u008c\7F\2\2\u008c\u008d\7C\2\2\u008d\u008e\7V\2\2\u008e\u008f\7G\2\2"+
		"\u008f\6\3\2\2\2\u0090\u0091\7G\2\2\u0091\u0092\7P\2\2\u0092\u0093\7F"+
		"\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7F\2\2\u0095\u0096\7C\2\2\u0096\u0097"+
		"\7V\2\2\u0097\u0098\7G\2\2\u0098\b\3\2\2\2\u0099\u009a\7U\2\2\u009a\u009b"+
		"\7V\2\2\u009b\u009c\7C\2\2\u009c\u009d\7T\2\2\u009d\u00b0\7V\2\2\u009e"+
		"\u009f\7G\2\2\u009f\u00a0\7P\2\2\u00a0\u00b0\7F\2\2\u00a1\u00a2\7U\2\2"+
		"\u00a2\u00a3\7W\2\2\u00a3\u00a4\7D\2\2\u00a4\u00a5\7L\2\2\u00a5\u00a6"+
		"\7G\2\2\u00a6\u00a7\7E\2\2\u00a7\u00b0\7V\2\2\u00a8\u00a9\7V\2\2\u00a9"+
		"\u00aa\7G\2\2\u00aa\u00ab\7C\2\2\u00ab\u00ac\7E\2\2\u00ac\u00ad\7J\2\2"+
		"\u00ad\u00ae\7G\2\2\u00ae\u00b0\7T\2\2\u00af\u0099\3\2\2\2\u00af\u009e"+
		"\3\2\2\2\u00af\u00a1\3\2\2\2\u00af\u00a8\3\2\2\2\u00b0\n\3\2\2\2\u00b1"+
		"\u00b2\7K\2\2\u00b2\u00b3\7P\2\2\u00b3\u00cb\7V\2\2\u00b4\u00b5\7D\2\2"+
		"\u00b5\u00b6\7Q\2\2\u00b6\u00b7\7Q\2\2\u00b7\u00cb\7N\2\2\u00b8\u00b9"+
		"\7U\2\2\u00b9\u00ba\7V\2\2\u00ba\u00bb\7T\2\2\u00bb\u00bc\7K\2\2\u00bc"+
		"\u00bd\7P\2\2\u00bd\u00cb\7I\2\2\u00be\u00bf\7F\2\2\u00bf\u00c0\7C\2\2"+
		"\u00c0\u00c1\7V\2\2\u00c1\u00cb\7G\2\2\u00c2\u00c3\7V\2\2\u00c3\u00c4"+
		"\7K\2\2\u00c4\u00c5\7O\2\2\u00c5\u00cb\7G\2\2\u00c6\u00c7\7X\2\2\u00c7"+
		"\u00c8\7Q\2\2\u00c8\u00c9\7K\2\2\u00c9\u00cb\7F\2\2\u00ca\u00b1\3\2\2"+
		"\2\u00ca\u00b4\3\2\2\2\u00ca\u00b8\3\2\2\2\u00ca\u00be\3\2\2\2\u00ca\u00c2"+
		"\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\f\3\2\2\2\u00cc\u00cd\7E\2\2\u00cd"+
		"\u00ce\7N\2\2\u00ce\u00cf\7C\2\2\u00cf\u00d0\7U\2\2\u00d0\u00d1\7U\2\2"+
		"\u00d1\16\3\2\2\2\u00d2\u00d3\7F\2\2\u00d3\u00d4\7C\2\2\u00d4\u00d5\7"+
		"[\2\2\u00d5\20\3\2\2\2\u00d6\u00d7\7Y\2\2\u00d7\u00d8\7G\2\2\u00d8\u00d9"+
		"\7G\2\2\u00d9\u00da\7M\2\2\u00da\22\3\2\2\2\u00db\u00dc\7E\2\2\u00dc\u00dd"+
		"\7N\2\2\u00dd\u00de\7C\2\2\u00de\u00df\7U\2\2\u00df\u00e0\7U\2\2\u00e0"+
		"\u00e1\7G\2\2\u00e1\u00e2\7U\2\2\u00e2\24\3\2\2\2\u00e3\u00e4\7F\2\2\u00e4"+
		"\u00e5\7C\2\2\u00e5\u00e6\7[\2\2\u00e6\u00e7\7U\2\2\u00e7\26\3\2\2\2\u00e8"+
		"\u00e9\7,\2\2\u00e9\30\3\2\2\2\u00ea\u00eb\7\61\2\2\u00eb\32\3\2\2\2\u00ec"+
		"\u00ed\7-\2\2\u00ed\34\3\2\2\2\u00ee\u00ef\7/\2\2\u00ef\36\3\2\2\2\u00f0"+
		"\u00f1\7?\2\2\u00f1\u00f2\7?\2\2\u00f2 \3\2\2\2\u00f3\u00f4\7#\2\2\u00f4"+
		"\u00f5\7?\2\2\u00f5\"\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7$\3\2\2\2\u00f8"+
		"\u00f9\7@\2\2\u00f9&\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb\u00fc\7?\2\2\u00fc"+
		"(\3\2\2\2\u00fd\u00fe\7@\2\2\u00fe\u00ff\7?\2\2\u00ff*\3\2\2\2\u0100\u0101"+
		"\7C\2\2\u0101\u0102\7P\2\2\u0102\u0103\7F\2\2\u0103,\3\2\2\2\u0104\u0105"+
		"\7Q\2\2\u0105\u0106\7T\2\2\u0106.\3\2\2\2\u0107\u0108\7P\2\2\u0108\u0109"+
		"\7Q\2\2\u0109\u010a\7V\2\2\u010a\60\3\2\2\2\u010b\u010c\7K\2\2\u010c\u010d"+
		"\7P\2\2\u010d\62\3\2\2\2\u010e\u010f\7%\2\2\u010f\64\3\2\2\2\u0110\u0111"+
		"\7*\2\2\u0111\66\3\2\2\2\u0112\u0113\7+\2\2\u01138\3\2\2\2\u0114\u0115"+
		"\7]\2\2\u0115:\3\2\2\2\u0116\u0117\7_\2\2\u0117<\3\2\2\2\u0118\u0119\7"+
		"\60\2\2\u0119>\3\2\2\2\u011a\u011b\7.\2\2\u011b@\3\2\2\2\u011c\u011d\7"+
		"<\2\2\u011dB\3\2\2\2\u011e\u011f\7?\2\2\u011fD\3\2\2\2\u0120\u0121\7E"+
		"\2\2\u0121\u0122\7Q\2\2\u0122\u0123\7N\2\2\u0123\u0124\7N\2\2\u0124\u0125"+
		"\7G\2\2\u0125\u0126\7E\2\2\u0126\u0127\7V\2\2\u0127\u0128\7K\2\2\u0128"+
		"\u0129\7Q\2\2\u0129\u012a\7P\2\2\u012a\u012b\7\"\2\2\u012b\u012c\7Q\2"+
		"\2\u012c\u012d\7H\2\2\u012dF\3\2\2\2\u012e\u012f\7C\2\2\u012f\u0130\7"+
		"F\2\2\u0130\u0131\7F\2\2\u0131H\3\2\2\2\u0132\u0133\7W\2\2\u0133\u0134"+
		"\7R\2\2\u0134\u0135\7F\2\2\u0135\u0136\7C\2\2\u0136\u0137\7V\2\2\u0137"+
		"\u0138\7G\2\2\u0138J\3\2\2\2\u0139\u013a\7F\2\2\u013a\u013b\7G\2\2\u013b"+
		"\u013c\7N\2\2\u013c\u013d\7G\2\2\u013d\u013e\7V\2\2\u013e\u013f\7G\2\2"+
		"\u013fL\3\2\2\2\u0140\u0141\7I\2\2\u0141\u0142\7G\2\2\u0142\u0143\7V\2"+
		"\2\u0143N\3\2\2\2\u0144\u0145\7Y\2\2\u0145\u0146\7J\2\2\u0146\u0147\7"+
		"G\2\2\u0147\u0148\7T\2\2\u0148\u0149\7G\2\2\u0149P\3\2\2\2\u014a\u014b"+
		"\7U\2\2\u014b\u014c\7C\2\2\u014c\u014d\7V\2\2\u014d\u014e\7K\2\2\u014e"+
		"\u014f\7U\2\2\u014f\u0150\7H\2\2\u0150\u0151\7[\2\2\u0151\u0152\7K\2\2"+
		"\u0152\u0153\7P\2\2\u0153\u0154\7I\2\2\u0154R\3\2\2\2\u0155\u0156\7C\2"+
		"\2\u0156\u0157\7V\2\2\u0157T\3\2\2\2\u0158\u0159\7Q\2\2\u0159\u015a\7"+
		"P\2\2\u015aV\3\2\2\2\u015b\u015c\7F\2\2\u015c\u015d\7G\2\2\u015d\u015e"+
		"\7H\2\2\u015eX\3\2\2\2\u015f\u0160\7K\2\2\u0160\u0161\7H\2\2\u0161Z\3"+
		"\2\2\2\u0162\u0163\7G\2\2\u0163\u0164\7N\2\2\u0164\u0165\7K\2\2\u0165"+
		"\u0166\7H\2\2\u0166\\\3\2\2\2\u0167\u0168\7G\2\2\u0168\u0169\7N\2\2\u0169"+
		"\u016a\7U\2\2\u016a\u016b\7G\2\2\u016b^\3\2\2\2\u016c\u016d\7H\2\2\u016d"+
		"\u016e\7Q\2\2\u016e\u016f\7T\2\2\u016f`\3\2\2\2\u0170\u0171\7Y\2\2\u0171"+
		"\u0172\7J\2\2\u0172\u0173\7K\2\2\u0173\u0174\7N\2\2\u0174\u0175\7G\2\2"+
		"\u0175b\3\2\2\2\u0176\u0177\7T\2\2\u0177\u0178\7G\2\2\u0178\u0179\7V\2"+
		"\2\u0179\u017a\7W\2\2\u017a\u017b\7T\2\2\u017b\u017c\7P\2\2\u017cd\3\2"+
		"\2\2\u017d\u017e\7D\2\2\u017e\u017f\7T\2\2\u017f\u0180\7G\2\2\u0180\u0181"+
		"\7C\2\2\u0181\u0182\7M\2\2\u0182f\3\2\2\2\u0183\u0184\7}\2\2\u0184h\3"+
		"\2\2\2\u0185\u0186\7\177\2\2\u0186j\3\2\2\2\u0187\u0188\7F\2\2\u0188\u0189"+
		"\7K\2\2\u0189\u018a\7U\2\2\u018a\u018b\7V\2\2\u018b\u018c\7K\2\2\u018c"+
		"\u018d\7P\2\2\u018d\u018e\7E\2\2\u018e\u018f\7V\2\2\u018fl\3\2\2\2\u0190"+
		"\u0191\7R\2\2\u0191\u0192\7T\2\2\u0192\u0193\7K\2\2\u0193\u0194\7P\2\2"+
		"\u0194\u0195\7V\2\2\u0195n\3\2\2\2\u0196\u0197\7F\2\2\u0197\u0198\7C\2"+
		"\2\u0198\u0199\7V\2\2\u0199\u019a\7G\2\2\u019a\u019b\7U\2\2\u019bp\3\2"+
		"\2\2\u019c\u019e\7/\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u01a1\t\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3r\3\2\2\2\u01a4\u01a5"+
		"\7V\2\2\u01a5\u01a6\7t\2\2\u01a6\u01a7\7w\2\2\u01a7\u01ae\7g\2\2\u01a8"+
		"\u01a9\7H\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab\7n\2\2\u01ab\u01ac\7u\2\2"+
		"\u01ac\u01ae\7g\2\2\u01ad\u01a4\3\2\2\2\u01ad\u01a8\3\2\2\2\u01aet\3\2"+
		"\2\2\u01af\u01b3\7$\2\2\u01b0\u01b2\t\3\2\2\u01b1\u01b0\3\2\2\2\u01b2"+
		"\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2"+
		"\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\7$\2\2\u01b7v\3\2\2\2\u01b8\u01ba"+
		"\7\62\2\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2"+
		"\u01bb\u01c1\t\4\2\2\u01bc\u01bd\t\5\2\2\u01bd\u01c1\t\2\2\2\u01be\u01bf"+
		"\7\65\2\2\u01bf\u01c1\t\6\2\2\u01c0\u01b9\3\2\2\2\u01c0\u01bc\3\2\2\2"+
		"\u01c0\u01be\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c9\7\61\2\2\u01c3\u01c5"+
		"\7\62\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2"+
		"\u01c6\u01ca\t\4\2\2\u01c7\u01c8\7\63\2\2\u01c8\u01ca\t\7\2\2\u01c9\u01c4"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\7\61\2\2"+
		"\u01cc\u01cd\t\2\2\2\u01cd\u01ce\t\2\2\2\u01ce\u01cf\t\2\2\2\u01cf\u01d0"+
		"\t\2\2\2\u01d0x\3\2\2\2\u01d1\u01d2\t\6\2\2\u01d2\u01d6\t\2\2\2\u01d3"+
		"\u01d4\7\64\2\2\u01d4\u01d6\t\b\2\2\u01d5\u01d1\3\2\2\2\u01d5\u01d3\3"+
		"\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\7<\2\2\u01d8\u01d9\t\t\2\2\u01d9"+
		"\u01da\t\2\2\2\u01daz\3\2\2\2\u01db\u01dd\t\n\2\2\u01dc\u01db\3\2\2\2"+
		"\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e1\b>\2\2\u01e1|\3\2\2\2\u01e2\u01e6\t\13\2\2\u01e3"+
		"\u01e5\t\f\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7~\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea"+
		"\7\61\2\2\u01ea\u01eb\7\61\2\2\u01eb\u01ef\3\2\2\2\u01ec\u01ee\13\2\2"+
		"\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01f0\3\2\2\2\u01ef\u01ed"+
		"\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f4\7\17\2\2"+
		"\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6"+
		"\7\f\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\b@\3\2\u01f8\u0080\3\2\2\2\u01f9"+
		"\u01fa\7\61\2\2\u01fa\u01fb\7,\2\2\u01fb\u01ff\3\2\2\2\u01fc\u01fe\13"+
		"\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u0200\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7,"+
		"\2\2\u0203\u0204\7\61\2\2\u0204\u0205\3\2\2\2\u0205\u0206\bA\3\2\u0206"+
		"\u0082\3\2\2\2\23\2\u00af\u00ca\u019d\u01a2\u01ad\u01b3\u01b9\u01c0\u01c4"+
		"\u01c9\u01d5\u01de\u01e6\u01ef\u01f3\u01ff\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}