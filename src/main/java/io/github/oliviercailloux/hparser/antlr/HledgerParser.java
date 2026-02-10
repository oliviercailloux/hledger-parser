// Generated from io/github/oliviercailloux/hparser/antlr/Hledger.g4 by ANTLR 4.13.2
package io.github.oliviercailloux.hparser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HledgerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT_BLOCK=1, COMMENT_LINE=2, SEMICOLON=3, EOL=4, SPACE=5, START_WITHIN_COMMENT=6, 
		ACCOUNT=7, COMMODITY=8, OTHER_WORD=9, DATE=10;
	public static final int
		RULE_journal = 0, RULE_emptyLine = 1, RULE_directive = 2, RULE_accountDirective = 3, 
		RULE_accountName = 4, RULE_multipleWords = 5, RULE_word = 6, RULE_commentText = 7, 
		RULE_commodityDirective = 8, RULE_commodityString = 9, RULE_transaction = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"journal", "emptyLine", "directive", "accountDirective", "accountName", 
			"multipleWords", "word", "commentText", "commodityDirective", "commodityString", 
			"transaction"
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
			"ACCOUNT", "COMMODITY", "OTHER_WORD", "DATE"
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

	@Override
	public String getGrammarFileName() { return "Hledger.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HledgerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JournalContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HledgerParser.EOF, 0); }
		public List<EmptyLineContext> emptyLine() {
			return getRuleContexts(EmptyLineContext.class);
		}
		public EmptyLineContext emptyLine(int i) {
			return getRuleContext(EmptyLineContext.class,i);
		}
		public List<TerminalNode> COMMENT_LINE() { return getTokens(HledgerParser.COMMENT_LINE); }
		public TerminalNode COMMENT_LINE(int i) {
			return getToken(HledgerParser.COMMENT_LINE, i);
		}
		public List<TerminalNode> COMMENT_BLOCK() { return getTokens(HledgerParser.COMMENT_BLOCK); }
		public TerminalNode COMMENT_BLOCK(int i) {
			return getToken(HledgerParser.COMMENT_BLOCK, i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<TransactionContext> transaction() {
			return getRuleContexts(TransactionContext.class);
		}
		public TransactionContext transaction(int i) {
			return getRuleContext(TransactionContext.class,i);
		}
		public JournalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_journal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterJournal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitJournal(this);
		}
	}

	public final JournalContext journal() throws RecognitionException {
		JournalContext _localctx = new JournalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_journal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1430L) != 0)) {
				{
				setState(27);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOL:
					{
					setState(22);
					emptyLine();
					}
					break;
				case COMMENT_LINE:
					{
					setState(23);
					match(COMMENT_LINE);
					}
					break;
				case COMMENT_BLOCK:
					{
					setState(24);
					match(COMMENT_BLOCK);
					}
					break;
				case ACCOUNT:
				case COMMODITY:
					{
					setState(25);
					directive();
					}
					break;
				case DATE:
					{
					setState(26);
					transaction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyLineContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HledgerParser.EOL, 0); }
		public EmptyLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterEmptyLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitEmptyLine(this);
		}
	}

	public final EmptyLineContext emptyLine() throws RecognitionException {
		EmptyLineContext _localctx = new EmptyLineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_emptyLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveContext extends ParserRuleContext {
		public AccountDirectiveContext accountDirective() {
			return getRuleContext(AccountDirectiveContext.class,0);
		}
		public CommodityDirectiveContext commodityDirective() {
			return getRuleContext(CommodityDirectiveContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCOUNT:
				{
				setState(36);
				accountDirective();
				}
				break;
			case COMMODITY:
				{
				setState(37);
				commodityDirective();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccountDirectiveContext extends ParserRuleContext {
		public TerminalNode ACCOUNT() { return getToken(HledgerParser.ACCOUNT, 0); }
		public AccountNameContext accountName() {
			return getRuleContext(AccountNameContext.class,0);
		}
		public TerminalNode EOL() { return getToken(HledgerParser.EOL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(HledgerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(HledgerParser.SPACE, i);
		}
		public TerminalNode START_WITHIN_COMMENT() { return getToken(HledgerParser.START_WITHIN_COMMENT, 0); }
		public CommentTextContext commentText() {
			return getRuleContext(CommentTextContext.class,0);
		}
		public AccountDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accountDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterAccountDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitAccountDirective(this);
		}
	}

	public final AccountDirectiveContext accountDirective() throws RecognitionException {
		AccountDirectiveContext _localctx = new AccountDirectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_accountDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ACCOUNT);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				match(SPACE);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(46);
			accountName();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==START_WITHIN_COMMENT) {
				{
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(47);
					match(SPACE);
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(START_WITHIN_COMMENT);
				setState(54);
				commentText();
				}
			}

			setState(57);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccountNameContext extends ParserRuleContext {
		public MultipleWordsContext multipleWords() {
			return getRuleContext(MultipleWordsContext.class,0);
		}
		public AccountNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accountName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterAccountName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitAccountName(this);
		}
	}

	public final AccountNameContext accountName() throws RecognitionException {
		AccountNameContext _localctx = new AccountNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_accountName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			multipleWords();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipleWordsContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(HledgerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(HledgerParser.SPACE, i);
		}
		public MultipleWordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleWords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterMultipleWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitMultipleWords(this);
		}
	}

	public final MultipleWordsContext multipleWords() throws RecognitionException {
		MultipleWordsContext _localctx = new MultipleWordsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multipleWords);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			word();
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					match(SPACE);
					setState(63);
					word();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WordContext extends ParserRuleContext {
		public TerminalNode ACCOUNT() { return getToken(HledgerParser.ACCOUNT, 0); }
		public TerminalNode COMMODITY() { return getToken(HledgerParser.COMMODITY, 0); }
		public TerminalNode OTHER_WORD() { return getToken(HledgerParser.OTHER_WORD, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentTextContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(HledgerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(HledgerParser.SPACE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(HledgerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(HledgerParser.SEMICOLON, i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public CommentTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterCommentText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitCommentText(this);
		}
	}

	public final CommentTextContext commentText() throws RecognitionException {
		CommentTextContext _localctx = new CommentTextContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commentText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 936L) != 0)) {
				{
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(71);
					match(SPACE);
					}
					break;
				case SEMICOLON:
					{
					setState(72);
					match(SEMICOLON);
					}
					break;
				case ACCOUNT:
				case COMMODITY:
				case OTHER_WORD:
					{
					setState(73);
					word();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommodityDirectiveContext extends ParserRuleContext {
		public TerminalNode COMMODITY() { return getToken(HledgerParser.COMMODITY, 0); }
		public CommodityStringContext commodityString() {
			return getRuleContext(CommodityStringContext.class,0);
		}
		public TerminalNode EOL() { return getToken(HledgerParser.EOL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(HledgerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(HledgerParser.SPACE, i);
		}
		public TerminalNode START_WITHIN_COMMENT() { return getToken(HledgerParser.START_WITHIN_COMMENT, 0); }
		public CommentTextContext commentText() {
			return getRuleContext(CommentTextContext.class,0);
		}
		public CommodityDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commodityDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterCommodityDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitCommodityDirective(this);
		}
	}

	public final CommodityDirectiveContext commodityDirective() throws RecognitionException {
		CommodityDirectiveContext _localctx = new CommodityDirectiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commodityDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(COMMODITY);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				match(SPACE);
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(85);
			commodityString();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==START_WITHIN_COMMENT) {
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(86);
					match(SPACE);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(START_WITHIN_COMMENT);
				setState(93);
				commentText();
				}
			}

			setState(96);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommodityStringContext extends ParserRuleContext {
		public MultipleWordsContext multipleWords() {
			return getRuleContext(MultipleWordsContext.class,0);
		}
		public CommodityStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commodityString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterCommodityString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitCommodityString(this);
		}
	}

	public final CommodityStringContext commodityString() throws RecognitionException {
		CommodityStringContext _localctx = new CommodityStringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_commodityString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			multipleWords();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransactionContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(HledgerParser.DATE, 0); }
		public TerminalNode EOL() { return getToken(HledgerParser.EOL, 0); }
		public TransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitTransaction(this);
		}
	}

	public final TransactionContext transaction() throws RecognitionException {
		TransactionContext _localctx = new TransactionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_transaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(DATE);
			setState(101);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\nh\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000"+
		"\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0003\u0001\u0003\u0004\u0003"+
		"+\b\u0003\u000b\u0003\f\u0003,\u0001\u0003\u0001\u0003\u0005\u00031\b"+
		"\u0003\n\u0003\f\u00034\t\u0003\u0001\u0003\u0001\u0003\u0003\u00038\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005A\b\u0005\n\u0005\f\u0005D\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007K\b"+
		"\u0007\n\u0007\f\u0007N\t\u0007\u0001\b\u0001\b\u0004\bR\b\b\u000b\b\f"+
		"\bS\u0001\b\u0001\b\u0005\bX\b\b\n\b\f\b[\t\b\u0001\b\u0001\b\u0003\b"+
		"_\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0001\u0001\u0000\u0007\tl\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0002\"\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006"+
		"(\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\n=\u0001\u0000\u0000"+
		"\u0000\fE\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010"+
		"O\u0001\u0000\u0000\u0000\u0012b\u0001\u0000\u0000\u0000\u0014d\u0001"+
		"\u0000\u0000\u0000\u0016\u001c\u0003\u0002\u0001\u0000\u0017\u001c\u0005"+
		"\u0002\u0000\u0000\u0018\u001c\u0005\u0001\u0000\u0000\u0019\u001c\u0003"+
		"\u0004\u0002\u0000\u001a\u001c\u0003\u0014\n\u0000\u001b\u0016\u0001\u0000"+
		"\u0000\u0000\u001b\u0017\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005\u0000\u0000\u0001!"+
		"\u0001\u0001\u0000\u0000\u0000\"#\u0005\u0004\u0000\u0000#\u0003\u0001"+
		"\u0000\u0000\u0000$\'\u0003\u0006\u0003\u0000%\'\u0003\u0010\b\u0000&"+
		"$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'\u0005\u0001\u0000"+
		"\u0000\u0000(*\u0005\u0007\u0000\u0000)+\u0005\u0005\u0000\u0000*)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.7\u0003\b\u0004\u0000"+
		"/1\u0005\u0005\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000056\u0005\u0006\u0000\u000068\u0003"+
		"\u000e\u0007\u000072\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009:\u0005\u0004\u0000\u0000:\u0007\u0001\u0000"+
		"\u0000\u0000;<\u0003\n\u0005\u0000<\t\u0001\u0000\u0000\u0000=B\u0003"+
		"\f\u0006\u0000>?\u0005\u0005\u0000\u0000?A\u0003\f\u0006\u0000@>\u0001"+
		"\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000C\u000b\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000EF\u0007\u0000\u0000\u0000F\r\u0001\u0000\u0000\u0000GK\u0005"+
		"\u0005\u0000\u0000HK\u0005\u0003\u0000\u0000IK\u0003\f\u0006\u0000JG\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000M\u000f\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OQ\u0005"+
		"\b\u0000\u0000PR\u0005\u0005\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000U^\u0003\u0012\t\u0000VX\u0005\u0005\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\]\u0005\u0006\u0000\u0000]_\u0003\u000e\u0007\u0000^Y\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`a\u0005\u0004\u0000\u0000a\u0011\u0001\u0000\u0000\u0000bc\u0003\n\u0005"+
		"\u0000c\u0013\u0001\u0000\u0000\u0000de\u0005\n\u0000\u0000ef\u0005\u0004"+
		"\u0000\u0000f\u0015\u0001\u0000\u0000\u0000\f\u001b\u001d&,27BJLSY^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}