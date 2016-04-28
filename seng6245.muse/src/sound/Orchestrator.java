package sound;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import org.apache.commons.lang3.math.Fraction;


/**
 * 
 * @author Todd G. Hetrick
 * Wraps the activities of the Sequence Player and orchestrates the activities
 * by adding notes in the proper sequence.  Leverages an internal tickPosition
 * to make sure that the notes added are done in the proper sequence.
 *  
 */
public class Orchestrator {
	
	private SequencePlayer sequencePlayer;
	private int tickPosition;
	private final int ticksPerBeat;
	
	/**
	 * Instantiates a new instance of the Orchestrator Class
	 * @param tempo - represents beats per minute for a given song
	 * @param ticksPerBeat - represents the number of ticks per beat
	 */
	public Orchestrator(int tempo, int ticksPerBeat) {
		
		this.tickPosition = 0; // Start at the beginning
		this.ticksPerBeat = ticksPerBeat;
		
		try {
			this.sequencePlayer = new SequencePlayer(tempo, ticksPerBeat);
		} catch (MidiUnavailableException midiUnavailableException) {
			midiUnavailableException.printStackTrace();
		} catch (InvalidMidiDataException invalidMidiDataException) {
			invalidMidiDataException.printStackTrace();
		}
	}

	/**
	 * Initiates the underlying sequence player's play method
	 * which executes the song's sounds
	 */
	public void play() {
		try {
			sequencePlayer.play();
		} catch (MidiUnavailableException midiUnavailableException) {
			midiUnavailableException.printStackTrace();
		}
	}	
	
	@Override
	/**
	 * Compares one Orchestrator object with another Orchestrator object
	 * Specifically, if the underlying SequencePlayers and the tickPosition
	 * are equal, then this function returns true.
	 */
	public boolean equals(Object other) {
	    //check for self-comparison
	    if ( this == other ) 
	    	return true;

	    //use instanceof instead of getClass here for two reasons
	    //	1. if need be, it can match any supertype, and not just one class;
	    //	2. it renders an explict check for "that == null" redundant, since
	    //it does the check for null already - "null instanceof [type]" always
	    //returns false. (See Effective Java by Joshua Bloch.)
	    if (!(other instanceof Orchestrator)) 
	    	return false;
	    
        // if the objects are the same type, then cast 'other' as Note and 
	    // compare values
	    Orchestrator that = (Orchestrator) other;
	    return (this.sequencePlayer.equals(that.sequencePlayer) && this.tickPosition == that.tickPosition);
	}		
	
	/**
	 * Returns the ticksPerBeat integer value as a Fraction
	 * (used primarily in the addTime function)
	 * @return ticksPerBeat as a Fraction
	 */
	public Fraction getTicksPerBeatAsFraction() {
		Fraction ticksPerBeatAsFraction = Fraction.getFraction(this.ticksPerBeat, 1);
		return ticksPerBeatAsFraction;
	}
		
	/**
	 * Adds a MIDI note with length information to the Sequence Player
	 * @param note - the note represented as a MIDI note
	 * @param noteLength - note's length represented as a Fraction
	 */
	public void addNote(int note, Fraction noteLength) {
		Fraction tickPerBeatAsFraction = Fraction.getFraction(this.ticksPerBeat, 1);
		sequencePlayer.addNote(note, this.tickPosition, noteLength.multiplyBy(tickPerBeatAsFraction).getNumerator());
	}
	
	/**
	 * Increments tick position with the note's time length 
	 * @param timeLength - note's time length represented as a Fraction
	 */
	public void addTime(Fraction timeLength){
		Fraction augment = timeLength.multiplyBy(this.getTicksPerBeatAsFraction());
		this.tickPosition += augment.getNumerator();
	}
	
	/**
	 * reset tick position to 0
	 */
	public void initializeTime() {
		this.tickPosition = 0;
	}
}
