import org.antlr.v4.runtime.tree.TerminalNode;

public class MeuListener extends CalcularBaseListener{
    private int resultado;
    @Override
    public void enterProgram(CalcularParser.ProgramContext ctx) {
        // TODO Auto-generated method stub
        super.enterProgram(ctx);
        System.out.println("Entrando na sentença.");
    }

    @Override
    public void exitProgram(CalcularParser.ProgramContext ctx) {
        // TODO Auto-generated method stub
        super.exitProgram(ctx);
        System.out.println("Saindo da sentença! - Resultado = " + resultado);

    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
        super.visitTerminal(node);
        System.out.println("Li o elemento: " + node.getText());
        String elemento = node.getText();
        if(!elemento.equals("+")) {
            resultado += Integer.parseInt(elemento);
        }
    }   

}
