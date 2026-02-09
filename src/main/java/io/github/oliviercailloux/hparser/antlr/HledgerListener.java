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
	 * Enter a parse tree produced by {@link HledgerParser#commentText}.
	 * @param ctx the parse tree
	 */
	void enterCommentText(HledgerParser.CommentTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HledgerParser#commentText}.
	 * @param ctx the parse tree
	 */
	void exitCommentText(HledgerParser.CommentTextContext ctx);
}