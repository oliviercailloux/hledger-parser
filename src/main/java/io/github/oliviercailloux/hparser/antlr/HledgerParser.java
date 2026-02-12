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
		ACCOUNT=7, COMMODITY=8, DATE=9, OTHER_WORD=10;
	public static final int
		RULE_journal = 0, RULE_emptyLine = 1, RULE_directive = 2, RULE_accountDirective = 3, 
		RULE_accountName = 4, RULE_multipleWords = 5, RULE_word = 6, RULE_endComment = 7, 
		RULE_commentText = 8, RULE_commodityDirective = 9, RULE_commodityString = 10, 
		RULE_transaction = 11, RULE_description = 12, RULE_posting = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"journal", "emptyLine", "directive", "accountDirective", "accountName", 
			"multipleWords", "word", "endComment", "commentText", "commodityDirective", 
			"commodityString", "transaction", "description", "posting"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 912L) != 0)) {
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOL:
					{
					setState(28);
					emptyLine();
					}
					break;
				case ACCOUNT:
				case COMMODITY:
					{
					setState(29);
					directive();
					}
					break;
				case DATE:
					{
					setState(30);
					transaction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCOUNT:
				{
				setState(40);
				accountDirective();
				}
				break;
			case COMMODITY:
				{
				setState(41);
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
			setState(44);
			match(ACCOUNT);
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				match(SPACE);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(50);
			accountName();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(51);
				match(SPACE);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_WITHIN_COMMENT) {
				{
				setState(57);
				endComment();
				}
			}

			setState(60);
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
			setState(62);
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
			setState(64);
			word();
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					match(SPACE);
					setState(66);
					word();
					}
					} 
				}
				setState(71);
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
			setState(72);
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
			setState(74);
			match(START_WITHIN_COMMENT);
			setState(75);
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
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2024L) != 0)) {
				{
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(77);
					match(SPACE);
					}
					break;
				case SEMICOLON:
					{
					setState(78);
					match(SEMICOLON);
					}
					break;
				case DATE:
					{
					setState(79);
					match(DATE);
					}
					break;
				case START_WITHIN_COMMENT:
					{
					setState(80);
					match(START_WITHIN_COMMENT);
					}
					break;
				case ACCOUNT:
				case COMMODITY:
				case OTHER_WORD:
					{
					setState(81);
					word();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(86);
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
			setState(87);
			match(COMMODITY);
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				match(SPACE);
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(93);
			commodityString();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(94);
				match(SPACE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_WITHIN_COMMENT) {
				{
				setState(100);
				endComment();
				}
			}

			setState(103);
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
			setState(105);
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
			setState(107);
			match(DATE);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					match(SPACE);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(114);
			description();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(115);
				match(SPACE);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_WITHIN_COMMENT) {
				{
				setState(121);
				endComment();
				}
			}

			setState(124);
			match(EOL);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(125);
				posting();
				}
				}
				setState(130);
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
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(131);
						match(SPACE);
						}
						}
						setState(136);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(140);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SEMICOLON:
						{
						setState(137);
						match(SEMICOLON);
						}
						break;
					case DATE:
						{
						setState(138);
						match(DATE);
						}
						break;
					case ACCOUNT:
					case COMMODITY:
					case OTHER_WORD:
						{
						setState(139);
						word();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(146);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				match(SPACE);
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(152);
			accountName();
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(153);
				match(SPACE);
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					match(SPACE);
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(159);
				commodityString();
				}
				break;
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(162);
				match(SPACE);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_WITHIN_COMMENT) {
				{
				setState(168);
				endComment();
				}
			}

			setState(171);
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
		"\u0004\u0001\n\u00ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002+\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0004\u0003/\b\u0003\u000b\u0003\f\u00030\u0001\u0003\u0001"+
		"\u0003\u0005\u00035\b\u0003\n\u0003\f\u00038\t\u0003\u0001\u0003\u0003"+
		"\u0003;\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005D\b\u0005\n\u0005\f\u0005G\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bS\b\b\n\b\f\bV\t\b\u0001\t\u0001"+
		"\t\u0004\tZ\b\t\u000b\t\f\t[\u0001\t\u0001\t\u0005\t`\b\t\n\t\f\tc\t\t"+
		"\u0001\t\u0003\tf\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0005\u000bn\b\u000b\n\u000b\f\u000bq\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000bu\b\u000b\n\u000b\f\u000bx\t\u000b\u0001\u000b\u0003"+
		"\u000b{\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u007f\b\u000b\n\u000b"+
		"\f\u000b\u0082\t\u000b\u0001\f\u0005\f\u0085\b\f\n\f\f\f\u0088\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u008d\b\f\u0005\f\u008f\b\f\n\f\f\f\u0092\t"+
		"\f\u0001\r\u0004\r\u0095\b\r\u000b\r\f\r\u0096\u0001\r\u0001\r\u0001\r"+
		"\u0004\r\u009c\b\r\u000b\r\f\r\u009d\u0001\r\u0003\r\u00a1\b\r\u0001\r"+
		"\u0005\r\u00a4\b\r\n\r\f\r\u00a7\t\r\u0001\r\u0003\r\u00aa\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001\u0002\u0000\u0007\b\n"+
		"\n\u00bc\u0000!\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000"+
		"\u0004*\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b>\u0001"+
		"\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000\fH\u0001\u0000\u0000\u0000"+
		"\u000eJ\u0001\u0000\u0000\u0000\u0010T\u0001\u0000\u0000\u0000\u0012W"+
		"\u0001\u0000\u0000\u0000\u0014i\u0001\u0000\u0000\u0000\u0016k\u0001\u0000"+
		"\u0000\u0000\u0018\u0090\u0001\u0000\u0000\u0000\u001a\u0094\u0001\u0000"+
		"\u0000\u0000\u001c \u0003\u0002\u0001\u0000\u001d \u0003\u0004\u0002\u0000"+
		"\u001e \u0003\u0016\u000b\u0000\u001f\u001c\u0001\u0000\u0000\u0000\u001f"+
		"\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0000"+
		"\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&\'\u0005\u0004\u0000\u0000"+
		"\'\u0003\u0001\u0000\u0000\u0000(+\u0003\u0006\u0003\u0000)+\u0003\u0012"+
		"\t\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+\u0005\u0001"+
		"\u0000\u0000\u0000,.\u0005\u0007\u0000\u0000-/\u0005\u0005\u0000\u0000"+
		".-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000026\u0003\b\u0004"+
		"\u000035\u0005\u0005\u0000\u000043\u0001\u0000\u0000\u000058\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007:\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009;\u0003\u000e\u0007\u0000"+
		":9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<=\u0005\u0004\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0003"+
		"\n\u0005\u0000?\t\u0001\u0000\u0000\u0000@E\u0003\f\u0006\u0000AB\u0005"+
		"\u0005\u0000\u0000BD\u0003\f\u0006\u0000CA\u0001\u0000\u0000\u0000DG\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"F\u000b\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0007\u0000"+
		"\u0000\u0000I\r\u0001\u0000\u0000\u0000JK\u0005\u0006\u0000\u0000KL\u0003"+
		"\u0010\b\u0000L\u000f\u0001\u0000\u0000\u0000MS\u0005\u0005\u0000\u0000"+
		"NS\u0005\u0003\u0000\u0000OS\u0005\t\u0000\u0000PS\u0005\u0006\u0000\u0000"+
		"QS\u0003\f\u0006\u0000RM\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000"+
		"RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000U\u0011\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"WY\u0005\b\u0000\u0000XZ\u0005\u0005\u0000\u0000YX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]a\u0003\u0014\n\u0000^`\u0005\u0005"+
		"\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000df\u0003\u000e\u0007\u0000ed\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005\u0004"+
		"\u0000\u0000h\u0013\u0001\u0000\u0000\u0000ij\u0003\n\u0005\u0000j\u0015"+
		"\u0001\u0000\u0000\u0000ko\u0005\t\u0000\u0000ln\u0005\u0005\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000rv\u0003\u0018\f\u0000su\u0005\u0005\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"y{\u0003\u000e\u0007\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|\u0080\u0005\u0004\u0000\u0000}\u007f"+
		"\u0003\u001a\r\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0017\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0083\u0085\u0005\u0005\u0000\u0000\u0084\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u008c\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008d\u0005\u0003\u0000"+
		"\u0000\u008a\u008d\u0005\t\u0000\u0000\u008b\u008d\u0003\f\u0006\u0000"+
		"\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000"+
		"\u008e\u0086\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0019\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0095\u0005\u0005\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u00a0\u0003\b\u0004\u0000\u0099\u009b\u0005\u0005\u0000\u0000\u009a"+
		"\u009c\u0005\u0005\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a1\u0003\u0014\n\u0000\u00a0\u0099\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a5\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u0005\u0005\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003\u000e\u0007\u0000\u00a9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0004\u0000\u0000\u00ac\u001b"+
		"\u0001\u0000\u0000\u0000\u0018\u001f!*06:ERT[aeovz\u0080\u0086\u008c\u0090"+
		"\u0096\u009d\u00a0\u00a5\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}