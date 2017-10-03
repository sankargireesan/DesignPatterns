package ast4;

public class NumberExpression extends Expression {
    private String text;
    private static int count =0;

    public NumberExpression(int n){
        text=Integer.toString(n);
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String report(){
        return "Number of instances of Number Expression created :"+count;
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
