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
		T__0=1, EOL=2, COMMENT_BLOCK=3, COMMENT_LINE=4, INLINE_COMMENT=5, SEP=6, 
		ACCOUNT=7, COMMODITY=8, DATE=9, WORD=10, WS=11;
	public static final int
		RULE_journal = 0, RULE_emptyLine = 1, RULE_directive = 2, RULE_accountDirective = 3, 
		RULE_accountName = 4, RULE_commodityDirective = 5, RULE_commodity = 6, 
		RULE_transaction = 7, RULE_description = 8, RULE_posting = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"journal", "emptyLine", "directive", "accountDirective", "accountName", 
			"commodityDirective", "commodity", "transaction", "description", "posting"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", null, null, null, null, null, "'account'", "'commodity'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "EOL", "COMMENT_BLOCK", "COMMENT_LINE", "INLINE_COMMENT", 
			"SEP", "ACCOUNT", "COMMODITY", "DATE", "WORD", "WS"
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 900L) != 0)) {
				{
				setState(23);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOL:
					{
					setState(20);
					emptyLine();
					}
					break;
				case ACCOUNT:
				case COMMODITY:
					{
					setState(21);
					directive();
					}
					break;
				case DATE:
					{
					setState(22);
					transaction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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
			setState(30);
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
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCOUNT:
				{
				setState(32);
				accountDirective();
				}
				break;
			case COMMODITY:
				{
				setState(33);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ACCOUNT);
			setState(37);
			accountName();
			setState(38);
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
		public List<TerminalNode> ACCOUNT() { return getTokens(HledgerParser.ACCOUNT); }
		public TerminalNode ACCOUNT(int i) {
			return getToken(HledgerParser.ACCOUNT, i);
		}
		public List<TerminalNode> COMMODITY() { return getTokens(HledgerParser.COMMODITY); }
		public TerminalNode COMMODITY(int i) {
			return getToken(HledgerParser.COMMODITY, i);
		}
		public List<TerminalNode> WORD() { return getTokens(HledgerParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HledgerParser.WORD, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1408L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1408L) != 0) );
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
		public CommodityContext commodity() {
			return getRuleContext(CommodityContext.class,0);
		}
		public TerminalNode EOL() { return getToken(HledgerParser.EOL, 0); }
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
		enterRule(_localctx, 10, RULE_commodityDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(COMMODITY);
			setState(46);
			commodity();
			setState(47);
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
	public static class CommodityContext extends ParserRuleContext {
		public List<TerminalNode> ACCOUNT() { return getTokens(HledgerParser.ACCOUNT); }
		public TerminalNode ACCOUNT(int i) {
			return getToken(HledgerParser.ACCOUNT, i);
		}
		public List<TerminalNode> COMMODITY() { return getTokens(HledgerParser.COMMODITY); }
		public TerminalNode COMMODITY(int i) {
			return getToken(HledgerParser.COMMODITY, i);
		}
		public List<TerminalNode> WORD() { return getTokens(HledgerParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HledgerParser.WORD, i);
		}
		public CommodityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commodity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterCommodity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitCommodity(this);
		}
	}

	public final CommodityContext commodity() throws RecognitionException {
		CommodityContext _localctx = new CommodityContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_commodity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1408L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1408L) != 0) );
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
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(HledgerParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(HledgerParser.EOL, i);
		}
		public List<TerminalNode> SEP() { return getTokens(HledgerParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(HledgerParser.SEP, i);
		}
		public List<PostingContext> posting() {
			return getRuleContexts(PostingContext.class);
		}
		public PostingContext posting(int i) {
			return getRuleContext(PostingContext.class,i);
		}
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
		enterRule(_localctx, 14, RULE_transaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(DATE);
			setState(55);
			description();
			setState(56);
			match(EOL);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(57);
				match(SEP);
				setState(58);
				posting();
				setState(59);
				match(EOL);
				}
				}
				setState(65);
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
	public static class DescriptionContext extends ParserRuleContext {
		public List<TerminalNode> SEP() { return getTokens(HledgerParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(HledgerParser.SEP, i);
		}
		public List<TerminalNode> ACCOUNT() { return getTokens(HledgerParser.ACCOUNT); }
		public TerminalNode ACCOUNT(int i) {
			return getToken(HledgerParser.ACCOUNT, i);
		}
		public List<TerminalNode> COMMODITY() { return getTokens(HledgerParser.COMMODITY); }
		public TerminalNode COMMODITY(int i) {
			return getToken(HledgerParser.COMMODITY, i);
		}
		public List<TerminalNode> DATE() { return getTokens(HledgerParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(HledgerParser.DATE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(HledgerParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HledgerParser.WORD, i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitDescription(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1986L) != 0)) {
				{
				{
				setState(66);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1986L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(71);
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
	public static class PostingContext extends ParserRuleContext {
		public AccountNameContext accountName() {
			return getRuleContext(AccountNameContext.class,0);
		}
		public TerminalNode SEP() { return getToken(HledgerParser.SEP, 0); }
		public CommodityContext commodity() {
			return getRuleContext(CommodityContext.class,0);
		}
		public PostingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterPosting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitPosting(this);
		}
	}

	public final PostingContext posting() throws RecognitionException {
		PostingContext _localctx = new PostingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_posting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			accountName();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEP) {
				{
				setState(73);
				match(SEP);
				setState(74);
				commodity();
				}
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

	public static final String _serializedATN =
		"\u0004\u0001\u000bN\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002#\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004*\b"+
		"\u0004\u000b\u0004\f\u0004+\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0004\u00063\b\u0006\u000b\u0006\f\u00064\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007>\b\u0007\n\u0007\f\u0007A\t\u0007\u0001\b\u0005\bD\b\b\n"+
		"\b\f\bG\t\b\u0001\t\u0001\t\u0001\t\u0003\tL\b\t\u0001\t\u0000\u0000\n"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0002\u0002\u0000"+
		"\u0007\b\n\n\u0002\u0000\u0001\u0001\u0006\nL\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000"+
		"\u0000\u0006$\u0001\u0000\u0000\u0000\b)\u0001\u0000\u0000\u0000\n-\u0001"+
		"\u0000\u0000\u0000\f2\u0001\u0000\u0000\u0000\u000e6\u0001\u0000\u0000"+
		"\u0000\u0010E\u0001\u0000\u0000\u0000\u0012H\u0001\u0000\u0000\u0000\u0014"+
		"\u0018\u0003\u0002\u0001\u0000\u0015\u0018\u0003\u0004\u0002\u0000\u0016"+
		"\u0018\u0003\u000e\u0007\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0017"+
		"\u0015\u0001\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0000\u0000\u0001\u001d"+
		"\u0001\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f"+
		"\u0003\u0001\u0000\u0000\u0000 #\u0003\u0006\u0003\u0000!#\u0003\n\u0005"+
		"\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#\u0005\u0001"+
		"\u0000\u0000\u0000$%\u0005\u0007\u0000\u0000%&\u0003\b\u0004\u0000&\'"+
		"\u0005\u0002\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000(*\u0007\u0000"+
		"\u0000\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\t\u0001\u0000\u0000\u0000"+
		"-.\u0005\b\u0000\u0000./\u0003\f\u0006\u0000/0\u0005\u0002\u0000\u0000"+
		"0\u000b\u0001\u0000\u0000\u000013\u0007\u0000\u0000\u000021\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u00005\r\u0001\u0000\u0000\u000067\u0005\t\u0000\u000078"+
		"\u0003\u0010\b\u00008?\u0005\u0002\u0000\u00009:\u0005\u0006\u0000\u0000"+
		":;\u0003\u0012\t\u0000;<\u0005\u0002\u0000\u0000<>\u0001\u0000\u0000\u0000"+
		"=9\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@\u000f\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000BD\u0007\u0001\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000F\u0011\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HK\u0003"+
		"\b\u0004\u0000IJ\u0005\u0006\u0000\u0000JL\u0003\f\u0006\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0013\u0001\u0000\u0000"+
		"\u0000\b\u0017\u0019\"+4?EK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}