package ast2;

public class VariableExpression extends Expression {
    private String text;

    public VariableExpression(Variable v){
        text = v.textualRepresentation();
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
