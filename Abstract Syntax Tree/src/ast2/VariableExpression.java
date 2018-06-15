package ast2;

// VariableExpression extends class Expression
public class VariableExpression extends Expression {

    // text stores the textualRepresentation of the object
    private String text;

    // Constructor stores the value to text
    public VariableExpression(Variable v){
        text = v.textualRepresentation();
    }


    // returns the textual representation of the objects
    @Override
    public String textualRepresentation() {
        return text;
    }
}
