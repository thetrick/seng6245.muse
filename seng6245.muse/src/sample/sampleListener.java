// Generated from sample.g4 by ANTLR 4.5.2

package sample;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sampleParser}.
 */
public interface sampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sampleParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(sampleParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link sampleParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(sampleParser.RContext ctx);
}