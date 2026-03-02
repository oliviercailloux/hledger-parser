package io.github.oliviercailloux.hparser;

import io.github.oliviercailloux.hparser.antlr.HledgerLexer;
import io.github.oliviercailloux.hparser.antlr.HledgerParser;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.JournalContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

public class TestUtils {
  public static record TokensAndJournal (CommonTokenStream t, JournalContext tree) {
  }

  public static JournalContext tree(CharStream s) {
    return parse(s, true).tree;
  }

  public static TokensAndJournal parse(CharStream s, boolean safe) {
    HledgerLexer lexer = new HledgerLexer(s);
    if (safe) {
      lexer.removeErrorListeners();
      lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
    }
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    HledgerParser parser = new HledgerParser(tokens);
    if (safe) {
      parser.removeErrorListeners();
      parser.addErrorListener(ThrowingErrorListener.INSTANCE);
    }
    JournalContext tree = parser.journal();
    return new TokensAndJournal(tokens, tree);
  }
}
