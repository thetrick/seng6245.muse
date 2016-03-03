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
package abc;
}

/*
 * LEXICAL RULES - Token List.
 */
 
WHITESPACE : [ \t]+ -> skip ;
NEWLINE: [\n\r];
COMMENT : '%\n' | '%' .*?  [\n\r]+;
HEADER_INDEX : 'X:' ' '* [0-9]+ ' '* [\n\r]+;
HEADER_TITLE : 'T:' ' '* [a-zA-Z0-9'.'' '',''!''#''&''('')''?']+ ' '* [\n\r]+;
HEADER_COMPOSER : 'C:' ' '* [a-zA-Z0-9'.'' ']+ ' '* [\n\r]+;
HEADER_LENGTH : 'L:' ' '* [0-9]+'/'[0-9]+ ' '* [\n\r]+;
HEADER_METER : 'M:' ' '* ('C' | 'C|' | [0-9]+'/'[0-9]+) ' '* [\n\r]+;
HEADER_TEMPO : 'Q:' ' '* ([0-9]+'/'[0-9]+ ' '* '=')? ' '* [0-9]+ ' '* [\n\r]+;
HEADER_VOICE : 'V:' ' '* [a-zA-Z0-9]+ ' '* [\n\r]+;
HEADER_KEY : 'K:' ' '* [A-Ga-g]['#''b']?'m'? ' '* [\n\r]+;
NOTE :  ('^'|'^^'|'_'|'__'|'=')?[a-gA-G]['\''',']*([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
REST : 'z' ([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
DUPLET: '(' '2';
TRIPLET: '(' '3';
QUADRUPLET: '(' '4';
BAR_LINE: '|' | '[|';
CHORD_OPEN: '[';
CHORD_CLOSE: ']';
REPEAT_BEGIN: '|:' | '||:';
REPEAT_END: ':|' | ':||';
REPEAT_ONE : '[1';
REPEAT_TWO: '[2';
END_MAJOR_SECTION: '|]' | '||';

/*
 * PARSER RULES
 */
composition : music_header music_body NEWLINE* EOF;
music_header : header_index header_title optional_headers* header_key;

header_index : HEADER_INDEX;
header_title : HEADER_TITLE;
optional_headers : header_composer | header_length | header_meter | header_tempo | header_voice | COMMENT;
header_composer : HEADER_COMPOSER;
header_length : HEADER_LENGTH;
header_meter : HEADER_METER;
header_tempo : HEADER_TEMPO;
header_voice : HEADER_VOICE;
header_key : HEADER_KEY;

music_body : (line | header_voice NEWLINE* | COMMENT)+;
line: NEWLINE* bar+ NEWLINE*;
bar : (REPEAT_BEGIN|REPEAT_ONE|REPEAT_TWO|BAR_LINE)? note_type+ (BAR_LINE|END_MAJOR_SECTION|NEWLINE|REPEAT_END)?;

note_type : note | rest | chord | duplet | triplet | quadruplet;
note: NOTE;
rest: REST;
chord : CHORD_OPEN (note|rest)+ CHORD_CLOSE;

duplet: DUPLET (note|chord) (note|chord);
triplet: TRIPLET (note|chord) (note|chord) (note|chord);
quadruplet: QUADRUPLET (note|chord) (note|chord) (note|chord) (note|chord);
