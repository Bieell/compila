// Generated from Calcular.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcularParser}.
 */
public interface CalcularListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalcularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalcularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcularParser#calcula}.
	 * @param ctx the parse tree
	 */
	void enterCalcula(CalcularParser.CalculaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcularParser#calcula}.
	 * @param ctx the parse tree
	 */
	void exitCalcula(CalcularParser.CalculaContext ctx);
}