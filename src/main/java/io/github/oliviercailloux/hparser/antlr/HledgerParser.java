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
		TAG=7, ACCOUNT=8, COMMODITY=9, DATE=10, P_WORD=11, STAR=12, EQUALS=13, 
		WORD=14, WS=15;
	public static final int
		RULE_journal = 0, RULE_emptyLine = 1, RULE_directive = 2, RULE_decimalMarkDirective = 3, 
		RULE_tagDirective = 4, RULE_tag = 5, RULE_accountDirective = 6, RULE_accountName = 7, 
		RULE_commodityDirective = 8, RULE_commodity = 9, RULE_pDirective = 10, 
		RULE_commoditySymbol = 11, RULE_commodityAmount = 12, RULE_transaction = 13, 
		RULE_description = 14, RULE_posting = 15, RULE_assertion = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"journal", "emptyLine", "directive", "decimalMarkDirective", "tagDirective", 
			"tag", "accountDirective", "accountName", "commodityDirective", "commodity", 
			"pDirective", "commoditySymbol", "commodityAmount", "transaction", "description", 
			"posting", "assertion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'decimal-mark .'", "'tag'", "'account'", 
			"'commodity'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EOL", "COMMENT_BLOCK", "COMMENT_LINE", "INLINE_COMMENT", "SEP", 
			"DECIMAL_MARK", "TAG", "ACCOUNT", "COMMODITY", "DATE", "P_WORD", "STAR", 
			"EQUALS", "WORD", "WS"
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4034L) != 0)) {
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOL:
					{
					setState(34);
					emptyLine();
					}
					break;
				case DECIMAL_MARK:
				case TAG:
				case ACCOUNT:
				case COMMODITY:
				case P_WORD:
					{
					setState(35);
					directive();
					}
					break;
				case DATE:
					{
					setState(36);
					transaction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
			setState(44);
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
		public TagDirectiveContext tagDirective() {
			return getRuleContext(TagDirectiveContext.class,0);
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
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_MARK:
				{
				setState(46);
				decimalMarkDirective();
				}
				break;
			case TAG:
				{
				setState(47);
				tagDirective();
				}
				break;
			case ACCOUNT:
				{
				setState(48);
				accountDirective();
				}
				break;
			case COMMODITY:
				{
				setState(49);
				commodityDirective();
				}
				break;
			case P_WORD:
				{
				setState(50);
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
			setState(53);
			match(DECIMAL_MARK);
			setState(54);
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
	public static class TagDirectiveContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(HledgerParser.TAG, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode EOL() { return getToken(HledgerParser.EOL, 0); }
		public TagDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterTagDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitTagDirective(this);
		}
	}

	public final TagDirectiveContext tagDirective() throws RecognitionException {
		TagDirectiveContext _localctx = new TagDirectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tagDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(TAG);
			setState(57);
			tag();
			setState(58);
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
	public static class TagContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(HledgerParser.WORD, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
		enterRule(_localctx, 12, RULE_accountDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ACCOUNT);
			setState(63);
			accountName();
			setState(64);
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
		enterRule(_localctx, 14, RULE_accountName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17152L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17152L) != 0) );
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
		enterRule(_localctx, 16, RULE_commodityDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(COMMODITY);
			setState(72);
			commodity();
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
		enterRule(_localctx, 18, RULE_commodity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17152L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17152L) != 0) );
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
		enterRule(_localctx, 20, RULE_pDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(P_WORD);
			setState(81);
			match(DATE);
			setState(82);
			commoditySymbol();
			setState(83);
			commodityAmount();
			setState(84);
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
		enterRule(_localctx, 22, RULE_commoditySymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		enterRule(_localctx, 24, RULE_commodityAmount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17152L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17152L) != 0) );
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
		enterRule(_localctx, 26, RULE_transaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(DATE);
			setState(94);
			description();
			setState(95);
			match(EOL);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(96);
				match(SEP);
				setState(97);
				posting();
				setState(98);
				match(EOL);
				}
				}
				setState(104);
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
		enterRule(_localctx, 28, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32544L) != 0)) {
				{
				{
				setState(105);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32544L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(110);
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
		enterRule(_localctx, 30, RULE_posting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(111);
				match(STAR);
				}
			}

			setState(114);
			accountName();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEP) {
				{
				setState(115);
				match(SEP);
				setState(116);
				commodity();
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(119);
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
		enterRule(_localctx, 32, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(EQUALS);
			setState(123);
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
		"\u0004\u0001\u000f~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00024\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007D\b\u0007"+
		"\u000b\u0007\f\u0007E\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004\t"+
		"M\b\t\u000b\t\f\tN\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0004\fZ\b\f\u000b\f\f\f[\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\re\b\r\n\r\f\rh\t\r\u0001\u000e"+
		"\u0005\u000ek\b\u000e\n\u000e\f\u000en\t\u000e\u0001\u000f\u0003\u000f"+
		"q\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000fv\b\u000f\u0001"+
		"\u000f\u0003\u000fy\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0002\u0002\u0000\b\t\u000e"+
		"\u000e\u0002\u0000\u0005\u0005\b\u000e{\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0002,\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u00065"+
		"\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000"+
		"\u0000\f>\u0001\u0000\u0000\u0000\u000eC\u0001\u0000\u0000\u0000\u0010"+
		"G\u0001\u0000\u0000\u0000\u0012L\u0001\u0000\u0000\u0000\u0014P\u0001"+
		"\u0000\u0000\u0000\u0016V\u0001\u0000\u0000\u0000\u0018Y\u0001\u0000\u0000"+
		"\u0000\u001a]\u0001\u0000\u0000\u0000\u001cl\u0001\u0000\u0000\u0000\u001e"+
		"p\u0001\u0000\u0000\u0000 z\u0001\u0000\u0000\u0000\"&\u0003\u0002\u0001"+
		"\u0000#&\u0003\u0004\u0002\u0000$&\u0003\u001a\r\u0000%\"\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0000\u0000"+
		"\u0001+\u0001\u0001\u0000\u0000\u0000,-\u0005\u0001\u0000\u0000-\u0003"+
		"\u0001\u0000\u0000\u0000.4\u0003\u0006\u0003\u0000/4\u0003\b\u0004\u0000"+
		"04\u0003\f\u0006\u000014\u0003\u0010\b\u000024\u0003\u0014\n\u00003.\u0001"+
		"\u0000\u0000\u00003/\u0001\u0000\u0000\u000030\u0001\u0000\u0000\u0000"+
		"31\u0001\u0000\u0000\u000032\u0001\u0000\u0000\u00004\u0005\u0001\u0000"+
		"\u0000\u000056\u0005\u0006\u0000\u000067\u0005\u0001\u0000\u00007\u0007"+
		"\u0001\u0000\u0000\u000089\u0005\u0007\u0000\u00009:\u0003\n\u0005\u0000"+
		":;\u0005\u0001\u0000\u0000;\t\u0001\u0000\u0000\u0000<=\u0005\u000e\u0000"+
		"\u0000=\u000b\u0001\u0000\u0000\u0000>?\u0005\b\u0000\u0000?@\u0003\u000e"+
		"\u0007\u0000@A\u0005\u0001\u0000\u0000A\r\u0001\u0000\u0000\u0000BD\u0007"+
		"\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u000f\u0001\u0000"+
		"\u0000\u0000GH\u0005\t\u0000\u0000HI\u0003\u0012\t\u0000IJ\u0005\u0001"+
		"\u0000\u0000J\u0011\u0001\u0000\u0000\u0000KM\u0007\u0000\u0000\u0000"+
		"LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000O\u0013\u0001\u0000\u0000\u0000PQ\u0005"+
		"\u000b\u0000\u0000QR\u0005\n\u0000\u0000RS\u0003\u0016\u000b\u0000ST\u0003"+
		"\u0018\f\u0000TU\u0005\u0001\u0000\u0000U\u0015\u0001\u0000\u0000\u0000"+
		"VW\u0005\u000e\u0000\u0000W\u0017\u0001\u0000\u0000\u0000XZ\u0007\u0000"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0019\u0001\u0000\u0000"+
		"\u0000]^\u0005\n\u0000\u0000^_\u0003\u001c\u000e\u0000_f\u0005\u0001\u0000"+
		"\u0000`a\u0005\u0005\u0000\u0000ab\u0003\u001e\u000f\u0000bc\u0005\u0001"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000eh\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"g\u001b\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ik\u0007\u0001"+
		"\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u001d\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000oq\u0005\f\u0000\u0000po\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000ru\u0003\u000e"+
		"\u0007\u0000st\u0005\u0005\u0000\u0000tv\u0003\u0012\t\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wy\u0003"+
		" \u0010\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u001f"+
		"\u0001\u0000\u0000\u0000z{\u0005\r\u0000\u0000{|\u0003\u0012\t\u0000|"+
		"!\u0001\u0000\u0000\u0000\u000b%\'3EN[flpux";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}