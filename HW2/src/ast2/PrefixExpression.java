package ast2;

public class PrefixExpression extends Expression {

    private String text;

    public PrefixExpression(Operator o, Expression first, Expression second){
        text = o.textualRepresentation()+first.textualRepresentation()+second.textualRepresentation();
    }
    @Override
    public String textualRepresentation(){
        return text;
    }
}
