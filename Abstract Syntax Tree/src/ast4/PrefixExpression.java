package ast4;

public class PrefixExpression extends Expression {

    private String text;

    // count is used to keep the number of instances of PrefixExpression objects created
    private static int count =0;

    public PrefixExpression(Operator o, Expression first, Expression second){
        text = o.textualRepresentation()+first.textualRepresentation()+second.textualRepresentation();
        count++;
    }

    public static int getCount(){
        return count;
    }

    // returns the number of instances of PrefixExpression created
    public String report(){
        return "Number of instances of Prefix Expression created :"+count;
    }

    @Override
    public String textualRepresentation(){
        return text;
    }
}
