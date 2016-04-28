package api;

import interfaces.IAbcMusicSymbol;
import sound.Orchestrator;

import org.apache.commons.lang3.math.Fraction;

/**
 * 
 * @author Todd G. Hetrick
 *
 */
public class Rest implements IAbcMusicSymbol {
	
    private final Fraction length;

    public Rest(Fraction length) {
        this.length = length;
    }

    @Override
    public int getTicksPerBeat() {
        return length.getDenominator();
    }
    
	@Override
	public Fraction getNoteLength() {
		return this.length;
	}	

	@Override
    public Rest augmentNoteLength(Fraction factor) {
        Fraction newLength = length.multiplyBy(factor);
        return new Rest(newLength);
    }
    
    @Override
    public boolean equals(Object other) {
	    //check for self-comparison
	    if ( this == other ) return true;

	    //use instanceof instead of getClass here for two reasons
	    //	1. if need be, it can match any supertype, and not just one class;
	    //	2. it renders an explict check for "that == null" redundant, since
	    //it does the check for null already - "null instanceof [type]" always
	    //returns false. (See Effective Java by Joshua Bloch.)
	    if (!(other instanceof Rest)) 
	    	return false;
	    
        // if the objects are the same type, then cast 'other' as Note and 
	    // compare values
	    Rest that = (Rest) other;
	    return this.length.equals(that.length);
    }

    @Override
    /**
     * Return the string representation of Rest Data Type
     */
    public String toString() {
        return "z" + this.length.toString();
    }

    @Override
    public int hashCode() {
        return this.length.hashCode();
    }

	@Override
	/**
	 * Injects the current Rest object (this) into the Orchestrator
	 * @param orchestrator - Orchestrator Instance used to manage the sequencing of notes
	 * 						 from the .abc file format to MIDI sounds
	 */
	public void addToOrchestrator(Orchestrator orchestrator) {
		orchestrator.addTime(this.length);
	}
}
