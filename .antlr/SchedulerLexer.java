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
		UPDATE_CANVA=37, DELETE_CANVA=38, GET_CANVA=39, WHERE=40, SATISFYING=41, 
		AT=42, DEF=43, IF=44, ELIF=45, ELSE=46, FOR=47, WHILE=48, RETURN=49, BREAK=50, 
		OPEN_CURLY=51, CLOSE_CURLY=52, DISTINCT=53, PRINT=54, INT=55, BOOL=56, 
		STRING=57, DATE=58, TIME=59, WS=60, VARNAME=61, COMMENT_LINE=62, COMMENT=63;
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
			"UPDATE_CANVA", "DELETE_CANVA", "GET_CANVA", "WHERE", "SATISFYING", "AT", 
			"DEF", "IF", "ELIF", "ELSE", "FOR", "WHILE", "RETURN", "BREAK", "OPEN_CURLY", 
			"CLOSE_CURLY", "DISTINCT", "PRINT", "INT", "BOOL", "STRING", "DATE", 
			"TIME", "WS", "VARNAME", "COMMENT_LINE", "COMMENT"
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
			"'WHILE'", "'RETURN'", "'BREAK'", "'{'", "'}'", "'DISTINCT'", "'PRINT'"
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
			"CLOSE_CURLY", "DISTINCT", "PRINT", "INT", "BOOL", "STRING", "DATE", 
			"TIME", "WS", "VARNAME", "COMMENT_LINE", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u0202\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00b4\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00cf\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3"+
		",\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\58\u0199\n8\38\68\u019c"+
		"\n8\r8\168\u019d\39\39\39\39\39\39\39\39\39\59\u01a9\n9\3:\3:\7:\u01ad"+
		"\n:\f:\16:\u01b0\13:\3:\3:\3;\5;\u01b5\n;\3;\3;\3;\3;\3;\5;\u01bc\n;\3"+
		";\3;\5;\u01c0\n;\3;\3;\3;\5;\u01c5\n;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\5"+
		"<\u01d1\n<\3<\3<\3<\3<\3=\6=\u01d8\n=\r=\16=\u01d9\3=\3=\3>\3>\7>\u01e0"+
		"\n>\f>\16>\u01e3\13>\3?\3?\3?\3?\7?\u01e9\n?\f?\16?\u01ec\13?\3?\5?\u01ef"+
		"\n?\3?\3?\3?\3?\3@\3@\3@\3@\7@\u01f9\n@\f@\16@\u01fc\13@\3@\3@\3@\3@\3"+
		"@\4\u01ea\u01fa\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\3\2\r\3\2\62;\6\2\"\"\62;C\\c"+
		"|\3\2\63;\3\2\63\64\3\2\62\63\3\2\62\64\3\2\62\65\3\2\62\67\5\2\13\f\17"+
		"\17\"\"\4\2C\\c|\5\2\62;C\\c|\2\u0218\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\3\u0081\3\2\2\2\5\u0083\3\2\2\2\7\u0089\3\2\2\2\t\u0094\3\2\2\2\13"+
		"\u00b3\3\2\2\2\r\u00ce\3\2\2\2\17\u00d0\3\2\2\2\21\u00d6\3\2\2\2\23\u00da"+
		"\3\2\2\2\25\u00df\3\2\2\2\27\u00e7\3\2\2\2\31\u00ec\3\2\2\2\33\u00ee\3"+
		"\2\2\2\35\u00f0\3\2\2\2\37\u00f2\3\2\2\2!\u00f4\3\2\2\2#\u00f7\3\2\2\2"+
		"%\u00fa\3\2\2\2\'\u00fc\3\2\2\2)\u00fe\3\2\2\2+\u0101\3\2\2\2-\u0104\3"+
		"\2\2\2/\u0108\3\2\2\2\61\u010b\3\2\2\2\63\u010f\3\2\2\2\65\u0112\3\2\2"+
		"\2\67\u0114\3\2\2\29\u0116\3\2\2\2;\u0118\3\2\2\2=\u011a\3\2\2\2?\u011c"+
		"\3\2\2\2A\u011e\3\2\2\2C\u0120\3\2\2\2E\u0122\3\2\2\2G\u0124\3\2\2\2I"+
		"\u0132\3\2\2\2K\u0136\3\2\2\2M\u013d\3\2\2\2O\u0144\3\2\2\2Q\u0148\3\2"+
		"\2\2S\u014e\3\2\2\2U\u0159\3\2\2\2W\u015c\3\2\2\2Y\u0160\3\2\2\2[\u0163"+
		"\3\2\2\2]\u0168\3\2\2\2_\u016d\3\2\2\2a\u0171\3\2\2\2c\u0177\3\2\2\2e"+
		"\u017e\3\2\2\2g\u0184\3\2\2\2i\u0186\3\2\2\2k\u0188\3\2\2\2m\u0191\3\2"+
		"\2\2o\u0198\3\2\2\2q\u01a8\3\2\2\2s\u01aa\3\2\2\2u\u01bb\3\2\2\2w\u01d0"+
		"\3\2\2\2y\u01d7\3\2\2\2{\u01dd\3\2\2\2}\u01e4\3\2\2\2\177\u01f4\3\2\2"+
		"\2\u0081\u0082\7=\2\2\u0082\4\3\2\2\2\u0083\u0084\7F\2\2\u0084\u0085\7"+
		"C\2\2\u0085\u0086\7V\2\2\u0086\u0087\7G\2\2\u0087\u0088\7U\2\2\u0088\6"+
		"\3\2\2\2\u0089\u008a\7U\2\2\u008a\u008b\7V\2\2\u008b\u008c\7C\2\2\u008c"+
		"\u008d\7T\2\2\u008d\u008e\7V\2\2\u008e\u008f\7\"\2\2\u008f\u0090\7F\2"+
		"\2\u0090\u0091\7C\2\2\u0091\u0092\7V\2\2\u0092\u0093\7G\2\2\u0093\b\3"+
		"\2\2\2\u0094\u0095\7G\2\2\u0095\u0096\7P\2\2\u0096\u0097\7F\2\2\u0097"+
		"\u0098\7\"\2\2\u0098\u0099\7F\2\2\u0099\u009a\7C\2\2\u009a\u009b\7V\2"+
		"\2\u009b\u009c\7G\2\2\u009c\n\3\2\2\2\u009d\u009e\7U\2\2\u009e\u009f\7"+
		"V\2\2\u009f\u00a0\7C\2\2\u00a0\u00a1\7T\2\2\u00a1\u00b4\7V\2\2\u00a2\u00a3"+
		"\7G\2\2\u00a3\u00a4\7P\2\2\u00a4\u00b4\7F\2\2\u00a5\u00a6\7U\2\2\u00a6"+
		"\u00a7\7W\2\2\u00a7\u00a8\7D\2\2\u00a8\u00a9\7L\2\2\u00a9\u00aa\7G\2\2"+
		"\u00aa\u00ab\7E\2\2\u00ab\u00b4\7V\2\2\u00ac\u00ad\7V\2\2\u00ad\u00ae"+
		"\7G\2\2\u00ae\u00af\7C\2\2\u00af\u00b0\7E\2\2\u00b0\u00b1\7J\2\2\u00b1"+
		"\u00b2\7G\2\2\u00b2\u00b4\7T\2\2\u00b3\u009d\3\2\2\2\u00b3\u00a2\3\2\2"+
		"\2\u00b3\u00a5\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b4\f\3\2\2\2\u00b5\u00b6"+
		"\7K\2\2\u00b6\u00b7\7P\2\2\u00b7\u00cf\7V\2\2\u00b8\u00b9\7D\2\2\u00b9"+
		"\u00ba\7Q\2\2\u00ba\u00bb\7Q\2\2\u00bb\u00cf\7N\2\2\u00bc\u00bd\7U\2\2"+
		"\u00bd\u00be\7V\2\2\u00be\u00bf\7T\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1"+
		"\7P\2\2\u00c1\u00cf\7I\2\2\u00c2\u00c3\7F\2\2\u00c3\u00c4\7C\2\2\u00c4"+
		"\u00c5\7V\2\2\u00c5\u00cf\7G\2\2\u00c6\u00c7\7V\2\2\u00c7\u00c8\7K\2\2"+
		"\u00c8\u00c9\7O\2\2\u00c9\u00cf\7G\2\2\u00ca\u00cb\7X\2\2\u00cb\u00cc"+
		"\7Q\2\2\u00cc\u00cd\7K\2\2\u00cd\u00cf\7F\2\2\u00ce\u00b5\3\2\2\2\u00ce"+
		"\u00b8\3\2\2\2\u00ce\u00bc\3\2\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c6\3\2"+
		"\2\2\u00ce\u00ca\3\2\2\2\u00cf\16\3\2\2\2\u00d0\u00d1\7E\2\2\u00d1\u00d2"+
		"\7N\2\2\u00d2\u00d3\7C\2\2\u00d3\u00d4\7U\2\2\u00d4\u00d5\7U\2\2\u00d5"+
		"\20\3\2\2\2\u00d6\u00d7\7F\2\2\u00d7\u00d8\7C\2\2\u00d8\u00d9\7[\2\2\u00d9"+
		"\22\3\2\2\2\u00da\u00db\7Y\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7G\2\2\u00dd"+
		"\u00de\7M\2\2\u00de\24\3\2\2\2\u00df\u00e0\7E\2\2\u00e0\u00e1\7N\2\2\u00e1"+
		"\u00e2\7C\2\2\u00e2\u00e3\7U\2\2\u00e3\u00e4\7U\2\2\u00e4\u00e5\7G\2\2"+
		"\u00e5\u00e6\7U\2\2\u00e6\26\3\2\2\2\u00e7\u00e8\7F\2\2\u00e8\u00e9\7"+
		"C\2\2\u00e9\u00ea\7[\2\2\u00ea\u00eb\7U\2\2\u00eb\30\3\2\2\2\u00ec\u00ed"+
		"\7,\2\2\u00ed\32\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\34\3\2\2\2\u00f0\u00f1"+
		"\7-\2\2\u00f1\36\3\2\2\2\u00f2\u00f3\7/\2\2\u00f3 \3\2\2\2\u00f4\u00f5"+
		"\7?\2\2\u00f5\u00f6\7?\2\2\u00f6\"\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9$\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb&\3\2\2\2\u00fc\u00fd\7"+
		"@\2\2\u00fd(\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff\u0100\7?\2\2\u0100*\3\2"+
		"\2\2\u0101\u0102\7@\2\2\u0102\u0103\7?\2\2\u0103,\3\2\2\2\u0104\u0105"+
		"\7C\2\2\u0105\u0106\7P\2\2\u0106\u0107\7F\2\2\u0107.\3\2\2\2\u0108\u0109"+
		"\7Q\2\2\u0109\u010a\7T\2\2\u010a\60\3\2\2\2\u010b\u010c\7P\2\2\u010c\u010d"+
		"\7Q\2\2\u010d\u010e\7V\2\2\u010e\62\3\2\2\2\u010f\u0110\7K\2\2\u0110\u0111"+
		"\7P\2\2\u0111\64\3\2\2\2\u0112\u0113\7%\2\2\u0113\66\3\2\2\2\u0114\u0115"+
		"\7*\2\2\u01158\3\2\2\2\u0116\u0117\7+\2\2\u0117:\3\2\2\2\u0118\u0119\7"+
		"]\2\2\u0119<\3\2\2\2\u011a\u011b\7_\2\2\u011b>\3\2\2\2\u011c\u011d\7\60"+
		"\2\2\u011d@\3\2\2\2\u011e\u011f\7.\2\2\u011fB\3\2\2\2\u0120\u0121\7<\2"+
		"\2\u0121D\3\2\2\2\u0122\u0123\7?\2\2\u0123F\3\2\2\2\u0124\u0125\7E\2\2"+
		"\u0125\u0126\7Q\2\2\u0126\u0127\7N\2\2\u0127\u0128\7N\2\2\u0128\u0129"+
		"\7G\2\2\u0129\u012a\7E\2\2\u012a\u012b\7V\2\2\u012b\u012c\7K\2\2\u012c"+
		"\u012d\7Q\2\2\u012d\u012e\7P\2\2\u012e\u012f\7\"\2\2\u012f\u0130\7Q\2"+
		"\2\u0130\u0131\7H\2\2\u0131H\3\2\2\2\u0132\u0133\7C\2\2\u0133\u0134\7"+
		"F\2\2\u0134\u0135\7F\2\2\u0135J\3\2\2\2\u0136\u0137\7W\2\2\u0137\u0138"+
		"\7R\2\2\u0138\u0139\7F\2\2\u0139\u013a\7C\2\2\u013a\u013b\7V\2\2\u013b"+
		"\u013c\7G\2\2\u013cL\3\2\2\2\u013d\u013e\7F\2\2\u013e\u013f\7G\2\2\u013f"+
		"\u0140\7N\2\2\u0140\u0141\7G\2\2\u0141\u0142\7V\2\2\u0142\u0143\7G\2\2"+
		"\u0143N\3\2\2\2\u0144\u0145\7I\2\2\u0145\u0146\7G\2\2\u0146\u0147\7V\2"+
		"\2\u0147P\3\2\2\2\u0148\u0149\7Y\2\2\u0149\u014a\7J\2\2\u014a\u014b\7"+
		"G\2\2\u014b\u014c\7T\2\2\u014c\u014d\7G\2\2\u014dR\3\2\2\2\u014e\u014f"+
		"\7U\2\2\u014f\u0150\7C\2\2\u0150\u0151\7V\2\2\u0151\u0152\7K\2\2\u0152"+
		"\u0153\7U\2\2\u0153\u0154\7H\2\2\u0154\u0155\7[\2\2\u0155\u0156\7K\2\2"+
		"\u0156\u0157\7P\2\2\u0157\u0158\7I\2\2\u0158T\3\2\2\2\u0159\u015a\7C\2"+
		"\2\u015a\u015b\7V\2\2\u015bV\3\2\2\2\u015c\u015d\7F\2\2\u015d\u015e\7"+
		"G\2\2\u015e\u015f\7H\2\2\u015fX\3\2\2\2\u0160\u0161\7K\2\2\u0161\u0162"+
		"\7H\2\2\u0162Z\3\2\2\2\u0163\u0164\7G\2\2\u0164\u0165\7N\2\2\u0165\u0166"+
		"\7K\2\2\u0166\u0167\7H\2\2\u0167\\\3\2\2\2\u0168\u0169\7G\2\2\u0169\u016a"+
		"\7N\2\2\u016a\u016b\7U\2\2\u016b\u016c\7G\2\2\u016c^\3\2\2\2\u016d\u016e"+
		"\7H\2\2\u016e\u016f\7Q\2\2\u016f\u0170\7T\2\2\u0170`\3\2\2\2\u0171\u0172"+
		"\7Y\2\2\u0172\u0173\7J\2\2\u0173\u0174\7K\2\2\u0174\u0175\7N\2\2\u0175"+
		"\u0176\7G\2\2\u0176b\3\2\2\2\u0177\u0178\7T\2\2\u0178\u0179\7G\2\2\u0179"+
		"\u017a\7V\2\2\u017a\u017b\7W\2\2\u017b\u017c\7T\2\2\u017c\u017d\7P\2\2"+
		"\u017dd\3\2\2\2\u017e\u017f\7D\2\2\u017f\u0180\7T\2\2\u0180\u0181\7G\2"+
		"\2\u0181\u0182\7C\2\2\u0182\u0183\7M\2\2\u0183f\3\2\2\2\u0184\u0185\7"+
		"}\2\2\u0185h\3\2\2\2\u0186\u0187\7\177\2\2\u0187j\3\2\2\2\u0188\u0189"+
		"\7F\2\2\u0189\u018a\7K\2\2\u018a\u018b\7U\2\2\u018b\u018c\7V\2\2\u018c"+
		"\u018d\7K\2\2\u018d\u018e\7P\2\2\u018e\u018f\7E\2\2\u018f\u0190\7V\2\2"+
		"\u0190l\3\2\2\2\u0191\u0192\7R\2\2\u0192\u0193\7T\2\2\u0193\u0194\7K\2"+
		"\2\u0194\u0195\7P\2\2\u0195\u0196\7V\2\2\u0196n\3\2\2\2\u0197\u0199\7"+
		"/\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a"+
		"\u019c\t\2\2\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019ep\3\2\2\2\u019f\u01a0\7V\2\2\u01a0\u01a1"+
		"\7t\2\2\u01a1\u01a2\7w\2\2\u01a2\u01a9\7g\2\2\u01a3\u01a4\7H\2\2\u01a4"+
		"\u01a5\7c\2\2\u01a5\u01a6\7n\2\2\u01a6\u01a7\7u\2\2\u01a7\u01a9\7g\2\2"+
		"\u01a8\u019f\3\2\2\2\u01a8\u01a3\3\2\2\2\u01a9r\3\2\2\2\u01aa\u01ae\7"+
		"$\2\2\u01ab\u01ad\t\3\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b1\u01b2\7$\2\2\u01b2t\3\2\2\2\u01b3\u01b5\7\62\2\2\u01b4\u01b3"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01bc\t\4\2\2\u01b7"+
		"\u01b8\t\5\2\2\u01b8\u01bc\t\2\2\2\u01b9\u01ba\7\65\2\2\u01ba\u01bc\t"+
		"\6\2\2\u01bb\u01b4\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01c4\7\61\2\2\u01be\u01c0\7\62\2\2\u01bf\u01be\3"+
		"\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5\t\4\2\2\u01c2"+
		"\u01c3\7\63\2\2\u01c3\u01c5\t\7\2\2\u01c4\u01bf\3\2\2\2\u01c4\u01c2\3"+
		"\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7\61\2\2\u01c7\u01c8\t\2\2\2\u01c8"+
		"\u01c9\t\2\2\2\u01c9\u01ca\t\2\2\2\u01ca\u01cb\t\2\2\2\u01cbv\3\2\2\2"+
		"\u01cc\u01cd\t\6\2\2\u01cd\u01d1\t\2\2\2\u01ce\u01cf\7\64\2\2\u01cf\u01d1"+
		"\t\b\2\2\u01d0\u01cc\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d3\7<\2\2\u01d3\u01d4\t\t\2\2\u01d4\u01d5\t\2\2\2\u01d5x\3\2\2\2\u01d6"+
		"\u01d8\t\n\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\b=\2\2\u01dc"+
		"z\3\2\2\2\u01dd\u01e1\t\13\2\2\u01de\u01e0\t\f\2\2\u01df\u01de\3\2\2\2"+
		"\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2|\3"+
		"\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\7\61\2\2\u01e5\u01e6\7\61\2\2\u01e6"+
		"\u01ea\3\2\2\2\u01e7\u01e9\13\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3"+
		"\2\2\2\u01ea\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ed\u01ef\7\17\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3"+
		"\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\7\f\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f3\b?\3\2\u01f3~\3\2\2\2\u01f4\u01f5\7\61\2\2\u01f5\u01f6\7,\2\2\u01f6"+
		"\u01fa\3\2\2\2\u01f7\u01f9\13\2\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3"+
		"\2\2\2\u01fa\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fd\u01fe\7,\2\2\u01fe\u01ff\7\61\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u0201\b@\3\2\u0201\u0080\3\2\2\2\23\2\u00b3\u00ce\u0198\u019d"+
		"\u01a8\u01ae\u01b4\u01bb\u01bf\u01c4\u01d0\u01d9\u01e1\u01ea\u01ee\u01fa"+
		"\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}