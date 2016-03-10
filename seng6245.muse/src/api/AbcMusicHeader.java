package api;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.math.Fraction;


public class AbcMusicHeader {
    private final String title;
    private final String composer;
    private final Fraction length;
    private final Fraction meter;
    private final Fraction tempo;
    private final String key;
    private final List<String> voices;
    
    public AbcMusicHeader(
    		String title, 
    		String composer, 
    		Fraction length,
    		Fraction meter, 
    		Fraction tempo, 
    		String key, 
    		List<String> voices) {
        this.title = title;
        this.composer = composer;
        this.length = length;
        this.meter = meter;
        this.tempo = tempo;
        this.key = key;
        this.voices = new ArrayList<String>(voices);
    }
}
