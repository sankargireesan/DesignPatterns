package ast2;

// PrefixExpression extends class Expression
public class PrefixExpression extends Expression {


    // text stores the textualRepresentation of the object
    private String text;

    // Constructor stores the value to string variable text
    public PrefixExpression(Operator o, Expression first, Expression second){
        text = o.textualRepresentation()+first.textualRepresentation()+second.textualRepresentation();
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation(){
        return text;
    }
}
