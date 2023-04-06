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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, CLASS_ATTRIBUTE=6, TYPENAME=7, 
		CLASSNAME=8, DAYNAME=9, CLASSESTOKEN=10, DAYSTOKEN=11, MULTIPLY=12, DIVIDE=13, 
		ADD=14, SUBTRACT=15, EQUAL=16, NOT_EQUAL=17, LESS_THAN=18, GREATER_THAN=19, 
		LESS_THAN_OR_EQUAL=20, GREATER_THAN_OR_EQUAL=21, AND=22, OR=23, NOT=24, 
		IN=25, OVERLAP=26, OPEN_PAREN=27, CLOSE_PAREN=28, OPEN_BRACKET=29, CLOSE_BRACKET=30, 
		DOT=31, COMMA=32, COLON=33, SINGLEEQUAL=34, COLLECTION_OF=35, ADD_CANVA=36, 
		UPDATE_CANVA=37, DELETE_CANVA=38, GET_CANVA=39, WHERE=40, SATISFYING=41, 
		AT=42, ON=43, DEF=44, IF=45, ELIF=46, ELSE=47, FOR=48, WHILE=49, RETURN=50, 
		BREAK=51, OPEN_CURLY=52, CLOSE_CURLY=53, DISTINCT=54, PRINT=55, DATESTOKEN=56, 
		INT=57, BOOL=58, STRING=59, DATE=60, TIME=61, WS=62, VARNAME=63, COMMENT_LINE=64, 
		COMMENT=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "CLASS_ATTRIBUTE", "TYPENAME", 
			"CLASSNAME", "DAYNAME", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", 
			"ADD", "SUBTRACT", "EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", 
			"LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", "AND", "OR", "NOT", "IN", 
			"OVERLAP", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"DOT", "COMMA", "COLON", "SINGLEEQUAL", "COLLECTION_OF", "ADD_CANVA", 
			"UPDATE_CANVA", "DELETE_CANVA", "GET_CANVA", "WHERE", "SATISFYING", "AT", 
			"ON", "DEF", "IF", "ELIF", "ELSE", "FOR", "WHILE", "RETURN", "BREAK", 
			"OPEN_CURLY", "CLOSE_CURLY", "DISTINCT", "PRINT", "DATESTOKEN", "INT", 
			"BOOL", "STRING", "DATE", "TIME", "WS", "VARNAME", "COMMENT_LINE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'LOAD'", "'DUMP'", "'START DATE'", "'END DATE'", null, 
			null, "'CLASS'", "'DAY'", "'CLASSES'", "'DAYS'", "'*'", "'/'", "'+'", 
			"'-'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'AND'", "'OR'", 
			"'NOT'", "'IN'", "'@'", "'('", "')'", "'['", "']'", "'.'", "','", "':'", 
			"'='", "'COLLECTION OF'", "'ADD'", "'UPDATE'", "'DELETE'", "'GET'", "'WHERE'", 
			"'SATISFYING'", "'AT'", "'ON'", "'DEF'", "'IF'", "'ELIF'", "'ELSE'", 
			"'FOR'", "'WHILE'", "'RETURN'", "'BREAK'", "'{'", "'}'", "'DISTINCT'", 
			"'PRINT'", "'DATES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "CLASS_ATTRIBUTE", "TYPENAME", "CLASSNAME", 
			"DAYNAME", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", "ADD", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u0210\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bc\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00d7\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39"+
		"\39\39\39\39\39\3:\5:\u01a5\n:\3:\6:\u01a8\n:\r:\16:\u01a9\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\5;\u01b5\n;\3<\3<\7<\u01b9\n<\f<\16<\u01bc\13<\3<\3<"+
		"\3=\5=\u01c1\n=\3=\3=\3=\3=\3=\5=\u01c8\n=\3=\3=\5=\u01cc\n=\3=\3=\3="+
		"\5=\u01d1\n=\3=\3=\3=\3=\3=\3=\3>\5>\u01da\n>\3>\3>\3>\5>\u01df\n>\3>"+
		"\3>\3>\3>\3?\6?\u01e6\n?\r?\16?\u01e7\3?\3?\3@\3@\7@\u01ee\n@\f@\16@\u01f1"+
		"\13@\3A\3A\3A\3A\7A\u01f7\nA\fA\16A\u01fa\13A\3A\5A\u01fd\nA\3A\3A\3A"+
		"\3A\3B\3B\3B\3B\7B\u0207\nB\fB\16B\u020a\13B\3B\3B\3B\3B\3B\5\u01ba\u01f8"+
		"\u0208\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\3\2\f\3\2\62;\3\2\63;\3"+
		"\2\63\64\3\2\62\63\3\2\62\64\3\2\62\65\3\2\62\67\5\2\13\f\17\17\"\"\5"+
		"\2C\\aac|\6\2\62;C\\aac|\2\u0227\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u0087\3\2\2\2\7\u008c\3\2\2"+
		"\2\t\u0091\3\2\2\2\13\u009c\3\2\2\2\r\u00bb\3\2\2\2\17\u00d6\3\2\2\2\21"+
		"\u00d8\3\2\2\2\23\u00de\3\2\2\2\25\u00e2\3\2\2\2\27\u00ea\3\2\2\2\31\u00ef"+
		"\3\2\2\2\33\u00f1\3\2\2\2\35\u00f3\3\2\2\2\37\u00f5\3\2\2\2!\u00f7\3\2"+
		"\2\2#\u00fa\3\2\2\2%\u00fd\3\2\2\2\'\u00ff\3\2\2\2)\u0101\3\2\2\2+\u0104"+
		"\3\2\2\2-\u0107\3\2\2\2/\u010b\3\2\2\2\61\u010e\3\2\2\2\63\u0112\3\2\2"+
		"\2\65\u0115\3\2\2\2\67\u0117\3\2\2\29\u0119\3\2\2\2;\u011b\3\2\2\2=\u011d"+
		"\3\2\2\2?\u011f\3\2\2\2A\u0121\3\2\2\2C\u0123\3\2\2\2E\u0125\3\2\2\2G"+
		"\u0127\3\2\2\2I\u0135\3\2\2\2K\u0139\3\2\2\2M\u0140\3\2\2\2O\u0147\3\2"+
		"\2\2Q\u014b\3\2\2\2S\u0151\3\2\2\2U\u015c\3\2\2\2W\u015f\3\2\2\2Y\u0162"+
		"\3\2\2\2[\u0166\3\2\2\2]\u0169\3\2\2\2_\u016e\3\2\2\2a\u0173\3\2\2\2c"+
		"\u0177\3\2\2\2e\u017d\3\2\2\2g\u0184\3\2\2\2i\u018a\3\2\2\2k\u018c\3\2"+
		"\2\2m\u018e\3\2\2\2o\u0197\3\2\2\2q\u019d\3\2\2\2s\u01a4\3\2\2\2u\u01b4"+
		"\3\2\2\2w\u01b6\3\2\2\2y\u01c7\3\2\2\2{\u01de\3\2\2\2}\u01e5\3\2\2\2\177"+
		"\u01eb\3\2\2\2\u0081\u01f2\3\2\2\2\u0083\u0202\3\2\2\2\u0085\u0086\7="+
		"\2\2\u0086\4\3\2\2\2\u0087\u0088\7N\2\2\u0088\u0089\7Q\2\2\u0089\u008a"+
		"\7C\2\2\u008a\u008b\7F\2\2\u008b\6\3\2\2\2\u008c\u008d\7F\2\2\u008d\u008e"+
		"\7W\2\2\u008e\u008f\7O\2\2\u008f\u0090\7R\2\2\u0090\b\3\2\2\2\u0091\u0092"+
		"\7U\2\2\u0092\u0093\7V\2\2\u0093\u0094\7C\2\2\u0094\u0095\7T\2\2\u0095"+
		"\u0096\7V\2\2\u0096\u0097\7\"\2\2\u0097\u0098\7F\2\2\u0098\u0099\7C\2"+
		"\2\u0099\u009a\7V\2\2\u009a\u009b\7G\2\2\u009b\n\3\2\2\2\u009c\u009d\7"+
		"G\2\2\u009d\u009e\7P\2\2\u009e\u009f\7F\2\2\u009f\u00a0\7\"\2\2\u00a0"+
		"\u00a1\7F\2\2\u00a1\u00a2\7C\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4\7G\2\2"+
		"\u00a4\f\3\2\2\2\u00a5\u00a6\7U\2\2\u00a6\u00a7\7V\2\2\u00a7\u00a8\7C"+
		"\2\2\u00a8\u00a9\7T\2\2\u00a9\u00bc\7V\2\2\u00aa\u00ab\7G\2\2\u00ab\u00ac"+
		"\7P\2\2\u00ac\u00bc\7F\2\2\u00ad\u00ae\7U\2\2\u00ae\u00af\7W\2\2\u00af"+
		"\u00b0\7D\2\2\u00b0\u00b1\7L\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b3\7E\2\2"+
		"\u00b3\u00bc\7V\2\2\u00b4\u00b5\7V\2\2\u00b5\u00b6\7G\2\2\u00b6\u00b7"+
		"\7C\2\2\u00b7\u00b8\7E\2\2\u00b8\u00b9\7J\2\2\u00b9\u00ba\7G\2\2\u00ba"+
		"\u00bc\7T\2\2\u00bb\u00a5\3\2\2\2\u00bb\u00aa\3\2\2\2\u00bb\u00ad\3\2"+
		"\2\2\u00bb\u00b4\3\2\2\2\u00bc\16\3\2\2\2\u00bd\u00be\7K\2\2\u00be\u00bf"+
		"\7P\2\2\u00bf\u00d7\7V\2\2\u00c0\u00c1\7D\2\2\u00c1\u00c2\7Q\2\2\u00c2"+
		"\u00c3\7Q\2\2\u00c3\u00d7\7N\2\2\u00c4\u00c5\7U\2\2\u00c5\u00c6\7V\2\2"+
		"\u00c6\u00c7\7T\2\2\u00c7\u00c8\7K\2\2\u00c8\u00c9\7P\2\2\u00c9\u00d7"+
		"\7I\2\2\u00ca\u00cb\7F\2\2\u00cb\u00cc\7C\2\2\u00cc\u00cd\7V\2\2\u00cd"+
		"\u00d7\7G\2\2\u00ce\u00cf\7V\2\2\u00cf\u00d0\7K\2\2\u00d0\u00d1\7O\2\2"+
		"\u00d1\u00d7\7G\2\2\u00d2\u00d3\7X\2\2\u00d3\u00d4\7Q\2\2\u00d4\u00d5"+
		"\7K\2\2\u00d5\u00d7\7F\2\2\u00d6\u00bd\3\2\2\2\u00d6\u00c0\3\2\2\2\u00d6"+
		"\u00c4\3\2\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d2\3\2"+
		"\2\2\u00d7\20\3\2\2\2\u00d8\u00d9\7E\2\2\u00d9\u00da\7N\2\2\u00da\u00db"+
		"\7C\2\2\u00db\u00dc\7U\2\2\u00dc\u00dd\7U\2\2\u00dd\22\3\2\2\2\u00de\u00df"+
		"\7F\2\2\u00df\u00e0\7C\2\2\u00e0\u00e1\7[\2\2\u00e1\24\3\2\2\2\u00e2\u00e3"+
		"\7E\2\2\u00e3\u00e4\7N\2\2\u00e4\u00e5\7C\2\2\u00e5\u00e6\7U\2\2\u00e6"+
		"\u00e7\7U\2\2\u00e7\u00e8\7G\2\2\u00e8\u00e9\7U\2\2\u00e9\26\3\2\2\2\u00ea"+
		"\u00eb\7F\2\2\u00eb\u00ec\7C\2\2\u00ec\u00ed\7[\2\2\u00ed\u00ee\7U\2\2"+
		"\u00ee\30\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0\32\3\2\2\2\u00f1\u00f2\7\61"+
		"\2\2\u00f2\34\3\2\2\2\u00f3\u00f4\7-\2\2\u00f4\36\3\2\2\2\u00f5\u00f6"+
		"\7/\2\2\u00f6 \3\2\2\2\u00f7\u00f8\7?\2\2\u00f8\u00f9\7?\2\2\u00f9\"\3"+
		"\2\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fc\7?\2\2\u00fc$\3\2\2\2\u00fd\u00fe"+
		"\7>\2\2\u00fe&\3\2\2\2\u00ff\u0100\7@\2\2\u0100(\3\2\2\2\u0101\u0102\7"+
		">\2\2\u0102\u0103\7?\2\2\u0103*\3\2\2\2\u0104\u0105\7@\2\2\u0105\u0106"+
		"\7?\2\2\u0106,\3\2\2\2\u0107\u0108\7C\2\2\u0108\u0109\7P\2\2\u0109\u010a"+
		"\7F\2\2\u010a.\3\2\2\2\u010b\u010c\7Q\2\2\u010c\u010d\7T\2\2\u010d\60"+
		"\3\2\2\2\u010e\u010f\7P\2\2\u010f\u0110\7Q\2\2\u0110\u0111\7V\2\2\u0111"+
		"\62\3\2\2\2\u0112\u0113\7K\2\2\u0113\u0114\7P\2\2\u0114\64\3\2\2\2\u0115"+
		"\u0116\7B\2\2\u0116\66\3\2\2\2\u0117\u0118\7*\2\2\u01188\3\2\2\2\u0119"+
		"\u011a\7+\2\2\u011a:\3\2\2\2\u011b\u011c\7]\2\2\u011c<\3\2\2\2\u011d\u011e"+
		"\7_\2\2\u011e>\3\2\2\2\u011f\u0120\7\60\2\2\u0120@\3\2\2\2\u0121\u0122"+
		"\7.\2\2\u0122B\3\2\2\2\u0123\u0124\7<\2\2\u0124D\3\2\2\2\u0125\u0126\7"+
		"?\2\2\u0126F\3\2\2\2\u0127\u0128\7E\2\2\u0128\u0129\7Q\2\2\u0129\u012a"+
		"\7N\2\2\u012a\u012b\7N\2\2\u012b\u012c\7G\2\2\u012c\u012d\7E\2\2\u012d"+
		"\u012e\7V\2\2\u012e\u012f\7K\2\2\u012f\u0130\7Q\2\2\u0130\u0131\7P\2\2"+
		"\u0131\u0132\7\"\2\2\u0132\u0133\7Q\2\2\u0133\u0134\7H\2\2\u0134H\3\2"+
		"\2\2\u0135\u0136\7C\2\2\u0136\u0137\7F\2\2\u0137\u0138\7F\2\2\u0138J\3"+
		"\2\2\2\u0139\u013a\7W\2\2\u013a\u013b\7R\2\2\u013b\u013c\7F\2\2\u013c"+
		"\u013d\7C\2\2\u013d\u013e\7V\2\2\u013e\u013f\7G\2\2\u013fL\3\2\2\2\u0140"+
		"\u0141\7F\2\2\u0141\u0142\7G\2\2\u0142\u0143\7N\2\2\u0143\u0144\7G\2\2"+
		"\u0144\u0145\7V\2\2\u0145\u0146\7G\2\2\u0146N\3\2\2\2\u0147\u0148\7I\2"+
		"\2\u0148\u0149\7G\2\2\u0149\u014a\7V\2\2\u014aP\3\2\2\2\u014b\u014c\7"+
		"Y\2\2\u014c\u014d\7J\2\2\u014d\u014e\7G\2\2\u014e\u014f\7T\2\2\u014f\u0150"+
		"\7G\2\2\u0150R\3\2\2\2\u0151\u0152\7U\2\2\u0152\u0153\7C\2\2\u0153\u0154"+
		"\7V\2\2\u0154\u0155\7K\2\2\u0155\u0156\7U\2\2\u0156\u0157\7H\2\2\u0157"+
		"\u0158\7[\2\2\u0158\u0159\7K\2\2\u0159\u015a\7P\2\2\u015a\u015b\7I\2\2"+
		"\u015bT\3\2\2\2\u015c\u015d\7C\2\2\u015d\u015e\7V\2\2\u015eV\3\2\2\2\u015f"+
		"\u0160\7Q\2\2\u0160\u0161\7P\2\2\u0161X\3\2\2\2\u0162\u0163\7F\2\2\u0163"+
		"\u0164\7G\2\2\u0164\u0165\7H\2\2\u0165Z\3\2\2\2\u0166\u0167\7K\2\2\u0167"+
		"\u0168\7H\2\2\u0168\\\3\2\2\2\u0169\u016a\7G\2\2\u016a\u016b\7N\2\2\u016b"+
		"\u016c\7K\2\2\u016c\u016d\7H\2\2\u016d^\3\2\2\2\u016e\u016f\7G\2\2\u016f"+
		"\u0170\7N\2\2\u0170\u0171\7U\2\2\u0171\u0172\7G\2\2\u0172`\3\2\2\2\u0173"+
		"\u0174\7H\2\2\u0174\u0175\7Q\2\2\u0175\u0176\7T\2\2\u0176b\3\2\2\2\u0177"+
		"\u0178\7Y\2\2\u0178\u0179\7J\2\2\u0179\u017a\7K\2\2\u017a\u017b\7N\2\2"+
		"\u017b\u017c\7G\2\2\u017cd\3\2\2\2\u017d\u017e\7T\2\2\u017e\u017f\7G\2"+
		"\2\u017f\u0180\7V\2\2\u0180\u0181\7W\2\2\u0181\u0182\7T\2\2\u0182\u0183"+
		"\7P\2\2\u0183f\3\2\2\2\u0184\u0185\7D\2\2\u0185\u0186\7T\2\2\u0186\u0187"+
		"\7G\2\2\u0187\u0188\7C\2\2\u0188\u0189\7M\2\2\u0189h\3\2\2\2\u018a\u018b"+
		"\7}\2\2\u018bj\3\2\2\2\u018c\u018d\7\177\2\2\u018dl\3\2\2\2\u018e\u018f"+
		"\7F\2\2\u018f\u0190\7K\2\2\u0190\u0191\7U\2\2\u0191\u0192\7V\2\2\u0192"+
		"\u0193\7K\2\2\u0193\u0194\7P\2\2\u0194\u0195\7E\2\2\u0195\u0196\7V\2\2"+
		"\u0196n\3\2\2\2\u0197\u0198\7R\2\2\u0198\u0199\7T\2\2\u0199\u019a\7K\2"+
		"\2\u019a\u019b\7P\2\2\u019b\u019c\7V\2\2\u019cp\3\2\2\2\u019d\u019e\7"+
		"F\2\2\u019e\u019f\7C\2\2\u019f\u01a0\7V\2\2\u01a0\u01a1\7G\2\2\u01a1\u01a2"+
		"\7U\2\2\u01a2r\3\2\2\2\u01a3\u01a5\7/\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a8\t\2\2\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aat\3\2\2\2"+
		"\u01ab\u01ac\7V\2\2\u01ac\u01ad\7t\2\2\u01ad\u01ae\7w\2\2\u01ae\u01b5"+
		"\7g\2\2\u01af\u01b0\7H\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7n\2\2\u01b2"+
		"\u01b3\7u\2\2\u01b3\u01b5\7g\2\2\u01b4\u01ab\3\2\2\2\u01b4\u01af\3\2\2"+
		"\2\u01b5v\3\2\2\2\u01b6\u01ba\7$\2\2\u01b7\u01b9\13\2\2\2\u01b8\u01b7"+
		"\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\7$\2\2\u01bex\3\2\2\2\u01bf"+
		"\u01c1\7\62\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3"+
		"\2\2\2\u01c2\u01c8\t\3\2\2\u01c3\u01c4\t\4\2\2\u01c4\u01c8\t\2\2\2\u01c5"+
		"\u01c6\7\65\2\2\u01c6\u01c8\t\5\2\2\u01c7\u01c0\3\2\2\2\u01c7\u01c3\3"+
		"\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01d0\7\61\2\2\u01ca"+
		"\u01cc\7\62\2\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3"+
		"\2\2\2\u01cd\u01d1\t\3\2\2\u01ce\u01cf\7\63\2\2\u01cf\u01d1\t\6\2\2\u01d0"+
		"\u01cb\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\7\61"+
		"\2\2\u01d3\u01d4\t\2\2\2\u01d4\u01d5\t\2\2\2\u01d5\u01d6\t\2\2\2\u01d6"+
		"\u01d7\t\2\2\2\u01d7z\3\2\2\2\u01d8\u01da\t\5\2\2\u01d9\u01d8\3\2\2\2"+
		"\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01df\t\2\2\2\u01dc\u01dd"+
		"\7\64\2\2\u01dd\u01df\t\7\2\2\u01de\u01d9\3\2\2\2\u01de\u01dc\3\2\2\2"+
		"\u01df\u01e0\3\2\2\2\u01e0\u01e1\7<\2\2\u01e1\u01e2\t\b\2\2\u01e2\u01e3"+
		"\t\2\2\2\u01e3|\3\2\2\2\u01e4\u01e6\t\t\2\2\u01e5\u01e4\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e9\u01ea\b?\2\2\u01ea~\3\2\2\2\u01eb\u01ef\t\n\2\2\u01ec\u01ee"+
		"\t\13\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2"+
		"\u01ef\u01f0\3\2\2\2\u01f0\u0080\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3"+
		"\7\61\2\2\u01f3\u01f4\7\61\2\2\u01f4\u01f8\3\2\2\2\u01f5\u01f7\13\2\2"+
		"\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fd\7\17\2\2"+
		"\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff"+
		"\7\f\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\bA\3\2\u0201\u0082\3\2\2\2\u0202"+
		"\u0203\7\61\2\2\u0203\u0204\7,\2\2\u0204\u0208\3\2\2\2\u0205\u0207\13"+
		"\2\2\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0209\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c\7,"+
		"\2\2\u020c\u020d\7\61\2\2\u020d\u020e\3\2\2\2\u020e\u020f\bB\3\2\u020f"+
		"\u0084\3\2\2\2\24\2\u00bb\u00d6\u01a4\u01a9\u01b4\u01ba\u01c0\u01c7\u01cb"+
		"\u01d0\u01d9\u01de\u01e7\u01ef\u01f8\u01fc\u0208\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}