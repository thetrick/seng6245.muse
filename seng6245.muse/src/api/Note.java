package api;

import interfaces.*;
import org.apache.commons.lang3.math.Fraction;


public class Note implements IMusicalSymbol {

	private final char character;
	private final int octave;
	private final Fraction noteLength;
	private final int accidental;
	
	public char getCharacter() {
		return this.character;
	}
	
	public int getOctave() {
		return this.octave;
	}

	public int getAccidental() {
		return this.accidental;
	}
	
	private Note(NoteBuilder noteBuilder) {
		this.character = noteBuilder.builderCharacter;
		this.octave = noteBuilder.builderOctave;
		this.noteLength = noteBuilder.builderNoteLength;
		this.accidental = noteBuilder.builderAccidental;
	}
	
	@Override
	public Fraction getNoteLength() {
		return this.noteLength;
	}	
	
	@Override
	public IMusicalSymbol augmentNoteLength(Fraction factor) {
		Fraction newNoteLength = this.noteLength.multiplyBy(factor);
		NoteBuilder newNoteBuilder = new NoteBuilder(this.character, this.octave, newNoteLength, this.accidental);
		return newNoteBuilder.createNote();
	}
	
	@Override
	public int getTicksPerBeat() {
		return this.noteLength.getDenominator();
	}	
	
	@Override
	public int hashCode() {
		return this.character + this.noteLength.hashCode() + this.octave + this.accidental;
	}
	
	@Override
	public String toString() {
		
		StringBuilder stringbuilder = new StringBuilder();
		switch(this.accidental) {
			case 0:
				break;
			case 1:
				stringbuilder.append("^");
				break;
			default:
				stringbuilder.append("_");
				break;
		}

		switch(this.octave) {
			case 1:
				stringbuilder.append(String.valueOf(this.character).toLowerCase());
				break;
			case 2:
				stringbuilder.append(String.valueOf(this.character).toLowerCase());
				stringbuilder.append("'");
				break;
			case -1:
				stringbuilder.append(String.valueOf(this.character));
				stringbuilder.append(",");
				break;
			default:
				break;
		}		
		stringbuilder.append(this.noteLength.toString());
		return stringbuilder.toString();		
		
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
	    if (!(other instanceof Note)) 
	    	return false;
	    
        // if the objects are the same type, then cast 'other' as Note and 
	    // compare values
	    Note that = (Note) other;
	    return (this.character == that.character && 
	    		this.octave == that.octave && 
	    		this.noteLength.equals(that.noteLength) && 
	    		this.accidental == that.accidental);
	}
	
	public static class NoteBuilder	{
		private char builderCharacter;
		private int builderOctave;
		private Fraction builderNoteLength;
		private int builderAccidental;
		
		public NoteBuilder(char newCharacter, int newOctave, Fraction newNoteLength, int newAccidental) {
			this.builderCharacter = newCharacter;
			this.builderOctave = newOctave;
			this.builderNoteLength = newNoteLength;
			this.builderAccidental = newAccidental;
		}
		
	      public NoteBuilder Character(char newCharacter) {
	         this.builderCharacter = newCharacter;
	         return this;
	      }

	      public NoteBuilder Octave(int newOctave) {
	         this.builderOctave = newOctave;
	         return this;
	      }

	      public NoteBuilder NoteLength(Fraction newNoteLength) {
	         this.builderNoteLength = newNoteLength;
	         return this;
	      }

	      public NoteBuilder Accidental(int newAccidental) {
	         this.builderAccidental = newAccidental;
	         return this;
	      }
		
	      public Note createNote() {
	         return new Note(this);
	      }		
	}	
}
