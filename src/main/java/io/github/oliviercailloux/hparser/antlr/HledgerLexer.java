// Generated from io/github/oliviercailloux/hparser/antlr/Hledger.g4 by ANTLR 4.13.2
package io.github.oliviercailloux.hparser.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HledgerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, COMMENT_BLOCK=2, COMMENT_LINE=3, INLINE_COMMENT=4, SEP=5, ACCOUNT=6, 
		COMMODITY=7, DATE=8, P_WORD=9, STAR=10, EQUALS=11, WORD=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EOL", "COMMENT_BLOCK", "COMMENT_LINE", "INLINE_COMMENT", "SEP", "ACCOUNT", 
			"COMMODITY", "DATE", "P_WORD", "STAR", "EQUALS", "WORD", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'account'", "'commodity'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EOL", "COMMENT_BLOCK", "COMMENT_LINE", "INLINE_COMMENT", "SEP", 
			"ACCOUNT", "COMMODITY", "DATE", "P_WORD", "STAR", "EQUALS", "WORD", "WS"
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


	public HledgerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hledger.g4"; }

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
		"\u0004\u0000\r\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001+\b\u0001\n\u0001\f\u0001.\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002D\b\u0002\u0001\u0002\u0005\u0002G\b\u0002\n\u0002\f\u0002J\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0004\u0003R\b\u0003\u000b\u0003\f\u0003S\u0001\u0003\u0001\u0003\u0005"+
		"\u0003X\b\u0003\n\u0003\f\u0003[\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0004\u0004a\b\u0004\u000b\u0004\f\u0004b\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0004"+
		"\b\u0084\b\b\u000b\b\f\b\u0085\u0001\t\u0001\t\u0004\t\u008a\b\t\u000b"+
		"\t\f\t\u008b\u0001\n\u0005\n\u008f\b\n\n\n\f\n\u0092\t\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0004\u000b\u0097\b\u000b\u000b\u000b\f\u000b\u0098\u0001"+
		"\f\u0004\f\u009c\b\f\u000b\f\f\f\u009d\u0001\f\u0001\f\u0002,H\u0000\r"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000"+
		"\u0005\u0002\u0000\n\n\r\r\u0001\u000009\u0001\u0000-/\u0003\u0000\n\n"+
		"\r\r  \u0002\u0000\t\t  \u00ac\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001c\u0001"+
		"\u0000\u0000\u0000\u0003 \u0001\u0000\u0000\u0000\u0005C\u0001\u0000\u0000"+
		"\u0000\u0007O\u0001\u0000\u0000\u0000\t^\u0001\u0000\u0000\u0000\u000b"+
		"d\u0001\u0000\u0000\u0000\rl\u0001\u0000\u0000\u0000\u000fv\u0001\u0000"+
		"\u0000\u0000\u0011\u0081\u0001\u0000\u0000\u0000\u0013\u0087\u0001\u0000"+
		"\u0000\u0000\u0015\u0090\u0001\u0000\u0000\u0000\u0017\u0096\u0001\u0000"+
		"\u0000\u0000\u0019\u009b\u0001\u0000\u0000\u0000\u001b\u001d\u0005\r\u0000"+
		"\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0005\n\u0000\u0000"+
		"\u001f\u0002\u0001\u0000\u0000\u0000 !\u0005c\u0000\u0000!\"\u0005o\u0000"+
		"\u0000\"#\u0005m\u0000\u0000#$\u0005m\u0000\u0000$%\u0005e\u0000\u0000"+
		"%&\u0005n\u0000\u0000&\'\u0005t\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(,\u0003\u0001\u0000\u0000)+\t\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0003\u0001"+
		"\u0000\u000001\u0005e\u0000\u000012\u0005n\u0000\u000023\u0005d\u0000"+
		"\u000034\u0005 \u0000\u000045\u0005c\u0000\u000056\u0005o\u0000\u0000"+
		"67\u0005m\u0000\u000078\u0005m\u0000\u000089\u0005e\u0000\u00009:\u0005"+
		"n\u0000\u0000:;\u0005t\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0003\u0001"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0006\u0001\u0000\u0000?\u0004"+
		"\u0001\u0000\u0000\u0000@A\u0005/\u0000\u0000AD\u0005/\u0000\u0000BD\u0005"+
		"#\u0000\u0000C@\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000DH\u0001"+
		"\u0000\u0000\u0000EG\t\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0003\u0001\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0006\u0002\u0000\u0000N\u0006\u0001"+
		"\u0000\u0000\u0000OQ\u0005 \u0000\u0000PR\u0005 \u0000\u0000QP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UY\u0005;\u0000\u0000VX\b"+
		"\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000\\]\u0006\u0003\u0000\u0000]\b\u0001\u0000"+
		"\u0000\u0000^`\u0005 \u0000\u0000_a\u0005 \u0000\u0000`_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000c\n\u0001\u0000\u0000\u0000de\u0005a\u0000\u0000ef\u0005c"+
		"\u0000\u0000fg\u0005c\u0000\u0000gh\u0005o\u0000\u0000hi\u0005u\u0000"+
		"\u0000ij\u0005n\u0000\u0000jk\u0005t\u0000\u0000k\f\u0001\u0000\u0000"+
		"\u0000lm\u0005c\u0000\u0000mn\u0005o\u0000\u0000no\u0005m\u0000\u0000"+
		"op\u0005m\u0000\u0000pq\u0005o\u0000\u0000qr\u0005d\u0000\u0000rs\u0005"+
		"i\u0000\u0000st\u0005t\u0000\u0000tu\u0005y\u0000\u0000u\u000e\u0001\u0000"+
		"\u0000\u0000vw\u0007\u0001\u0000\u0000wx\u0007\u0001\u0000\u0000xy\u0007"+
		"\u0001\u0000\u0000yz\u0007\u0001\u0000\u0000z{\u0007\u0002\u0000\u0000"+
		"{|\u0007\u0001\u0000\u0000|}\u0007\u0001\u0000\u0000}~\u0007\u0002\u0000"+
		"\u0000~\u007f\u0007\u0001\u0000\u0000\u007f\u0080\u0007\u0001\u0000\u0000"+
		"\u0080\u0010\u0001\u0000\u0000\u0000\u0081\u0083\u0005P\u0000\u0000\u0082"+
		"\u0084\u0005 \u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0012\u0001\u0000\u0000\u0000\u0087\u0089"+
		"\u0005*\u0000\u0000\u0088\u008a\u0005 \u0000\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0014\u0001\u0000"+
		"\u0000\u0000\u008d\u008f\u0005 \u0000\u0000\u008e\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005=\u0000\u0000"+
		"\u0094\u0016\u0001\u0000\u0000\u0000\u0095\u0097\b\u0003\u0000\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u0018\u0001\u0000\u0000\u0000\u009a\u009c\u0007\u0004\u0000\u0000\u009b"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0006\f\u0000\u0000\u00a0\u001a"+
		"\u0001\u0000\u0000\u0000\r\u0000\u001c,CHSYb\u0085\u008b\u0090\u0098\u009d"+
		"\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}