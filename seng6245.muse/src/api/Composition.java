package api;

import java.util.ArrayList;
import java.util.List;
import interfaces.IAbcMusicFragment;
import sound.Orchestrator;

import org.apache.commons.lang3.math.Fraction;

public class Composition implements IAbcMusicFragment {
	private final AbcHeader abcHeader;
	private final List<Voice> voices;
	
    public Composition(AbcHeader abcHeader, List<Voice> voices) {
        this.abcHeader = abcHeader;
        this.voices = new ArrayList<Voice>(voices);
    }
    
    public int getCompositionTempo() {
    	Fraction tempo = this.abcHeader.getTempo();
    	Fraction length = this.abcHeader.getLength();
    	return tempo.multiplyBy(Fraction.getFraction(length.getDenominator(), 1)).getNumerator();
    }
    
	@Override
	public int getTicksPerBeat() {
		int leastCommonMultiple = 1;
		for(IAbcMusicFragment voice : voices) {
			leastCommonMultiple = NumberUtils.lcm(leastCommonMultiple, voice.getTicksPerBeat());
		}
		return leastCommonMultiple;
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
	    if (!(other instanceof Composition)) 
	    	return false;
	    
        // if the objects are the same type, then cast 'other' as Composition and 
	    // compare values
	    Composition that = (Composition) other;
	    return this.abcHeader.equals(that.abcHeader) && 
	    		this.voices.equals(that.voices);
    }
    
    @Override
    public String toString() {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(abcHeader.toString());
        stringbuilder.append(voices.toString());
        return stringbuilder.toString();
    }

    @Override
    public int hashCode() {
    	return this.abcHeader.hashCode() + this.voices.hashCode();
    }

	@Override
	public void addToOrchestrator(Orchestrator orchestrator) {
		for(Voice voice : this.voices) {
			voice.addToOrchestrator(orchestrator);
			orchestrator.initializeTime();
		}
	}
}
