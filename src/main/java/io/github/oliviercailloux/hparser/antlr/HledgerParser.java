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
		COMMENT_BLOCK=1, COMMENT_LINE=2, SEMICOLON=3, EQUALS=4, EOL=5, SPACE=6, 
		START_WITHIN_COMMENT=7, START_ASSERTION=8, ACCOUNT=9, COMMODITY=10, DATE=11, 
		OTHER_WORD=12;
	public static final int
		RULE_journal = 0, RULE_emptyLine = 1, RULE_directive = 2, RULE_accountDirective = 3, 
		RULE_accountName = 4, RULE_multipleWords = 5, RULE_word = 6, RULE_endComment = 7, 
		RULE_commentText = 8, RULE_commodityDirective = 9, RULE_commodityString = 10, 
		RULE_transaction = 11, RULE_description = 12, RULE_posting = 13, RULE_assertion = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"journal", "emptyLine", "directive", "accountDirective", "accountName", 
			"multipleWords", "word", "endComment", "commentText", "commodityDirective", 
			"commodityString", "transaction", "description", "posting", "assertion"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3616L) != 0)) {
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
				case ACCOUNT:
				case COMMODITY:
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCOUNT:
				{
				setState(42);
				accountDirective();
				}
				break;
			case COMMODITY:
				{
				setState(43);
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
		public EndCommentContext endComment() {
			return getRuleContext(EndCommentContext.class,0);
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
			setState(46);
			match(ACCOUNT);
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				match(SPACE);
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(52);
			accountName();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(53);
				match(SPACE);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_WITHIN_COMMENT) {
				{
				setState(59);
				endComment();
				}
			}

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
			setState(64);
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
			setState(66);
			word();
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					match(SPACE);
					setState(68);
					word();
					}
					} 
				}
				setState(73);
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
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 5632L) != 0)) ) {
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
	public static class EndCommentContext extends ParserRuleContext {
		public TerminalNode START_WITHIN_COMMENT() { return getToken(HledgerParser.START_WITHIN_COMMENT, 0); }
		public CommentTextContext commentText() {
			return getRuleContext(CommentTextContext.class,0);
		}
		public EndCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).enterEndComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HledgerListener ) ((HledgerListener)listener).exitEndComment(this);
		}
	}

	public final EndCommentContext endComment() throws RecognitionException {
		EndCommentContext _localctx = new EndCommentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_endComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(START_WITHIN_COMMENT);
			setState(77);
			commentText();
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
		public List<TerminalNode> EQUALS() { return getTokens(HledgerParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(HledgerParser.EQUALS, i);
		}
		public List<TerminalNode> DATE() { return getTokens(HledgerParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(HledgerParser.DATE, i);
		}
		public List<TerminalNode> START_WITHIN_COMMENT() { return getTokens(HledgerParser.START_WITHIN_COMMENT); }
		public TerminalNode START_WITHIN_COMMENT(int i) {
			return getToken(HledgerParser.START_WITHIN_COMMENT, i);
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
		enterRule(_localctx, 16, RULE_commentText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7896L) != 0)) {
				{
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(79);
					match(SPACE);
					}
					break;
				case SEMICOLON:
					{
					setState(80);
					match(SEMICOLON);
					}
					break;
				case EQUALS:
					{
					setState(81);
					match(EQUALS);
					}
					break;
				case DATE:
					{
					setState(82);
					match(DATE);
					}
					break;
				case START_WITHIN_COMMENT:
					{
					setState(83);
					match(START_WITHIN_COMMENT);
					}
					break;
				case ACCOUNT:
				case COMMODITY:
				case OTHER_WORD:
					{
					setState(84);
					word();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(89);
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
		public EndCommentContext endComment() {
			return getRuleContext(EndCommentContext.class,0);
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
		enterRule(_localctx, 18, RULE_commodityDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(COMMODITY);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				match(SPACE);
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(96);
			commodityString();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(97);
				match(SPACE);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_WITHIN_COMMENT) {
				{
				setState(103);
				endComment();
				}
			}

			setState(106);
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
		enterRule(_localctx, 20, RULE_commodityString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(HledgerParser.EOL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(HledgerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(HledgerParser.SPACE, i);
		}
		public EndCommentContext endComment() {
			return getRuleContext(EndCommentContext.class,0);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(DATE);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					match(SPACE);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(117);
			description();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(118);
				match(SPACE);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_WITHIN_COMMENT) {
				{
				setState(124);
				endComment();
				}
			}

			setState(127);
			match(EOL);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(128);
				posting();
				}
				}
				setState(133);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(HledgerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(HledgerParser.SEMICOLON, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(HledgerParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(HledgerParser.EQUALS, i);
		}
		public List<TerminalNode> DATE() { return getTokens(HledgerParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(HledgerParser.DATE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(134);
						match(SPACE);
						}
						}
						setState(139);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(144);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SEMICOLON:
						{
						setState(140);
						match(SEMICOLON);
						}
						break;
					case EQUALS:
						{
						setState(141);
						match(EQUALS);
						}
						break;
					case DATE:
						{
						setState(142);
						match(DATE);
						}
						break;
					case ACCOUNT:
					case COMMODITY:
					case OTHER_WORD:
						{
						setState(143);
						word();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public TerminalNode EOL() { return getToken(HledgerParser.EOL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(HledgerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(HledgerParser.SPACE, i);
		}
		public CommodityStringContext commodityString() {
			return getRuleContext(CommodityStringContext.class,0);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public EndCommentContext endComment() {
			return getRuleContext(EndCommentContext.class,0);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				match(SPACE);
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(156);
			accountName();
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(157);
				match(SPACE);
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(158);
					match(SPACE);
					}
					}
					setState(161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(163);
				commodityString();
				}
				break;
			}
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					match(SPACE);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_ASSERTION) {
				{
				setState(172);
				assertion();
				}
			}

			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(175);
				match(SPACE);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_WITHIN_COMMENT) {
				{
				setState(181);
				endComment();
				}
			}

			setState(184);
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
	public static class AssertionContext extends ParserRuleContext {
		public TerminalNode START_ASSERTION() { return getToken(HledgerParser.START_ASSERTION, 0); }
		public CommodityStringContext commodityString() {
			return getRuleContext(CommodityStringContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(HledgerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(HledgerParser.SPACE, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(START_ASSERTION);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(187);
				match(SPACE);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			commodityString();
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
		"\u0004\u0001\f\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"-\b\u0002\u0001\u0003\u0001\u0003\u0004\u00031\b\u0003\u000b\u0003\f\u0003"+
		"2\u0001\u0003\u0001\u0003\u0005\u00037\b\u0003\n\u0003\f\u0003:\t\u0003"+
		"\u0001\u0003\u0003\u0003=\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005F\b\u0005"+
		"\n\u0005\f\u0005I\t\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bV"+
		"\b\b\n\b\f\bY\t\b\u0001\t\u0001\t\u0004\t]\b\t\u000b\t\f\t^\u0001\t\u0001"+
		"\t\u0005\tc\b\t\n\t\f\tf\t\t\u0001\t\u0003\ti\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bq\b\u000b\n\u000b\f\u000b"+
		"t\t\u000b\u0001\u000b\u0001\u000b\u0005\u000bx\b\u000b\n\u000b\f\u000b"+
		"{\t\u000b\u0001\u000b\u0003\u000b~\b\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0082\b\u000b\n\u000b\f\u000b\u0085\t\u000b\u0001\f\u0005\f\u0088"+
		"\b\f\n\f\f\f\u008b\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0091\b"+
		"\f\u0005\f\u0093\b\f\n\f\f\f\u0096\t\f\u0001\r\u0004\r\u0099\b\r\u000b"+
		"\r\f\r\u009a\u0001\r\u0001\r\u0001\r\u0004\r\u00a0\b\r\u000b\r\f\r\u00a1"+
		"\u0001\r\u0003\r\u00a5\b\r\u0001\r\u0005\r\u00a8\b\r\n\r\f\r\u00ab\t\r"+
		"\u0001\r\u0003\r\u00ae\b\r\u0001\r\u0005\r\u00b1\b\r\n\r\f\r\u00b4\t\r"+
		"\u0001\r\u0003\r\u00b7\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00bd\b\u000e\n\u000e\f\u000e\u00c0\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0001\u0002\u0000\t\n\f\f\u00d6"+
		"\u0000#\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004,"+
		"\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b@\u0001\u0000"+
		"\u0000\u0000\nB\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000e"+
		"L\u0001\u0000\u0000\u0000\u0010W\u0001\u0000\u0000\u0000\u0012Z\u0001"+
		"\u0000\u0000\u0000\u0014l\u0001\u0000\u0000\u0000\u0016n\u0001\u0000\u0000"+
		"\u0000\u0018\u0094\u0001\u0000\u0000\u0000\u001a\u0098\u0001\u0000\u0000"+
		"\u0000\u001c\u00ba\u0001\u0000\u0000\u0000\u001e\"\u0003\u0002\u0001\u0000"+
		"\u001f\"\u0003\u0004\u0002\u0000 \"\u0003\u0016\u000b\u0000!\u001e\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000! \u0001\u0000\u0000"+
		"\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0005"+
		"\u0000\u0000\u0001\'\u0001\u0001\u0000\u0000\u0000()\u0005\u0005\u0000"+
		"\u0000)\u0003\u0001\u0000\u0000\u0000*-\u0003\u0006\u0003\u0000+-\u0003"+
		"\u0012\t\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\u0005"+
		"\u0001\u0000\u0000\u0000.0\u0005\t\u0000\u0000/1\u0005\u0006\u0000\u0000"+
		"0/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000048\u0003\b\u0004"+
		"\u000057\u0005\u0006\u0000\u000065\u0001\u0000\u0000\u00007:\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009<\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;=\u0003\u000e\u0007\u0000"+
		"<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>?\u0005\u0005\u0000\u0000?\u0007\u0001\u0000\u0000\u0000@A\u0003"+
		"\n\u0005\u0000A\t\u0001\u0000\u0000\u0000BG\u0003\f\u0006\u0000CD\u0005"+
		"\u0006\u0000\u0000DF\u0003\f\u0006\u0000EC\u0001\u0000\u0000\u0000FI\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"H\u000b\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0007\u0000"+
		"\u0000\u0000K\r\u0001\u0000\u0000\u0000LM\u0005\u0007\u0000\u0000MN\u0003"+
		"\u0010\b\u0000N\u000f\u0001\u0000\u0000\u0000OV\u0005\u0006\u0000\u0000"+
		"PV\u0005\u0003\u0000\u0000QV\u0005\u0004\u0000\u0000RV\u0005\u000b\u0000"+
		"\u0000SV\u0005\u0007\u0000\u0000TV\u0003\f\u0006\u0000UO\u0001\u0000\u0000"+
		"\u0000UP\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000UR\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X\u0011\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0005\n\u0000"+
		"\u0000[]\u0005\u0006\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`d\u0003\u0014\n\u0000ac\u0005\u0006\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000gi\u0003\u000e\u0007\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u0005\u0000\u0000k\u0013"+
		"\u0001\u0000\u0000\u0000lm\u0003\n\u0005\u0000m\u0015\u0001\u0000\u0000"+
		"\u0000nr\u0005\u000b\u0000\u0000oq\u0005\u0006\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uy\u0003\u0018\f\u0000vx\u0005\u0006\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0003\u000e"+
		"\u0007\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0083\u0005\u0005\u0000\u0000\u0080\u0082"+
		"\u0003\u001a\r\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0017\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0088\u0005\u0006\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0090\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u0091\u0005"+
		"\u0003\u0000\u0000\u008d\u0091\u0005\u0004\u0000\u0000\u008e\u0091\u0005"+
		"\u000b\u0000\u0000\u008f\u0091\u0003\f\u0006\u0000\u0090\u008c\u0001\u0000"+
		"\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000"+
		"\u0000\u0000\u0092\u0089\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u0099\u0005\u0006\u0000\u0000\u0098\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u00a4\u0003\b\u0004\u0000\u009d\u009f\u0005\u0006\u0000"+
		"\u0000\u009e\u00a0\u0005\u0006\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a5\u0003\u0014\n\u0000\u00a4\u009d\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a8\u0005\u0006\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ae\u0003\u001c\u000e\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b2\u0001\u0000\u0000\u0000\u00af\u00b1\u0005\u0006\u0000\u0000"+
		"\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b7\u0003\u000e\u0007\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0005\u0005\u0000\u0000\u00b9\u001b\u0001\u0000\u0000\u0000"+
		"\u00ba\u00be\u0005\b\u0000\u0000\u00bb\u00bd\u0005\u0006\u0000\u0000\u00bc"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0003\u0014\n\u0000\u00c2\u001d\u0001\u0000\u0000\u0000\u001b!"+
		"#,28<GUW^dhry}\u0083\u0089\u0090\u0094\u009a\u00a1\u00a4\u00a9\u00ad\u00b2"+
		"\u00b6\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}