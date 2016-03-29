package api;

import java.util.List;
import java.util.ArrayList;

public class Scale {
	private final Enums.Key key;
	private final Enums.ScaleType scaleType;
	private final List<Enums.ScaleNotes> scaleNotes;
	
	public Enums.Key getKey() {
		return this.key;
	}
	
	public String getKeyAsString() {
		return this.key.toString();
	}
	
	public Enums.ScaleType getScaleType() {
		return this.scaleType;
	}
	
	public List<Enums.ScaleNotes> getNotes() {
		return this.scaleNotes;
	}
	
	public List<String> getNotesAsString() {
		List<String> notesAsStrings = new ArrayList<String>();
		
		for(Enums.ScaleNotes scaleNote : this.scaleNotes) {
			notesAsStrings.add(scaleNote.toString());
		}
		
		return notesAsStrings;
	}
	
	public Scale(Enums.Key key, Enums.ScaleType scaleType, List<Enums.ScaleNotes> scaleNotes) {
		this.key = key;
		this.scaleType = scaleType;
		this.scaleNotes = scaleNotes;
	}
}