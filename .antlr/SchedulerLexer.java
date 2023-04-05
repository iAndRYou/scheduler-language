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
		CLASSNAME=8, DAYNAME=9, WEEKNAME=10, CLASSESTOKEN=11, DAYSTOKEN=12, MULTIPLY=13, 
		DIVIDE=14, ADD=15, SUBTRACT=16, EQUAL=17, NOT_EQUAL=18, LESS_THAN=19, 
		GREATER_THAN=20, LESS_THAN_OR_EQUAL=21, GREATER_THAN_OR_EQUAL=22, AND=23, 
		OR=24, NOT=25, IN=26, OVERLAP=27, OPEN_PAREN=28, CLOSE_PAREN=29, OPEN_BRACKET=30, 
		CLOSE_BRACKET=31, DOT=32, COMMA=33, COLON=34, SINGLEEQUAL=35, COLLECTION_OF=36, 
		ADD_CANVA=37, UPDATE_CANVA=38, DELETE_CANVA=39, GET_CANVA=40, WHERE=41, 
		SATISFYING=42, AT=43, ON=44, DEF=45, IF=46, ELIF=47, ELSE=48, FOR=49, 
		WHILE=50, RETURN=51, BREAK=52, OPEN_CURLY=53, CLOSE_CURLY=54, DISTINCT=55, 
		PRINT=56, DATESTOKEN=57, INT=58, BOOL=59, STRING=60, DATE=61, TIME=62, 
		WS=63, VARNAME=64, COMMENT_LINE=65, COMMENT=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "CLASS_ATTRIBUTE", "TYPENAME", 
			"CLASSNAME", "DAYNAME", "WEEKNAME", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", 
			"DIVIDE", "ADD", "SUBTRACT", "EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", 
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
			null, "'CLASS'", "'DAY'", "'WEEK'", "'CLASSES'", "'DAYS'", "'*'", "'/'", 
			"'+'", "'-'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'AND'", 
			"'OR'", "'NOT'", "'IN'", "'#'", "'('", "')'", "'['", "']'", "'.'", "','", 
			"':'", "'='", "'COLLECTION OF'", "'ADD'", "'UPDATE'", "'DELETE'", "'GET'", 
			"'WHERE'", "'SATISFYING'", "'AT'", "'ON'", "'DEF'", "'IF'", "'ELIF'", 
			"'ELSE'", "'FOR'", "'WHILE'", "'RETURN'", "'BREAK'", "'{'", "'}'", "'DISTINCT'", 
			"'PRINT'", "'DATES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "CLASS_ATTRIBUTE", "TYPENAME", "CLASSNAME", 
			"DAYNAME", "WEEKNAME", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u0217\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00be\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00d9\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\38\38\38\38\38\39\39\39"+
		"\39\39\39\3:\3:\3:\3:\3:\3:\3;\5;\u01ac\n;\3;\6;\u01af\n;\r;\16;\u01b0"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u01bc\n<\3=\3=\7=\u01c0\n=\f=\16=\u01c3"+
		"\13=\3=\3=\3>\5>\u01c8\n>\3>\3>\3>\3>\3>\5>\u01cf\n>\3>\3>\5>\u01d3\n"+
		">\3>\3>\3>\5>\u01d8\n>\3>\3>\3>\3>\3>\3>\3?\5?\u01e1\n?\3?\3?\3?\5?\u01e6"+
		"\n?\3?\3?\3?\3?\3@\6@\u01ed\n@\r@\16@\u01ee\3@\3@\3A\3A\7A\u01f5\nA\f"+
		"A\16A\u01f8\13A\3B\3B\3B\3B\7B\u01fe\nB\fB\16B\u0201\13B\3B\5B\u0204\n"+
		"B\3B\3B\3B\3B\3C\3C\3C\3C\7C\u020e\nC\fC\16C\u0211\13C\3C\3C\3C\3C\3C"+
		"\5\u01c1\u01ff\u020f\2D\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\3\2\f"+
		"\3\2\62;\3\2\63;\3\2\63\64\3\2\62\63\3\2\62\64\3\2\62\65\3\2\62\67\5\2"+
		"\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\2\u022e\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3"+
		"\2\2\2\5\u0089\3\2\2\2\7\u008e\3\2\2\2\t\u0093\3\2\2\2\13\u009e\3\2\2"+
		"\2\r\u00bd\3\2\2\2\17\u00d8\3\2\2\2\21\u00da\3\2\2\2\23\u00e0\3\2\2\2"+
		"\25\u00e4\3\2\2\2\27\u00e9\3\2\2\2\31\u00f1\3\2\2\2\33\u00f6\3\2\2\2\35"+
		"\u00f8\3\2\2\2\37\u00fa\3\2\2\2!\u00fc\3\2\2\2#\u00fe\3\2\2\2%\u0101\3"+
		"\2\2\2\'\u0104\3\2\2\2)\u0106\3\2\2\2+\u0108\3\2\2\2-\u010b\3\2\2\2/\u010e"+
		"\3\2\2\2\61\u0112\3\2\2\2\63\u0115\3\2\2\2\65\u0119\3\2\2\2\67\u011c\3"+
		"\2\2\29\u011e\3\2\2\2;\u0120\3\2\2\2=\u0122\3\2\2\2?\u0124\3\2\2\2A\u0126"+
		"\3\2\2\2C\u0128\3\2\2\2E\u012a\3\2\2\2G\u012c\3\2\2\2I\u012e\3\2\2\2K"+
		"\u013c\3\2\2\2M\u0140\3\2\2\2O\u0147\3\2\2\2Q\u014e\3\2\2\2S\u0152\3\2"+
		"\2\2U\u0158\3\2\2\2W\u0163\3\2\2\2Y\u0166\3\2\2\2[\u0169\3\2\2\2]\u016d"+
		"\3\2\2\2_\u0170\3\2\2\2a\u0175\3\2\2\2c\u017a\3\2\2\2e\u017e\3\2\2\2g"+
		"\u0184\3\2\2\2i\u018b\3\2\2\2k\u0191\3\2\2\2m\u0193\3\2\2\2o\u0195\3\2"+
		"\2\2q\u019e\3\2\2\2s\u01a4\3\2\2\2u\u01ab\3\2\2\2w\u01bb\3\2\2\2y\u01bd"+
		"\3\2\2\2{\u01ce\3\2\2\2}\u01e5\3\2\2\2\177\u01ec\3\2\2\2\u0081\u01f2\3"+
		"\2\2\2\u0083\u01f9\3\2\2\2\u0085\u0209\3\2\2\2\u0087\u0088\7=\2\2\u0088"+
		"\4\3\2\2\2\u0089\u008a\7N\2\2\u008a\u008b\7Q\2\2\u008b\u008c\7C\2\2\u008c"+
		"\u008d\7F\2\2\u008d\6\3\2\2\2\u008e\u008f\7F\2\2\u008f\u0090\7W\2\2\u0090"+
		"\u0091\7O\2\2\u0091\u0092\7R\2\2\u0092\b\3\2\2\2\u0093\u0094\7U\2\2\u0094"+
		"\u0095\7V\2\2\u0095\u0096\7C\2\2\u0096\u0097\7T\2\2\u0097\u0098\7V\2\2"+
		"\u0098\u0099\7\"\2\2\u0099\u009a\7F\2\2\u009a\u009b\7C\2\2\u009b\u009c"+
		"\7V\2\2\u009c\u009d\7G\2\2\u009d\n\3\2\2\2\u009e\u009f\7G\2\2\u009f\u00a0"+
		"\7P\2\2\u00a0\u00a1\7F\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\7F\2\2\u00a3"+
		"\u00a4\7C\2\2\u00a4\u00a5\7V\2\2\u00a5\u00a6\7G\2\2\u00a6\f\3\2\2\2\u00a7"+
		"\u00a8\7U\2\2\u00a8\u00a9\7V\2\2\u00a9\u00aa\7C\2\2\u00aa\u00ab\7T\2\2"+
		"\u00ab\u00be\7V\2\2\u00ac\u00ad\7G\2\2\u00ad\u00ae\7P\2\2\u00ae\u00be"+
		"\7F\2\2\u00af\u00b0\7U\2\2\u00b0\u00b1\7W\2\2\u00b1\u00b2\7D\2\2\u00b2"+
		"\u00b3\7L\2\2\u00b3\u00b4\7G\2\2\u00b4\u00b5\7E\2\2\u00b5\u00be\7V\2\2"+
		"\u00b6\u00b7\7V\2\2\u00b7\u00b8\7G\2\2\u00b8\u00b9\7C\2\2\u00b9\u00ba"+
		"\7E\2\2\u00ba\u00bb\7J\2\2\u00bb\u00bc\7G\2\2\u00bc\u00be\7T\2\2\u00bd"+
		"\u00a7\3\2\2\2\u00bd\u00ac\3\2\2\2\u00bd\u00af\3\2\2\2\u00bd\u00b6\3\2"+
		"\2\2\u00be\16\3\2\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1\7P\2\2\u00c1\u00d9"+
		"\7V\2\2\u00c2\u00c3\7D\2\2\u00c3\u00c4\7Q\2\2\u00c4\u00c5\7Q\2\2\u00c5"+
		"\u00d9\7N\2\2\u00c6\u00c7\7U\2\2\u00c7\u00c8\7V\2\2\u00c8\u00c9\7T\2\2"+
		"\u00c9\u00ca\7K\2\2\u00ca\u00cb\7P\2\2\u00cb\u00d9\7I\2\2\u00cc\u00cd"+
		"\7F\2\2\u00cd\u00ce\7C\2\2\u00ce\u00cf\7V\2\2\u00cf\u00d9\7G\2\2\u00d0"+
		"\u00d1\7V\2\2\u00d1\u00d2\7K\2\2\u00d2\u00d3\7O\2\2\u00d3\u00d9\7G\2\2"+
		"\u00d4\u00d5\7X\2\2\u00d5\u00d6\7Q\2\2\u00d6\u00d7\7K\2\2\u00d7\u00d9"+
		"\7F\2\2\u00d8\u00bf\3\2\2\2\u00d8\u00c2\3\2\2\2\u00d8\u00c6\3\2\2\2\u00d8"+
		"\u00cc\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\20\3\2\2"+
		"\2\u00da\u00db\7E\2\2\u00db\u00dc\7N\2\2\u00dc\u00dd\7C\2\2\u00dd\u00de"+
		"\7U\2\2\u00de\u00df\7U\2\2\u00df\22\3\2\2\2\u00e0\u00e1\7F\2\2\u00e1\u00e2"+
		"\7C\2\2\u00e2\u00e3\7[\2\2\u00e3\24\3\2\2\2\u00e4\u00e5\7Y\2\2\u00e5\u00e6"+
		"\7G\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7M\2\2\u00e8\26\3\2\2\2\u00e9\u00ea"+
		"\7E\2\2\u00ea\u00eb\7N\2\2\u00eb\u00ec\7C\2\2\u00ec\u00ed\7U\2\2\u00ed"+
		"\u00ee\7U\2\2\u00ee\u00ef\7G\2\2\u00ef\u00f0\7U\2\2\u00f0\30\3\2\2\2\u00f1"+
		"\u00f2\7F\2\2\u00f2\u00f3\7C\2\2\u00f3\u00f4\7[\2\2\u00f4\u00f5\7U\2\2"+
		"\u00f5\32\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7\34\3\2\2\2\u00f8\u00f9\7\61"+
		"\2\2\u00f9\36\3\2\2\2\u00fa\u00fb\7-\2\2\u00fb \3\2\2\2\u00fc\u00fd\7"+
		"/\2\2\u00fd\"\3\2\2\2\u00fe\u00ff\7?\2\2\u00ff\u0100\7?\2\2\u0100$\3\2"+
		"\2\2\u0101\u0102\7#\2\2\u0102\u0103\7?\2\2\u0103&\3\2\2\2\u0104\u0105"+
		"\7>\2\2\u0105(\3\2\2\2\u0106\u0107\7@\2\2\u0107*\3\2\2\2\u0108\u0109\7"+
		">\2\2\u0109\u010a\7?\2\2\u010a,\3\2\2\2\u010b\u010c\7@\2\2\u010c\u010d"+
		"\7?\2\2\u010d.\3\2\2\2\u010e\u010f\7C\2\2\u010f\u0110\7P\2\2\u0110\u0111"+
		"\7F\2\2\u0111\60\3\2\2\2\u0112\u0113\7Q\2\2\u0113\u0114\7T\2\2\u0114\62"+
		"\3\2\2\2\u0115\u0116\7P\2\2\u0116\u0117\7Q\2\2\u0117\u0118\7V\2\2\u0118"+
		"\64\3\2\2\2\u0119\u011a\7K\2\2\u011a\u011b\7P\2\2\u011b\66\3\2\2\2\u011c"+
		"\u011d\7%\2\2\u011d8\3\2\2\2\u011e\u011f\7*\2\2\u011f:\3\2\2\2\u0120\u0121"+
		"\7+\2\2\u0121<\3\2\2\2\u0122\u0123\7]\2\2\u0123>\3\2\2\2\u0124\u0125\7"+
		"_\2\2\u0125@\3\2\2\2\u0126\u0127\7\60\2\2\u0127B\3\2\2\2\u0128\u0129\7"+
		".\2\2\u0129D\3\2\2\2\u012a\u012b\7<\2\2\u012bF\3\2\2\2\u012c\u012d\7?"+
		"\2\2\u012dH\3\2\2\2\u012e\u012f\7E\2\2\u012f\u0130\7Q\2\2\u0130\u0131"+
		"\7N\2\2\u0131\u0132\7N\2\2\u0132\u0133\7G\2\2\u0133\u0134\7E\2\2\u0134"+
		"\u0135\7V\2\2\u0135\u0136\7K\2\2\u0136\u0137\7Q\2\2\u0137\u0138\7P\2\2"+
		"\u0138\u0139\7\"\2\2\u0139\u013a\7Q\2\2\u013a\u013b\7H\2\2\u013bJ\3\2"+
		"\2\2\u013c\u013d\7C\2\2\u013d\u013e\7F\2\2\u013e\u013f\7F\2\2\u013fL\3"+
		"\2\2\2\u0140\u0141\7W\2\2\u0141\u0142\7R\2\2\u0142\u0143\7F\2\2\u0143"+
		"\u0144\7C\2\2\u0144\u0145\7V\2\2\u0145\u0146\7G\2\2\u0146N\3\2\2\2\u0147"+
		"\u0148\7F\2\2\u0148\u0149\7G\2\2\u0149\u014a\7N\2\2\u014a\u014b\7G\2\2"+
		"\u014b\u014c\7V\2\2\u014c\u014d\7G\2\2\u014dP\3\2\2\2\u014e\u014f\7I\2"+
		"\2\u014f\u0150\7G\2\2\u0150\u0151\7V\2\2\u0151R\3\2\2\2\u0152\u0153\7"+
		"Y\2\2\u0153\u0154\7J\2\2\u0154\u0155\7G\2\2\u0155\u0156\7T\2\2\u0156\u0157"+
		"\7G\2\2\u0157T\3\2\2\2\u0158\u0159\7U\2\2\u0159\u015a\7C\2\2\u015a\u015b"+
		"\7V\2\2\u015b\u015c\7K\2\2\u015c\u015d\7U\2\2\u015d\u015e\7H\2\2\u015e"+
		"\u015f\7[\2\2\u015f\u0160\7K\2\2\u0160\u0161\7P\2\2\u0161\u0162\7I\2\2"+
		"\u0162V\3\2\2\2\u0163\u0164\7C\2\2\u0164\u0165\7V\2\2\u0165X\3\2\2\2\u0166"+
		"\u0167\7Q\2\2\u0167\u0168\7P\2\2\u0168Z\3\2\2\2\u0169\u016a\7F\2\2\u016a"+
		"\u016b\7G\2\2\u016b\u016c\7H\2\2\u016c\\\3\2\2\2\u016d\u016e\7K\2\2\u016e"+
		"\u016f\7H\2\2\u016f^\3\2\2\2\u0170\u0171\7G\2\2\u0171\u0172\7N\2\2\u0172"+
		"\u0173\7K\2\2\u0173\u0174\7H\2\2\u0174`\3\2\2\2\u0175\u0176\7G\2\2\u0176"+
		"\u0177\7N\2\2\u0177\u0178\7U\2\2\u0178\u0179\7G\2\2\u0179b\3\2\2\2\u017a"+
		"\u017b\7H\2\2\u017b\u017c\7Q\2\2\u017c\u017d\7T\2\2\u017dd\3\2\2\2\u017e"+
		"\u017f\7Y\2\2\u017f\u0180\7J\2\2\u0180\u0181\7K\2\2\u0181\u0182\7N\2\2"+
		"\u0182\u0183\7G\2\2\u0183f\3\2\2\2\u0184\u0185\7T\2\2\u0185\u0186\7G\2"+
		"\2\u0186\u0187\7V\2\2\u0187\u0188\7W\2\2\u0188\u0189\7T\2\2\u0189\u018a"+
		"\7P\2\2\u018ah\3\2\2\2\u018b\u018c\7D\2\2\u018c\u018d\7T\2\2\u018d\u018e"+
		"\7G\2\2\u018e\u018f\7C\2\2\u018f\u0190\7M\2\2\u0190j\3\2\2\2\u0191\u0192"+
		"\7}\2\2\u0192l\3\2\2\2\u0193\u0194\7\177\2\2\u0194n\3\2\2\2\u0195\u0196"+
		"\7F\2\2\u0196\u0197\7K\2\2\u0197\u0198\7U\2\2\u0198\u0199\7V\2\2\u0199"+
		"\u019a\7K\2\2\u019a\u019b\7P\2\2\u019b\u019c\7E\2\2\u019c\u019d\7V\2\2"+
		"\u019dp\3\2\2\2\u019e\u019f\7R\2\2\u019f\u01a0\7T\2\2\u01a0\u01a1\7K\2"+
		"\2\u01a1\u01a2\7P\2\2\u01a2\u01a3\7V\2\2\u01a3r\3\2\2\2\u01a4\u01a5\7"+
		"F\2\2\u01a5\u01a6\7C\2\2\u01a6\u01a7\7V\2\2\u01a7\u01a8\7G\2\2\u01a8\u01a9"+
		"\7U\2\2\u01a9t\3\2\2\2\u01aa\u01ac\7/\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\t\2\2\2\u01ae\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1v\3\2\2\2"+
		"\u01b2\u01b3\7V\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5\7w\2\2\u01b5\u01bc"+
		"\7g\2\2\u01b6\u01b7\7H\2\2\u01b7\u01b8\7c\2\2\u01b8\u01b9\7n\2\2\u01b9"+
		"\u01ba\7u\2\2\u01ba\u01bc\7g\2\2\u01bb\u01b2\3\2\2\2\u01bb\u01b6\3\2\2"+
		"\2\u01bcx\3\2\2\2\u01bd\u01c1\7$\2\2\u01be\u01c0\13\2\2\2\u01bf\u01be"+
		"\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01c4\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7$\2\2\u01c5z\3\2\2\2\u01c6"+
		"\u01c8\7\62\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3"+
		"\2\2\2\u01c9\u01cf\t\3\2\2\u01ca\u01cb\t\4\2\2\u01cb\u01cf\t\2\2\2\u01cc"+
		"\u01cd\7\65\2\2\u01cd\u01cf\t\5\2\2\u01ce\u01c7\3\2\2\2\u01ce\u01ca\3"+
		"\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d7\7\61\2\2\u01d1"+
		"\u01d3\7\62\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3"+
		"\2\2\2\u01d4\u01d8\t\3\2\2\u01d5\u01d6\7\63\2\2\u01d6\u01d8\t\6\2\2\u01d7"+
		"\u01d2\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\7\61"+
		"\2\2\u01da\u01db\t\2\2\2\u01db\u01dc\t\2\2\2\u01dc\u01dd\t\2\2\2\u01dd"+
		"\u01de\t\2\2\2\u01de|\3\2\2\2\u01df\u01e1\t\5\2\2\u01e0\u01df\3\2\2\2"+
		"\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e6\t\2\2\2\u01e3\u01e4"+
		"\7\64\2\2\u01e4\u01e6\t\7\2\2\u01e5\u01e0\3\2\2\2\u01e5\u01e3\3\2\2\2"+
		"\u01e6\u01e7\3\2\2\2\u01e7\u01e8\7<\2\2\u01e8\u01e9\t\b\2\2\u01e9\u01ea"+
		"\t\2\2\2\u01ea~\3\2\2\2\u01eb\u01ed\t\t\2\2\u01ec\u01eb\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f1\b@\2\2\u01f1\u0080\3\2\2\2\u01f2\u01f6\t\n\2\2\u01f3"+
		"\u01f5\t\13\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3"+
		"\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u0082\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9"+
		"\u01fa\7\61\2\2\u01fa\u01fb\7\61\2\2\u01fb\u01ff\3\2\2\2\u01fc\u01fe\13"+
		"\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u0200\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0204\7\17"+
		"\2\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0206\7\f\2\2\u0206\u0207\3\2\2\2\u0207\u0208\bB\3\2\u0208\u0084\3\2"+
		"\2\2\u0209\u020a\7\61\2\2\u020a\u020b\7,\2\2\u020b\u020f\3\2\2\2\u020c"+
		"\u020e\13\2\2\2\u020d\u020c\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u0210\3"+
		"\2\2\2\u020f\u020d\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212"+
		"\u0213\7,\2\2\u0213\u0214\7\61\2\2\u0214\u0215\3\2\2\2\u0215\u0216\bC"+
		"\3\2\u0216\u0086\3\2\2\2\24\2\u00bd\u00d8\u01ab\u01b0\u01bb\u01c1\u01c7"+
		"\u01ce\u01d2\u01d7\u01e0\u01e5\u01ee\u01f6\u01ff\u0203\u020f\4\b\2\2\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}