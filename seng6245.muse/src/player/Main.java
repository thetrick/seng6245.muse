package player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import api.Composition;
import api.Mapper;
import grammar.AbcMusicLexer;
import grammar.AbcMusicParser;
import sound.Orchestrator;


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
	public static void play(String abc) {
		
		Composition composition = Mapper.abcToComposition(abc);
		int tempo = composition.getCompositionTempo();
		int ticksPerBeat = composition.getTicksPerBeat();
		
		Orchestrator orchestrator = new Orchestrator(tempo, ticksPerBeat);
		composition.addToOrchestrator(orchestrator);
		orchestrator.play();
	}
	
	public static void main(String[] args) throws IOException {
		String file = LoadSampleAbcFiles().get(selectedFileIndex);
		String abc = getFileText(file);
		play(abc);
	}	
	
	/**
	 * Opens the selected file and reads the text into an String variable
	 * @param fileName - path location of a sample Abc file
	 * @return String containing all the text of the selected sample Abc file
	 */
	protected static String getFileText(String fileName) throws IOException {
		
		StringBuilder stringBuilder = new StringBuilder();

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) 
		{
			String line;

			// Iterate through the text file line-by-line
			while ((line = bufferedReader.readLine()) != null) 
			{
				stringBuilder.append(line);
				stringBuilder.append(System.getProperty("line.separator"));
			}
			bufferedReader.close();

		} 
		catch (Exception exception) 
		{
			exception.printStackTrace();
		}

		return stringBuilder.toString();
	}
	
	/**
	 * Loads an ArrayList of Sample Abc Files located on the file system
	 * @return ArrayList of Sample Abc Files
	 */
	private static ArrayList<String> LoadSampleAbcFiles()
	{
		ArrayList<String> sampleAbcs = new ArrayList<String>();
		sampleAbcs.add("sample_abc/debussy.abc");
		sampleAbcs.add("sample_abc/fur_elise.abc");
		sampleAbcs.add("sample_abc/invention.abc");
		sampleAbcs.add("sample_abc/little_night_music.abc");
		sampleAbcs.add("sample_abc/paddy.abc");
		sampleAbcs.add("sample_abc/prelude.abc");
		sampleAbcs.add("sample_abc/sample1.abc");
		sampleAbcs.add("sample_abc/sample2.abc");
		sampleAbcs.add("sample_abc/sample3.abc");
		sampleAbcs.add("sample_abc/scale.abc");
		return sampleAbcs;
	}
}
