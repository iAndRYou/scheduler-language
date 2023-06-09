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
public class DecLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, TYPENAME=27, VARNAME=28, SPACE=29, NEWLINE=30, INT=31, 
		BOOL=32, STRING=33, DATE=34, TIME=35, CLASS=36, DAY=37, WEEK=38;
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
			"T__25", "TYPENAME", "VARNAME", "SPACE", "NEWLINE", "INT", "BOOL", "STRING", 
			"DATE", "TIME", "CLASS", "DAY", "WEEK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'RETURN'", "'BREAK'", "'FOR'", "'IN'", "'WHILE'", 
			"'IF'", "'DEF'", "'('", "')'", "','", "'='", "'*'", "'/'", "'+'", "'-'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'AND'", "'OR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "TYPENAME", "VARNAME", "SPACE", "NEWLINE", "INT", "BOOL", 
			"STRING", "DATE", "TIME", "CLASS", "DAY", "WEEK"
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


	public DecLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u013b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u00bf\n\34\3\35\6\35\u00c2\n\35\r\35\16\35\u00c3\3\36\6\36\u00c7"+
		"\n\36\r\36\16\36\u00c8\3\36\3\36\3\37\6\37\u00ce\n\37\r\37\16\37\u00cf"+
		"\3\37\3\37\3 \6 \u00d5\n \r \16 \u00d6\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00e2"+
		"\n!\3\"\6\"\u00e5\n\"\r\"\16\"\u00e6\3#\5#\u00ea\n#\3#\3#\3#\3#\3#\5#"+
		"\u00f1\n#\3#\3#\5#\u00f5\n#\3#\3#\3#\5#\u00fa\n#\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\5$\u0106\n$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\2\2(\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(\3\2\r\4\2C\\c|\3\2\"\"\4\2\f\f\17\17\3\2\62;\5\2\62;C\\c"+
		"|\3\2\63;\3\2\63\64\3\2\62\63\3\2\62\64\3\2\62\65\3\2\62\67\2\u014d\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU"+
		"\3\2\2\2\13\\\3\2\2\2\rb\3\2\2\2\17f\3\2\2\2\21i\3\2\2\2\23o\3\2\2\2\25"+
		"r\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33z\3\2\2\2\35|\3\2\2\2\37~\3\2\2\2"+
		"!\u0080\3\2\2\2#\u0082\3\2\2\2%\u0084\3\2\2\2\'\u0086\3\2\2\2)\u0089\3"+
		"\2\2\2+\u008c\3\2\2\2-\u008e\3\2\2\2/\u0090\3\2\2\2\61\u0093\3\2\2\2\63"+
		"\u0096\3\2\2\2\65\u009a\3\2\2\2\67\u00be\3\2\2\29\u00c1\3\2\2\2;\u00c6"+
		"\3\2\2\2=\u00cd\3\2\2\2?\u00d4\3\2\2\2A\u00e1\3\2\2\2C\u00e4\3\2\2\2E"+
		"\u00f0\3\2\2\2G\u0105\3\2\2\2I\u010b\3\2\2\2K\u011b\3\2\2\2M\u012b\3\2"+
		"\2\2OP\7=\2\2P\4\3\2\2\2QR\7}\2\2R\6\3\2\2\2ST\7\177\2\2T\b\3\2\2\2UV"+
		"\7T\2\2VW\7G\2\2WX\7V\2\2XY\7W\2\2YZ\7T\2\2Z[\7P\2\2[\n\3\2\2\2\\]\7D"+
		"\2\2]^\7T\2\2^_\7G\2\2_`\7C\2\2`a\7M\2\2a\f\3\2\2\2bc\7H\2\2cd\7Q\2\2"+
		"de\7T\2\2e\16\3\2\2\2fg\7K\2\2gh\7P\2\2h\20\3\2\2\2ij\7Y\2\2jk\7J\2\2"+
		"kl\7K\2\2lm\7N\2\2mn\7G\2\2n\22\3\2\2\2op\7K\2\2pq\7H\2\2q\24\3\2\2\2"+
		"rs\7F\2\2st\7G\2\2tu\7H\2\2u\26\3\2\2\2vw\7*\2\2w\30\3\2\2\2xy\7+\2\2"+
		"y\32\3\2\2\2z{\7.\2\2{\34\3\2\2\2|}\7?\2\2}\36\3\2\2\2~\177\7,\2\2\177"+
		" \3\2\2\2\u0080\u0081\7\61\2\2\u0081\"\3\2\2\2\u0082\u0083\7-\2\2\u0083"+
		"$\3\2\2\2\u0084\u0085\7/\2\2\u0085&\3\2\2\2\u0086\u0087\7?\2\2\u0087\u0088"+
		"\7?\2\2\u0088(\3\2\2\2\u0089\u008a\7#\2\2\u008a\u008b\7?\2\2\u008b*\3"+
		"\2\2\2\u008c\u008d\7>\2\2\u008d,\3\2\2\2\u008e\u008f\7@\2\2\u008f.\3\2"+
		"\2\2\u0090\u0091\7>\2\2\u0091\u0092\7?\2\2\u0092\60\3\2\2\2\u0093\u0094"+
		"\7@\2\2\u0094\u0095\7?\2\2\u0095\62\3\2\2\2\u0096\u0097\7C\2\2\u0097\u0098"+
		"\7P\2\2\u0098\u0099\7F\2\2\u0099\64\3\2\2\2\u009a\u009b\7Q\2\2\u009b\u009c"+
		"\7T\2\2\u009c\66\3\2\2\2\u009d\u009e\7K\2\2\u009e\u009f\7P\2\2\u009f\u00bf"+
		"\7V\2\2\u00a0\u00a1\7D\2\2\u00a1\u00a2\7Q\2\2\u00a2\u00a3\7Q\2\2\u00a3"+
		"\u00bf\7N\2\2\u00a4\u00a5\7U\2\2\u00a5\u00a6\7V\2\2\u00a6\u00a7\7T\2\2"+
		"\u00a7\u00a8\7K\2\2\u00a8\u00a9\7P\2\2\u00a9\u00bf\7I\2\2\u00aa\u00ab"+
		"\7F\2\2\u00ab\u00ac\7C\2\2\u00ac\u00ad\7V\2\2\u00ad\u00bf\7G\2\2\u00ae"+
		"\u00af\7V\2\2\u00af\u00b0\7K\2\2\u00b0\u00b1\7O\2\2\u00b1\u00bf\7G\2\2"+
		"\u00b2\u00b3\7E\2\2\u00b3\u00b4\7N\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b6"+
		"\7U\2\2\u00b6\u00bf\7U\2\2\u00b7\u00b8\7F\2\2\u00b8\u00b9\7C\2\2\u00b9"+
		"\u00bf\7[\2\2\u00ba\u00bb\7Y\2\2\u00bb\u00bc\7G\2\2\u00bc\u00bd\7G\2\2"+
		"\u00bd\u00bf\7M\2\2\u00be\u009d\3\2\2\2\u00be\u00a0\3\2\2\2\u00be\u00a4"+
		"\3\2\2\2\u00be\u00aa\3\2\2\2\u00be\u00ae\3\2\2\2\u00be\u00b2\3\2\2\2\u00be"+
		"\u00b7\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf8\3\2\2\2\u00c0\u00c2\t\2\2\2"+
		"\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4:\3\2\2\2\u00c5\u00c7\t\3\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\b\36\2\2\u00cb<\3\2\2\2\u00cc\u00ce\t\4\2\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\b\37\2\2\u00d2>\3\2\2\2\u00d3\u00d5\t\5\2\2"+
		"\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7V\2\2\u00d9\u00da\7t\2\2\u00da\u00db"+
		"\7w\2\2\u00db\u00e2\7g\2\2\u00dc\u00dd\7H\2\2\u00dd\u00de\7c\2\2\u00de"+
		"\u00df\7n\2\2\u00df\u00e0\7u\2\2\u00e0\u00e2\7g\2\2\u00e1\u00d8\3\2\2"+
		"\2\u00e1\u00dc\3\2\2\2\u00e2B\3\2\2\2\u00e3\u00e5\t\6\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"D\3\2\2\2\u00e8\u00ea\7\62\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00f1\t\7\2\2\u00ec\u00ed\t\b\2\2\u00ed\u00f1"+
		"\t\5\2\2\u00ee\u00ef\7\65\2\2\u00ef\u00f1\t\t\2\2\u00f0\u00e9\3\2\2\2"+
		"\u00f0\u00ec\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f9"+
		"\7\61\2\2\u00f3\u00f5\7\62\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\u00fa\t\7\2\2\u00f7\u00f8\7\63\2\2\u00f8\u00fa"+
		"\t\n\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\7\61\2\2\u00fc\u00fd\t\5\2\2\u00fd\u00fe\t\5\2\2\u00fe\u00ff\t"+
		"\5\2\2\u00ff\u0100\t\5\2\2\u0100F\3\2\2\2\u0101\u0102\t\t\2\2\u0102\u0106"+
		"\t\5\2\2\u0103\u0104\7\64\2\2\u0104\u0106\t\13\2\2\u0105\u0101\3\2\2\2"+
		"\u0105\u0103\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7<\2\2\u0108\u0109"+
		"\t\f\2\2\u0109\u010a\t\5\2\2\u010aH\3\2\2\2\u010b\u010c\7p\2\2\u010c\u010d"+
		"\7q\2\2\u010d\u010e\7v\2\2\u010e\u010f\7a\2\2\u010f\u0110\7k\2\2\u0110"+
		"\u0111\7o\2\2\u0111\u0112\7r\2\2\u0112\u0113\7n\2\2\u0113\u0114\7g\2\2"+
		"\u0114\u0115\7o\2\2\u0115\u0116\7g\2\2\u0116\u0117\7p\2\2\u0117\u0118"+
		"\7v\2\2\u0118\u0119\7g\2\2\u0119\u011a\7f\2\2\u011aJ\3\2\2\2\u011b\u011c"+
		"\7p\2\2\u011c\u011d\7q\2\2\u011d\u011e\7v\2\2\u011e\u011f\7a\2\2\u011f"+
		"\u0120\7k\2\2\u0120\u0121\7o\2\2\u0121\u0122\7r\2\2\u0122\u0123\7n\2\2"+
		"\u0123\u0124\7g\2\2\u0124\u0125\7o\2\2\u0125\u0126\7g\2\2\u0126\u0127"+
		"\7p\2\2\u0127\u0128\7v\2\2\u0128\u0129\7g\2\2\u0129\u012a\7f\2\2\u012a"+
		"L\3\2\2\2\u012b\u012c\7p\2\2\u012c\u012d\7q\2\2\u012d\u012e\7v\2\2\u012e"+
		"\u012f\7a\2\2\u012f\u0130\7k\2\2\u0130\u0131\7o\2\2\u0131\u0132\7r\2\2"+
		"\u0132\u0133\7n\2\2\u0133\u0134\7g\2\2\u0134\u0135\7o\2\2\u0135\u0136"+
		"\7g\2\2\u0136\u0137\7p\2\2\u0137\u0138\7v\2\2\u0138\u0139\7g\2\2\u0139"+
		"\u013a\7f\2\2\u013aN\3\2\2\2\17\2\u00be\u00c3\u00c8\u00cf\u00d6\u00e1"+
		"\u00e6\u00e9\u00f0\u00f4\u00f9\u0105\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}