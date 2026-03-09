package io.github.oliviercailloux.hparser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.google.common.io.CharSource;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.CommodityContext;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.DirectiveContext;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.EmptyLineContext;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.JournalContext;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.TransactionContext;
import java.util.Iterator;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContentTests {
  @SuppressWarnings("unused")
  private static final Logger LOGGER = LoggerFactory.getLogger(ContentTests.class);

  @Test
  void testDecimalMarkDirective() throws Exception {
    CharSource s = CharSource.wrap("decimal-mark .\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("decimal-mark .\n", dir.decimalMarkDirective().getText());
  }

  @Test
  void testTagDirective() throws Exception {
    CharSource s = CharSource.wrap("tag someTag\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("someTag", dir.tagDirective().tag().getText());
  }

  @Test
  void testAccountDirective() throws Exception {
    CharSource s = CharSource.wrap("account somename\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("somename", dir.accountDirective().accountName().getText());
  }

  @Test
  void testAccountCommentDirective() throws Exception {
    CharSource s = CharSource.wrap("account somename  ; comment\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("somename", dir.accountDirective().accountName().getText());
  }

  @Test
  void testAccountDirectives() throws Exception {
    CharSource s = CharSource.wrap("account somename\naccount another \n\n");
    JournalContext j = JournalParser.journal(s);
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
    CharSource s = CharSource.wrap("commodity $0.00\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("$0.00", dir.commodityDirective().commodity().getText());
  }

  @Test
  void testCommodityDirectiveComment() throws Exception {
    CharSource s = CharSource.wrap("commodity $0.00     ; Some comment\n");
    // TokensAndJournal parsed = TestUtils.parse(s, false);
    // LOGGER.info("Got: {}.", parsed.tokenDescriptions());
    // JournalContext j = parsed.tree();
    // LOGGER.info("Parsed: {}.", j.toStringTree());
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("$0.00", dir.commodityDirective().commodity().getText());
  }

  @Test
  void testCommodityDirectiveCommentSep() throws Exception {
    CharSource s = CharSource.wrap("commodity $0.00     ; Some comment  with spaces\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("$0.00", dir.commodityDirective().commodity().getText());
  }

  @Test
  void testCommodityDirectiveCommentSc() throws Exception {
    CharSource s =
        CharSource.wrap("commodity $0.00     ; Some comment  with spaces and ; semicolons\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("$0.00", dir.commodityDirective().commodity().getText());
  }

  @Test
  void testCommoditySpcDirective() throws Exception {
    CharSource s = CharSource.wrap("commodity 1.000,00 EUR\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    CommodityContext commodity = dir.commodityDirective().commodity();
    assertEquals("1.000,00EUR", commodity.getText());
  }

  @Test
  void testPDirective() throws Exception {
    CharSource s = CharSource.wrap("P 1989-01-01 € BEF 40.3399\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(DirectiveContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    DirectiveContext dir = j.getChild(DirectiveContext.class, 0);
    assertEquals("€", dir.pDirective().commoditySymbol().getText());
    assertEquals("BEF40.3399", dir.pDirective().commodityAmount().getText());
  }

  @Test
  void testTransactionDate() throws Exception {
    CharSource s = CharSource.wrap("2026-01-01\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
  }

  @Test
  void testTransactionDescr() throws Exception {
    CharSource s = CharSource.wrap("2026-01-01 some description\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
    assertEquals("somedescription", t.description().getText());
  }

  @Test
  void testTransactionDescrTrap() throws Exception {
    CharSource s = CharSource.wrap("2026-01-01 P \n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
    assertEquals("P ", t.description().getText());
  }

  @Test
  void testTransactionDescrSemic() throws Exception {
    CharSource s = CharSource.wrap("2026-01-01 some description ; with semi colon\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
    /*
     * Per spec, it seems like the semicolon is a comment delimiter, even without two spaces before
     * it (actually even with zero spaces but we don’t insist on this here)
     */
    assertEquals("somedescription", t.description().getText());
  }

  @Test
  void testTransactionDescrComm() throws Exception {
    CharSource s = CharSource.wrap("2026-01-01 some description  ; some comment  ; with semi \n");
    JournalContext j = JournalParser.journal(s);
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
    CharSource s = CharSource.wrap("2026-01-01\n  some:spaced account   ; comment\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
    assertEquals("", t.description().getText());
    assertEquals("some:spacedaccount", t.posting(0).getText());
    assertEquals("some:spacedaccount", t.posting(0).accountName().getText());
  }

  @Test
  void testTransactionSpacing() throws Exception {
    CharSource s = CharSource.wrap("1998-03-31 descr\n  account  $1 ;   comment\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("1998-03-31", t.DATE().getText());
    assertEquals("descr", t.description().getText());
    assertEquals("account", t.posting(0).accountName().getText());
    assertEquals("$1", t.posting(0).commodity().getText());
  }

  @Test
  void testTransactionTag() throws Exception {
    CharSource s = CharSource.wrap("2022-07-03 descr\n  ;OFX descr\n  account  $1\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2022-07-03", t.DATE().getText());
    assertEquals("descr", t.description().getText());
    assertEquals("account", t.posting(0).accountName().getText());
    assertEquals("$1", t.posting(0).commodity().getText());
  }

  @Test
  void testAssertion() throws Exception {
    CharSource s = CharSource.wrap("2026-01-01\n  account  $0  = $10000\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
    assertEquals("account", t.posting(0).accountName().getText());
    assertEquals("$0", t.posting(0).commodity().getText());
    assertEquals("  =$10000", t.posting(0).assertion().getText());
    assertEquals("$10000", t.posting(0).assertion().commodity().getText());
  }

  @Test
  void testTransactionPostings() throws Exception {
    CharSource s = CharSource.wrap(
        "2026-01-01\n  some:spaced account   ; comment\n  * another  3000 €\n  a final   $ 4000,00  ; comment\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(TransactionContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
    TransactionContext t = j.getChild(TransactionContext.class, 0);
    assertEquals("2026-01-01", t.DATE().getText());
    assertEquals("", t.description().getText());
    assertEquals("some:spacedaccount", t.posting(0).getText());
    assertNull(t.posting(0).STAR());
    assertEquals("some:spacedaccount", t.posting(0).accountName().getText());
    assertEquals("* another  3000€", t.posting(1).getText());
    assertEquals("* ", t.posting(1).STAR().getText());
    assertEquals("another", t.posting(1).accountName().getText());
    assertEquals("3000€", t.posting(1).commodity().getText());
    assertNull(t.posting(2).STAR());
    assertEquals("afinal", t.posting(2).accountName().getText());
    assertEquals("$4000,00", t.posting(2).commodity().getText());
  }
}
