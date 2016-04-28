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
*	java -jar ../../lib/antlr-4.5.3-complete.jar AbcMusic.g4
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
WHITESPACE       : [ \t]+ -> skip ;
NEWLINE          : [\n\r];
INDEX            : 'X:' ' '* [0-9]+ ' '* [\n\r]+;
TITLE            : 'T:' ' '* [a-zA-Z0-9'.'' '',''!''#''&''('')''?']+ ' '* [\n\r]+;
COMPOSER         : 'C:' ' '* [a-zA-Z0-9'.'' ']+ ' '* [\n\r]+;
LENGTH           : 'L:' ' '* [0-9]+'/'[0-9]+ ' '* [\n\r]+;
METER            : 'M:' ' '* ('C' | 'C|' | [0-9]+'/'[0-9]+) ' '* [\n\r]+;
TEMPO            : 'Q:' ' '* ([0-9]+'/'[0-9]+ ' '* '=')? ' '* [0-9]+ ' '* [\n\r]+;
VOICE            : 'V:' ' '* [a-zA-Z0-9]+ ' '* [\n\r]+;
KEY              : 'K:' ' '* [A-Ga-g]['#''b']?'m'? ' '* [\n\r]+;
COMMENT          : '%' ('-' | '^' | '=' | '_'  | ' ' | '|' | '\'' | '(' | ')' | ']' | '[' | ':' |'_' | '*' | '~' | ',' | '/' | [a-zA-Z0-9] | '.' | '!' | '?')*  [\n\r]+;
NOTE             : ('^'|'^^'|'_'|'__'|'=')?[a-gA-G]['\''',']*([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
REST             : ('z'|'Z') ([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
DUPLET           : '(' '2';
TRIPLET          : '(' '3';
QUAD             : '(' '4';
PIPE             : '|' | '[|';
LBRAC            : '[';
RBRAC            : ']';
LREPEAT          : '|:' | '||:';
RREPEAT          : ':|' | ':||';
ONE_REPEAT       : '[1';
TWO_REPEAT       : '[2';
END_NOTES        : '|]' | '||';

/*
 * PARSER RULES
 */
 // abc_composition is the starter rule...
abc_composition  : abc_header abc_music NEWLINE* EOF;
abc_header       : header_index header_title optional_headers* field_key;

header_index     : INDEX;
header_title     : TITLE;
optional_headers : header_composer | header_length | header_meter | header_tempo | field_voice | COMMENT;
header_composer  : COMPOSER;
header_length    : LENGTH;
header_meter     : METER;
header_tempo     : TEMPO;
field_voice      : VOICE;
field_key        : KEY;

abc_music        : (line | field_voice NEWLINE* | COMMENT)+;
line             : NEWLINE* measure+ NEWLINE*;
measure          : (LREPEAT|ONE_REPEAT|TWO_REPEAT|PIPE)? note_element+ (PIPE|END_NOTES|NEWLINE|RREPEAT)?;

note_element     : note | rest | chord | duplet | triplet | quadruplet;
note             : NOTE;
rest             : REST;
chord            : LBRAC (note|rest)+ RBRAC;

duplet           : DUPLET (note|chord) (note|chord);
triplet          : TRIPLET (note|chord) (note|chord) (note|chord);
quadruplet       : QUAD (note|chord) (note|chord) (note|chord) (note|chord);