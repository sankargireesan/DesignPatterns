package ast4;

public class NumberExpression extends Expression {
    private String text;

    // count is used to keep the number of instances of NumberExpression objects created
    private static int count =0;

    public NumberExpression(int n){
        text=Integer.toString(n);
        count++;
    }

    // getter method to get the count
    public static int getCount(){
        return count;
    }


    // returns the number of instances of NumberExpression created
    public String report(){
        return "Number of instances of Number Expression created :"+count;
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
