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
		"\u0004\u0000\u000b\u0091\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001"+
		"\u0000\u0003\u0000\u0019\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002@\b\u0002\u0001\u0002\u0005"+
		"\u0002C\b\u0002\n\u0002\f\u0002F\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0004\u0003N\b\u0003\u000b"+
		"\u0003\f\u0003O\u0001\u0003\u0001\u0003\u0005\u0003T\b\u0003\n\u0003\f"+
		"\u0003W\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0004"+
		"\u0004]\b\u0004\u000b\u0004\f\u0004^\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0005\b\u007f\b\b\n\b\f\b\u0082\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0004\t\u0087\b\t\u000b\t\f\t\u0088\u0001\n\u0004\n"+
		"\u008c\b\n\u000b\n\f\n\u008d\u0001\n\u0001\n\u0002(D\u0000\u000b\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000\u0005\u0002\u0000\n\n"+
		"\r\r\u0001\u000009\u0001\u0000-/\u0003\u0000\n\n\r\r  \u0002\u0000\t\t"+
		"  \u009a\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0001\u0018\u0001\u0000\u0000\u0000\u0003"+
		"\u001c\u0001\u0000\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007K\u0001"+
		"\u0000\u0000\u0000\tZ\u0001\u0000\u0000\u0000\u000b`\u0001\u0000\u0000"+
		"\u0000\rh\u0001\u0000\u0000\u0000\u000fr\u0001\u0000\u0000\u0000\u0011"+
		"\u0080\u0001\u0000\u0000\u0000\u0013\u0086\u0001\u0000\u0000\u0000\u0015"+
		"\u008b\u0001\u0000\u0000\u0000\u0017\u0019\u0005\r\u0000\u0000\u0018\u0017"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0005\n\u0000\u0000\u001b\u0002\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0005c\u0000\u0000\u001d\u001e\u0005o\u0000"+
		"\u0000\u001e\u001f\u0005m\u0000\u0000\u001f \u0005m\u0000\u0000 !\u0005"+
		"e\u0000\u0000!\"\u0005n\u0000\u0000\"#\u0005t\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$(\u0003\u0001\u0000\u0000%\'\t\u0000\u0000\u0000&%\u0001"+
		"\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000+,\u0003\u0001\u0000\u0000,-\u0005e\u0000\u0000-.\u0005n\u0000\u0000"+
		"./\u0005d\u0000\u0000/0\u0005 \u0000\u000001\u0005c\u0000\u000012\u0005"+
		"o\u0000\u000023\u0005m\u0000\u000034\u0005m\u0000\u000045\u0005e\u0000"+
		"\u000056\u0005n\u0000\u000067\u0005t\u0000\u000078\u0001\u0000\u0000\u0000"+
		"89\u0003\u0001\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0006\u0001\u0000"+
		"\u0000;\u0004\u0001\u0000\u0000\u0000<=\u0005/\u0000\u0000=@\u0005/\u0000"+
		"\u0000>@\u0005#\u0000\u0000?<\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000"+
		"\u0000@D\u0001\u0000\u0000\u0000AC\t\u0000\u0000\u0000BA\u0001\u0000\u0000"+
		"\u0000CF\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0003"+
		"\u0001\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0006\u0002\u0000\u0000"+
		"J\u0006\u0001\u0000\u0000\u0000KM\u0005 \u0000\u0000LN\u0005 \u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QU\u0005;\u0000"+
		"\u0000RT\b\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0006\u0003\u0000\u0000Y\b\u0001"+
		"\u0000\u0000\u0000Z\\\u0005 \u0000\u0000[]\u0005 \u0000\u0000\\[\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_\n\u0001\u0000\u0000\u0000`a\u0005a\u0000\u0000"+
		"ab\u0005c\u0000\u0000bc\u0005c\u0000\u0000cd\u0005o\u0000\u0000de\u0005"+
		"u\u0000\u0000ef\u0005n\u0000\u0000fg\u0005t\u0000\u0000g\f\u0001\u0000"+
		"\u0000\u0000hi\u0005c\u0000\u0000ij\u0005o\u0000\u0000jk\u0005m\u0000"+
		"\u0000kl\u0005m\u0000\u0000lm\u0005o\u0000\u0000mn\u0005d\u0000\u0000"+
		"no\u0005i\u0000\u0000op\u0005t\u0000\u0000pq\u0005y\u0000\u0000q\u000e"+
		"\u0001\u0000\u0000\u0000rs\u0007\u0001\u0000\u0000st\u0007\u0001\u0000"+
		"\u0000tu\u0007\u0001\u0000\u0000uv\u0007\u0001\u0000\u0000vw\u0007\u0002"+
		"\u0000\u0000wx\u0007\u0001\u0000\u0000xy\u0007\u0001\u0000\u0000yz\u0007"+
		"\u0002\u0000\u0000z{\u0007\u0001\u0000\u0000{|\u0007\u0001\u0000\u0000"+
		"|\u0010\u0001\u0000\u0000\u0000}\u007f\u0005 \u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0005=\u0000\u0000"+
		"\u0084\u0012\u0001\u0000\u0000\u0000\u0085\u0087\b\u0003\u0000\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u0014\u0001\u0000\u0000\u0000\u008a\u008c\u0007\u0004\u0000\u0000\u008b"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0006\n\u0000\u0000\u0090\u0016"+
		"\u0001\u0000\u0000\u0000\u000b\u0000\u0018(?DOU^\u0080\u0088\u008d\u0001"+
		"\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}