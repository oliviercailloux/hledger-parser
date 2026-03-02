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
		COMMODITY=7, DATE=8, EQUALS=9, WORD=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EOL", "COMMENT_BLOCK", "COMMENT_LINE", "INLINE_COMMENT", "SEP", "ACCOUNT", 
			"COMMODITY", "DATE", "EQUALS", "WORD", "WS"
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
			"ACCOUNT", "COMMODITY", "DATE", "EQUALS", "WORD", "WS"
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
		"\u0004\u0000\u000b\u008f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001"+
		"\u0000\u0003\u0000\u0019\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002A\b\u0002\n\u0002"+
		"\f\u0002D\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0004\u0003L\b\u0003\u000b\u0003\f\u0003M\u0001\u0003"+
		"\u0001\u0003\u0005\u0003R\b\u0003\n\u0003\f\u0003U\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0004\u0004[\b\u0004\u000b\u0004"+
		"\f\u0004\\\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0005\b}\b\b\n\b\f\b\u0080\t\b\u0001\b\u0001\b\u0001\t\u0004"+
		"\t\u0085\b\t\u000b\t\f\t\u0086\u0001\n\u0004\n\u008a\b\n\u000b\n\f\n\u008b"+
		"\u0001\n\u0001\n\u0002(B\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0001\u0000\u0005\u0002\u0000\n\n\r\r\u0001\u000009\u0001\u0000"+
		"-/\u0003\u0000\n\n\r\r  \u0002\u0000\t\t  \u0097\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0001\u0018\u0001\u0000\u0000\u0000\u0003\u001c\u0001\u0000\u0000\u0000"+
		"\u0005<\u0001\u0000\u0000\u0000\u0007I\u0001\u0000\u0000\u0000\tX\u0001"+
		"\u0000\u0000\u0000\u000b^\u0001\u0000\u0000\u0000\rf\u0001\u0000\u0000"+
		"\u0000\u000fp\u0001\u0000\u0000\u0000\u0011~\u0001\u0000\u0000\u0000\u0013"+
		"\u0084\u0001\u0000\u0000\u0000\u0015\u0089\u0001\u0000\u0000\u0000\u0017"+
		"\u0019\u0005\r\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0005\n\u0000\u0000\u001b\u0002\u0001\u0000\u0000\u0000\u001c\u001d\u0005"+
		"c\u0000\u0000\u001d\u001e\u0005o\u0000\u0000\u001e\u001f\u0005m\u0000"+
		"\u0000\u001f \u0005m\u0000\u0000 !\u0005e\u0000\u0000!\"\u0005n\u0000"+
		"\u0000\"#\u0005t\u0000\u0000#$\u0001\u0000\u0000\u0000$(\u0003\u0001\u0000"+
		"\u0000%\'\t\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)+\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0003\u0001\u0000\u0000"+
		",-\u0005e\u0000\u0000-.\u0005n\u0000\u0000./\u0005d\u0000\u0000/0\u0005"+
		" \u0000\u000001\u0005c\u0000\u000012\u0005o\u0000\u000023\u0005m\u0000"+
		"\u000034\u0005m\u0000\u000045\u0005e\u0000\u000056\u0005n\u0000\u0000"+
		"67\u0005t\u0000\u000078\u0001\u0000\u0000\u000089\u0003\u0001\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:;\u0006\u0001\u0000\u0000;\u0004\u0001\u0000"+
		"\u0000\u0000<=\u0005/\u0000\u0000=>\u0005/\u0000\u0000>B\u0001\u0000\u0000"+
		"\u0000?A\t\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CE\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0003\u0001\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GH\u0006\u0002\u0000\u0000H\u0006\u0001\u0000\u0000"+
		"\u0000IK\u0005 \u0000\u0000JL\u0005 \u0000\u0000KJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OS\u0005;\u0000\u0000PR\b\u0000\u0000"+
		"\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VW\u0006\u0003\u0000\u0000W\b\u0001\u0000\u0000\u0000"+
		"XZ\u0005 \u0000\u0000Y[\u0005 \u0000\u0000ZY\u0001\u0000\u0000\u0000["+
		"\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]\n\u0001\u0000\u0000\u0000^_\u0005a\u0000\u0000_`\u0005c\u0000"+
		"\u0000`a\u0005c\u0000\u0000ab\u0005o\u0000\u0000bc\u0005u\u0000\u0000"+
		"cd\u0005n\u0000\u0000de\u0005t\u0000\u0000e\f\u0001\u0000\u0000\u0000"+
		"fg\u0005c\u0000\u0000gh\u0005o\u0000\u0000hi\u0005m\u0000\u0000ij\u0005"+
		"m\u0000\u0000jk\u0005o\u0000\u0000kl\u0005d\u0000\u0000lm\u0005i\u0000"+
		"\u0000mn\u0005t\u0000\u0000no\u0005y\u0000\u0000o\u000e\u0001\u0000\u0000"+
		"\u0000pq\u0007\u0001\u0000\u0000qr\u0007\u0001\u0000\u0000rs\u0007\u0001"+
		"\u0000\u0000st\u0007\u0001\u0000\u0000tu\u0007\u0002\u0000\u0000uv\u0007"+
		"\u0001\u0000\u0000vw\u0007\u0001\u0000\u0000wx\u0007\u0002\u0000\u0000"+
		"xy\u0007\u0001\u0000\u0000yz\u0007\u0001\u0000\u0000z\u0010\u0001\u0000"+
		"\u0000\u0000{}\u0005 \u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005=\u0000\u0000\u0082\u0012\u0001\u0000\u0000\u0000\u0083"+
		"\u0085\b\u0003\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0014\u0001\u0000\u0000\u0000\u0088\u008a"+
		"\u0007\u0004\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0006\n\u0000\u0000\u008e\u0016\u0001\u0000\u0000\u0000\n\u0000\u0018"+
		"(BMS\\~\u0086\u008b\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}