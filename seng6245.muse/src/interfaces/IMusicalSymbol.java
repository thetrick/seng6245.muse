package interfaces;

import org.apache.commons.lang3.math.Fraction;

public interface IMusicalSymbol extends IMusicalFragment {

	public Fraction getNoteLength();
	
	public IMusicalSymbol augmentNoteLength(Fraction factor);
	
}
