package io.github.oliviercailloux.hparser;

import com.google.common.io.CharSource;
import io.github.oliviercailloux.hparser.antlr.HledgerLexer;
import io.github.oliviercailloux.hparser.antlr.HledgerParser;
import java.io.Reader;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTests {
  @SuppressWarnings("unused")
  private static final Logger LOGGER = LoggerFactory.getLogger(MyTests.class);

  @Test
  void testEmpty() throws Exception {
    CharSource input = Resourcer.charSource("Empty.journal");
    try (Reader r = input.openStream()) {
      CharStream s = CharStreams.fromReader(r);
      HledgerLexer lexer = new HledgerLexer(s);
      TokenStream tokens = new CommonTokenStream(lexer);
      HledgerParser parser = new HledgerParser(tokens);
      ParseTree tree = parser.journal();
      LOGGER.info(tree.toStringTree(parser));
    }
  }

  @Test
  void testComment() throws Exception {
    CharSource input = Resourcer.charSource("Comment.journal");
    try (Reader r = input.openStream()) {
      CharStream s = CharStreams.fromReader(r);
      HledgerLexer lexer = new HledgerLexer(s);
      TokenStream tokens = new CommonTokenStream(lexer);
      HledgerParser parser = new HledgerParser(tokens);
      ParseTree tree = parser.journal();
      LOGGER.info(tree.toStringTree(parser));
    }
  }

  @Test
  void testBlockComment() throws Exception {
    CharSource input = Resourcer.charSource("Block comment.journal");
    try (Reader r = input.openStream()) {
      CharStream s = CharStreams.fromReader(r);
      HledgerLexer lexer = new HledgerLexer(s);
      TokenStream tokens = new CommonTokenStream(lexer);
      HledgerParser parser = new HledgerParser(tokens);
      ParseTree tree = parser.journal();
      LOGGER.info(tree.toStringTree(parser));
    }
  }

  @Test
  void testDirective() throws Exception {
    CharSource input = Resourcer.charSource("Directive.journal");
    try (Reader r = input.openStream()) {
      // CharStream s = CharStreams.fromReader(r);
      CharStream s = CharStreams.fromString("account somename\naccount another\n\n");
      HledgerLexer lexer = new HledgerLexer(s);
      lexer.removeErrorListeners();
      lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
      TokenStream tokens = new CommonTokenStream(lexer);
      HledgerParser parser = new HledgerParser(tokens);
      parser.removeErrorListeners();
      parser.addErrorListener(ThrowingErrorListener.INSTANCE);
      ParseTree tree = parser.journal();
      LOGGER.info(tree.toStringTree(parser));
    }
  }
}
