package player;

import java.util.ArrayList;

/**
 * Main entry point of your application.
 */
public class Main {
	private static final int selectedFileIndex = 1;
	/**
	 * Plays the input file using Java MIDI API and displays
	 * header information to the standard output stream.
	 * 
	 * <p>Your code <b>should not</b> exit the application abnormally using
	 * System.exit()</p>
	 * 
	 * @param file the name of input abc file
	 */
	public static void play(String file) {

	}
	
	public static void main(String[] args) {
		ArrayList<String> abcfiles = new ArrayList<String>();
		abcfiles.add("sample_abc/fur_elise.abc");
		abcfiles.add("sample_abc/invention.abc");
		abcfiles.add("sample_abc/little_night_music.abc");
		abcfiles.add("sample_abc/paddy.abc");
		abcfiles.add("sample_abc/piece1.abc");
		abcfiles.add("sample_abc/piece2.abc");
		abcfiles.add("sample_abc/prelude.abc");
		abcfiles.add("sample_abc/scale.abc");
		abcfiles.add("sample_abc/test.abc");
		abcfiles.add("sample_abc/SampleChordsandTuplets.abc");
		abcfiles.add("sample_abc/test2.abc");
		String abcfile = abcfiles.get(selectedFileIndex);
		play(abcfile);
	}	
}
