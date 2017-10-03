package ast;

// NumberExpression extends Expression
public class NumberExpression extends Expression {

    // text will contain the textual representation of NumberExpression
    // It will get a value when the object is created using constructor
    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public NumberExpression(int n){
        text=Integer.toString(n);
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
