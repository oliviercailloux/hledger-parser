package io.github.oliviercailloux.hparser;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

@SuppressWarnings("serial")
public class ParsingException extends RuntimeException {
  @SuppressWarnings("unused")
  public ParsingException(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
      int charPositionInLine, String msg, RecognitionException cause) {
    super("line " + line + ":" + charPositionInLine + " " + msg, cause);
  }
}
