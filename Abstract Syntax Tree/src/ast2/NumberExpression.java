package ast2;

// NumberExpression extends class Expression
public class NumberExpression extends Expression {


    // text stores the textualRepresentation of the object
    private String text;

    // Constructor stores the value to string variable text
    public NumberExpression(int n){
        text=Integer.toString(n);
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}
