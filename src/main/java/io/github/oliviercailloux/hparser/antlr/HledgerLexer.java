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
		COMMENT_BLOCK=1, COMMENT_LINE=2, SEMICOLON=3, EOL=4, SPACE=5, START_WITHIN_COMMENT=6, 
		ACCOUNT=7, COMMODITY=8, DATE=9, OTHER_WORD=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT_BLOCK", "COMMENT_LINE", "SEMICOLON", "EOL", "SPACE", "START_WITHIN_COMMENT", 
			"ACCOUNT", "COMMODITY", "DATE", "OTHER_WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "';'", null, "' '", "'  ;'", "'account'", "'commodity'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT_BLOCK", "COMMENT_LINE", "SEMICOLON", "EOL", "SPACE", "START_WITHIN_COMMENT", 
			"ACCOUNT", "COMMODITY", "DATE", "OTHER_WORD"
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
		"\u0004\u0000\nu\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0003\u0003F\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bh\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bm\b\b\u0001\b\u0001\b\u0001\t\u0004\tr\b\t\u000b\t\f"+
		"\ts\u0002!;\u0000\n\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0001\u0000\u0005\u0001"+
		"\u000009\u0001\u0000-/\u0001\u000001\u0001\u000003\u0004\u0000\n\n\r\r"+
		"  ;;z\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001"+
		"\u0015\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u0005B\u0001"+
		"\u0000\u0000\u0000\u0007E\u0001\u0000\u0000\u0000\tI\u0001\u0000\u0000"+
		"\u0000\u000bK\u0001\u0000\u0000\u0000\rO\u0001\u0000\u0000\u0000\u000f"+
		"W\u0001\u0000\u0000\u0000\u0011a\u0001\u0000\u0000\u0000\u0013q\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005c\u0000\u0000\u0016\u0017\u0005o\u0000"+
		"\u0000\u0017\u0018\u0005m\u0000\u0000\u0018\u0019\u0005m\u0000\u0000\u0019"+
		"\u001a\u0005e\u0000\u0000\u001a\u001b\u0005n\u0000\u0000\u001b\u001c\u0005"+
		"t\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d!\u0003\u0007\u0003"+
		"\u0000\u001e \t\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" #\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0003"+
		"\u0007\u0003\u0000%&\u0005e\u0000\u0000&\'\u0005n\u0000\u0000\'(\u0005"+
		"d\u0000\u0000()\u0005 \u0000\u0000)*\u0005c\u0000\u0000*+\u0005o\u0000"+
		"\u0000+,\u0005m\u0000\u0000,-\u0005m\u0000\u0000-.\u0005e\u0000\u0000"+
		"./\u0005n\u0000\u0000/0\u0005t\u0000\u000001\u0001\u0000\u0000\u00001"+
		"2\u0003\u0007\u0003\u000023\u0001\u0000\u0000\u000034\u0006\u0000\u0000"+
		"\u00004\u0002\u0001\u0000\u0000\u000056\u0005/\u0000\u000067\u0005/\u0000"+
		"\u00007;\u0001\u0000\u0000\u00008:\t\u0000\u0000\u000098\u0001\u0000\u0000"+
		"\u0000:=\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0003"+
		"\u0007\u0003\u0000?@\u0001\u0000\u0000\u0000@A\u0006\u0001\u0000\u0000"+
		"A\u0004\u0001\u0000\u0000\u0000BC\u0005;\u0000\u0000C\u0006\u0001\u0000"+
		"\u0000\u0000DF\u0005\r\u0000\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005\n\u0000\u0000H\b\u0001"+
		"\u0000\u0000\u0000IJ\u0005 \u0000\u0000J\n\u0001\u0000\u0000\u0000KL\u0005"+
		" \u0000\u0000LM\u0005 \u0000\u0000MN\u0005;\u0000\u0000N\f\u0001\u0000"+
		"\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005c\u0000\u0000QR\u0005c\u0000"+
		"\u0000RS\u0005o\u0000\u0000ST\u0005u\u0000\u0000TU\u0005n\u0000\u0000"+
		"UV\u0005t\u0000\u0000V\u000e\u0001\u0000\u0000\u0000WX\u0005c\u0000\u0000"+
		"XY\u0005o\u0000\u0000YZ\u0005m\u0000\u0000Z[\u0005m\u0000\u0000[\\\u0005"+
		"o\u0000\u0000\\]\u0005d\u0000\u0000]^\u0005i\u0000\u0000^_\u0005t\u0000"+
		"\u0000_`\u0005y\u0000\u0000`\u0010\u0001\u0000\u0000\u0000ab\u0007\u0000"+
		"\u0000\u0000bc\u0007\u0000\u0000\u0000cd\u0007\u0000\u0000\u0000de\u0007"+
		"\u0000\u0000\u0000eg\u0007\u0001\u0000\u0000fh\u0007\u0002\u0000\u0000"+
		"gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ij\u0007\u0000\u0000\u0000jl\u0007\u0001\u0000\u0000km\u0007\u0003"+
		"\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000no\u0007\u0000\u0000\u0000o\u0012\u0001\u0000\u0000"+
		"\u0000pr\b\u0004\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0014\u0001"+
		"\u0000\u0000\u0000\u0007\u0000!;Egls\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}