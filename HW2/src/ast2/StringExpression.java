package ast2;

public class StringExpression extends Expression {

    private String text;

    public StringExpression(String s){
        text=s;
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
