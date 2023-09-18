// Generated from /home/jakobe/Documents/GitHub/Custom-Language/src/NewSpeak/grammar/NewSpeak.g4 by ANTLR 4.13.1
package NewSpeak.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class NewSpeakLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, INT=13, WS=14, COMMENT=15, MULTILINE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "ID", "INT", "WS", "COMMENT", "MULTILINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'artsem'", "'blackwhite'", "'again'", "'unagain'", "'greater'", 
			"'ungreater'", "'samegreater'", "'sameungreater'", "'dubleplus'", "'versificator'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "INT", "WS", "COMMENT", "MULTILINE"
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


	public NewSpeakLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NewSpeak.g4"; }

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
		"\u0004\u0000\u0010\u00bd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0004\u000b\u0088\b\u000b\u000b\u000b\f\u000b\u0089"+
		"\u0001\f\u0004\f\u008d\b\f\u000b\f\f\f\u008e\u0001\r\u0004\r\u0092\b\r"+
		"\u000b\r\f\r\u0093\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u009c\b\u000e\n\u000e\f\u000e\u009f\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00a6"+
		"\b\u000e\n\u000e\f\u000e\u00a9\t\u000e\u0001\u000e\u0003\u000e\u00ac\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00b4\b\u000f\n\u000f\f\u000f\u00b7\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u009d\u00a7\u00b5"+
		"\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0002\u0002\u0000AZaz\u0003"+
		"\u0000\t\n\r\r  \u00c3\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000"+
		"\u0005*\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t;\u0001"+
		"\u0000\u0000\u0000\u000bC\u0001\u0000\u0000\u0000\rK\u0001\u0000\u0000"+
		"\u0000\u000fU\u0001\u0000\u0000\u0000\u0011a\u0001\u0000\u0000\u0000\u0013"+
		"o\u0001\u0000\u0000\u0000\u0015y\u0001\u0000\u0000\u0000\u0017\u0087\u0001"+
		"\u0000\u0000\u0000\u0019\u008c\u0001\u0000\u0000\u0000\u001b\u0091\u0001"+
		"\u0000\u0000\u0000\u001d\u00ab\u0001\u0000\u0000\u0000\u001f\u00af\u0001"+
		"\u0000\u0000\u0000!\"\u0005;\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000"+
		"#$\u0005a\u0000\u0000$%\u0005r\u0000\u0000%&\u0005t\u0000\u0000&\'\u0005"+
		"s\u0000\u0000\'(\u0005e\u0000\u0000()\u0005m\u0000\u0000)\u0004\u0001"+
		"\u0000\u0000\u0000*+\u0005b\u0000\u0000+,\u0005l\u0000\u0000,-\u0005a"+
		"\u0000\u0000-.\u0005c\u0000\u0000./\u0005k\u0000\u0000/0\u0005w\u0000"+
		"\u000001\u0005h\u0000\u000012\u0005i\u0000\u000023\u0005t\u0000\u0000"+
		"34\u0005e\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005a\u0000\u0000"+
		"67\u0005g\u0000\u000078\u0005a\u0000\u000089\u0005i\u0000\u00009:\u0005"+
		"n\u0000\u0000:\b\u0001\u0000\u0000\u0000;<\u0005u\u0000\u0000<=\u0005"+
		"n\u0000\u0000=>\u0005a\u0000\u0000>?\u0005g\u0000\u0000?@\u0005a\u0000"+
		"\u0000@A\u0005i\u0000\u0000AB\u0005n\u0000\u0000B\n\u0001\u0000\u0000"+
		"\u0000CD\u0005g\u0000\u0000DE\u0005r\u0000\u0000EF\u0005e\u0000\u0000"+
		"FG\u0005a\u0000\u0000GH\u0005t\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005"+
		"r\u0000\u0000J\f\u0001\u0000\u0000\u0000KL\u0005u\u0000\u0000LM\u0005"+
		"n\u0000\u0000MN\u0005g\u0000\u0000NO\u0005r\u0000\u0000OP\u0005e\u0000"+
		"\u0000PQ\u0005a\u0000\u0000QR\u0005t\u0000\u0000RS\u0005e\u0000\u0000"+
		"ST\u0005r\u0000\u0000T\u000e\u0001\u0000\u0000\u0000UV\u0005s\u0000\u0000"+
		"VW\u0005a\u0000\u0000WX\u0005m\u0000\u0000XY\u0005e\u0000\u0000YZ\u0005"+
		"g\u0000\u0000Z[\u0005r\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005a\u0000"+
		"\u0000]^\u0005t\u0000\u0000^_\u0005e\u0000\u0000_`\u0005r\u0000\u0000"+
		"`\u0010\u0001\u0000\u0000\u0000ab\u0005s\u0000\u0000bc\u0005a\u0000\u0000"+
		"cd\u0005m\u0000\u0000de\u0005e\u0000\u0000ef\u0005u\u0000\u0000fg\u0005"+
		"n\u0000\u0000gh\u0005g\u0000\u0000hi\u0005r\u0000\u0000ij\u0005e\u0000"+
		"\u0000jk\u0005a\u0000\u0000kl\u0005t\u0000\u0000lm\u0005e\u0000\u0000"+
		"mn\u0005r\u0000\u0000n\u0012\u0001\u0000\u0000\u0000op\u0005d\u0000\u0000"+
		"pq\u0005u\u0000\u0000qr\u0005b\u0000\u0000rs\u0005l\u0000\u0000st\u0005"+
		"e\u0000\u0000tu\u0005p\u0000\u0000uv\u0005l\u0000\u0000vw\u0005u\u0000"+
		"\u0000wx\u0005s\u0000\u0000x\u0014\u0001\u0000\u0000\u0000yz\u0005v\u0000"+
		"\u0000z{\u0005e\u0000\u0000{|\u0005r\u0000\u0000|}\u0005s\u0000\u0000"+
		"}~\u0005i\u0000\u0000~\u007f\u0005f\u0000\u0000\u007f\u0080\u0005i\u0000"+
		"\u0000\u0080\u0081\u0005c\u0000\u0000\u0081\u0082\u0005a\u0000\u0000\u0082"+
		"\u0083\u0005t\u0000\u0000\u0083\u0084\u0005o\u0000\u0000\u0084\u0085\u0005"+
		"r\u0000\u0000\u0085\u0016\u0001\u0000\u0000\u0000\u0086\u0088\u0007\u0000"+
		"\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u0018\u0001\u0000\u0000\u0000\u008b\u008d\u000209\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u001a\u0001\u0000\u0000\u0000\u0090\u0092\u0007\u0001\u0000\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0006\r\u0000\u0000\u0096"+
		"\u001c\u0001\u0000\u0000\u0000\u0097\u0098\u0005/\u0000\u0000\u0098\u0099"+
		"\u0005/\u0000\u0000\u0099\u009d\u0001\u0000\u0000\u0000\u009a\u009c\t"+
		"\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u00a0\u00ac\u0005\n\u0000\u0000\u00a1\u00a2\u0005/"+
		"\u0000\u0000\u00a2\u00a3\u0005/\u0000\u0000\u00a3\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\t\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005\u0000\u0000\u0001"+
		"\u00ab\u0097\u0001\u0000\u0000\u0000\u00ab\u00a1\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0006\u000e\u0000\u0000"+
		"\u00ae\u001e\u0001\u0000\u0000\u0000\u00af\u00b0\u0005/\u0000\u0000\u00b0"+
		"\u00b1\u0005*\u0000\u0000\u00b1\u00b5\u0001\u0000\u0000\u0000\u00b2\u00b4"+
		"\t\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005*\u0000\u0000\u00b9\u00ba\u0005/\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0006\u000f\u0000"+
		"\u0000\u00bc \u0001\u0000\u0000\u0000\b\u0000\u0089\u008e\u0093\u009d"+
		"\u00a7\u00ab\u00b5\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}