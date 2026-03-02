package io.github.oliviercailloux.hparser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import io.github.oliviercailloux.hparser.TestUtils.TokensAndJournal;
import io.github.oliviercailloux.hparser.antlr.HledgerLexer;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.CommodityContext;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.DirectiveContext;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.EmptyLineContext;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.JournalContext;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.TransactionContext;
import java.util.Iterator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTests {
  @SuppressWarnings("unused")
  private static final Logger LOGGER = LoggerFactory.getLogger(MyTests.class);

  @Test
  void testAccountDirective() throws Exception {
    CharStream s = CharStreams.fromString("account somename\n");
    JournalContext j = TestUtils.tree(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("somename", dir.accountDirective().accountName().getText());
  }

  @Test
  void testAccountCommenDirective() throws Exception {
    CharStream s = CharStreams.fromString("account somename  ; commen\n");
    JournalContext j = TestUtils.tree(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("somename", dir.accountDirective().accountName().getText());
  }

  @Test
  void testAccountCommentDirective() throws Exception {
    CharStream s = CharStreams.fromString("account somename  ; comment\n");
    JournalContext j = TestUtils.tree(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("somename", dir.accountDirective().accountName().getText());
  }

  @Test
  void testAccountDirectives() throws Exception {
    CharStream s = CharStreams.fromString("account somename\naccount  another \n\n");
    JournalContext j = TestUtils.tree(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(EmptyLineContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    assertEquals("somename",
        j.getChild(DirectiveContext.class, 0).accountDirective().accountName().getText());
    assertEquals("another",
        j.getChild(DirectiveContext.class, 1).accountDirective().accountName().getText());
    assertEquals(EmptyLineContext.class, j.getChild(EmptyLineContext.class, 0).getClass());
    assertNull(j.getChild(EmptyLineContext.class, 1));
    assertNull(j.getChild(EmptyLineContext.class, 2));
  }

  @Test
  void testCommodityDirective() throws Exception {
    CharStream s = CharStreams.fromString("commodity $0.00\n");
    JournalContext j = TestUtils.tree(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("$0.00", dir.commodityDirective().commodity().getText());
  }

  @Test
  void testCommodityDirectiveComment() throws Exception {
    CharStream s = CharStreams.fromString("commodity $0.00     ; Some comment\n");
    JournalContext j = TestUtils.tree(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("$0.00", dir.commodityDirective().commodity().getText());
  }

  @Test
  void testCommodityDirectiveCommentSep() throws Exception {
    CharStream s = CharStreams.fromString("commodity $0.00     ; Some comment  with spaces\n");
    JournalContext j = TestUtils.tree(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("$0.00", dir.commodityDirective().commodity().getText());
  }

  @Test
  void testCommodityDirectiveCommentSc() throws Exception {
    CharStream s = CharStreams
        .fromString("commodity $0.00     ; Some comment  with spaces and ; semicolons\n");
    JournalContext j = TestUtils.tree(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("$0.00", dir.commodityDirective().commodity().getText());
  }

  @Test
  void testCommoditySpcDirective() throws Exception {
    CharStream s = CharStreams.fromString("commodity 1.000,00 EUR\n");
    JournalContext j = TestUtils.tree(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    CommodityContext commodity = dir.commodityDirective().commodity();
    assertEquals("1.000,00EUR", commodity.getText());
  }

  @Test
  void testTransactionDate() throws Exception {
    CharStream s = CharStreams.fromString("2026-01-01\n");
    TokensAndJournal parsed = TestUtils.parse(s, false);
    CommonTokenStream tokens = parsed.t();
    tokens.fill(); // Important!

    for (Token t : tokens.getTokens()) {
      LOGGER.info("TEXT=[" + t.getText() + "] " + "TYPE="
          + HledgerLexer.VOCABULARY.getSymbolicName(t.getType()) + " CHANNEL=" + t.getChannel());
    }
    JournalContext j = parsed.tree();
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
  }

  @Test
  void testTransactionDescr() throws Exception {
    CharStream s = CharStreams.fromString("2026-01-01 some description\n");
    JournalContext j = TestUtils.tree(s);
    LOGGER.info("Parsed: {}.", j.toStringTree());
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
    assertEquals("somedescription", t.description().getText());
  }

  @Test
  void testTransactionDescrComm() throws Exception {
    CharStream s =
        CharStreams.fromString("2026-01-01 some description  ; some comment  ; with semi \n");
    JournalContext j = TestUtils.tree(s);
    LOGGER.info("Parsed: {}.", j.toStringTree());
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
    assertEquals("somedescription", t.description().getText());
  }

  @Test
  void testTransactionOnePosting() throws Exception {
    CharStream s = CharStreams.fromString("2026-01-01\n  some:spaced account   ; comment\n");
    JournalContext j = TestUtils.tree(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
    assertEquals("", t.description().getText());
    assertEquals("  some:spaced account   ; comment\n", t.posting(0).getText());
    assertEquals("some:spaced account", t.posting(0).accountName().getText());
  }

  @Test
  void testAssertion() throws Exception {
    CharStream s = CharStreams.fromString("2026-01-01\n  account  $0  = $10000\n");
    JournalContext j = TestUtils.tree(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
    assertEquals("account", t.posting(0).accountName().getText());
    assertEquals("$0", t.posting(0).commodityString().getText());
    assertEquals("  = $10000", t.posting(0).assertion().getText());
    assertEquals("$10000", t.posting(0).assertion().commodityString().getText());
  }

  @Test
  void testTransactionPostings() throws Exception {
    CharStream s = CharStreams.fromString(
        "2026-01-01\n  some:spaced account   ; comment\n  another  3000 €\n  a final   $ 4000,00  ; comment\n");
    JournalContext j = TestUtils.tree(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
    assertEquals("", t.description().getText());
    assertEquals("  some:spaced account   ; comment\n", t.posting(0).getText());
    assertEquals("some:spaced account", t.posting(0).accountName().getText());
    assertEquals("  another  3000 €\n", t.posting(1).getText());
    assertEquals("another", t.posting(1).accountName().getText());
    assertEquals("3000 €", t.posting(1).commodityString().getText());
    assertEquals("a final", t.posting(2).accountName().getText());
    assertEquals("$ 4000,00", t.posting(2).commodityString().getText());
  }
}
