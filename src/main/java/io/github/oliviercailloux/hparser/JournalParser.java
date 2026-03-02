package io.github.oliviercailloux.hparser;

import com.google.common.collect.ImmutableList;
import com.google.common.io.CharSource;
import io.github.oliviercailloux.hparser.antlr.HledgerLexer;
import io.github.oliviercailloux.hparser.antlr.HledgerParser;
import io.github.oliviercailloux.hparser.antlr.HledgerParser.JournalContext;
import java.io.IOException;
import java.util.List;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class JournalParser {
  public static record TokenDescription (String text, String name, int channel) {
  }

  public static record TokensAndJournal (BufferedTokenStream stream, JournalContext tree) {
    public List<Token> tokens() {
      return stream.getTokens();
    }

    public ImmutableList<TokenDescription> tokenDescriptions() {
      return tokens().stream().map(t -> describe(t))
          .collect(ImmutableList.toImmutableList());
    }

    private TokenDescription describe(Token t) {
      return new TokenDescription(t.getText(), HledgerLexer.VOCABULARY.getSymbolicName(t.getType()), t.getChannel());
    }
  }

  public static JournalContext tree(CharSource s) throws IOException {
    return tree(CharStreams.fromString(s.read()));
  }

  static JournalContext tree(CharStream s) {
    return parse(s, true).tree;
  }

  static TokensAndJournal parse(CharStream s, boolean safe) {
    HledgerLexer lexer = new HledgerLexer(s);
    if (safe) {
      lexer.removeErrorListeners();
      lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
    }
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    tokens.fill();
    HledgerParser parser = new HledgerParser(tokens);
    if (safe) {
      parser.removeErrorListeners();
      parser.addErrorListener(ThrowingErrorListener.INSTANCE);
    }
    JournalContext tree = parser.journal();
    return new TokensAndJournal(tokens, tree);
  }
}
