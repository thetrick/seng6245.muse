package api;

import java.util.ArrayList;
import java.util.List;

public class HeaderInfo {
    private final String title;
    private final String composer;
    private final Duration length;
    private final Duration meter;
    private final Duration tempo;
    private final String key;
    private final List<String> voices;
    
    public HeaderInfo(String title, String composer, Duration length,
    		Duration meter, Duration tempo, String key, List<String> voices) {
        this.title = title;
        this.composer = composer;
        this.length = length;
        this.meter = meter;
        this.tempo = tempo;
        this.key = key;
        this.voices = new ArrayList<String>(voices);
    }
}
