package ast2;

// InfixExpression extends class Expression
public class InfixExpression extends Expression {


    // text stores the textualRepresentation of the object
    private String text;

    // Constructor stores the value to string variable text
    public InfixExpression(Operator o, Expression first, Expression second){
        text = first.textualRepresentation()+o.textualRepresentation()+second.textualRepresentation();
    }
    @Override
    public String textualRepresentation(){
        return text;
    }
}
