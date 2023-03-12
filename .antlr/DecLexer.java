// Generated from d:\KTK\scheduler-language\Dec.g4 by ANTLR 4.9.2
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
		T__9=10, T__10=11, TYPENAME=12, VARNAME=13, SPACE=14, NEWLINE=15, INT=16, 
		BOOL=17, STRING=18, DATE=19, TIME=20, CLASS=21, DAY=22, WEEK=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "TYPENAME", "VARNAME", "SPACE", "NEWLINE", "INT", "BOOL", 
			"STRING", "DATE", "TIME", "CLASS", "DAY", "WEEK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'IF'", "'DEF'", "'('", "')'", "','", "'='", "'*'", "'/'", 
			"'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"TYPENAME", "VARNAME", "SPACE", "NEWLINE", "INT", "BOOL", "STRING", "DATE", 
			"TIME", "CLASS", "DAY", "WEEK"
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
	public String getGrammarFileName() { return "Dec.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\rl\n\r\3\16\6\16o\n\16\r\16\16\16p\3\17\6\17t\n"+
		"\17\r\17\16\17u\3\17\3\17\3\20\6\20{\n\20\r\20\16\20|\3\20\3\20\3\21\6"+
		"\21\u0082\n\21\r\21\16\21\u0083\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u008f\n\22\3\23\6\23\u0092\n\23\r\23\16\23\u0093\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u009c\n\24\3\25\3\25\3\25\3\25\5\25\u00a2\n"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\2\2\31\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\3\2\f\4\2C\\c|\3\2\"\"\4\2\f\f\17\17\3\2"+
		"\62;\5\2\62;C\\c|\3\2\63;\3\2\63\64\3\2\62\63\3\2\62\65\3\2\62\67\2\u00e6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\3\61\3\2\2\2\5\63\3\2\2\2\7\66\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r>\3"+
		"\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31"+
		"k\3\2\2\2\33n\3\2\2\2\35s\3\2\2\2\37z\3\2\2\2!\u0081\3\2\2\2#\u008e\3"+
		"\2\2\2%\u0091\3\2\2\2\'\u009b\3\2\2\2)\u00a1\3\2\2\2+\u00a7\3\2\2\2-\u00b7"+
		"\3\2\2\2/\u00c7\3\2\2\2\61\62\7=\2\2\62\4\3\2\2\2\63\64\7K\2\2\64\65\7"+
		"H\2\2\65\6\3\2\2\2\66\67\7F\2\2\678\7G\2\289\7H\2\29\b\3\2\2\2:;\7*\2"+
		"\2;\n\3\2\2\2<=\7+\2\2=\f\3\2\2\2>?\7.\2\2?\16\3\2\2\2@A\7?\2\2A\20\3"+
		"\2\2\2BC\7,\2\2C\22\3\2\2\2DE\7\61\2\2E\24\3\2\2\2FG\7-\2\2G\26\3\2\2"+
		"\2HI\7/\2\2I\30\3\2\2\2JK\7K\2\2KL\7P\2\2Ll\7V\2\2MN\7D\2\2NO\7Q\2\2O"+
		"P\7Q\2\2Pl\7N\2\2QR\7U\2\2RS\7V\2\2ST\7T\2\2TU\7K\2\2UV\7P\2\2Vl\7I\2"+
		"\2WX\7F\2\2XY\7C\2\2YZ\7V\2\2Zl\7G\2\2[\\\7V\2\2\\]\7K\2\2]^\7O\2\2^l"+
		"\7G\2\2_`\7E\2\2`a\7N\2\2ab\7C\2\2bc\7U\2\2cl\7U\2\2de\7F\2\2ef\7C\2\2"+
		"fl\7[\2\2gh\7Y\2\2hi\7G\2\2ij\7G\2\2jl\7M\2\2kJ\3\2\2\2kM\3\2\2\2kQ\3"+
		"\2\2\2kW\3\2\2\2k[\3\2\2\2k_\3\2\2\2kd\3\2\2\2kg\3\2\2\2l\32\3\2\2\2m"+
		"o\t\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\34\3\2\2\2rt\t\3\2"+
		"\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\17\2\2x\36\3"+
		"\2\2\2y{\t\4\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177"+
		"\b\20\2\2\177 \3\2\2\2\u0080\u0082\t\5\2\2\u0081\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\"\3\2\2\2\u0085"+
		"\u0086\7V\2\2\u0086\u0087\7t\2\2\u0087\u0088\7w\2\2\u0088\u008f\7g\2\2"+
		"\u0089\u008a\7H\2\2\u008a\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\u008d"+
		"\7u\2\2\u008d\u008f\7g\2\2\u008e\u0085\3\2\2\2\u008e\u0089\3\2\2\2\u008f"+
		"$\3\2\2\2\u0090\u0092\t\6\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094&\3\2\2\2\u0095\u0096\7"+
		"\62\2\2\u0096\u009c\t\7\2\2\u0097\u0098\t\b\2\2\u0098\u009c\t\5\2\2\u0099"+
		"\u009a\7\65\2\2\u009a\u009c\t\t\2\2\u009b\u0095\3\2\2\2\u009b\u0097\3"+
		"\2\2\2\u009b\u0099\3\2\2\2\u009c(\3\2\2\2\u009d\u009e\t\t\2\2\u009e\u00a2"+
		"\t\5\2\2\u009f\u00a0\7\64\2\2\u00a0\u00a2\t\n\2\2\u00a1\u009d\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7<\2\2\u00a4\u00a5"+
		"\t\13\2\2\u00a5\u00a6\t\5\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\u00a9\7q\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7a\2\2\u00ab\u00ac\7k\2\2"+
		"\u00ac\u00ad\7o\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7n\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7p\2\2\u00b3"+
		"\u00b4\7v\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7f\2\2\u00b6,\3\2\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7a\2\2"+
		"\u00bb\u00bc\7k\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7r\2\2\u00be\u00bf"+
		"\7n\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7f\2\2"+
		"\u00c6.\3\2\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7v\2"+
		"\2\u00ca\u00cb\7a\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7o\2\2\u00cd\u00ce"+
		"\7r\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7o\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5\u00d6\7f\2\2\u00d6\60\3\2\2\2\f\2kpu|\u0083\u008e\u0093\u009b\u00a1"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}