package interfaces;

import org.apache.commons.lang3.math.Fraction;

public interface IAbcMusicSymbol extends IAbcMusicFragment {

	public Fraction getNoteLength();
	public IAbcMusicSymbol augmentNoteLength(Fraction factor);
	
}
