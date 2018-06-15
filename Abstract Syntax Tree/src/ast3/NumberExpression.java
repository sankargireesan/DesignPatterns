package ast3;

public class NumberExpression extends Expression {
    private String text;

    // count is used to keep the number of objects created
    private static int count =0;

    public NumberExpression(int n){
        text=Integer.toString(n);
        count++;
    }

    // count is used to keep the number of instances of objects created
    public static int getCount(){
        return count;
    }


    // returns the number of instances of object created
    public String report(){
        return "Number of instances of Number Expression created :"+count;
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}
