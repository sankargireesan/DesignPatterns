package ast;

// PrefixExpression class extends Expression
public class PrefixExpression extends Expression {

    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public PrefixExpression(Operator o, Expression first, Expression second){
        text = o.textualRepresentation()+first.textualRepresentation()+second.textualRepresentation();
    }
    @Override
    public String textualRepresentation(){
        return text;
    }
}
