package ast2;

public class Declaration extends Statement {

    private String text;

    public Declaration(Variable v){
        text="var "+v.textualRepresentation()+";";
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}