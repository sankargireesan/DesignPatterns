package ast;

// InfixExpression class extends Expression class and add the method textualRepresentation()
// InfixExpression constructor  takes in an Operator and two Expressions and produce an InfixExpression object
public class InfixExpression extends Expression {

    // text stores the textualRepresentation of the object
    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public InfixExpression(Operator o, Expression first, Expression second){
        text = first.textualRepresentation()+o.textualRepresentation()+second.textualRepresentation();
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation(){
        return text;
    }
}
