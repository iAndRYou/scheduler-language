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
		T__0=1, T__1=2, T__2=3, T__3=4, CLASS_ATTRIBUTE=5, TYPENAME=6, CLASSNAME=7, 
		DAYNAME=8, WEEKNAME=9, CLASSESTOKEN=10, DAYSTOKEN=11, MULTIPLY=12, DIVIDE=13, 
		ADD=14, SUBTRACT=15, EQUAL=16, NOT_EQUAL=17, LESS_THAN=18, GREATER_THAN=19, 
		LESS_THAN_OR_EQUAL=20, GREATER_THAN_OR_EQUAL=21, AND=22, OR=23, NOT=24, 
		IN=25, OVERLAP=26, OPEN_PAREN=27, CLOSE_PAREN=28, OPEN_BRACKET=29, CLOSE_BRACKET=30, 
		DOT=31, COMMA=32, COLON=33, SINGLEEQUAL=34, COLLECTION_OF=35, ADD_CANVA=36, 
		UPDATE_CANVA=37, DELETE_CANVA=38, GET_CANVA=39, WHERE=40, AT=41, DEF=42, 
		IF=43, ELIF=44, ELSE=45, FOR=46, WHILE=47, RETURN=48, BREAK=49, OPEN_CURLY=50, 
		CLOSE_CURLY=51, INT=52, BOOL=53, STRING=54, DATE=55, TIME=56, WS=57, VARNAME=58, 
		COMMENT_LINE=59, COMMENT=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "CLASS_ATTRIBUTE", "TYPENAME", "CLASSNAME", 
			"DAYNAME", "WEEKNAME", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", 
			"ADD", "SUBTRACT", "EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", 
			"LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", "AND", "OR", "NOT", "IN", 
			"OVERLAP", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"DOT", "COMMA", "COLON", "SINGLEEQUAL", "COLLECTION_OF", "ADD_CANVA", 
			"UPDATE_CANVA", "DELETE_CANVA", "GET_CANVA", "WHERE", "AT", "DEF", "IF", 
			"ELIF", "ELSE", "FOR", "WHILE", "RETURN", "BREAK", "OPEN_CURLY", "CLOSE_CURLY", 
			"INT", "BOOL", "STRING", "DATE", "TIME", "WS", "VARNAME", "COMMENT_LINE", 
			"COMMENT"
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
			"'AT'", "'DEF'", "'IF'", "'ELIF'", "'ELSE'", "'FOR'", "'WHILE'", "'RETURN'", 
			"'BREAK'", "'{'", "'}'"
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
			"UPDATE_CANVA", "DELETE_CANVA", "GET_CANVA", "WHERE", "AT", "DEF", "IF", 
			"ELIF", "ELSE", "FOR", "WHILE", "RETURN", "BREAK", "OPEN_CURLY", "CLOSE_CURLY", 
			"INT", "BOOL", "STRING", "DATE", "TIME", "WS", "VARNAME", "COMMENT_LINE", 
			"COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01e2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ae"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c9\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\5\65\u0179"+
		"\n\65\3\65\6\65\u017c\n\65\r\65\16\65\u017d\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\5\66\u0189\n\66\3\67\3\67\7\67\u018d\n\67\f\67\16\67"+
		"\u0190\13\67\3\67\3\67\38\58\u0195\n8\38\38\38\38\38\58\u019c\n8\38\3"+
		"8\58\u01a0\n8\38\38\38\58\u01a5\n8\38\38\38\38\38\38\39\39\39\39\59\u01b1"+
		"\n9\39\39\39\39\3:\6:\u01b8\n:\r:\16:\u01b9\3:\3:\3;\3;\7;\u01c0\n;\f"+
		";\16;\u01c3\13;\3<\3<\3<\3<\7<\u01c9\n<\f<\16<\u01cc\13<\3<\5<\u01cf\n"+
		"<\3<\3<\3<\3<\3=\3=\3=\3=\7=\u01d9\n=\f=\16=\u01dc\13=\3=\3=\3=\3=\3="+
		"\4\u01ca\u01da\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>\3\2\r\3\2\62;\6\2\"\"\62;C\\c|\3\2\63;\3\2"+
		"\63\64\3\2\62\63\3\2\62\64\3\2\62\65\3\2\62\67\5\2\13\f\17\17\"\"\4\2"+
		"C\\c|\5\2\62;C\\c|\2\u01f8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7\u0083\3\2\2\2\t\u008e\3"+
		"\2\2\2\13\u00ad\3\2\2\2\r\u00c8\3\2\2\2\17\u00ca\3\2\2\2\21\u00d0\3\2"+
		"\2\2\23\u00d4\3\2\2\2\25\u00d9\3\2\2\2\27\u00e1\3\2\2\2\31\u00e6\3\2\2"+
		"\2\33\u00e8\3\2\2\2\35\u00ea\3\2\2\2\37\u00ec\3\2\2\2!\u00ee\3\2\2\2#"+
		"\u00f1\3\2\2\2%\u00f4\3\2\2\2\'\u00f6\3\2\2\2)\u00f8\3\2\2\2+\u00fb\3"+
		"\2\2\2-\u00fe\3\2\2\2/\u0102\3\2\2\2\61\u0105\3\2\2\2\63\u0109\3\2\2\2"+
		"\65\u010c\3\2\2\2\67\u010e\3\2\2\29\u0110\3\2\2\2;\u0112\3\2\2\2=\u0114"+
		"\3\2\2\2?\u0116\3\2\2\2A\u0118\3\2\2\2C\u011a\3\2\2\2E\u011c\3\2\2\2G"+
		"\u011e\3\2\2\2I\u012c\3\2\2\2K\u0130\3\2\2\2M\u0137\3\2\2\2O\u013e\3\2"+
		"\2\2Q\u0142\3\2\2\2S\u0148\3\2\2\2U\u014b\3\2\2\2W\u014f\3\2\2\2Y\u0152"+
		"\3\2\2\2[\u0157\3\2\2\2]\u015c\3\2\2\2_\u0160\3\2\2\2a\u0166\3\2\2\2c"+
		"\u016d\3\2\2\2e\u0173\3\2\2\2g\u0175\3\2\2\2i\u0178\3\2\2\2k\u0188\3\2"+
		"\2\2m\u018a\3\2\2\2o\u019b\3\2\2\2q\u01b0\3\2\2\2s\u01b7\3\2\2\2u\u01bd"+
		"\3\2\2\2w\u01c4\3\2\2\2y\u01d4\3\2\2\2{|\7=\2\2|\4\3\2\2\2}~\7F\2\2~\177"+
		"\7C\2\2\177\u0080\7V\2\2\u0080\u0081\7G\2\2\u0081\u0082\7U\2\2\u0082\6"+
		"\3\2\2\2\u0083\u0084\7U\2\2\u0084\u0085\7V\2\2\u0085\u0086\7C\2\2\u0086"+
		"\u0087\7T\2\2\u0087\u0088\7V\2\2\u0088\u0089\7\"\2\2\u0089\u008a\7F\2"+
		"\2\u008a\u008b\7C\2\2\u008b\u008c\7V\2\2\u008c\u008d\7G\2\2\u008d\b\3"+
		"\2\2\2\u008e\u008f\7G\2\2\u008f\u0090\7P\2\2\u0090\u0091\7F\2\2\u0091"+
		"\u0092\7\"\2\2\u0092\u0093\7F\2\2\u0093\u0094\7C\2\2\u0094\u0095\7V\2"+
		"\2\u0095\u0096\7G\2\2\u0096\n\3\2\2\2\u0097\u0098\7U\2\2\u0098\u0099\7"+
		"V\2\2\u0099\u009a\7C\2\2\u009a\u009b\7T\2\2\u009b\u00ae\7V\2\2\u009c\u009d"+
		"\7G\2\2\u009d\u009e\7P\2\2\u009e\u00ae\7F\2\2\u009f\u00a0\7U\2\2\u00a0"+
		"\u00a1\7W\2\2\u00a1\u00a2\7D\2\2\u00a2\u00a3\7L\2\2\u00a3\u00a4\7G\2\2"+
		"\u00a4\u00a5\7E\2\2\u00a5\u00ae\7V\2\2\u00a6\u00a7\7V\2\2\u00a7\u00a8"+
		"\7G\2\2\u00a8\u00a9\7C\2\2\u00a9\u00aa\7E\2\2\u00aa\u00ab\7J\2\2\u00ab"+
		"\u00ac\7G\2\2\u00ac\u00ae\7T\2\2\u00ad\u0097\3\2\2\2\u00ad\u009c\3\2\2"+
		"\2\u00ad\u009f\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ae\f\3\2\2\2\u00af\u00b0"+
		"\7K\2\2\u00b0\u00b1\7P\2\2\u00b1\u00c9\7V\2\2\u00b2\u00b3\7D\2\2\u00b3"+
		"\u00b4\7Q\2\2\u00b4\u00b5\7Q\2\2\u00b5\u00c9\7N\2\2\u00b6\u00b7\7U\2\2"+
		"\u00b7\u00b8\7V\2\2\u00b8\u00b9\7T\2\2\u00b9\u00ba\7K\2\2\u00ba\u00bb"+
		"\7P\2\2\u00bb\u00c9\7I\2\2\u00bc\u00bd\7F\2\2\u00bd\u00be\7C\2\2\u00be"+
		"\u00bf\7V\2\2\u00bf\u00c9\7G\2\2\u00c0\u00c1\7V\2\2\u00c1\u00c2\7K\2\2"+
		"\u00c2\u00c3\7O\2\2\u00c3\u00c9\7G\2\2\u00c4\u00c5\7X\2\2\u00c5\u00c6"+
		"\7Q\2\2\u00c6\u00c7\7K\2\2\u00c7\u00c9\7F\2\2\u00c8\u00af\3\2\2\2\u00c8"+
		"\u00b2\3\2\2\2\u00c8\u00b6\3\2\2\2\u00c8\u00bc\3\2\2\2\u00c8\u00c0\3\2"+
		"\2\2\u00c8\u00c4\3\2\2\2\u00c9\16\3\2\2\2\u00ca\u00cb\7E\2\2\u00cb\u00cc"+
		"\7N\2\2\u00cc\u00cd\7C\2\2\u00cd\u00ce\7U\2\2\u00ce\u00cf\7U\2\2\u00cf"+
		"\20\3\2\2\2\u00d0\u00d1\7F\2\2\u00d1\u00d2\7C\2\2\u00d2\u00d3\7[\2\2\u00d3"+
		"\22\3\2\2\2\u00d4\u00d5\7Y\2\2\u00d5\u00d6\7G\2\2\u00d6\u00d7\7G\2\2\u00d7"+
		"\u00d8\7M\2\2\u00d8\24\3\2\2\2\u00d9\u00da\7E\2\2\u00da\u00db\7N\2\2\u00db"+
		"\u00dc\7C\2\2\u00dc\u00dd\7U\2\2\u00dd\u00de\7U\2\2\u00de\u00df\7G\2\2"+
		"\u00df\u00e0\7U\2\2\u00e0\26\3\2\2\2\u00e1\u00e2\7F\2\2\u00e2\u00e3\7"+
		"C\2\2\u00e3\u00e4\7[\2\2\u00e4\u00e5\7U\2\2\u00e5\30\3\2\2\2\u00e6\u00e7"+
		"\7,\2\2\u00e7\32\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9\34\3\2\2\2\u00ea\u00eb"+
		"\7-\2\2\u00eb\36\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed \3\2\2\2\u00ee\u00ef"+
		"\7?\2\2\u00ef\u00f0\7?\2\2\u00f0\"\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2\u00f3"+
		"\7?\2\2\u00f3$\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5&\3\2\2\2\u00f6\u00f7\7"+
		"@\2\2\u00f7(\3\2\2\2\u00f8\u00f9\7>\2\2\u00f9\u00fa\7?\2\2\u00fa*\3\2"+
		"\2\2\u00fb\u00fc\7@\2\2\u00fc\u00fd\7?\2\2\u00fd,\3\2\2\2\u00fe\u00ff"+
		"\7C\2\2\u00ff\u0100\7P\2\2\u0100\u0101\7F\2\2\u0101.\3\2\2\2\u0102\u0103"+
		"\7Q\2\2\u0103\u0104\7T\2\2\u0104\60\3\2\2\2\u0105\u0106\7P\2\2\u0106\u0107"+
		"\7Q\2\2\u0107\u0108\7V\2\2\u0108\62\3\2\2\2\u0109\u010a\7K\2\2\u010a\u010b"+
		"\7P\2\2\u010b\64\3\2\2\2\u010c\u010d\7%\2\2\u010d\66\3\2\2\2\u010e\u010f"+
		"\7*\2\2\u010f8\3\2\2\2\u0110\u0111\7+\2\2\u0111:\3\2\2\2\u0112\u0113\7"+
		"]\2\2\u0113<\3\2\2\2\u0114\u0115\7_\2\2\u0115>\3\2\2\2\u0116\u0117\7\60"+
		"\2\2\u0117@\3\2\2\2\u0118\u0119\7.\2\2\u0119B\3\2\2\2\u011a\u011b\7<\2"+
		"\2\u011bD\3\2\2\2\u011c\u011d\7?\2\2\u011dF\3\2\2\2\u011e\u011f\7E\2\2"+
		"\u011f\u0120\7Q\2\2\u0120\u0121\7N\2\2\u0121\u0122\7N\2\2\u0122\u0123"+
		"\7G\2\2\u0123\u0124\7E\2\2\u0124\u0125\7V\2\2\u0125\u0126\7K\2\2\u0126"+
		"\u0127\7Q\2\2\u0127\u0128\7P\2\2\u0128\u0129\7\"\2\2\u0129\u012a\7Q\2"+
		"\2\u012a\u012b\7H\2\2\u012bH\3\2\2\2\u012c\u012d\7C\2\2\u012d\u012e\7"+
		"F\2\2\u012e\u012f\7F\2\2\u012fJ\3\2\2\2\u0130\u0131\7W\2\2\u0131\u0132"+
		"\7R\2\2\u0132\u0133\7F\2\2\u0133\u0134\7C\2\2\u0134\u0135\7V\2\2\u0135"+
		"\u0136\7G\2\2\u0136L\3\2\2\2\u0137\u0138\7F\2\2\u0138\u0139\7G\2\2\u0139"+
		"\u013a\7N\2\2\u013a\u013b\7G\2\2\u013b\u013c\7V\2\2\u013c\u013d\7G\2\2"+
		"\u013dN\3\2\2\2\u013e\u013f\7I\2\2\u013f\u0140\7G\2\2\u0140\u0141\7V\2"+
		"\2\u0141P\3\2\2\2\u0142\u0143\7Y\2\2\u0143\u0144\7J\2\2\u0144\u0145\7"+
		"G\2\2\u0145\u0146\7T\2\2\u0146\u0147\7G\2\2\u0147R\3\2\2\2\u0148\u0149"+
		"\7C\2\2\u0149\u014a\7V\2\2\u014aT\3\2\2\2\u014b\u014c\7F\2\2\u014c\u014d"+
		"\7G\2\2\u014d\u014e\7H\2\2\u014eV\3\2\2\2\u014f\u0150\7K\2\2\u0150\u0151"+
		"\7H\2\2\u0151X\3\2\2\2\u0152\u0153\7G\2\2\u0153\u0154\7N\2\2\u0154\u0155"+
		"\7K\2\2\u0155\u0156\7H\2\2\u0156Z\3\2\2\2\u0157\u0158\7G\2\2\u0158\u0159"+
		"\7N\2\2\u0159\u015a\7U\2\2\u015a\u015b\7G\2\2\u015b\\\3\2\2\2\u015c\u015d"+
		"\7H\2\2\u015d\u015e\7Q\2\2\u015e\u015f\7T\2\2\u015f^\3\2\2\2\u0160\u0161"+
		"\7Y\2\2\u0161\u0162\7J\2\2\u0162\u0163\7K\2\2\u0163\u0164\7N\2\2\u0164"+
		"\u0165\7G\2\2\u0165`\3\2\2\2\u0166\u0167\7T\2\2\u0167\u0168\7G\2\2\u0168"+
		"\u0169\7V\2\2\u0169\u016a\7W\2\2\u016a\u016b\7T\2\2\u016b\u016c\7P\2\2"+
		"\u016cb\3\2\2\2\u016d\u016e\7D\2\2\u016e\u016f\7T\2\2\u016f\u0170\7G\2"+
		"\2\u0170\u0171\7C\2\2\u0171\u0172\7M\2\2\u0172d\3\2\2\2\u0173\u0174\7"+
		"}\2\2\u0174f\3\2\2\2\u0175\u0176\7\177\2\2\u0176h\3\2\2\2\u0177\u0179"+
		"\7/\2\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a"+
		"\u017c\t\2\2\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017ej\3\2\2\2\u017f\u0180\7V\2\2\u0180\u0181"+
		"\7t\2\2\u0181\u0182\7w\2\2\u0182\u0189\7g\2\2\u0183\u0184\7H\2\2\u0184"+
		"\u0185\7c\2\2\u0185\u0186\7n\2\2\u0186\u0187\7u\2\2\u0187\u0189\7g\2\2"+
		"\u0188\u017f\3\2\2\2\u0188\u0183\3\2\2\2\u0189l\3\2\2\2\u018a\u018e\7"+
		"$\2\2\u018b\u018d\t\3\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0191\u0192\7$\2\2\u0192n\3\2\2\2\u0193\u0195\7\62\2\2\u0194\u0193"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u019c\t\4\2\2\u0197"+
		"\u0198\t\5\2\2\u0198\u019c\t\2\2\2\u0199\u019a\7\65\2\2\u019a\u019c\t"+
		"\6\2\2\u019b\u0194\3\2\2\2\u019b\u0197\3\2\2\2\u019b\u0199\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u01a4\7\61\2\2\u019e\u01a0\7\62\2\2\u019f\u019e\3"+
		"\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a5\t\4\2\2\u01a2"+
		"\u01a3\7\63\2\2\u01a3\u01a5\t\7\2\2\u01a4\u019f\3\2\2\2\u01a4\u01a2\3"+
		"\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\61\2\2\u01a7\u01a8\t\2\2\2\u01a8"+
		"\u01a9\t\2\2\2\u01a9\u01aa\t\2\2\2\u01aa\u01ab\t\2\2\2\u01abp\3\2\2\2"+
		"\u01ac\u01ad\t\6\2\2\u01ad\u01b1\t\2\2\2\u01ae\u01af\7\64\2\2\u01af\u01b1"+
		"\t\b\2\2\u01b0\u01ac\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b3\7<\2\2\u01b3\u01b4\t\t\2\2\u01b4\u01b5\t\2\2\2\u01b5r\3\2\2\2\u01b6"+
		"\u01b8\t\n\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\b:\2\2\u01bc"+
		"t\3\2\2\2\u01bd\u01c1\t\13\2\2\u01be\u01c0\t\f\2\2\u01bf\u01be\3\2\2\2"+
		"\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2v\3"+
		"\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7\61\2\2\u01c5\u01c6\7\61\2\2\u01c6"+
		"\u01ca\3\2\2\2\u01c7\u01c9\13\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3"+
		"\2\2\2\u01ca\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01cf\7\17\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3"+
		"\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\7\f\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d3\b<\3\2\u01d3x\3\2\2\2\u01d4\u01d5\7\61\2\2\u01d5\u01d6\7,\2\2\u01d6"+
		"\u01da\3\2\2\2\u01d7\u01d9\13\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3"+
		"\2\2\2\u01da\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dd\u01de\7,\2\2\u01de\u01df\7\61\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0\u01e1\b=\3\2\u01e1z\3\2\2\2\23\2\u00ad\u00c8\u0178\u017d\u0188"+
		"\u018e\u0194\u019b\u019f\u01a4\u01b0\u01b9\u01c1\u01ca\u01ce\u01da\4\b"+
		"\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}