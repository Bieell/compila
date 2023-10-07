import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

/**
 * MeuCompilador
 */
public class MeuCompilador {
    public static void main(String[] args) {
        System.out.println("hello");

        CharStream entrada = CharStreams.fromString("4+2");
        CalcularLexer lex = new CalcularLexer(entrada);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CalcularParser parser = new CalcularParser(tokens);
        CalcularParser.ProgramContext arvore = parser.program();
        System.out.println(arvore.toStringTree(parser));
        MeuListener meuListener = new MeuListener();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(meuListener, arvore);
    }

}