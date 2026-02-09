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
		T__0=1, EOL=2, SPACE=3, SEP=4, ACCOUNT=5, WORD=6, COMMENT_LINE=7, COMMENT_BLOCK=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "EOL", "SPACE", "SEP", "ACCOUNT", "WORD", "COMMENT_LINE", "COMMENT_BLOCK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", null, "' '", null, "'account'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "EOL", "SPACE", "SEP", "ACCOUNT", "WORD", "COMMENT_LINE", 
			"COMMENT_BLOCK"
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
		"\u0004\u0000\bZ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001\u0015\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0004\u0003\u001d\b\u0003\u000b\u0003\f\u0003\u001e\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0004\u0005*\b\u0005\u000b\u0005\f\u0005+\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u00062\b\u0006\n\u0006\f\u0006"+
		"5\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007E\b\u0007\n\u0007\f\u0007"+
		"H\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u00023F\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0001\u0000\u0001\u0004\u0000\n\n\r\r  ;"+
		";^\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0011"+
		"\u0001\u0000\u0000\u0000\u0003\u0014\u0001\u0000\u0000\u0000\u0005\u0018"+
		"\u0001\u0000\u0000\u0000\u0007\u001a\u0001\u0000\u0000\u0000\t \u0001"+
		"\u0000\u0000\u0000\u000b)\u0001\u0000\u0000\u0000\r-\u0001\u0000\u0000"+
		"\u0000\u000f:\u0001\u0000\u0000\u0000\u0011\u0012\u0005;\u0000\u0000\u0012"+
		"\u0002\u0001\u0000\u0000\u0000\u0013\u0015\u0005\r\u0000\u0000\u0014\u0013"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0005\n\u0000\u0000\u0017\u0004\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0005 \u0000\u0000\u0019\u0006\u0001\u0000"+
		"\u0000\u0000\u001a\u001c\u0003\u0005\u0002\u0000\u001b\u001d\u0003\u0005"+
		"\u0002\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000"+
		"\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f\b\u0001\u0000\u0000\u0000 !\u0005a\u0000\u0000!\"\u0005"+
		"c\u0000\u0000\"#\u0005c\u0000\u0000#$\u0005o\u0000\u0000$%\u0005u\u0000"+
		"\u0000%&\u0005n\u0000\u0000&\'\u0005t\u0000\u0000\'\n\u0001\u0000\u0000"+
		"\u0000(*\b\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\f\u0001\u0000"+
		"\u0000\u0000-.\u0005/\u0000\u0000./\u0005/\u0000\u0000/3\u0001\u0000\u0000"+
		"\u000002\t\u0000\u0000\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000046\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000067\u0003\u0003\u0001\u000078\u0001"+
		"\u0000\u0000\u000089\u0006\u0006\u0000\u00009\u000e\u0001\u0000\u0000"+
		"\u0000:;\u0005c\u0000\u0000;<\u0005o\u0000\u0000<=\u0005m\u0000\u0000"+
		"=>\u0005m\u0000\u0000>?\u0005e\u0000\u0000?@\u0005n\u0000\u0000@A\u0005"+
		"t\u0000\u0000AB\u0001\u0000\u0000\u0000BF\u0003\u0003\u0001\u0000CE\t"+
		"\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\n\u0000\u0000JK\u0005e\u0000"+
		"\u0000KL\u0005n\u0000\u0000LM\u0005d\u0000\u0000MN\u0005 \u0000\u0000"+
		"NO\u0005c\u0000\u0000OP\u0005o\u0000\u0000PQ\u0005m\u0000\u0000QR\u0005"+
		"m\u0000\u0000RS\u0005e\u0000\u0000ST\u0005n\u0000\u0000TU\u0005t\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VW\u0003\u0003\u0001\u0000WX\u0001\u0000"+
		"\u0000\u0000XY\u0006\u0007\u0000\u0000Y\u0010\u0001\u0000\u0000\u0000"+
		"\u0006\u0000\u0014\u001e+3F\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}