package sound;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import org.apache.commons.lang3.math.Fraction;

import api.Chord;

public class Orchestrator {
	
	private SequencePlayer sequencePlayer;
	private int tickPosition;
	private final int ticksPerBeat;
	
	public Orchestrator(int tempo, int ticksPerBeat, int tickPosition) {
		try {
			this.sequencePlayer = new SequencePlayer(tempo, ticksPerBeat);
		} catch (MidiUnavailableException midiUnavailableException) {
			midiUnavailableException.printStackTrace();
		} catch (InvalidMidiDataException invalidMidiDataException) {
			invalidMidiDataException.printStackTrace();
		}
		this.tickPosition = tickPosition;
		this.ticksPerBeat = ticksPerBeat;
	}

	public void play() {
		try {
			sequencePlayer.play();
		} catch (MidiUnavailableException midiUnavailableException) {
			midiUnavailableException.printStackTrace();
		}
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
	    if (!(other instanceof Orchestrator)) 
	    	return false;
	    
        // if the objects are the same type, then cast 'other' as Note and 
	    // compare values
	    Orchestrator that = (Orchestrator) other;
	    return (this.sequencePlayer.equals(that.sequencePlayer) && this.tickPosition == that.tickPosition);
	}		
	
	public Fraction getTicksPerBeatAsFraction() {
		Fraction ticksPerBeatAsFraction = Fraction.getFraction(this.ticksPerBeat, 1);
		return ticksPerBeatAsFraction;
	}
	
	public Orchestrator(SequencePlayer sequencePlayer, int tickPosition) {
		this.sequencePlayer = sequencePlayer;
		this.tickPosition = tickPosition;
		this.ticksPerBeat = sequencePlayer.getTicksPerBeat();
	}
	
	public void addNote(int note, Fraction noteLength) {
		Fraction tickPerBeatAsFraction = Fraction.getFraction(this.ticksPerBeat, 1);
		sequencePlayer.addNote(note, this.tickPosition, noteLength.multiplyBy(tickPerBeatAsFraction).getNumerator());
	}
	
	public void addTime(Fraction timeLength){
		Fraction augment = timeLength.multiplyBy(this.getTicksPerBeatAsFraction());
		this.tickPosition += augment.getNumerator();
	}
	
	public void initializeTime() {
		this.tickPosition = 0;
	}
}
