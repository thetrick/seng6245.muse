package grammar;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.Fraction;

import interfaces.*;
import api.*;
import grammar.AbcMusicParser.Abc_headerContext;
import grammar.AbcMusicParser.NoteContext;

public class MyListener extends AbcMusicBaseListener {

	private AbcHeader _abcHeader;
	private Composition _composition;
	private CircleOfFifths _cof;
	private List<Voice> _voices;
	
	public AbcHeader getAbcHeader(){
		return this._abcHeader;
	}
	
	@Override
	public void exitNote(NoteContext ctx) {
		
		int octave = 0;
		int accidental = 0;
		String[] notes = ctx.getText().trim().split("");
		
		for(String note : notes){
			
		}
	}

	public Composition getComposition(){
		return this._composition;
	}
	
	public MyListener(){
		this._cof = new CircleOfFifths();
		this._abcHeader = null;
		this._composition = null;
	}

	@Override
	public void exitAbc_header(Abc_headerContext ctx) {
		
		int index = Integer.MIN_VALUE;
		String title = "";
		String composer = "Unknown";
		Fraction length = Fraction.getFraction(1, 8);
		Fraction meter = Fraction.getFraction(4, 4); 
		Fraction tempo = Fraction.getFraction(100, 1);
		String key = "";
		List<String> voices = new ArrayList<String>();
		
		String[] lines = ctx.getText().split("\r\n");
		
		for(String line : lines) {
			// Get the first two characters
			String lbl = StringUtils.substring(line, 0, 2); 
			// Get everything after the first two characters
			String data = StringUtils.substring(line, 2).trim(); 
			switch(lbl) {
				case "X:": // Index - Required but can be ignored
					index = Integer.parseInt(data);
					break;
				case "T:": // Title - Required
					title = data;
					break;
				case "C:": // Composer
					composer = data;
					break;
				case "M:": // Meter
					if(!data.equals("C")) {
						meter = Fraction.getFraction(normalizeFractionString(data));
					}
					break;
				case "L:": // Length
					length = Fraction.getFraction(normalizeFractionString(data));
					break;
				case "Q:": // Tempo
					if(data.contains("=")){
						
					} else {
						
					}
					break;
				case "K:": // Key Signature
					key = data;
					break;
				case "V:": // Voice
					voices.add(data);
					break;
				default:
					break;
			}
		}
		
	}

	/**
	 * As per the requirements, some fraction values are represented as "/", "#/" or "/#"
	 * where # represent a digit.  Prior to getting the official Fraction value,
	 * we must make sure the string represents an actual well-formed Fraction.
	 * Please note that a missing numerator defaults to 1 and a missing denominator 
	 * defaults to 2.
	 * @param data - represent a fraction as a string
	 * @return well-formed Fraction value as a string
	 */
	private String normalizeFractionString(String data){
		if(data.equals("/")){
			return "1/2";
		}
		
		String retVal = data;
		if(retVal.startsWith("/")) {
			retVal = "1" + retVal;
		}
		
		if(retVal.endsWith("/")) {
			retVal += "2";
		}
		
		return retVal;
	}
	
}
