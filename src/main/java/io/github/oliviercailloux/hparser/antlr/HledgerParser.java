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
		EOL=1, COMMENT_BLOCK=2, COMMENT_LINE=3, INLINE_COMMENT=4, SEP=5, DECIMAL_MARK=6, 
		ACCOUNT=7, COMMODITY=8, DATE=9, P_WORD=10, STAR=11, EQUALS=12, WORD=13, 
		WS=14;
	public static final int
		RULE_journal = 0, RULE_emptyLine = 1, RULE_directive = 2, RULE_decimalMarkDirective = 3, 
		RULE_accountDirective = 4, RULE_accountName = 5, RULE_commodityDirective = 6, 
		RULE_commodity = 7, RULE_pDirective = 8, RULE_commoditySymbol = 9, RULE_commodityAmount = 10, 
		RULE_transaction = 11, RULE_description = 12, RULE_posting = 13, RULE_assertion = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"journal", "emptyLine", "directive", "decimalMarkDirective", "accountDirective", 
			"accountName", "commodityDirective", "commodity", "pDirective", "commoditySymbol", 
			"commodityAmount", "transaction", "description", "posting", "assertion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'decimal-mark .'", "'account'", 
			"'commodity'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EOL", "COMMENT_BLOCK", "COMMENT_LINE", "INLINE_COMMENT", "SEP", 
			"DECIMAL_MARK", "ACCOUNT", "COMMODITY", "DATE", "P_WORD", "STAR", "EQUALS", 
			"WORD", "WS"
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1986L) != 0)) {
				{
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOL:
					{
					setState(30);
					emptyLine();
					}
					break;
				case DECIMAL_MARK:
				case ACCOUNT:
				case COMMODITY:
				case P_WORD:
					{
					setState(31);
					directive();
					}
					break;
				case DATE:
					{
					setState(32);
					transaction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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
			setState(40);
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
		public DecimalMarkDirectiveContext decimalMarkDirective() {
			return getRuleContext(DecimalMarkDirectiveContext.class,0);
		}
		public AccountDirectiveContext accountDirective() {
			return getRuleContext(AccountDirectiveContext.class,0);
		}
		public CommodityDirectiveContext commodityDirective() {
			return getRuleContext(CommodityDirectiveContext.class,0);
		}
		public PDirectiveContext pDirective() {
			return getRuleContext(PDirectiveContext.class,0);
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_MARK:
				{
				setState(42);
				decimalMarkDirective();
				}
				break;
			case ACCOUNT:
				{
				setState(43);
				accountDirective();
				}
				break;
			case COMMODITY:
				{
				setState(44);
				commodityDirective();
				}
				break;
			case P_WORD:
				{
				setState(45);
				pDirective();
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
	public static class DecimalMarkDirectiveContext extends ParserRuleContext {
		public TerminalNode DECIMAL_MARK() { return getToken(HledgerParser.DECIMAL_MARK, 0); }
		public TerminalNode EOL() { return getToken(HledgerParser.EOL, 0); }
		public DecimalMarkDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalMarkDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterDecimalMarkDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitDecimalMarkDirective(this);
		}
	}

	public final DecimalMarkDirectiveContext decimalMarkDirective() throws RecognitionException {
		DecimalMarkDirectiveContext _localctx = new DecimalMarkDirectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decimalMarkDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(DECIMAL_MARK);
			setState(49);
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
		enterRule(_localctx, 8, RULE_accountDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ACCOUNT);
			setState(52);
			accountName();
			setState(53);
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
		enterRule(_localctx, 10, RULE_accountName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8576L) != 0) );
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
		enterRule(_localctx, 12, RULE_commodityDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(COMMODITY);
			setState(61);
			commodity();
			setState(62);
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
		enterRule(_localctx, 14, RULE_commodity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8576L) != 0) );
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
	public static class PDirectiveContext extends ParserRuleContext {
		public TerminalNode P_WORD() { return getToken(HledgerParser.P_WORD, 0); }
		public TerminalNode DATE() { return getToken(HledgerParser.DATE, 0); }
		public CommoditySymbolContext commoditySymbol() {
			return getRuleContext(CommoditySymbolContext.class,0);
		}
		public CommodityAmountContext commodityAmount() {
			return getRuleContext(CommodityAmountContext.class,0);
		}
		public TerminalNode EOL() { return getToken(HledgerParser.EOL, 0); }
		public PDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterPDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitPDirective(this);
		}
	}

	public final PDirectiveContext pDirective() throws RecognitionException {
		PDirectiveContext _localctx = new PDirectiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(P_WORD);
			setState(70);
			match(DATE);
			setState(71);
			commoditySymbol();
			setState(72);
			commodityAmount();
			setState(73);
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
	public static class CommoditySymbolContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(HledgerParser.WORD, 0); }
		public CommoditySymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commoditySymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterCommoditySymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitCommoditySymbol(this);
		}
	}

	public final CommoditySymbolContext commoditySymbol() throws RecognitionException {
		CommoditySymbolContext _localctx = new CommoditySymbolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_commoditySymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(WORD);
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
	public static class CommodityAmountContext extends ParserRuleContext {
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
		public CommodityAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commodityAmount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterCommodityAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitCommodityAmount(this);
		}
	}

	public final CommodityAmountContext commodityAmount() throws RecognitionException {
		CommodityAmountContext _localctx = new CommodityAmountContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_commodityAmount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8576L) != 0) );
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
		enterRule(_localctx, 22, RULE_transaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(DATE);
			setState(83);
			description();
			setState(84);
			match(EOL);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(85);
				match(SEP);
				setState(86);
				posting();
				setState(87);
				match(EOL);
				}
				}
				setState(93);
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
		public List<TerminalNode> P_WORD() { return getTokens(HledgerParser.P_WORD); }
		public TerminalNode P_WORD(int i) {
			return getToken(HledgerParser.P_WORD, i);
		}
		public List<TerminalNode> STAR() { return getTokens(HledgerParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(HledgerParser.STAR, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(HledgerParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(HledgerParser.EQUALS, i);
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
		enterRule(_localctx, 24, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16288L) != 0)) {
				{
				{
				setState(94);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16288L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(99);
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
		public TerminalNode STAR() { return getToken(HledgerParser.STAR, 0); }
		public TerminalNode SEP() { return getToken(HledgerParser.SEP, 0); }
		public CommodityContext commodity() {
			return getRuleContext(CommodityContext.class,0);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
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
		enterRule(_localctx, 26, RULE_posting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(100);
				match(STAR);
				}
			}

			setState(103);
			accountName();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEP) {
				{
				setState(104);
				match(SEP);
				setState(105);
				commodity();
				}
			}

			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(108);
				assertion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssertionContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(HledgerParser.EQUALS, 0); }
		public CommodityContext commodity() {
			return getRuleContext(CommodityContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(EQUALS);
			setState(112);
			commodity();
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
		"\u0004\u0001\u000es\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005"+
		"9\b\u0005\u000b\u0005\f\u0005:\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0004\u0007B\b\u0007\u000b\u0007\f\u0007C\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004\nO\b"+
		"\n\u000b\n\f\nP\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000bZ\b\u000b\n\u000b\f\u000b]\t"+
		"\u000b\u0001\f\u0005\f`\b\f\n\f\f\fc\t\f\u0001\r\u0003\rf\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\rk\b\r\u0001\r\u0003\rn\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0002\u0002\u0000"+
		"\u0007\b\r\r\u0002\u0000\u0005\u0005\u0007\rq\u0000#\u0001\u0000\u0000"+
		"\u0000\u0002(\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u0006"+
		"0\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000"+
		"\u0000\f<\u0001\u0000\u0000\u0000\u000eA\u0001\u0000\u0000\u0000\u0010"+
		"E\u0001\u0000\u0000\u0000\u0012K\u0001\u0000\u0000\u0000\u0014N\u0001"+
		"\u0000\u0000\u0000\u0016R\u0001\u0000\u0000\u0000\u0018a\u0001\u0000\u0000"+
		"\u0000\u001ae\u0001\u0000\u0000\u0000\u001co\u0001\u0000\u0000\u0000\u001e"+
		"\"\u0003\u0002\u0001\u0000\u001f\"\u0003\u0004\u0002\u0000 \"\u0003\u0016"+
		"\u000b\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000&\'\u0005\u0000\u0000\u0001\'\u0001\u0001\u0000\u0000\u0000"+
		"()\u0005\u0001\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*/\u0003\u0006"+
		"\u0003\u0000+/\u0003\b\u0004\u0000,/\u0003\f\u0006\u0000-/\u0003\u0010"+
		"\b\u0000.*\u0001\u0000\u0000\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0005\u0001\u0000\u0000\u0000"+
		"01\u0005\u0006\u0000\u000012\u0005\u0001\u0000\u00002\u0007\u0001\u0000"+
		"\u0000\u000034\u0005\u0007\u0000\u000045\u0003\n\u0005\u000056\u0005\u0001"+
		"\u0000\u00006\t\u0001\u0000\u0000\u000079\u0007\u0000\u0000\u000087\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;\u000b\u0001\u0000\u0000\u0000<=\u0005\b\u0000"+
		"\u0000=>\u0003\u000e\u0007\u0000>?\u0005\u0001\u0000\u0000?\r\u0001\u0000"+
		"\u0000\u0000@B\u0007\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"D\u000f\u0001\u0000\u0000\u0000EF\u0005\n\u0000\u0000FG\u0005\t\u0000"+
		"\u0000GH\u0003\u0012\t\u0000HI\u0003\u0014\n\u0000IJ\u0005\u0001\u0000"+
		"\u0000J\u0011\u0001\u0000\u0000\u0000KL\u0005\r\u0000\u0000L\u0013\u0001"+
		"\u0000\u0000\u0000MO\u0007\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000Q\u0015\u0001\u0000\u0000\u0000RS\u0005\t\u0000\u0000ST\u0003\u0018"+
		"\f\u0000T[\u0005\u0001\u0000\u0000UV\u0005\u0005\u0000\u0000VW\u0003\u001a"+
		"\r\u0000WX\u0005\u0001\u0000\u0000XZ\u0001\u0000\u0000\u0000YU\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\u0017\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^`\u0007\u0001\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0019"+
		"\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000df\u0005\u000b\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gj\u0003\n\u0005\u0000hi\u0005\u0005\u0000\u0000ik\u0003\u000e"+
		"\u0007\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001"+
		"\u0000\u0000\u0000ln\u0003\u001c\u000e\u0000ml\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000n\u001b\u0001\u0000\u0000\u0000op\u0005\f\u0000"+
		"\u0000pq\u0003\u000e\u0007\u0000q\u001d\u0001\u0000\u0000\u0000\u000b"+
		"!#.:CP[aejm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}