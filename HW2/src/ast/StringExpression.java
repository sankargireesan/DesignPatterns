package ast;

// StringExpression extends class Expression
public class StringExpression extends Expression {

    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public StringExpression(String s){
        text=s;
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
