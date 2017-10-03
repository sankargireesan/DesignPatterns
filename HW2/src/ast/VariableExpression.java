package ast;

// VariableExpression extends Expression
public class VariableExpression extends Expression {

    // text stores the textualRepresentation of the object
    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public VariableExpression(Variable v){
        text = v.textualRepresentation();
    }


    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}
