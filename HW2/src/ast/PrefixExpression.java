package ast;

// PrefixExpression class extends Expression
public class PrefixExpression extends Expression {

    // text stores the textualRepresentation of the object
    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public PrefixExpression(Operator o, Expression first, Expression second){
        text = o.textualRepresentation()+first.textualRepresentation()+second.textualRepresentation();
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation(){
        return text;
    }
}
