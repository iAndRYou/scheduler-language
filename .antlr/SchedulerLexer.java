// Generated from d:\KTK\scheduler-language\Scheduler.g4 by ANTLR 4.9.2
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
		WEEKTOKEN=7, VARNAME=8, CLASSESTOKEN=9, DAYSTOKEN=10, MULTIPLY=11, DIVIDE=12, 
		ADD=13, SUBTRACT=14, EQUAL=15, NOT_EQUAL=16, LESS_THAN=17, GREATER_THAN=18, 
		LESS_THAN_OR_EQUAL=19, GREATER_THAN_OR_EQUAL=20, AND=21, OR=22, NOT=23, 
		IN=24, OVERLAP=25, OPEN_PAREN=26, CLOSE_PAREN=27, OPEN_BRACKET=28, CLOSE_BRACKET=29, 
		DOT=30, COMMA=31, COLON=32, SINGLEEQUAL=33, COLLECTION_OF=34, ADD_CANVA=35, 
		UPDATE_CANVA=36, DELETE_CANVA=37, GET_CANVA=38, WHERE=39, DEF=40, IF=41, 
		FOR=42, WHILE=43, RETURN=44, BREAK=45, CURLY_OPEN=46, CURLY_CLOSE=47, 
		INT=48, BOOL=49, STRING=50, DATE=51, TIME=52, WS=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "CLASS_ATTRIBUTE", "TYPENAME", "CLASSTOKEN", "DAYTOKEN", 
			"WEEKTOKEN", "VARNAME", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", 
			"ADD", "SUBTRACT", "EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", 
			"LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", "AND", "OR", "NOT", "IN", 
			"OVERLAP", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"DOT", "COMMA", "COLON", "SINGLEEQUAL", "COLLECTION_OF", "ADD_CANVA", 
			"UPDATE_CANVA", "DELETE_CANVA", "GET_CANVA", "WHERE", "DEF", "IF", "FOR", 
			"WHILE", "RETURN", "BREAK", "CURLY_OPEN", "CURLY_CLOSE", "INT", "BOOL", 
			"STRING", "DATE", "TIME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'DATES'", null, null, "'CLASS'", "'DAY'", "'WEEK'", null, 
			"'CLASSES'", "'DAYS'", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'AND'", "'OR'", "'NOT'", "'IN'", "'#'", "'('", 
			"')'", "'['", "']'", "'.'", "','", "':'", "'='", "'COLLECTION OF'", "'ADD'", 
			"'UPDATE'", "'DELETE'", "'GET'", "'WHERE'", "'DEF'", "'IF'", "'FOR'", 
			"'WHILE'", "'RETURN'", "'BREAK'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "CLASS_ATTRIBUTE", "TYPENAME", "CLASSTOKEN", "DAYTOKEN", 
			"WEEKTOKEN", "VARNAME", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", 
			"ADD", "SUBTRACT", "EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", 
			"LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", "AND", "OR", "NOT", "IN", 
			"OVERLAP", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"DOT", "COMMA", "COLON", "SINGLEEQUAL", "COLLECTION_OF", "ADD_CANVA", 
			"UPDATE_CANVA", "DELETE_CANVA", "GET_CANVA", "WHERE", "DEF", "IF", "FOR", 
			"WHILE", "RETURN", "BREAK", "CURLY_OPEN", "CURLY_CLOSE", "INT", "BOOL", 
			"STRING", "DATE", "TIME", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u018c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u008c\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a3\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\6\t\u00b5\n\t\r\t\16\t\u00b6"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\6\61\u014b\n\61\r\61\16\61\u014c\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u0158\n\62\3\63\3\63\7\63\u015c\n\63\f\63\16\63"+
		"\u015f\13\63\3\63\3\63\3\64\5\64\u0164\n\64\3\64\3\64\3\64\3\64\3\64\5"+
		"\64\u016b\n\64\3\64\3\64\5\64\u016f\n\64\3\64\3\64\3\64\5\64\u0174\n\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u0180\n\65\3\65"+
		"\3\65\3\65\3\65\3\66\6\66\u0187\n\66\r\66\16\66\u0188\3\66\3\66\2\2\67"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67\3\2"+
		"\f\4\2C\\c|\3\2\62;\5\2\62;C\\c|\3\2\63;\3\2\63\64\3\2\62\63\3\2\62\64"+
		"\3\2\62\65\3\2\62\67\5\2\13\f\17\17\"\"\2\u019d\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7\u008b"+
		"\3\2\2\2\t\u00a2\3\2\2\2\13\u00a4\3\2\2\2\r\u00aa\3\2\2\2\17\u00ae\3\2"+
		"\2\2\21\u00b4\3\2\2\2\23\u00b8\3\2\2\2\25\u00c0\3\2\2\2\27\u00c5\3\2\2"+
		"\2\31\u00c7\3\2\2\2\33\u00c9\3\2\2\2\35\u00cb\3\2\2\2\37\u00cd\3\2\2\2"+
		"!\u00d0\3\2\2\2#\u00d3\3\2\2\2%\u00d5\3\2\2\2\'\u00d7\3\2\2\2)\u00da\3"+
		"\2\2\2+\u00dd\3\2\2\2-\u00e1\3\2\2\2/\u00e4\3\2\2\2\61\u00e8\3\2\2\2\63"+
		"\u00eb\3\2\2\2\65\u00ed\3\2\2\2\67\u00ef\3\2\2\29\u00f1\3\2\2\2;\u00f3"+
		"\3\2\2\2=\u00f5\3\2\2\2?\u00f7\3\2\2\2A\u00f9\3\2\2\2C\u00fb\3\2\2\2E"+
		"\u00fd\3\2\2\2G\u010b\3\2\2\2I\u010f\3\2\2\2K\u0116\3\2\2\2M\u011d\3\2"+
		"\2\2O\u0121\3\2\2\2Q\u0127\3\2\2\2S\u012b\3\2\2\2U\u012e\3\2\2\2W\u0132"+
		"\3\2\2\2Y\u0138\3\2\2\2[\u013f\3\2\2\2]\u0145\3\2\2\2_\u0147\3\2\2\2a"+
		"\u014a\3\2\2\2c\u0157\3\2\2\2e\u0159\3\2\2\2g\u016a\3\2\2\2i\u017f\3\2"+
		"\2\2k\u0186\3\2\2\2mn\7=\2\2n\4\3\2\2\2op\7F\2\2pq\7C\2\2qr\7V\2\2rs\7"+
		"G\2\2st\7U\2\2t\6\3\2\2\2uv\7U\2\2vw\7V\2\2wx\7C\2\2xy\7T\2\2y\u008c\7"+
		"V\2\2z{\7G\2\2{|\7P\2\2|\u008c\7F\2\2}~\7U\2\2~\177\7W\2\2\177\u0080\7"+
		"D\2\2\u0080\u0081\7L\2\2\u0081\u0082\7G\2\2\u0082\u0083\7E\2\2\u0083\u008c"+
		"\7V\2\2\u0084\u0085\7V\2\2\u0085\u0086\7G\2\2\u0086\u0087\7C\2\2\u0087"+
		"\u0088\7E\2\2\u0088\u0089\7J\2\2\u0089\u008a\7G\2\2\u008a\u008c\7T\2\2"+
		"\u008bu\3\2\2\2\u008bz\3\2\2\2\u008b}\3\2\2\2\u008b\u0084\3\2\2\2\u008c"+
		"\b\3\2\2\2\u008d\u008e\7K\2\2\u008e\u008f\7P\2\2\u008f\u00a3\7V\2\2\u0090"+
		"\u0091\7D\2\2\u0091\u0092\7Q\2\2\u0092\u0093\7Q\2\2\u0093\u00a3\7N\2\2"+
		"\u0094\u0095\7U\2\2\u0095\u0096\7V\2\2\u0096\u0097\7T\2\2\u0097\u0098"+
		"\7K\2\2\u0098\u0099\7P\2\2\u0099\u00a3\7I\2\2\u009a\u009b\7F\2\2\u009b"+
		"\u009c\7C\2\2\u009c\u009d\7V\2\2\u009d\u00a3\7G\2\2\u009e\u009f\7V\2\2"+
		"\u009f\u00a0\7K\2\2\u00a0\u00a1\7O\2\2\u00a1\u00a3\7G\2\2\u00a2\u008d"+
		"\3\2\2\2\u00a2\u0090\3\2\2\2\u00a2\u0094\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2"+
		"\u009e\3\2\2\2\u00a3\n\3\2\2\2\u00a4\u00a5\7E\2\2\u00a5\u00a6\7N\2\2\u00a6"+
		"\u00a7\7C\2\2\u00a7\u00a8\7U\2\2\u00a8\u00a9\7U\2\2\u00a9\f\3\2\2\2\u00aa"+
		"\u00ab\7F\2\2\u00ab\u00ac\7C\2\2\u00ac\u00ad\7[\2\2\u00ad\16\3\2\2\2\u00ae"+
		"\u00af\7Y\2\2\u00af\u00b0\7G\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2\7M\2\2"+
		"\u00b2\20\3\2\2\2\u00b3\u00b5\t\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\22\3\2\2\2\u00b8"+
		"\u00b9\7E\2\2\u00b9\u00ba\7N\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bc\7U\2\2"+
		"\u00bc\u00bd\7U\2\2\u00bd\u00be\7G\2\2\u00be\u00bf\7U\2\2\u00bf\24\3\2"+
		"\2\2\u00c0\u00c1\7F\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3\7[\2\2\u00c3\u00c4"+
		"\7U\2\2\u00c4\26\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6\30\3\2\2\2\u00c7\u00c8"+
		"\7\61\2\2\u00c8\32\3\2\2\2\u00c9\u00ca\7-\2\2\u00ca\34\3\2\2\2\u00cb\u00cc"+
		"\7/\2\2\u00cc\36\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce\u00cf\7?\2\2\u00cf "+
		"\3\2\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d2\7?\2\2\u00d2\"\3\2\2\2\u00d3\u00d4"+
		"\7>\2\2\u00d4$\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6&\3\2\2\2\u00d7\u00d8\7"+
		">\2\2\u00d8\u00d9\7?\2\2\u00d9(\3\2\2\2\u00da\u00db\7@\2\2\u00db\u00dc"+
		"\7?\2\2\u00dc*\3\2\2\2\u00dd\u00de\7C\2\2\u00de\u00df\7P\2\2\u00df\u00e0"+
		"\7F\2\2\u00e0,\3\2\2\2\u00e1\u00e2\7Q\2\2\u00e2\u00e3\7T\2\2\u00e3.\3"+
		"\2\2\2\u00e4\u00e5\7P\2\2\u00e5\u00e6\7Q\2\2\u00e6\u00e7\7V\2\2\u00e7"+
		"\60\3\2\2\2\u00e8\u00e9\7K\2\2\u00e9\u00ea\7P\2\2\u00ea\62\3\2\2\2\u00eb"+
		"\u00ec\7%\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee\66\3\2\2\2\u00ef"+
		"\u00f0\7+\2\2\u00f08\3\2\2\2\u00f1\u00f2\7]\2\2\u00f2:\3\2\2\2\u00f3\u00f4"+
		"\7_\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7\60\2\2\u00f6>\3\2\2\2\u00f7\u00f8"+
		"\7.\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7<\2\2\u00faB\3\2\2\2\u00fb\u00fc\7"+
		"?\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7E\2\2\u00fe\u00ff\7Q\2\2\u00ff\u0100"+
		"\7N\2\2\u0100\u0101\7N\2\2\u0101\u0102\7G\2\2\u0102\u0103\7E\2\2\u0103"+
		"\u0104\7V\2\2\u0104\u0105\7K\2\2\u0105\u0106\7Q\2\2\u0106\u0107\7P\2\2"+
		"\u0107\u0108\7\"\2\2\u0108\u0109\7Q\2\2\u0109\u010a\7H\2\2\u010aF\3\2"+
		"\2\2\u010b\u010c\7C\2\2\u010c\u010d\7F\2\2\u010d\u010e\7F\2\2\u010eH\3"+
		"\2\2\2\u010f\u0110\7W\2\2\u0110\u0111\7R\2\2\u0111\u0112\7F\2\2\u0112"+
		"\u0113\7C\2\2\u0113\u0114\7V\2\2\u0114\u0115\7G\2\2\u0115J\3\2\2\2\u0116"+
		"\u0117\7F\2\2\u0117\u0118\7G\2\2\u0118\u0119\7N\2\2\u0119\u011a\7G\2\2"+
		"\u011a\u011b\7V\2\2\u011b\u011c\7G\2\2\u011cL\3\2\2\2\u011d\u011e\7I\2"+
		"\2\u011e\u011f\7G\2\2\u011f\u0120\7V\2\2\u0120N\3\2\2\2\u0121\u0122\7"+
		"Y\2\2\u0122\u0123\7J\2\2\u0123\u0124\7G\2\2\u0124\u0125\7T\2\2\u0125\u0126"+
		"\7G\2\2\u0126P\3\2\2\2\u0127\u0128\7F\2\2\u0128\u0129\7G\2\2\u0129\u012a"+
		"\7H\2\2\u012aR\3\2\2\2\u012b\u012c\7K\2\2\u012c\u012d\7H\2\2\u012dT\3"+
		"\2\2\2\u012e\u012f\7H\2\2\u012f\u0130\7Q\2\2\u0130\u0131\7T\2\2\u0131"+
		"V\3\2\2\2\u0132\u0133\7Y\2\2\u0133\u0134\7J\2\2\u0134\u0135\7K\2\2\u0135"+
		"\u0136\7N\2\2\u0136\u0137\7G\2\2\u0137X\3\2\2\2\u0138\u0139\7T\2\2\u0139"+
		"\u013a\7G\2\2\u013a\u013b\7V\2\2\u013b\u013c\7W\2\2\u013c\u013d\7T\2\2"+
		"\u013d\u013e\7P\2\2\u013eZ\3\2\2\2\u013f\u0140\7D\2\2\u0140\u0141\7T\2"+
		"\2\u0141\u0142\7G\2\2\u0142\u0143\7C\2\2\u0143\u0144\7M\2\2\u0144\\\3"+
		"\2\2\2\u0145\u0146\7}\2\2\u0146^\3\2\2\2\u0147\u0148\7\177\2\2\u0148`"+
		"\3\2\2\2\u0149\u014b\t\3\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014db\3\2\2\2\u014e\u014f\7V\2\2\u014f"+
		"\u0150\7t\2\2\u0150\u0151\7w\2\2\u0151\u0158\7g\2\2\u0152\u0153\7H\2\2"+
		"\u0153\u0154\7c\2\2\u0154\u0155\7n\2\2\u0155\u0156\7u\2\2\u0156\u0158"+
		"\7g\2\2\u0157\u014e\3\2\2\2\u0157\u0152\3\2\2\2\u0158d\3\2\2\2\u0159\u015d"+
		"\7$\2\2\u015a\u015c\t\4\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0161\7$\2\2\u0161f\3\2\2\2\u0162\u0164\7\62\2\2\u0163\u0162"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u016b\t\5\2\2\u0166"+
		"\u0167\t\6\2\2\u0167\u016b\t\3\2\2\u0168\u0169\7\65\2\2\u0169\u016b\t"+
		"\7\2\2\u016a\u0163\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u0173\7\61\2\2\u016d\u016f\7\62\2\2\u016e\u016d\3"+
		"\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0174\t\5\2\2\u0171"+
		"\u0172\7\63\2\2\u0172\u0174\t\b\2\2\u0173\u016e\3\2\2\2\u0173\u0171\3"+
		"\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7\61\2\2\u0176\u0177\t\3\2\2\u0177"+
		"\u0178\t\3\2\2\u0178\u0179\t\3\2\2\u0179\u017a\t\3\2\2\u017ah\3\2\2\2"+
		"\u017b\u017c\t\7\2\2\u017c\u0180\t\3\2\2\u017d\u017e\7\64\2\2\u017e\u0180"+
		"\t\t\2\2\u017f\u017b\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0182\7<\2\2\u0182\u0183\t\n\2\2\u0183\u0184\t\3\2\2\u0184j\3\2\2\2\u0185"+
		"\u0187\t\13\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3"+
		"\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\b\66\2\2\u018b"+
		"l\3\2\2\2\17\2\u008b\u00a2\u00b6\u014c\u0157\u015d\u0163\u016a\u016e\u0173"+
		"\u017f\u0188\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}