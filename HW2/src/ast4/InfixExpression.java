package ast4;

// InfixExpression class extends abstract class Expression
public class InfixExpression extends Expression {

    private String text;

    // count is used to keep the number of instances of InfixExpression objects created
    private static int count =0;

    public InfixExpression(Operator o, Expression first, Expression second){
        text = first.textualRepresentation()+o.textualRepresentation()+second.textualRepresentation();
        count++;
    }

    public static int getCount(){
        return count;
    }

    // returns the number of instances of InfixExpression created
    public String report(){
        return "Number of instances of Infix Expression created :"+count;
    }

    @Override
    public String textualRepresentation(){
        return text;
    }
}
