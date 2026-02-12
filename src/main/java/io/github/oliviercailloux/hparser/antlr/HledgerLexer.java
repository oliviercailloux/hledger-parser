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
		COMMENT_BLOCK=1, COMMENT_LINE=2, SEMICOLON=3, EQUALS=4, EOL=5, SPACE=6, 
		START_WITHIN_COMMENT=7, START_ASSERTION=8, ACCOUNT=9, COMMODITY=10, DATE=11, 
		OTHER_WORD=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT_BLOCK", "COMMENT_LINE", "SEMICOLON", "EQUALS", "EOL", "SPACE", 
			"START_WITHIN_COMMENT", "START_ASSERTION", "ACCOUNT", "COMMODITY", "DATE", 
			"OTHER_WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "';'", "'='", null, "' '", "'  ;'", "'  ='", "'account'", 
			"'commodity'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT_BLOCK", "COMMENT_LINE", "SEMICOLON", "EQUALS", "EOL", 
			"SPACE", "START_WITHIN_COMMENT", "START_ASSERTION", "ACCOUNT", "COMMODITY", 
			"DATE", "OTHER_WORD"
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
		"\u0004\u0000\f\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"$\b\u0000\n\u0000\f\u0000\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001>\b\u0001\n\u0001\f\u0001A\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0003\u0004L\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\nr\b\n\u0001\n\u0001\n\u0001\n\u0003\nw\b\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0004\u000b|\b\u000b\u000b\u000b\f\u000b}\u0002%?\u0000"+
		"\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u0005"+
		"\u0001\u000009\u0001\u0000-/\u0001\u000001\u0001\u000003\u0005\u0000\n"+
		"\n\r\r  ;;==\u0084\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u00039\u0001\u0000\u0000\u0000"+
		"\u0005F\u0001\u0000\u0000\u0000\u0007H\u0001\u0000\u0000\u0000\tK\u0001"+
		"\u0000\u0000\u0000\u000bO\u0001\u0000\u0000\u0000\rQ\u0001\u0000\u0000"+
		"\u0000\u000fU\u0001\u0000\u0000\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013"+
		"a\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000\u0000\u0017{\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005c\u0000\u0000\u001a\u001b\u0005o\u0000"+
		"\u0000\u001b\u001c\u0005m\u0000\u0000\u001c\u001d\u0005m\u0000\u0000\u001d"+
		"\u001e\u0005e\u0000\u0000\u001e\u001f\u0005n\u0000\u0000\u001f \u0005"+
		"t\u0000\u0000 !\u0001\u0000\u0000\u0000!%\u0003\t\u0004\u0000\"$\t\u0000"+
		"\u0000\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000()\u0003\t\u0004\u0000)*\u0005e\u0000\u0000"+
		"*+\u0005n\u0000\u0000+,\u0005d\u0000\u0000,-\u0005 \u0000\u0000-.\u0005"+
		"c\u0000\u0000./\u0005o\u0000\u0000/0\u0005m\u0000\u000001\u0005m\u0000"+
		"\u000012\u0005e\u0000\u000023\u0005n\u0000\u000034\u0005t\u0000\u0000"+
		"45\u0001\u0000\u0000\u000056\u0003\t\u0004\u000067\u0001\u0000\u0000\u0000"+
		"78\u0006\u0000\u0000\u00008\u0002\u0001\u0000\u0000\u00009:\u0005/\u0000"+
		"\u0000:;\u0005/\u0000\u0000;?\u0001\u0000\u0000\u0000<>\t\u0000\u0000"+
		"\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000BC\u0003\t\u0004\u0000CD\u0001\u0000\u0000\u0000DE\u0006"+
		"\u0001\u0000\u0000E\u0004\u0001\u0000\u0000\u0000FG\u0005;\u0000\u0000"+
		"G\u0006\u0001\u0000\u0000\u0000HI\u0005=\u0000\u0000I\b\u0001\u0000\u0000"+
		"\u0000JL\u0005\r\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0005\n\u0000\u0000N\n\u0001\u0000"+
		"\u0000\u0000OP\u0005 \u0000\u0000P\f\u0001\u0000\u0000\u0000QR\u0005 "+
		"\u0000\u0000RS\u0005 \u0000\u0000ST\u0005;\u0000\u0000T\u000e\u0001\u0000"+
		"\u0000\u0000UV\u0005 \u0000\u0000VW\u0005 \u0000\u0000WX\u0005=\u0000"+
		"\u0000X\u0010\u0001\u0000\u0000\u0000YZ\u0005a\u0000\u0000Z[\u0005c\u0000"+
		"\u0000[\\\u0005c\u0000\u0000\\]\u0005o\u0000\u0000]^\u0005u\u0000\u0000"+
		"^_\u0005n\u0000\u0000_`\u0005t\u0000\u0000`\u0012\u0001\u0000\u0000\u0000"+
		"ab\u0005c\u0000\u0000bc\u0005o\u0000\u0000cd\u0005m\u0000\u0000de\u0005"+
		"m\u0000\u0000ef\u0005o\u0000\u0000fg\u0005d\u0000\u0000gh\u0005i\u0000"+
		"\u0000hi\u0005t\u0000\u0000ij\u0005y\u0000\u0000j\u0014\u0001\u0000\u0000"+
		"\u0000kl\u0007\u0000\u0000\u0000lm\u0007\u0000\u0000\u0000mn\u0007\u0000"+
		"\u0000\u0000no\u0007\u0000\u0000\u0000oq\u0007\u0001\u0000\u0000pr\u0007"+
		"\u0002\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0007\u0000\u0000\u0000tv\u0007\u0001\u0000"+
		"\u0000uw\u0007\u0003\u0000\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0007\u0000\u0000\u0000y\u0016"+
		"\u0001\u0000\u0000\u0000z|\b\u0004\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u0018\u0001\u0000\u0000\u0000\u0007\u0000%?Kqv}\u0001\u0000\u0001"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}