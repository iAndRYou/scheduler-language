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
		T__0=1, T__1=2, CLASS_ATTRIBUTE=3, TYPENAME=4, CLASSTOKEN=5, DAYTOKEN=6, 
		WEEKTOKEN=7, CLASSESTOKEN=8, DAYSTOKEN=9, MULTIPLY=10, DIVIDE=11, ADD=12, 
		SUBTRACT=13, EQUAL=14, NOT_EQUAL=15, LESS_THAN=16, GREATER_THAN=17, LESS_THAN_OR_EQUAL=18, 
		GREATER_THAN_OR_EQUAL=19, AND=20, OR=21, NOT=22, IN=23, OVERLAP=24, OPEN_PAREN=25, 
		CLOSE_PAREN=26, OPEN_BRACKET=27, CLOSE_BRACKET=28, DOT=29, COMMA=30, COLON=31, 
		SINGLEEQUAL=32, COLLECTION_OF=33, ADD_CANVA=34, UPDATE_CANVA=35, DELETE_CANVA=36, 
		GET_CANVA=37, WHERE=38, DEF=39, IF=40, FOR=41, WHILE=42, RETURN=43, BREAK=44, 
		OPEN_CURLY=45, CLOSE_CURLY=46, INT=47, BOOL=48, STRING=49, DATE=50, TIME=51, 
		WS=52, VARNAME=53, COMMENT_LINE=54, COMMENT=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "CLASS_ATTRIBUTE", "TYPENAME", "CLASSTOKEN", "DAYTOKEN", 
			"WEEKTOKEN", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", "ADD", 
			"SUBTRACT", "EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUAL", 
			"GREATER_THAN_OR_EQUAL", "AND", "OR", "NOT", "IN", "OVERLAP", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "DOT", "COMMA", "COLON", 
			"SINGLEEQUAL", "COLLECTION_OF", "ADD_CANVA", "UPDATE_CANVA", "DELETE_CANVA", 
			"GET_CANVA", "WHERE", "DEF", "IF", "FOR", "WHILE", "RETURN", "BREAK", 
			"OPEN_CURLY", "CLOSE_CURLY", "INT", "BOOL", "STRING", "DATE", "TIME", 
			"WS", "VARNAME", "COMMENT_LINE", "COMMENT"
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
			"OPEN_CURLY", "CLOSE_CURLY", "INT", "BOOL", "STRING", "DATE", "TIME", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u01b0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\u0090\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a7\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\6\60"+
		"\u014a\n\60\r\60\16\60\u014b\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\5\61\u0157\n\61\3\62\3\62\7\62\u015b\n\62\f\62\16\62\u015e\13\62\3"+
		"\62\3\62\3\63\5\63\u0163\n\63\3\63\3\63\3\63\3\63\3\63\5\63\u016a\n\63"+
		"\3\63\3\63\5\63\u016e\n\63\3\63\3\63\3\63\5\63\u0173\n\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u017f\n\64\3\64\3\64\3\64"+
		"\3\64\3\65\6\65\u0186\n\65\r\65\16\65\u0187\3\65\3\65\3\66\3\66\7\66\u018e"+
		"\n\66\f\66\16\66\u0191\13\66\3\67\3\67\3\67\3\67\7\67\u0197\n\67\f\67"+
		"\16\67\u019a\13\67\3\67\5\67\u019d\n\67\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\78\u01a7\n8\f8\168\u01aa\138\38\38\38\38\38\4\u0198\u01a8\29\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9\3\2\f\3"+
		"\2\62;\5\2\62;C\\c|\3\2\63;\3\2\63\64\3\2\62\63\3\2\62\64\3\2\62\65\3"+
		"\2\62\67\5\2\13\f\17\17\"\"\4\2C\\c|\2\u01c4\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5"+
		"s\3\2\2\2\7\u008f\3\2\2\2\t\u00a6\3\2\2\2\13\u00a8\3\2\2\2\r\u00ae\3\2"+
		"\2\2\17\u00b2\3\2\2\2\21\u00b7\3\2\2\2\23\u00bf\3\2\2\2\25\u00c4\3\2\2"+
		"\2\27\u00c6\3\2\2\2\31\u00c8\3\2\2\2\33\u00ca\3\2\2\2\35\u00cc\3\2\2\2"+
		"\37\u00cf\3\2\2\2!\u00d2\3\2\2\2#\u00d4\3\2\2\2%\u00d6\3\2\2\2\'\u00d9"+
		"\3\2\2\2)\u00dc\3\2\2\2+\u00e0\3\2\2\2-\u00e3\3\2\2\2/\u00e7\3\2\2\2\61"+
		"\u00ea\3\2\2\2\63\u00ec\3\2\2\2\65\u00ee\3\2\2\2\67\u00f0\3\2\2\29\u00f2"+
		"\3\2\2\2;\u00f4\3\2\2\2=\u00f6\3\2\2\2?\u00f8\3\2\2\2A\u00fa\3\2\2\2C"+
		"\u00fc\3\2\2\2E\u010a\3\2\2\2G\u010e\3\2\2\2I\u0115\3\2\2\2K\u011c\3\2"+
		"\2\2M\u0120\3\2\2\2O\u0126\3\2\2\2Q\u012a\3\2\2\2S\u012d\3\2\2\2U\u0131"+
		"\3\2\2\2W\u0137\3\2\2\2Y\u013e\3\2\2\2[\u0144\3\2\2\2]\u0146\3\2\2\2_"+
		"\u0149\3\2\2\2a\u0156\3\2\2\2c\u0158\3\2\2\2e\u0169\3\2\2\2g\u017e\3\2"+
		"\2\2i\u0185\3\2\2\2k\u018b\3\2\2\2m\u0192\3\2\2\2o\u01a2\3\2\2\2qr\7="+
		"\2\2r\4\3\2\2\2st\7F\2\2tu\7C\2\2uv\7V\2\2vw\7G\2\2wx\7U\2\2x\6\3\2\2"+
		"\2yz\7U\2\2z{\7V\2\2{|\7C\2\2|}\7T\2\2}\u0090\7V\2\2~\177\7G\2\2\177\u0080"+
		"\7P\2\2\u0080\u0090\7F\2\2\u0081\u0082\7U\2\2\u0082\u0083\7W\2\2\u0083"+
		"\u0084\7D\2\2\u0084\u0085\7L\2\2\u0085\u0086\7G\2\2\u0086\u0087\7E\2\2"+
		"\u0087\u0090\7V\2\2\u0088\u0089\7V\2\2\u0089\u008a\7G\2\2\u008a\u008b"+
		"\7C\2\2\u008b\u008c\7E\2\2\u008c\u008d\7J\2\2\u008d\u008e\7G\2\2\u008e"+
		"\u0090\7T\2\2\u008fy\3\2\2\2\u008f~\3\2\2\2\u008f\u0081\3\2\2\2\u008f"+
		"\u0088\3\2\2\2\u0090\b\3\2\2\2\u0091\u0092\7K\2\2\u0092\u0093\7P\2\2\u0093"+
		"\u00a7\7V\2\2\u0094\u0095\7D\2\2\u0095\u0096\7Q\2\2\u0096\u0097\7Q\2\2"+
		"\u0097\u00a7\7N\2\2\u0098\u0099\7U\2\2\u0099\u009a\7V\2\2\u009a\u009b"+
		"\7T\2\2\u009b\u009c\7K\2\2\u009c\u009d\7P\2\2\u009d\u00a7\7I\2\2\u009e"+
		"\u009f\7F\2\2\u009f\u00a0\7C\2\2\u00a0\u00a1\7V\2\2\u00a1\u00a7\7G\2\2"+
		"\u00a2\u00a3\7V\2\2\u00a3\u00a4\7K\2\2\u00a4\u00a5\7O\2\2\u00a5\u00a7"+
		"\7G\2\2\u00a6\u0091\3\2\2\2\u00a6\u0094\3\2\2\2\u00a6\u0098\3\2\2\2\u00a6"+
		"\u009e\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\n\3\2\2\2\u00a8\u00a9\7E\2\2"+
		"\u00a9\u00aa\7N\2\2\u00aa\u00ab\7C\2\2\u00ab\u00ac\7U\2\2\u00ac\u00ad"+
		"\7U\2\2\u00ad\f\3\2\2\2\u00ae\u00af\7F\2\2\u00af\u00b0\7C\2\2\u00b0\u00b1"+
		"\7[\2\2\u00b1\16\3\2\2\2\u00b2\u00b3\7Y\2\2\u00b3\u00b4\7G\2\2\u00b4\u00b5"+
		"\7G\2\2\u00b5\u00b6\7M\2\2\u00b6\20\3\2\2\2\u00b7\u00b8\7E\2\2\u00b8\u00b9"+
		"\7N\2\2\u00b9\u00ba\7C\2\2\u00ba\u00bb\7U\2\2\u00bb\u00bc\7U\2\2\u00bc"+
		"\u00bd\7G\2\2\u00bd\u00be\7U\2\2\u00be\22\3\2\2\2\u00bf\u00c0\7F\2\2\u00c0"+
		"\u00c1\7C\2\2\u00c1\u00c2\7[\2\2\u00c2\u00c3\7U\2\2\u00c3\24\3\2\2\2\u00c4"+
		"\u00c5\7,\2\2\u00c5\26\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\30\3\2\2\2\u00c8"+
		"\u00c9\7-\2\2\u00c9\32\3\2\2\2\u00ca\u00cb\7/\2\2\u00cb\34\3\2\2\2\u00cc"+
		"\u00cd\7?\2\2\u00cd\u00ce\7?\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0"+
		"\u00d1\7?\2\2\u00d1 \3\2\2\2\u00d2\u00d3\7>\2\2\u00d3\"\3\2\2\2\u00d4"+
		"\u00d5\7@\2\2\u00d5$\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7\u00d8\7?\2\2\u00d8"+
		"&\3\2\2\2\u00d9\u00da\7@\2\2\u00da\u00db\7?\2\2\u00db(\3\2\2\2\u00dc\u00dd"+
		"\7C\2\2\u00dd\u00de\7P\2\2\u00de\u00df\7F\2\2\u00df*\3\2\2\2\u00e0\u00e1"+
		"\7Q\2\2\u00e1\u00e2\7T\2\2\u00e2,\3\2\2\2\u00e3\u00e4\7P\2\2\u00e4\u00e5"+
		"\7Q\2\2\u00e5\u00e6\7V\2\2\u00e6.\3\2\2\2\u00e7\u00e8\7K\2\2\u00e8\u00e9"+
		"\7P\2\2\u00e9\60\3\2\2\2\u00ea\u00eb\7%\2\2\u00eb\62\3\2\2\2\u00ec\u00ed"+
		"\7*\2\2\u00ed\64\3\2\2\2\u00ee\u00ef\7+\2\2\u00ef\66\3\2\2\2\u00f0\u00f1"+
		"\7]\2\2\u00f18\3\2\2\2\u00f2\u00f3\7_\2\2\u00f3:\3\2\2\2\u00f4\u00f5\7"+
		"\60\2\2\u00f5<\3\2\2\2\u00f6\u00f7\7.\2\2\u00f7>\3\2\2\2\u00f8\u00f9\7"+
		"<\2\2\u00f9@\3\2\2\2\u00fa\u00fb\7?\2\2\u00fbB\3\2\2\2\u00fc\u00fd\7E"+
		"\2\2\u00fd\u00fe\7Q\2\2\u00fe\u00ff\7N\2\2\u00ff\u0100\7N\2\2\u0100\u0101"+
		"\7G\2\2\u0101\u0102\7E\2\2\u0102\u0103\7V\2\2\u0103\u0104\7K\2\2\u0104"+
		"\u0105\7Q\2\2\u0105\u0106\7P\2\2\u0106\u0107\7\"\2\2\u0107\u0108\7Q\2"+
		"\2\u0108\u0109\7H\2\2\u0109D\3\2\2\2\u010a\u010b\7C\2\2\u010b\u010c\7"+
		"F\2\2\u010c\u010d\7F\2\2\u010dF\3\2\2\2\u010e\u010f\7W\2\2\u010f\u0110"+
		"\7R\2\2\u0110\u0111\7F\2\2\u0111\u0112\7C\2\2\u0112\u0113\7V\2\2\u0113"+
		"\u0114\7G\2\2\u0114H\3\2\2\2\u0115\u0116\7F\2\2\u0116\u0117\7G\2\2\u0117"+
		"\u0118\7N\2\2\u0118\u0119\7G\2\2\u0119\u011a\7V\2\2\u011a\u011b\7G\2\2"+
		"\u011bJ\3\2\2\2\u011c\u011d\7I\2\2\u011d\u011e\7G\2\2\u011e\u011f\7V\2"+
		"\2\u011fL\3\2\2\2\u0120\u0121\7Y\2\2\u0121\u0122\7J\2\2\u0122\u0123\7"+
		"G\2\2\u0123\u0124\7T\2\2\u0124\u0125\7G\2\2\u0125N\3\2\2\2\u0126\u0127"+
		"\7F\2\2\u0127\u0128\7G\2\2\u0128\u0129\7H\2\2\u0129P\3\2\2\2\u012a\u012b"+
		"\7K\2\2\u012b\u012c\7H\2\2\u012cR\3\2\2\2\u012d\u012e\7H\2\2\u012e\u012f"+
		"\7Q\2\2\u012f\u0130\7T\2\2\u0130T\3\2\2\2\u0131\u0132\7Y\2\2\u0132\u0133"+
		"\7J\2\2\u0133\u0134\7K\2\2\u0134\u0135\7N\2\2\u0135\u0136\7G\2\2\u0136"+
		"V\3\2\2\2\u0137\u0138\7T\2\2\u0138\u0139\7G\2\2\u0139\u013a\7V\2\2\u013a"+
		"\u013b\7W\2\2\u013b\u013c\7T\2\2\u013c\u013d\7P\2\2\u013dX\3\2\2\2\u013e"+
		"\u013f\7D\2\2\u013f\u0140\7T\2\2\u0140\u0141\7G\2\2\u0141\u0142\7C\2\2"+
		"\u0142\u0143\7M\2\2\u0143Z\3\2\2\2\u0144\u0145\7}\2\2\u0145\\\3\2\2\2"+
		"\u0146\u0147\7\177\2\2\u0147^\3\2\2\2\u0148\u014a\t\2\2\2\u0149\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"`\3\2\2\2\u014d\u014e\7V\2\2\u014e\u014f\7t\2\2\u014f\u0150\7w\2\2\u0150"+
		"\u0157\7g\2\2\u0151\u0152\7H\2\2\u0152\u0153\7c\2\2\u0153\u0154\7n\2\2"+
		"\u0154\u0155\7u\2\2\u0155\u0157\7g\2\2\u0156\u014d\3\2\2\2\u0156\u0151"+
		"\3\2\2\2\u0157b\3\2\2\2\u0158\u015c\7$\2\2\u0159\u015b\t\3\2\2\u015a\u0159"+
		"\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7$\2\2\u0160d\3\2\2\2\u0161"+
		"\u0163\7\62\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3"+
		"\2\2\2\u0164\u016a\t\4\2\2\u0165\u0166\t\5\2\2\u0166\u016a\t\2\2\2\u0167"+
		"\u0168\7\65\2\2\u0168\u016a\t\6\2\2\u0169\u0162\3\2\2\2\u0169\u0165\3"+
		"\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0172\7\61\2\2\u016c"+
		"\u016e\7\62\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016f\u0173\t\4\2\2\u0170\u0171\7\63\2\2\u0171\u0173\t\7\2\2\u0172"+
		"\u016d\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7\61"+
		"\2\2\u0175\u0176\t\2\2\2\u0176\u0177\t\2\2\2\u0177\u0178\t\2\2\2\u0178"+
		"\u0179\t\2\2\2\u0179f\3\2\2\2\u017a\u017b\t\6\2\2\u017b\u017f\t\2\2\2"+
		"\u017c\u017d\7\64\2\2\u017d\u017f\t\b\2\2\u017e\u017a\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7<\2\2\u0181\u0182\t\t\2\2\u0182"+
		"\u0183\t\2\2\2\u0183h\3\2\2\2\u0184\u0186\t\n\2\2\u0185\u0184\3\2\2\2"+
		"\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\b\65\2\2\u018aj\3\2\2\2\u018b\u018f\t\13\2\2\u018c"+
		"\u018e\t\3\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190l\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193"+
		"\7\61\2\2\u0193\u0194\7\61\2\2\u0194\u0198\3\2\2\2\u0195\u0197\13\2\2"+
		"\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0199\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019d\7\17\2\2"+
		"\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f"+
		"\7\f\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\b\67\3\2\u01a1n\3\2\2\2\u01a2"+
		"\u01a3\7\61\2\2\u01a3\u01a4\7,\2\2\u01a4\u01a8\3\2\2\2\u01a5\u01a7\13"+
		"\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7,"+
		"\2\2\u01ac\u01ad\7\61\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\b8\3\2\u01af"+
		"p\3\2\2\2\22\2\u008f\u00a6\u014b\u0156\u015c\u0162\u0169\u016d\u0172\u017e"+
		"\u0187\u018f\u0198\u019c\u01a8\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}