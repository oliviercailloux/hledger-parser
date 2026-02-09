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
		T__0=1, T__1=2, T__2=3, T__3=4, EOL=5, SPACE=6, SEP=7, ACCOUNT=8, COMMODITY=9, 
		WORD=10, DATE=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "EOL", "SPACE", "SEP", "ACCOUNT", "COMMODITY", 
			"WORD", "DATE", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'comment'", "'end comment'", "';'", null, "' '", null, 
			"'account'", "'commodity'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "EOL", "SPACE", "SEP", "ACCOUNT", "COMMODITY", 
			"WORD", "DATE"
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
		"\u0004\u0000\u000bc\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u00044\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0004\u0006"+
		"<\b\u0006\u000b\u0006\f\u0006=\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0004\tS\b\t\u000b\t\f\tT\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0000"+
		"\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\u0000\u0001\u0000"+
		"\u0002\u0004\u0000\n\n\r\r  ;;\u0001\u000009d\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001c\u0001\u0000\u0000\u0000"+
		"\u0005$\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t3\u0001"+
		"\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000"+
		"\u0000\u000f?\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013"+
		"R\u0001\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017a\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005/\u0000\u0000\u001a\u001b\u0005/\u0000"+
		"\u0000\u001b\u0002\u0001\u0000\u0000\u0000\u001c\u001d\u0005c\u0000\u0000"+
		"\u001d\u001e\u0005o\u0000\u0000\u001e\u001f\u0005m\u0000\u0000\u001f "+
		"\u0005m\u0000\u0000 !\u0005e\u0000\u0000!\"\u0005n\u0000\u0000\"#\u0005"+
		"t\u0000\u0000#\u0004\u0001\u0000\u0000\u0000$%\u0005e\u0000\u0000%&\u0005"+
		"n\u0000\u0000&\'\u0005d\u0000\u0000\'(\u0005 \u0000\u0000()\u0005c\u0000"+
		"\u0000)*\u0005o\u0000\u0000*+\u0005m\u0000\u0000+,\u0005m\u0000\u0000"+
		",-\u0005e\u0000\u0000-.\u0005n\u0000\u0000./\u0005t\u0000\u0000/\u0006"+
		"\u0001\u0000\u0000\u000001\u0005;\u0000\u00001\b\u0001\u0000\u0000\u0000"+
		"24\u0005\r\u0000\u000032\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000056\u0005\n\u0000\u00006\n\u0001\u0000\u0000"+
		"\u000078\u0005 \u0000\u00008\f\u0001\u0000\u0000\u00009;\u0003\u000b\u0005"+
		"\u0000:<\u0003\u000b\u0005\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u000e"+
		"\u0001\u0000\u0000\u0000?@\u0005a\u0000\u0000@A\u0005c\u0000\u0000AB\u0005"+
		"c\u0000\u0000BC\u0005o\u0000\u0000CD\u0005u\u0000\u0000DE\u0005n\u0000"+
		"\u0000EF\u0005t\u0000\u0000F\u0010\u0001\u0000\u0000\u0000GH\u0005c\u0000"+
		"\u0000HI\u0005o\u0000\u0000IJ\u0005m\u0000\u0000JK\u0005m\u0000\u0000"+
		"KL\u0005o\u0000\u0000LM\u0005d\u0000\u0000MN\u0005i\u0000\u0000NO\u0005"+
		"t\u0000\u0000OP\u0005y\u0000\u0000P\u0012\u0001\u0000\u0000\u0000QS\b"+
		"\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0014\u0001\u0000"+
		"\u0000\u0000VW\u0003\u0017\u000b\u0000WX\u0003\u0017\u000b\u0000XY\u0003"+
		"\u0017\u000b\u0000YZ\u0003\u0017\u000b\u0000Z[\u0005-\u0000\u0000[\\\u0003"+
		"\u0017\u000b\u0000\\]\u0003\u0017\u000b\u0000]^\u0005-\u0000\u0000^_\u0003"+
		"\u0017\u000b\u0000_`\u0003\u0017\u000b\u0000`\u0016\u0001\u0000\u0000"+
		"\u0000ab\u0007\u0001\u0000\u0000b\u0018\u0001\u0000\u0000\u0000\u0004"+
		"\u00003=T\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}