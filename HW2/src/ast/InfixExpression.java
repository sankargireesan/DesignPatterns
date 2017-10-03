package ast;

// InfixExpression class extends Expression class and add the method textualRepresentation()
// InfixExpression constructor  takes in an Operator and two Expressions and produce an InfixExpression object
public class InfixExpression extends Expression {

    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public InfixExpression(Operator o, Expression first, Expression second){
        text = first.textualRepresentation()+o.textualRepresentation()+second.textualRepresentation();
    }
    @Override
    public String textualRepresentation(){
        return text;
    }
}
