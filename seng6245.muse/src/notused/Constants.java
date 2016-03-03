package notused;

public final class Constants {

	public final class RegularExpressions{
		public static final String NUMBER_REGEX = "^[X]:[ \\t]*[0-9]+[ \\t]*$*";
		public static final String TITLE_REGEX = "^[T]:.*";
		public static final String COMPOSER_REGEX = "^[C]:.*";
		public static final String NOTE_LENGTH_REGEX = "^[L]:[ \\t]*[0-9]+/[0-9]+[ \\t]*$";
		public static final String METER_REGEX = "^[M]:[ \\t]*[0-9]+/[0-9]+[ \\t]*$";
		public static final String TEMPO_REGEX = "^[Q]:[ \\t]*[0-9]+[ \\t]*$";
		public static final String VOICE_REGEX = "^[V]:.*";
		public static final String KEY_REGEX = "^[K]:[ \\t]*[a-gA-G]m{0,1}[ \\t]*$";
		public static final String NOTE_REGEX = "(\\^{0,2}|_{0,2}|={0,1})[a-gA-G][,']*[0-9/]*";
		public static final String REST_REGEX = "z[0-9/]*";
		public static final String BEGIN_CHORD_REGEX = "\\[";
		public static final String END_CHORD_REGEX = "]";
		public static final String BEGIN_REPEAT_REGEX = "\\|:";
		public static final String END_REPEAT_REGEX = ":\\|";
		public static final String REPEAT_SEQ_REGEX = "\\[[0-9]+";
		public static final String TUPLET_REGEX = "\\([2-4]";
		public static final String MEASURE_REGEX = "\\|";
		public static final String MAJOR_SECTION_REGEX = "(\\|\\|)|(\\|\\])";
		public static final String COMMENT_REGEX = "%.*$";
	}
	
	public final class FieldNames {
		public static final String NUMBER_FIELD_NAME = "Number";
		public static final String TITLE_FIELD_NAME = "Title";
		public static final String COMPOSER_FIELD_NAME = "Composer";
		public static final String NOTE_LENGTH_FIELD_NAME = "Note Length";
		public static final String METER_FIELD_NAME = "Meter";
		public static final String TEMPO_FIELD_NAME = "Tempo";
		public static final String VOICE_FIELD_NAME = "Voice";
		public static final String KEY_FIELD_NAME = "Key";
		public static final String NOTE_FIELD_NAME = "Note";
		public static final String REST_FIELD_NAME = "Rest";
		public static final String BEGIN_CHORD_FIELD_NAME = "Begin Chord";
		public static final String END_CHORD_FIELD_NAME = "End Chord";
		public static final String BEGIN_REPEAT_FIELD_NAME = "Begin Repeat";
		public static final String END_REPEAT_FIELD_NAME = "End Repeat";
		public static final String REPEAT_SEQ_FIELD_NAME = "Repeat Sequence";
		public static final String TUPLET_FIELD_NAME = "Tuplet";
		public static final String MEASURE_FIELD_NAME = "Measure";
		public static final String MAJOR_SECTION_FIELD_NAME = "Major Section";
		public static final String COMMENT_FIELD_NAME = "Comment";		
	}
}
