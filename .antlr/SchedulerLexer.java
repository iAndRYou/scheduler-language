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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, TYPENAME=34, VARNAME=35, SPACE=36, NEWLINE=37, INT=38, 
		BOOL=39, STRING=40, DATE=41, TIME=42, DAY=43, WEEK=44;
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
			"TYPENAME", "VARNAME", "SPACE", "NEWLINE", "INT", "BOOL", "STRING", "DATE", 
			"TIME", "DAY", "WEEK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'RETURN'", "'BREAK'", "'FOR'", "'IN'", "'WHILE'", 
			"'IF'", "'DEF'", "'('", "')'", "','", "'='", "'*'", "'/'", "'+'", "'-'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'AND'", "'OR'", "'NOT'", 
			"'#'", "'CLASS'", "'SUBJECT'", "'TEACHER'", "'START'", "'END'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "TYPENAME", 
			"VARNAME", "SPACE", "NEWLINE", "INT", "BOOL", "STRING", "DATE", "TIME", 
			"DAY", "WEEK"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u015d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00f1\n"+
		"#\3$\6$\u00f4\n$\r$\16$\u00f5\3%\6%\u00f9\n%\r%\16%\u00fa\3%\3%\3&\6&"+
		"\u0100\n&\r&\16&\u0101\3&\3&\3\'\6\'\u0107\n\'\r\'\16\'\u0108\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\5(\u0114\n(\3)\6)\u0117\n)\r)\16)\u0118\3*\5*\u011c"+
		"\n*\3*\3*\3*\3*\3*\5*\u0123\n*\3*\3*\5*\u0127\n*\3*\3*\3*\5*\u012c\n*"+
		"\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\5+\u0138\n+\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\r\4\2C\\c|\3\2\""+
		"\"\4\2\f\f\17\17\3\2\62;\5\2\62;C\\c|\3\2\63;\3\2\63\64\3\2\62\63\3\2"+
		"\62\64\3\2\62\65\3\2\62\67\2\u016f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3"+
		"\2\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13h\3\2\2\2\rn\3\2\2\2\17r\3\2"+
		"\2\2\21u\3\2\2\2\23{\3\2\2\2\25~\3\2\2\2\27\u0082\3\2\2\2\31\u0084\3\2"+
		"\2\2\33\u0086\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u008c\3\2\2\2"+
		"#\u008e\3\2\2\2%\u0090\3\2\2\2\'\u0092\3\2\2\2)\u0095\3\2\2\2+\u0098\3"+
		"\2\2\2-\u009a\3\2\2\2/\u009c\3\2\2\2\61\u009f\3\2\2\2\63\u00a2\3\2\2\2"+
		"\65\u00a6\3\2\2\2\67\u00a9\3\2\2\29\u00ad\3\2\2\2;\u00af\3\2\2\2=\u00b5"+
		"\3\2\2\2?\u00bd\3\2\2\2A\u00c5\3\2\2\2C\u00cb\3\2\2\2E\u00f0\3\2\2\2G"+
		"\u00f3\3\2\2\2I\u00f8\3\2\2\2K\u00ff\3\2\2\2M\u0106\3\2\2\2O\u0113\3\2"+
		"\2\2Q\u0116\3\2\2\2S\u0122\3\2\2\2U\u0137\3\2\2\2W\u013d\3\2\2\2Y\u014d"+
		"\3\2\2\2[\\\7=\2\2\\\4\3\2\2\2]^\7}\2\2^\6\3\2\2\2_`\7\177\2\2`\b\3\2"+
		"\2\2ab\7T\2\2bc\7G\2\2cd\7V\2\2de\7W\2\2ef\7T\2\2fg\7P\2\2g\n\3\2\2\2"+
		"hi\7D\2\2ij\7T\2\2jk\7G\2\2kl\7C\2\2lm\7M\2\2m\f\3\2\2\2no\7H\2\2op\7"+
		"Q\2\2pq\7T\2\2q\16\3\2\2\2rs\7K\2\2st\7P\2\2t\20\3\2\2\2uv\7Y\2\2vw\7"+
		"J\2\2wx\7K\2\2xy\7N\2\2yz\7G\2\2z\22\3\2\2\2{|\7K\2\2|}\7H\2\2}\24\3\2"+
		"\2\2~\177\7F\2\2\177\u0080\7G\2\2\u0080\u0081\7H\2\2\u0081\26\3\2\2\2"+
		"\u0082\u0083\7*\2\2\u0083\30\3\2\2\2\u0084\u0085\7+\2\2\u0085\32\3\2\2"+
		"\2\u0086\u0087\7.\2\2\u0087\34\3\2\2\2\u0088\u0089\7?\2\2\u0089\36\3\2"+
		"\2\2\u008a\u008b\7,\2\2\u008b \3\2\2\2\u008c\u008d\7\61\2\2\u008d\"\3"+
		"\2\2\2\u008e\u008f\7-\2\2\u008f$\3\2\2\2\u0090\u0091\7/\2\2\u0091&\3\2"+
		"\2\2\u0092\u0093\7?\2\2\u0093\u0094\7?\2\2\u0094(\3\2\2\2\u0095\u0096"+
		"\7#\2\2\u0096\u0097\7?\2\2\u0097*\3\2\2\2\u0098\u0099\7>\2\2\u0099,\3"+
		"\2\2\2\u009a\u009b\7@\2\2\u009b.\3\2\2\2\u009c\u009d\7>\2\2\u009d\u009e"+
		"\7?\2\2\u009e\60\3\2\2\2\u009f\u00a0\7@\2\2\u00a0\u00a1\7?\2\2\u00a1\62"+
		"\3\2\2\2\u00a2\u00a3\7C\2\2\u00a3\u00a4\7P\2\2\u00a4\u00a5\7F\2\2\u00a5"+
		"\64\3\2\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7T\2\2\u00a8\66\3\2\2\2\u00a9"+
		"\u00aa\7P\2\2\u00aa\u00ab\7Q\2\2\u00ab\u00ac\7V\2\2\u00ac8\3\2\2\2\u00ad"+
		"\u00ae\7%\2\2\u00ae:\3\2\2\2\u00af\u00b0\7E\2\2\u00b0\u00b1\7N\2\2\u00b1"+
		"\u00b2\7C\2\2\u00b2\u00b3\7U\2\2\u00b3\u00b4\7U\2\2\u00b4<\3\2\2\2\u00b5"+
		"\u00b6\7U\2\2\u00b6\u00b7\7W\2\2\u00b7\u00b8\7D\2\2\u00b8\u00b9\7L\2\2"+
		"\u00b9\u00ba\7G\2\2\u00ba\u00bb\7E\2\2\u00bb\u00bc\7V\2\2\u00bc>\3\2\2"+
		"\2\u00bd\u00be\7V\2\2\u00be\u00bf\7G\2\2\u00bf\u00c0\7C\2\2\u00c0\u00c1"+
		"\7E\2\2\u00c1\u00c2\7J\2\2\u00c2\u00c3\7G\2\2\u00c3\u00c4\7T\2\2\u00c4"+
		"@\3\2\2\2\u00c5\u00c6\7U\2\2\u00c6\u00c7\7V\2\2\u00c7\u00c8\7C\2\2\u00c8"+
		"\u00c9\7T\2\2\u00c9\u00ca\7V\2\2\u00caB\3\2\2\2\u00cb\u00cc\7G\2\2\u00cc"+
		"\u00cd\7P\2\2\u00cd\u00ce\7F\2\2\u00ceD\3\2\2\2\u00cf\u00d0\7K\2\2\u00d0"+
		"\u00d1\7P\2\2\u00d1\u00f1\7V\2\2\u00d2\u00d3\7D\2\2\u00d3\u00d4\7Q\2\2"+
		"\u00d4\u00d5\7Q\2\2\u00d5\u00f1\7N\2\2\u00d6\u00d7\7U\2\2\u00d7\u00d8"+
		"\7V\2\2\u00d8\u00d9\7T\2\2\u00d9\u00da\7K\2\2\u00da\u00db\7P\2\2\u00db"+
		"\u00f1\7I\2\2\u00dc\u00dd\7F\2\2\u00dd\u00de\7C\2\2\u00de\u00df\7V\2\2"+
		"\u00df\u00f1\7G\2\2\u00e0\u00e1\7V\2\2\u00e1\u00e2\7K\2\2\u00e2\u00e3"+
		"\7O\2\2\u00e3\u00f1\7G\2\2\u00e4\u00e5\7E\2\2\u00e5\u00e6\7N\2\2\u00e6"+
		"\u00e7\7C\2\2\u00e7\u00e8\7U\2\2\u00e8\u00f1\7U\2\2\u00e9\u00ea\7F\2\2"+
		"\u00ea\u00eb\7C\2\2\u00eb\u00f1\7[\2\2\u00ec\u00ed\7Y\2\2\u00ed\u00ee"+
		"\7G\2\2\u00ee\u00ef\7G\2\2\u00ef\u00f1\7M\2\2\u00f0\u00cf\3\2\2\2\u00f0"+
		"\u00d2\3\2\2\2\u00f0\u00d6\3\2\2\2\u00f0\u00dc\3\2\2\2\u00f0\u00e0\3\2"+
		"\2\2\u00f0\u00e4\3\2\2\2\u00f0\u00e9\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f1"+
		"F\3\2\2\2\u00f2\u00f4\t\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6H\3\2\2\2\u00f7\u00f9\t"+
		"\3\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\b%\2\2\u00fdJ\3\2\2\2\u00fe"+
		"\u0100\t\4\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\b&\2\2\u0104"+
		"L\3\2\2\2\u0105\u0107\t\5\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109N\3\2\2\2\u010a\u010b\7"+
		"V\2\2\u010b\u010c\7t\2\2\u010c\u010d\7w\2\2\u010d\u0114\7g\2\2\u010e\u010f"+
		"\7H\2\2\u010f\u0110\7c\2\2\u0110\u0111\7n\2\2\u0111\u0112\7u\2\2\u0112"+
		"\u0114\7g\2\2\u0113\u010a\3\2\2\2\u0113\u010e\3\2\2\2\u0114P\3\2\2\2\u0115"+
		"\u0117\t\6\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119R\3\2\2\2\u011a\u011c\7\62\2\2\u011b\u011a"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0123\t\7\2\2\u011e"+
		"\u011f\t\b\2\2\u011f\u0123\t\5\2\2\u0120\u0121\7\65\2\2\u0121\u0123\t"+
		"\t\2\2\u0122\u011b\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u012b\7\61\2\2\u0125\u0127\7\62\2\2\u0126\u0125\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012c\t\7\2\2\u0129"+
		"\u012a\7\63\2\2\u012a\u012c\t\n\2\2\u012b\u0126\3\2\2\2\u012b\u0129\3"+
		"\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\61\2\2\u012e\u012f\t\5\2\2\u012f"+
		"\u0130\t\5\2\2\u0130\u0131\t\5\2\2\u0131\u0132\t\5\2\2\u0132T\3\2\2\2"+
		"\u0133\u0134\t\t\2\2\u0134\u0138\t\5\2\2\u0135\u0136\7\64\2\2\u0136\u0138"+
		"\t\13\2\2\u0137\u0133\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\3\2\2\2"+
		"\u0139\u013a\7<\2\2\u013a\u013b\t\f\2\2\u013b\u013c\t\5\2\2\u013cV\3\2"+
		"\2\2\u013d\u013e\7p\2\2\u013e\u013f\7q\2\2\u013f\u0140\7v\2\2\u0140\u0141"+
		"\7a\2\2\u0141\u0142\7k\2\2\u0142\u0143\7o\2\2\u0143\u0144\7r\2\2\u0144"+
		"\u0145\7n\2\2\u0145\u0146\7g\2\2\u0146\u0147\7o\2\2\u0147\u0148\7g\2\2"+
		"\u0148\u0149\7p\2\2\u0149\u014a\7v\2\2\u014a\u014b\7g\2\2\u014b\u014c"+
		"\7f\2\2\u014cX\3\2\2\2\u014d\u014e\7p\2\2\u014e\u014f\7q\2\2\u014f\u0150"+
		"\7v\2\2\u0150\u0151\7a\2\2\u0151\u0152\7k\2\2\u0152\u0153\7o\2\2\u0153"+
		"\u0154\7r\2\2\u0154\u0155\7n\2\2\u0155\u0156\7g\2\2\u0156\u0157\7o\2\2"+
		"\u0157\u0158\7g\2\2\u0158\u0159\7p\2\2\u0159\u015a\7v\2\2\u015a\u015b"+
		"\7g\2\2\u015b\u015c\7f\2\2\u015cZ\3\2\2\2\17\2\u00f0\u00f5\u00fa\u0101"+
		"\u0108\u0113\u0118\u011b\u0122\u0126\u012b\u0137\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}