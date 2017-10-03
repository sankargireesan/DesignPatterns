package ast2;

public class NumberExpression extends Expression {
    private String text;

    public NumberExpression(int n){
        text=Integer.toString(n);
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
