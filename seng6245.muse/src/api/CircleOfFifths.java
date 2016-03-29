package api;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CircleOfFifths {

	private final List<Scale> scales;
	
	public CircleOfFifths() {
		this.scales = new ArrayList<Scale>();
		this.initialize();
	}
	
	private void initialize() {
		
		List<Enums.ScaleNotes> sharpGroup1 = Arrays.asList(Enums.ScaleNotes.Fsharp);
		List<Enums.ScaleNotes> sharpGroup2 = Arrays.asList(Enums.ScaleNotes.Fsharp, Enums.ScaleNotes.Csharp);
		List<Enums.ScaleNotes> sharpGroup3 = Arrays.asList(Enums.ScaleNotes.Fsharp, Enums.ScaleNotes.Csharp, Enums.ScaleNotes.Gsharp);
		List<Enums.ScaleNotes> sharpGroup4 = Arrays.asList(Enums.ScaleNotes.Fsharp, Enums.ScaleNotes.Csharp, Enums.ScaleNotes.Gsharp, Enums.ScaleNotes.Dsharp);
		List<Enums.ScaleNotes> sharpGroup5 = Arrays.asList(Enums.ScaleNotes.Fsharp, Enums.ScaleNotes.Csharp, Enums.ScaleNotes.Gsharp, Enums.ScaleNotes.Dsharp, Enums.ScaleNotes.Asharp);
		List<Enums.ScaleNotes> sharpGroup6 = Arrays.asList(Enums.ScaleNotes.Fsharp, Enums.ScaleNotes.Csharp, Enums.ScaleNotes.Gsharp, Enums.ScaleNotes.Dsharp, Enums.ScaleNotes.Asharp, Enums.ScaleNotes.Esharp);
		List<Enums.ScaleNotes> sharpGroup7 = Arrays.asList(Enums.ScaleNotes.Fsharp, Enums.ScaleNotes.Csharp, Enums.ScaleNotes.Gsharp, Enums.ScaleNotes.Dsharp, Enums.ScaleNotes.Asharp, Enums.ScaleNotes.Esharp, Enums.ScaleNotes.Bsharp);
		List<Enums.ScaleNotes> flatGroup1 = Arrays.asList(Enums.ScaleNotes.Bflat);
		List<Enums.ScaleNotes> flatGroup2 = Arrays.asList(Enums.ScaleNotes.Bflat, Enums.ScaleNotes.Eflat);
		List<Enums.ScaleNotes> flatGroup3 = Arrays.asList(Enums.ScaleNotes.Bflat, Enums.ScaleNotes.Eflat, Enums.ScaleNotes.Aflat);
		List<Enums.ScaleNotes> flatGroup4 = Arrays.asList(Enums.ScaleNotes.Bflat, Enums.ScaleNotes.Eflat, Enums.ScaleNotes.Aflat, Enums.ScaleNotes.Dflat);
		List<Enums.ScaleNotes> flatGroup5 = Arrays.asList(Enums.ScaleNotes.Bflat, Enums.ScaleNotes.Eflat, Enums.ScaleNotes.Aflat, Enums.ScaleNotes.Dflat, Enums.ScaleNotes.Gflat);
		List<Enums.ScaleNotes> flatGroup6 = Arrays.asList(Enums.ScaleNotes.Bflat, Enums.ScaleNotes.Eflat, Enums.ScaleNotes.Aflat, Enums.ScaleNotes.Dflat, Enums.ScaleNotes.Gflat, Enums.ScaleNotes.Cflat);
		List<Enums.ScaleNotes> flatGroup7 = Arrays.asList(Enums.ScaleNotes.Bflat, Enums.ScaleNotes.Eflat, Enums.ScaleNotes.Aflat, Enums.ScaleNotes.Dflat, Enums.ScaleNotes.Gflat, Enums.ScaleNotes.Cflat, Enums.ScaleNotes.Fflat);
		
		
		this.addScale(Enums.Key.Cmajor, Enums.ScaleType.NotApplicable, new ArrayList<Enums.ScaleNotes>());
		this.addScale(Enums.Key.Aminor, Enums.ScaleType.NotApplicable, new ArrayList<Enums.ScaleNotes>());
		this.addScale(Enums.Key.Gmajor, Enums.ScaleType.Sharp, sharpGroup1);
		this.addScale(Enums.Key.Eminor, Enums.ScaleType.Sharp, sharpGroup1);
		this.addScale(Enums.Key.Dmajor, Enums.ScaleType.Sharp, sharpGroup2);
		this.addScale(Enums.Key.Bminor, Enums.ScaleType.Sharp, sharpGroup2);
		this.addScale(Enums.Key.Amajor, Enums.ScaleType.Sharp, sharpGroup3);
		this.addScale(Enums.Key.Fsharpminor, Enums.ScaleType.Sharp, sharpGroup3);
		this.addScale(Enums.Key.Emajor, Enums.ScaleType.Sharp, sharpGroup4);
		this.addScale(Enums.Key.Csharpminor, Enums.ScaleType.Sharp, sharpGroup4);
		this.addScale(Enums.Key.Emajor, Enums.ScaleType.Sharp, sharpGroup5);
		this.addScale(Enums.Key.Csharpminor, Enums.ScaleType.Sharp, sharpGroup5);
		this.addScale(Enums.Key.Emajor, Enums.ScaleType.Sharp, sharpGroup6);
		this.addScale(Enums.Key.Csharpminor, Enums.ScaleType.Sharp, sharpGroup6);
		this.addScale(Enums.Key.Emajor, Enums.ScaleType.Sharp, sharpGroup7);
		this.addScale(Enums.Key.Csharpminor, Enums.ScaleType.Sharp, sharpGroup7);
		this.addScale(Enums.Key.Fmajor, Enums.ScaleType.Flat, flatGroup1);
		this.addScale(Enums.Key.Dminor, Enums.ScaleType.Flat, flatGroup1);
		this.addScale(Enums.Key.Bflatmajor, Enums.ScaleType.Flat, flatGroup2);
		this.addScale(Enums.Key.Gminor, Enums.ScaleType.Flat, flatGroup2);
		this.addScale(Enums.Key.Eflatmajor, Enums.ScaleType.Flat, flatGroup3);
		this.addScale(Enums.Key.Cminor, Enums.ScaleType.Flat, flatGroup3);
		this.addScale(Enums.Key.Aflatmajor, Enums.ScaleType.Flat, flatGroup4);
		this.addScale(Enums.Key.Fminor, Enums.ScaleType.Flat, flatGroup4);
		this.addScale(Enums.Key.Dflatmajor, Enums.ScaleType.Flat, flatGroup5);
		this.addScale(Enums.Key.Bflatminor, Enums.ScaleType.Flat, flatGroup5);
		this.addScale(Enums.Key.Gflatmajor, Enums.ScaleType.Flat, flatGroup6);
		this.addScale(Enums.Key.Eflatminor, Enums.ScaleType.Flat, flatGroup6);
		this.addScale(Enums.Key.Cflatmajor, Enums.ScaleType.Flat, flatGroup7);
		this.addScale(Enums.Key.Aflatminor, Enums.ScaleType.Flat, flatGroup7);
	}
	
	public int getKeyAccidentalAdjustment(Enums.Key key, Enums.ScaleNotes scaleNote) {
			
		for (Scale scale : this.scales) {
			if (key == scale.getKey()) {
				if(scale.getNotes().contains(scaleNote)) {
					if(scale.getScaleType() == Enums.ScaleType.Sharp) {
						return 1;
					} else if (scale.getScaleType() == Enums.ScaleType.Flat) {
						return -1;
					}
				}
				return 0;
			}
		}
		
		throw new IllegalArgumentException("Key Signature (" + key.toString() + ") cannot be found!!!");
	}
		
	private void addScale(Enums.Key key, Enums.ScaleType scaleType, List<Enums.ScaleNotes> scaleNotes) {
		Scale scale = new Scale(key, scaleType, scaleNotes);
		this.scales.add(scale);
	}
}
