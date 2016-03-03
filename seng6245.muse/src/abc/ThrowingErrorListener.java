package abc;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

// Used to handle ANTLR Processing Errors...
// Leverage a strategy detailed at the following location: 
//     http://stackoverflow.com/questions/18132078/handling-errors-in-antlr4/18137301#18137301
public class ThrowingErrorListener extends BaseErrorListener {

	   public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

	   @Override
	   public void syntaxError(Recognizer<?, ?> recognizer, 
			   Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
	      throws ParseCancellationException {
	         throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
	      }
	}
