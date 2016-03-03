package notused;

public final class Enums {

    public static enum AbcTypes { 
    	NUMBER(Constants.FieldNames.NUMBER_FIELD_NAME, Constants.RegularExpressions.NUMBER_REGEX),
    	TITLE(Constants.FieldNames.TITLE_FIELD_NAME, Constants.RegularExpressions.TITLE_REGEX),
    	COMPOSER(Constants.FieldNames.COMPOSER_FIELD_NAME, Constants.RegularExpressions.COMPOSER_REGEX),
    	NOTE_LENGTH(Constants.FieldNames.NOTE_LENGTH_FIELD_NAME, Constants.RegularExpressions.NOTE_LENGTH_REGEX),
    	METER(Constants.FieldNames.METER_FIELD_NAME, Constants.RegularExpressions.METER_REGEX),
    	TEMPO(Constants.FieldNames.TEMPO_FIELD_NAME, Constants.RegularExpressions.TEMPO_REGEX),
    	VOICE(Constants.FieldNames.VOICE_FIELD_NAME, Constants.RegularExpressions.VOICE_REGEX),
    	KEY(Constants.FieldNames.KEY_FIELD_NAME, Constants.RegularExpressions.KEY_REGEX),
    	NOTE(Constants.FieldNames.NOTE_FIELD_NAME, Constants.RegularExpressions.NOTE_REGEX),
    	REST(Constants.FieldNames.REST_FIELD_NAME, Constants.RegularExpressions.REST_REGEX),
    	BEGIN_CHORD(Constants.FieldNames.BEGIN_CHORD_FIELD_NAME, Constants.RegularExpressions.BEGIN_CHORD_REGEX),
    	END_CHORD(Constants.FieldNames.END_CHORD_FIELD_NAME, Constants.RegularExpressions.END_CHORD_REGEX),
    	BEGIN_REPEAT(Constants.FieldNames.BEGIN_REPEAT_FIELD_NAME, Constants.RegularExpressions.BEGIN_REPEAT_REGEX),
    	END_REPEAT(Constants.FieldNames.END_REPEAT_FIELD_NAME, Constants.RegularExpressions.END_REPEAT_REGEX),
    	REPEAT_SEQ(Constants.FieldNames.REPEAT_SEQ_FIELD_NAME, Constants.RegularExpressions.REPEAT_SEQ_REGEX),
    	TUPLET(Constants.FieldNames.TUPLET_FIELD_NAME, Constants.RegularExpressions.TUPLET_REGEX),
    	MEASURE(Constants.FieldNames.MEASURE_FIELD_NAME, Constants.RegularExpressions.MEASURE_REGEX),
    	MAJOR_SECTION(Constants.FieldNames.MAJOR_SECTION_FIELD_NAME, Constants.RegularExpressions.MAJOR_SECTION_REGEX),
    	COMMENT(Constants.FieldNames.COMMENT_FIELD_NAME, Constants.RegularExpressions.COMMENT_REGEX);
    	
    	public final String regexPattern;
    	public final String name;
    	
    	AbcTypes(String name, String regexPattern) {
    		this.name = name;
            this.regexPattern = regexPattern;
    	}
    	
        public String toString() {
            return this.name;
         }    	
    }
	
}
