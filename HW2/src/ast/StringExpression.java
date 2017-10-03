package ast;

// StringExpression extends class Expression
public class StringExpression extends Expression {

    // text stores the textualRepresentation of the object
    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public StringExpression(String s){
        text=s;
    }


    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}
