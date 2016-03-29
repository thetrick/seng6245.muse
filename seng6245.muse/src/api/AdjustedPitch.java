package api;

public class AdjustedPitch {
	private final Enums.Pitches pitch;
	private final int octave;
	
	public AdjustedPitch(Enums.Pitches pitch, int octave) {
		this.pitch = pitch;
		this.octave = octave;
	}
	
	public Enums.Pitches getPitch() {
		return this.pitch;
	}
	
	public int getOctave() {
		return this.octave;
	}

	public static AdjustedPitch getAdjustedPitch(String pitch, int adjustment) {
		
		int currentPosition = Enums.Pitches.valueOf(pitch).getPosition();
		switch(currentPosition){
			case 0:
				if(adjustment == -1){
					return new AdjustedPitch(Enums.Pitches.B, 1);
				}
			case 6:
				if(adjustment == 1){
					return new AdjustedPitch(Enums.Pitches.C, -1);
				}				
			default:
				int movement = currentPosition + adjustment;
				return new AdjustedPitch(Enums.Pitches.valueOf(pitch), movement);
		}
	}
}