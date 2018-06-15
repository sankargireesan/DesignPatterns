package ast2;

// StringExpression extends class Expression
public class StringExpression extends Expression {


    // text stores the textualRepresentation of the object
    private String text;


    // Constructor stores the value to string variable text
    public StringExpression(String s){
        text=s;
    }


    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}
