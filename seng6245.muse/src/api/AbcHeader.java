package api;

import java.util.List;
import org.apache.commons.lang3.math.Fraction;

/**
 * 
 * @author Todd G. Hetrick
 * Represents the Data Model of the Header Portion of the Abc Music file
 */
public class AbcHeader {
	private final int index;
    private final String title;
    private final String composer;
    private final Fraction length;
    private final Fraction meter;
    private final Fraction tempo;
    private final String key;
    private final List<String> voices;
    
	public int getIndex() {
		return this.index;
	}    
    
	public String getTitle() {
		return this.title;
	}
	
	public String getComposer() {
		return this.composer;
	}

	public Fraction getLength() {
		return this.length;
	}    
    
	public Fraction getMeter() {
		return this.meter;
	} 
	
	public Fraction getTempo() {
		return this.tempo;
	}
	
	public String getKey() {
		return this.key;
	} 
	
	public List<String> getVoices() {
		return this.voices;
	} 	
	
    public AbcHeader(AbcHeaderBuilder abcHeaderBuilder) {
    	this.index = abcHeaderBuilder.builderIndex;
        this.title = abcHeaderBuilder.builderTitle;
        this.composer = abcHeaderBuilder.builderComposer;
        this.length = abcHeaderBuilder.builderLength;
        this.meter = abcHeaderBuilder.builderMeter;
        this.tempo = abcHeaderBuilder.builderTempo;
        this.key = abcHeaderBuilder.builderKey;
        this.voices = abcHeaderBuilder.builderVoices;
    }
    
    @Override
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     * Customized to return the Abc Music Files Header Information as multi-line string
     */
    public String toString() {
    	
    	StringBuilder stringbuilder = new StringBuilder();

    	stringbuilder.append("X: " + Integer.toString(this.index) + "\n");
    	stringbuilder.append("T: " + this.title.toString() + "\n");
    	stringbuilder.append("C: " + this.composer.toString() + "\n");

    	stringbuilder.append(tsfmtr("M", this.meter.toString()));
    	stringbuilder.append(tsfmtr("L", this.length.toString()));
    	stringbuilder.append(tsfmtr("Q", this.tempo.toString()));

    	stringbuilder.append("V: " + this.voices.toString() + "\n");
    	stringbuilder.append("K: " + this.key.toString() + "\n");

    	return stringbuilder.toString();    	
    }
    
    @Override
    public int hashCode() {
    	int returnValue = this.title.hashCode() + 
    			this.composer.hashCode() + 
    			this.length.hashCode() + 
    			this.meter.hashCode() + 
    			this.tempo.hashCode() + 
    			this.key.hashCode() + 
    			this.voices.hashCode(); 
        return returnValue;
    }
    
    /**
     * Utility function formats a Abc Header Line
     * @param lbl - represents an Abc Header Label
     * @param s - represents the Abc Header Value
     * @return a properly formatted string represented as a line
     */
    private static String tsfmtr(String lbl, String s) {
    	
    	StringBuilder stringbuilder = new StringBuilder();
    	stringbuilder.append(lbl);
    	stringbuilder.append(": ");
    	
    	if(!s.isEmpty()) {
    		if(s.startsWith("/")){
    			stringbuilder.append("1");
    		}    		
    		stringbuilder.append(s);	
    	}
    	else {
    		stringbuilder.append("1");
    	}
    	stringbuilder.append("\n");
    	
    	return stringbuilder.toString();
    }
    
    /*
     * Builder Class for AbcHeader
     * Utilizes the Joshua's Bloch's Builder pattern
     * For more details, visit the following article:
     * http://www.javaworld.com/article/2074938/core-java/too-many-parameters-in-java-methods-part-3-builder-pattern.html
     */
	public static class AbcHeaderBuilder	{
		private int builderIndex;
	    private String builderTitle;
	    private String builderComposer;
	    private Fraction builderLength;
	    private Fraction builderMeter;
	    private Fraction builderTempo;
	    private String builderKey;
	    private List<String> builderVoices;
		
		public AbcHeaderBuilder(int newIndex,
				String newTitle, 
				String newKey) {
			this.builderIndex = newIndex;
			this.builderTitle = newTitle;
			this.builderComposer = "Unknown";
			this.builderKey = newKey;
		}
		
	      public AbcHeaderBuilder Title(String newTitle) {
	         this.builderTitle = newTitle;
	         return this;
	      }

	      public AbcHeaderBuilder Composer(String newComposer) {
	         this.builderComposer = newComposer;
	         return this;
	      }

	      public AbcHeaderBuilder Length(Fraction newLength) {
	         this.builderLength = newLength;
	         return this;
	      }

	      public AbcHeaderBuilder Meter(Fraction newMeter) {
	         this.builderMeter = newMeter;
	         return this;
	      }
		
	      public AbcHeaderBuilder Tempo(Fraction newTempo) {
	    	  this.builderTempo = newTempo;
		      return this;
	      }
	      
	      public AbcHeaderBuilder Key(String newKey) {
		      this.builderKey = newKey;
		      return this;
	      }
	      
	      public AbcHeaderBuilder Voices(List<String> newVoices) {
		      this.builderVoices = newVoices;
		      return this;
	      }
	      
	      public AbcHeader createAbcHeader() {
	         return new AbcHeader(this);
	      }		
	}	    
}
