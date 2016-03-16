/**
* ANTLR GRAMMAR FILE
* Used to define a grammar for ABC Music Notation (https://en.wikipedia.org/wiki/ABC_notation)
* List of References:
* 	: http://www.theendian.com/blog/antlr-4-lexer-parser-and-listener-with-example-grammar/
*	: http://meri-stuff.blogspot.com/2011/08/antlr-tutorial-hello-word.html
*	: http://meri-stuff.blogspot.com/2011/09/antlr-tutorial-expression-language.html
*	: https://github.com/antlr/antlr4
* 
* Run the following command to compile ABC Music Notation Grammar:
*
*	java -jar ../../external-jars/antlr-4.5.2-complete.jar AbcMusic.g4
*
* Refer to ../../support-docs/abc_subset_bnf.txt
*/
grammar AbcMusic;

@header {
package grammar;
}

/*
 * LEXICAL RULES - Token List.
 */
 
WHITESPACE: [ \t]+ -> skip;
SPACES: ' '*;
NEWLINE: [\n\r];
COMMENT: '%\n' | '%' .*?  NEWLINE+;

INDEX_PREAMBLE: 'X:' ' '*;
TITLE_PREAMBLE: 'T:' ' '*;
COMPOSER_PREAMBLE: 'C:' ' '*;
LENGTH_PREAMBLE: 'L:' ' '*;
METER_PREAMBLE: 'M:' ' '*;
TEMPO_PREAMBLE: 'Q:' ' '*;
VOICE_PREAMBLE: 'V:' ' '*;
KEY_PREAMBLE: 'K:' ' '*;

INDEX_PATTERN: [0-9]+;
TITLE_PATTERN: [a-zA-Z0-9'.'' '',''!''#''&''('')''?']+;
COMPOSER_PATTERN: [a-zA-Z0-9'.'' ']+;
LENGTH_PATTERN: [0-9]+'/'[0-9]+;
METER_PATTERN: ('C' | 'C|' | [0-9]+'/'[0-9]+);
TEMPO_PATTERN: ([0-9]+'/'[0-9]+ ' '* '=')? ' '* [0-9]+;
VOICE_PATTERN: [a-zA-Z0-9]+;
KEY_PATTERN: [A-Ga-g]['#''b']?'m'?;

INDEX_FIELD_DEF: INDEX_PREAMBLE INDEX_PATTERN SPACES NEWLINE+
TITLE_FIELD_DEF: TITLE_PREAMBLE TITLE_PATTERN SPACES NEWLINE+
COMPOSER_FIELD_DEF: COMPOSER_PREAMBLE COMPOSER_PATTERN SPACES NEWLINE+
LENGTH_FIELD_DEF: LENGTH_PREAMBLE LENGTH_PATTERN SPACES NEWLINE+
METER_FIELD_DEF: METER_PREAMBLE METER_PATTERN SPACES NEWLINE+
TEMPO_FIELD_DEF: TEMPO_PREAMBLE TEMPO_PATTERN SPACES NEWLINE+
VOICE_FIELD_DEF: VOICE_PREAMBLE VOICE_PATTERN SPACES NEWLINE+
KEY_FIELD_DEF: KEY_PREAMBLE KEY_PATTERN SPACES NEWLINE+

NOTE_PATTERN: ('^'|'^^'|'_'|'__'|'=')?[a-gA-G]['\''',']*([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
REST_PATTERN: ('z') ([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
DUPLET_PATTERN: '(2';
TRIPLET_PATTERN: '(3';
QUADRUPLET_PATTERN: '(4';
BAR_LINE: '|' | '[|';
CHORD_OPEN_PATTERN: '[';
CHORD_CLOSE_PATTERN: ']';
REPEAT_ONE_PATTERN : '[1';
REPEAT_TWO_PATTERN: '[2';
REPEAT_BEGIN_PATTERN: '|:'|'||:';
REPEAT_END_PATTERN: ':|'|':||';
END_MAJOR_SECTION_PATTERN: '|]' | '||';

/*
 * PARSER RULES
 */
abc_composition : abc_header abc_music NEWLINE* EOF;
abc_header : header_index header_title optional_headers* header_key;

header_index : INDEX_FIELD_DEF;
header_title : TITLE_FIELD_DEF;
optional_headers : header_composer | header_length | header_meter | header_tempo | header_voice | COMMENT;
header_composer : COMPOSER_FIELD_DEF;
header_length : LENGTH_FIELD_DEF;
header_meter : METER_FIELD_DEF;
header_tempo : TEMPO_FIELD_DEF;
header_voice : VOICE_FIELD_DEF;
header_key : KEY_FIELD_DEF;

abc_music : (line | header_voice NEWLINE* | COMMENT)+;
line: NEWLINE* bar+ NEWLINE*;
bar : (REPEAT_BEGIN_PATTERN|REPEAT_ONE_PATTERN|REPEAT_TWO_PATTERN|BAR_LINE)? note_type+ (BAR_LINE|END_MAJOR_SECTION_PATTERN|NEWLINE|REPEAT_END_PATTERN)?;

note_type : note | rest | chord | duplet | triplet | quadruplet;
note: NOTE_PATTERN;
rest: REST_PATTERN;
chord : CHORD_OPEN_PATTERN (note|rest)+ CHORD_CLOSE_PATTERN;

duplet: DUPLET (note|chord) (note|chord);
triplet: TRIPLET (note|chord) (note|chord) (note|chord);
quadruplet: QUADRUPLET (note|chord) (note|chord) (note|chord) (note|chord);
