package io.github.oliviercailloux.hparser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.MoreCollectors;
import com.google.common.io.CharSource;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.DirectiveContext;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.EmptyLineContext;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.JournalContext;
import java.util.Iterator;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.jupiter.api.Test;

public class NoContentTests {

  @Test
  void testEmpty() throws Exception {
    CharSource s = CharSource.wrap("");
    JournalContext j = JournalParser.journal(s);
    assertEquals(1, j.getChildCount());
    assertEquals(1, j.children.size());
    assertTrue(j.children.stream().collect(MoreCollectors.onlyElement()) instanceof TerminalNode);
    TerminalNode t = j.getChild(TerminalNode.class, 0);
    assertEquals(j.EOF(), t);
    assertEquals("<EOF>", t.getSymbol().getText());

    assertNull(j.getChild(DirectiveContext.class, 0));
    assertNull(j.getChild(DirectiveContext.class, 1));
    assertNull(j.getChild(DirectiveContext.class, 2));
  }

  @Test
  void testEmptyLines() throws Exception {
    CharSource s = CharSource.wrap("\n\n\n");
    JournalContext j = JournalParser.journal(s);
    assertEquals(4, j.getChildCount());
    assertEquals(4, j.children.size());
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(EmptyLineContext.class, it.next().getClass());
    assertEquals(EmptyLineContext.class, it.next().getClass());
    assertEquals(EmptyLineContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
  }

  @Test
  void testInvalid() throws Exception {
    CharSource s = CharSource.wrap("invalid");
    assertThrows(ParsingException.class, () -> JournalParser.journal(s));
  }

  @Test
  void testComment() throws Exception {
    CharSource s = CharSource.wrap("// single comment\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
  }

  @Test
  void testCommentDash() throws Exception {
    CharSource s = CharSource.wrap("// single comment\n# another comment\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
  }

  @Test
  void testCommentEmpties() throws Exception {
    CharSource s = CharSource.wrap("\n// single comment\n\n");
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(EmptyLineContext.class, it.next().getClass());
    assertEquals(EmptyLineContext.class, it.next().getClass());
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
  }

  @Test
  void testBlockComment() throws Exception {
    CharSource s = CharSource.wrap("""
        comment
        hello, world
        end comment
        """);
    JournalContext j = JournalParser.journal(s);
    Iterator<ParseTree> it = j.children.iterator();
    assertEquals(j.EOF(), it.next());
    assertFalse(it.hasNext());
  }
  
}
