package ast;

// VariableExpression extends Expression
public class VariableExpression extends Expression {
    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public VariableExpression(Variable v){
        text = v.textualRepresentation();
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
