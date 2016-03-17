package api;

import java.util.ArrayList;
import java.util.List;

import interfaces.IMusicalFragment;

public class Voice implements IMusicalFragment{

    private final String name;
    private final List<MusicBar> musicBars;
	
    public Voice(String name, List<MusicBar> bars) {
        this.name = name;
        this.musicBars = new ArrayList<MusicBar>(bars);
    }    
    
	
    @Override
    public int getTicksPerBeat() {
		int leastCommonMultiple = 1;
		for (MusicBar musicBar : musicBars) {
			leastCommonMultiple = NumberUtils.lcm(leastCommonMultiple, musicBar.getTicksPerBeat());
		}
		return leastCommonMultiple;
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
	    if (!(other instanceof Voice)) 
	    	return false;
	    
        // if the objects are the same type, then cast 'other' as Note and 
	    // compare values
	    Voice that = (Voice) other;
	    return (this.name.equals(that.name) && this.musicBars.equals(that.musicBars));
    }


    @Override
    public String toString() {
        StringBuilder stringbuilder = new StringBuilder(name + ":");
        for (MusicBar musicBar : musicBars) {
        	stringbuilder.append(musicBar.toString());
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    @Override
    public int hashCode() {
        return name.hashCode() + musicBars.hashCode();
    }	

}
