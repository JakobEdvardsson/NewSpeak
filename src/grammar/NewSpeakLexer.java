// Generated from /home/jakobe/Documents/GitHub/Custom-Language/src/grammar/NewSpeak.g4 by ANTLR 4.13.1
package grammar;
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
		ID=10, INT=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ID", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'artsem'", "'blackwhite'", "'unagain'", "'greater'", "'ungreater'", 
			"'samegreater'", "'sameungreater'", "'dubleplus'", "'versificator'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
			"WS"
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
		"\u0004\u0000\f\u0087\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0004\tx\b\t\u000b\t\f\ty\u0001\n\u0004\n}\b\n\u000b\n\f\n~\u0001\u000b"+
		"\u0004\u000b\u0082\b\u000b\u000b\u000b\f\u000b\u0083\u0001\u000b\u0001"+
		"\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0001\u0000\u0002\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u0089\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000"+
		"\u0000\u0000\u0003 \u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000"+
		"\u00073\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000bE\u0001"+
		"\u0000\u0000\u0000\rQ\u0001\u0000\u0000\u0000\u000f_\u0001\u0000\u0000"+
		"\u0000\u0011i\u0001\u0000\u0000\u0000\u0013w\u0001\u0000\u0000\u0000\u0015"+
		"|\u0001\u0000\u0000\u0000\u0017\u0081\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005a\u0000\u0000\u001a\u001b\u0005r\u0000\u0000\u001b\u001c\u0005t"+
		"\u0000\u0000\u001c\u001d\u0005s\u0000\u0000\u001d\u001e\u0005e\u0000\u0000"+
		"\u001e\u001f\u0005m\u0000\u0000\u001f\u0002\u0001\u0000\u0000\u0000 !"+
		"\u0005b\u0000\u0000!\"\u0005l\u0000\u0000\"#\u0005a\u0000\u0000#$\u0005"+
		"c\u0000\u0000$%\u0005k\u0000\u0000%&\u0005w\u0000\u0000&\'\u0005h\u0000"+
		"\u0000\'(\u0005i\u0000\u0000()\u0005t\u0000\u0000)*\u0005e\u0000\u0000"+
		"*\u0004\u0001\u0000\u0000\u0000+,\u0005u\u0000\u0000,-\u0005n\u0000\u0000"+
		"-.\u0005a\u0000\u0000./\u0005g\u0000\u0000/0\u0005a\u0000\u000001\u0005"+
		"i\u0000\u000012\u0005n\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005"+
		"g\u0000\u000045\u0005r\u0000\u000056\u0005e\u0000\u000067\u0005a\u0000"+
		"\u000078\u0005t\u0000\u000089\u0005e\u0000\u00009:\u0005r\u0000\u0000"+
		":\b\u0001\u0000\u0000\u0000;<\u0005u\u0000\u0000<=\u0005n\u0000\u0000"+
		"=>\u0005g\u0000\u0000>?\u0005r\u0000\u0000?@\u0005e\u0000\u0000@A\u0005"+
		"a\u0000\u0000AB\u0005t\u0000\u0000BC\u0005e\u0000\u0000CD\u0005r\u0000"+
		"\u0000D\n\u0001\u0000\u0000\u0000EF\u0005s\u0000\u0000FG\u0005a\u0000"+
		"\u0000GH\u0005m\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005g\u0000\u0000"+
		"JK\u0005r\u0000\u0000KL\u0005e\u0000\u0000LM\u0005a\u0000\u0000MN\u0005"+
		"t\u0000\u0000NO\u0005e\u0000\u0000OP\u0005r\u0000\u0000P\f\u0001\u0000"+
		"\u0000\u0000QR\u0005s\u0000\u0000RS\u0005a\u0000\u0000ST\u0005m\u0000"+
		"\u0000TU\u0005e\u0000\u0000UV\u0005u\u0000\u0000VW\u0005n\u0000\u0000"+
		"WX\u0005g\u0000\u0000XY\u0005r\u0000\u0000YZ\u0005e\u0000\u0000Z[\u0005"+
		"a\u0000\u0000[\\\u0005t\u0000\u0000\\]\u0005e\u0000\u0000]^\u0005r\u0000"+
		"\u0000^\u000e\u0001\u0000\u0000\u0000_`\u0005d\u0000\u0000`a\u0005u\u0000"+
		"\u0000ab\u0005b\u0000\u0000bc\u0005l\u0000\u0000cd\u0005e\u0000\u0000"+
		"de\u0005p\u0000\u0000ef\u0005l\u0000\u0000fg\u0005u\u0000\u0000gh\u0005"+
		"s\u0000\u0000h\u0010\u0001\u0000\u0000\u0000ij\u0005v\u0000\u0000jk\u0005"+
		"e\u0000\u0000kl\u0005r\u0000\u0000lm\u0005s\u0000\u0000mn\u0005i\u0000"+
		"\u0000no\u0005f\u0000\u0000op\u0005i\u0000\u0000pq\u0005c\u0000\u0000"+
		"qr\u0005a\u0000\u0000rs\u0005t\u0000\u0000st\u0005o\u0000\u0000tu\u0005"+
		"r\u0000\u0000u\u0012\u0001\u0000\u0000\u0000vx\u0007\u0000\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z\u0014\u0001\u0000\u0000\u0000{}\u0002"+
		"09\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0016\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0007\u0001\u0000\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0006\u000b\u0000\u0000\u0086\u0018\u0001\u0000\u0000"+
		"\u0000\u0004\u0000y~\u0083\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}