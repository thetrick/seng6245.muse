// Generated from AbcMusic.g4 by ANTLR 4.5.2

package grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbcMusicParser}.
 */
public interface AbcMusicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#composition}.
	 * @param ctx the parse tree
	 */
	void enterComposition(AbcMusicParser.CompositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#composition}.
	 * @param ctx the parse tree
	 */
	void exitComposition(AbcMusicParser.CompositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#music_header}.
	 * @param ctx the parse tree
	 */
	void enterMusic_header(AbcMusicParser.Music_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#music_header}.
	 * @param ctx the parse tree
	 */
	void exitMusic_header(AbcMusicParser.Music_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#header_index}.
	 * @param ctx the parse tree
	 */
	void enterHeader_index(AbcMusicParser.Header_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#header_index}.
	 * @param ctx the parse tree
	 */
	void exitHeader_index(AbcMusicParser.Header_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#header_title}.
	 * @param ctx the parse tree
	 */
	void enterHeader_title(AbcMusicParser.Header_titleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#header_title}.
	 * @param ctx the parse tree
	 */
	void exitHeader_title(AbcMusicParser.Header_titleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#optional_headers}.
	 * @param ctx the parse tree
	 */
	void enterOptional_headers(AbcMusicParser.Optional_headersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#optional_headers}.
	 * @param ctx the parse tree
	 */
	void exitOptional_headers(AbcMusicParser.Optional_headersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#header_composer}.
	 * @param ctx the parse tree
	 */
	void enterHeader_composer(AbcMusicParser.Header_composerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#header_composer}.
	 * @param ctx the parse tree
	 */
	void exitHeader_composer(AbcMusicParser.Header_composerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#header_length}.
	 * @param ctx the parse tree
	 */
	void enterHeader_length(AbcMusicParser.Header_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#header_length}.
	 * @param ctx the parse tree
	 */
	void exitHeader_length(AbcMusicParser.Header_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#header_meter}.
	 * @param ctx the parse tree
	 */
	void enterHeader_meter(AbcMusicParser.Header_meterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#header_meter}.
	 * @param ctx the parse tree
	 */
	void exitHeader_meter(AbcMusicParser.Header_meterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#header_tempo}.
	 * @param ctx the parse tree
	 */
	void enterHeader_tempo(AbcMusicParser.Header_tempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#header_tempo}.
	 * @param ctx the parse tree
	 */
	void exitHeader_tempo(AbcMusicParser.Header_tempoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#header_voice}.
	 * @param ctx the parse tree
	 */
	void enterHeader_voice(AbcMusicParser.Header_voiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#header_voice}.
	 * @param ctx the parse tree
	 */
	void exitHeader_voice(AbcMusicParser.Header_voiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#header_key}.
	 * @param ctx the parse tree
	 */
	void enterHeader_key(AbcMusicParser.Header_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#header_key}.
	 * @param ctx the parse tree
	 */
	void exitHeader_key(AbcMusicParser.Header_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#music_body}.
	 * @param ctx the parse tree
	 */
	void enterMusic_body(AbcMusicParser.Music_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#music_body}.
	 * @param ctx the parse tree
	 */
	void exitMusic_body(AbcMusicParser.Music_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(AbcMusicParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(AbcMusicParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#bar}.
	 * @param ctx the parse tree
	 */
	void enterBar(AbcMusicParser.BarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#bar}.
	 * @param ctx the parse tree
	 */
	void exitBar(AbcMusicParser.BarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#note_type}.
	 * @param ctx the parse tree
	 */
	void enterNote_type(AbcMusicParser.Note_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#note_type}.
	 * @param ctx the parse tree
	 */
	void exitNote_type(AbcMusicParser.Note_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(AbcMusicParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(AbcMusicParser.NoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#rest}.
	 * @param ctx the parse tree
	 */
	void enterRest(AbcMusicParser.RestContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#rest}.
	 * @param ctx the parse tree
	 */
	void exitRest(AbcMusicParser.RestContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#chord}.
	 * @param ctx the parse tree
	 */
	void enterChord(AbcMusicParser.ChordContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#chord}.
	 * @param ctx the parse tree
	 */
	void exitChord(AbcMusicParser.ChordContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#duplet}.
	 * @param ctx the parse tree
	 */
	void enterDuplet(AbcMusicParser.DupletContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#duplet}.
	 * @param ctx the parse tree
	 */
	void exitDuplet(AbcMusicParser.DupletContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#triplet}.
	 * @param ctx the parse tree
	 */
	void enterTriplet(AbcMusicParser.TripletContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#triplet}.
	 * @param ctx the parse tree
	 */
	void exitTriplet(AbcMusicParser.TripletContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcMusicParser#quadruplet}.
	 * @param ctx the parse tree
	 */
	void enterQuadruplet(AbcMusicParser.QuadrupletContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcMusicParser#quadruplet}.
	 * @param ctx the parse tree
	 */
	void exitQuadruplet(AbcMusicParser.QuadrupletContext ctx);
}