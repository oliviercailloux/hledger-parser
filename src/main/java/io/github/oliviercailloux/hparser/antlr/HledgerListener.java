// Generated from io/github/oliviercailloux/hparser/antlr/Hledger.g4 by ANTLR 4.13.2
package io.github.oliviercailloux.hparser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HledgerParser}.
 */
public interface HledgerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HledgerParser#journal}.
	 * @param ctx the parse tree
	 */
	void enterJournal(HledgerParser.JournalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HledgerParser#journal}.
	 * @param ctx the parse tree
	 */
	void exitJournal(HledgerParser.JournalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HledgerParser#emptyLine}.
	 * @param ctx the parse tree
	 */
	void enterEmptyLine(HledgerParser.EmptyLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HledgerParser#emptyLine}.
	 * @param ctx the parse tree
	 */
	void exitEmptyLine(HledgerParser.EmptyLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HledgerParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(HledgerParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HledgerParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(HledgerParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HledgerParser#accountDirective}.
	 * @param ctx the parse tree
	 */
	void enterAccountDirective(HledgerParser.AccountDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HledgerParser#accountDirective}.
	 * @param ctx the parse tree
	 */
	void exitAccountDirective(HledgerParser.AccountDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HledgerParser#accountName}.
	 * @param ctx the parse tree
	 */
	void enterAccountName(HledgerParser.AccountNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HledgerParser#accountName}.
	 * @param ctx the parse tree
	 */
	void exitAccountName(HledgerParser.AccountNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HledgerParser#multipleWords}.
	 * @param ctx the parse tree
	 */
	void enterMultipleWords(HledgerParser.MultipleWordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HledgerParser#multipleWords}.
	 * @param ctx the parse tree
	 */
	void exitMultipleWords(HledgerParser.MultipleWordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HledgerParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(HledgerParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HledgerParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(HledgerParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HledgerParser#commentText}.
	 * @param ctx the parse tree
	 */
	void enterCommentText(HledgerParser.CommentTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HledgerParser#commentText}.
	 * @param ctx the parse tree
	 */
	void exitCommentText(HledgerParser.CommentTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HledgerParser#commodityDirective}.
	 * @param ctx the parse tree
	 */
	void enterCommodityDirective(HledgerParser.CommodityDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HledgerParser#commodityDirective}.
	 * @param ctx the parse tree
	 */
	void exitCommodityDirective(HledgerParser.CommodityDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HledgerParser#commodityString}.
	 * @param ctx the parse tree
	 */
	void enterCommodityString(HledgerParser.CommodityStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HledgerParser#commodityString}.
	 * @param ctx the parse tree
	 */
	void exitCommodityString(HledgerParser.CommodityStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HledgerParser#transaction}.
	 * @param ctx the parse tree
	 */
	void enterTransaction(HledgerParser.TransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HledgerParser#transaction}.
	 * @param ctx the parse tree
	 */
	void exitTransaction(HledgerParser.TransactionContext ctx);
}