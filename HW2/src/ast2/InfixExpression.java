package ast2;

public class InfixExpression extends Expression {

    private String text;

    public InfixExpression(Operator o, Expression first, Expression second){
        text = first.textualRepresentation()+o.textualRepresentation()+second.textualRepresentation();
    }
    @Override
    public String textualRepresentation(){
        return text;
    }
}
