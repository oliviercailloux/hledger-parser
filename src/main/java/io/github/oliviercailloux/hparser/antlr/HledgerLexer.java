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
		T__0=1, T__1=2, COMMENT_BLOCK=3, EOL=4, SPACE=5, SEP=6, ACCOUNT=7, COMMODITY=8, 
		WORD=9, DATE=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "COMMENT_BLOCK", "COMMENT_START", "COMMENT_END", "EOL", 
			"SPACE", "SEP", "ACCOUNT", "COMMODITY", "WORD", "DATE", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "';'", null, null, "' '", null, "'account'", "'commodity'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "COMMENT_BLOCK", "EOL", "SPACE", "SEP", "ACCOUNT", 
			"COMMODITY", "WORD", "DATE"
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
		"\u0004\u0000\nq\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002$\b"+
		"\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005B\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0004"+
		"\u0007J\b\u0007\u000b\u0007\f\u0007K\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\na\b\n\u000b\n\f\nb\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001%\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0000\t\u0000"+
		"\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019"+
		"\u0000\u0001\u0000\u0002\u0004\u0000\n\n\r\r  ;;\u0001\u000009q\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u001b"+
		"\u0001\u0000\u0000\u0000\u0003\u001e\u0001\u0000\u0000\u0000\u0005 \u0001"+
		"\u0000\u0000\u0000\u0007,\u0001\u0000\u0000\u0000\t4\u0001\u0000\u0000"+
		"\u0000\u000bA\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000f"+
		"G\u0001\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013U\u0001"+
		"\u0000\u0000\u0000\u0015`\u0001\u0000\u0000\u0000\u0017d\u0001\u0000\u0000"+
		"\u0000\u0019o\u0001\u0000\u0000\u0000\u001b\u001c\u0005/\u0000\u0000\u001c"+
		"\u001d\u0005/\u0000\u0000\u001d\u0002\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005;\u0000\u0000\u001f\u0004\u0001\u0000\u0000\u0000 !\u0003\u0007"+
		"\u0003\u0000!%\u0003\u000b\u0005\u0000\"$\t\u0000\u0000\u0000#\"\u0001"+
		"\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000()\u0003\u000b\u0005\u0000)*\u0003\t\u0004\u0000*+\u0003\u000b\u0005"+
		"\u0000+\u0006\u0001\u0000\u0000\u0000,-\u0005c\u0000\u0000-.\u0005o\u0000"+
		"\u0000./\u0005m\u0000\u0000/0\u0005m\u0000\u000001\u0005e\u0000\u0000"+
		"12\u0005n\u0000\u000023\u0005t\u0000\u00003\b\u0001\u0000\u0000\u0000"+
		"45\u0005e\u0000\u000056\u0005n\u0000\u000067\u0005d\u0000\u000078\u0005"+
		" \u0000\u000089\u0005c\u0000\u00009:\u0005o\u0000\u0000:;\u0005m\u0000"+
		"\u0000;<\u0005m\u0000\u0000<=\u0005e\u0000\u0000=>\u0005n\u0000\u0000"+
		">?\u0005t\u0000\u0000?\n\u0001\u0000\u0000\u0000@B\u0005\r\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CD\u0005\n\u0000\u0000D\f\u0001\u0000\u0000\u0000EF\u0005 \u0000"+
		"\u0000F\u000e\u0001\u0000\u0000\u0000GI\u0003\r\u0006\u0000HJ\u0003\r"+
		"\u0006\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0010\u0001\u0000\u0000"+
		"\u0000MN\u0005a\u0000\u0000NO\u0005c\u0000\u0000OP\u0005c\u0000\u0000"+
		"PQ\u0005o\u0000\u0000QR\u0005u\u0000\u0000RS\u0005n\u0000\u0000ST\u0005"+
		"t\u0000\u0000T\u0012\u0001\u0000\u0000\u0000UV\u0005c\u0000\u0000VW\u0005"+
		"o\u0000\u0000WX\u0005m\u0000\u0000XY\u0005m\u0000\u0000YZ\u0005o\u0000"+
		"\u0000Z[\u0005d\u0000\u0000[\\\u0005i\u0000\u0000\\]\u0005t\u0000\u0000"+
		"]^\u0005y\u0000\u0000^\u0014\u0001\u0000\u0000\u0000_a\b\u0000\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\u0016\u0001\u0000\u0000\u0000de\u0003"+
		"\u0019\f\u0000ef\u0003\u0019\f\u0000fg\u0003\u0019\f\u0000gh\u0003\u0019"+
		"\f\u0000hi\u0005-\u0000\u0000ij\u0003\u0019\f\u0000jk\u0003\u0019\f\u0000"+
		"kl\u0005-\u0000\u0000lm\u0003\u0019\f\u0000mn\u0003\u0019\f\u0000n\u0018"+
		"\u0001\u0000\u0000\u0000op\u0007\u0001\u0000\u0000p\u001a\u0001\u0000"+
		"\u0000\u0000\u0005\u0000%AKb\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}