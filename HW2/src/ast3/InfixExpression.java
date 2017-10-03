package ast3;

public class InfixExpression extends Expression {

    private String text;
    private static int count =0;

    public InfixExpression(Operator o, Expression first, Expression second){
        text = first.textualRepresentation()+o.textualRepresentation()+second.textualRepresentation();
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String report(){
        return "Number of instances of Infix Expression created :"+count;
    }

    @Override
    public String textualRepresentation(){
        return text;
    }
}
