/**
 *
 * java -jar ../../external-jars/antlr-4.5.2-complete.jar sample.g4
 * Define a grammar called sample
 *
 */
grammar sample;

@header {
package sample;
}

r  : 'hello' ID ;         // match keyword hello followed by an identifier
ID : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines