package api;

import java.util.ArrayList;
import java.util.List;

import interfaces.IMusicalSymbol;
import interfaces.IMusicalFragment;


public class MusicBar implements IMusicalFragment {

	private final List<IMusicalSymbol> notes;
	
	public MusicBar(List<IMusicalSymbol> notes) {
		this.notes = new ArrayList<IMusicalSymbol>(notes);
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
	public boolean equals(Object other) {
		
	    //check for self-comparison
	    if ( this == other ) 
	    	return true;

	    //use instanceof instead of getClass here for two reasons
	    //	1. if need be, it can match any supertype, and not just one class;
	    //	2. it renders an explict check for "that == null" redundant, since
	    //it does the check for null already - "null instanceof [type]" always
	    //returns false. (See Effective Java by Joshua Bloch.)
	    if (!(other instanceof MusicBar)) 
	    	return false;		
		
		MusicBar that = (MusicBar) other;
		return this.notes.equals(that.notes);
	}	
	
	@Override
	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		for(IMusicalSymbol note : notes) {
			stringbuilder.append(note.toString());
			stringbuilder.append(" ");
		}
		stringbuilder.append("|");
		return stringbuilder.toString();
	}	
	
	@Override
	public int hashCode() {
		return notes.hashCode();
	}
	
}
