package api;

import org.apache.commons.lang3.math.Fraction;
import java.util.List;
import java.util.ArrayList;
import interfaces.IMusicalSymbol;

public class Chord implements IMusicalSymbol {
	
	private final List<IMusicalSymbol> notes;
	private final Fraction chordLength;
	
	public Chord(List<IMusicalSymbol> notes) {
		this.notes = new ArrayList<IMusicalSymbol>(notes);
		
		// find the smallest length in list of notes
		if(this.notes.isEmpty()) {
			chordLength = Fraction.ZERO;
			return;
		}
		
		Fraction smallest = notes.get(0).getNoteLength();
		for(IMusicalSymbol note : notes) {
			if(note.getNoteLength().compareTo(smallest) == -1) {
				smallest = note.getNoteLength();
			}
		}
		
		this.chordLength = smallest;
	}
	

	@Override
	public int getTicksPerBeat() {
		int leastCommonMultiple = 1;
		for(IMusicalSymbol note : notes) {
			leastCommonMultiple = NumberUtils.lcm(leastCommonMultiple, note.getTicksPerBeat());
		}
		return leastCommonMultiple;
	}

	@Override
	public Fraction getNoteLength() {
		return this.chordLength;
	}

	@Override
	public IMusicalSymbol augmentNoteLength(Fraction factor) {
        List<IMusicalSymbol> newNotes = new ArrayList<IMusicalSymbol>(notes.size());
        for(IMusicalSymbol note : notes) {
            newNotes.add(note.augmentNoteLength(factor));
        }
        return new Chord(newNotes);
	}
	
	@Override
	public boolean equals(Object other) {
	    //check for self-comparison
	    if ( this == other ) 
	    	return true;

	    //use instanceof instead of getClass here for two reasons
	    //	1. if need be, it can match any supertype, and not just one class;
	    //	2. it renders an explict check for "that == null" redundant, since
	    //it does the check for null already - "null instanceof [type]" always
	    //returns false. (See Effective Java by Joshua Bloch.)
	    if (!(other instanceof Chord)) 
	    	return false;
	    
        // if the objects are the same type, then cast 'other' as Note and 
	    // compare values
	    Chord that = (Chord) other;
	    return (this.chordLength.compareTo(that.chordLength) == 0 && this.notes.equals(that.notes));
	}	
	
    @Override
    public String toString() {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        for(IMusicalSymbol note : notes) {
        	stringbuilder.append(note);
        	stringbuilder.append(" ");
        }
        stringbuilder.setLength((stringbuilder.length() - 1));
        stringbuilder.append("]");
        return stringbuilder.toString();
    }	
	
	@Override
	public int hashCode() {
		return this.notes.hashCode();
	}

}
