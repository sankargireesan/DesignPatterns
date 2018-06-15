package ast4;

public class Operator extends Expression {

    private String text;

    // count is used to keep the number of instances of Operator objects created
    private static int count =0;

    public Operator(String s){
        text = s;
        count++;
    }

    public static int getCount(){
        return count;
    }

    // returns the number of instances of Operator created
    public String report(){
        return "Number of instances of Operator created :"+count;
    }
    @Override
    public String textualRepresentation(){
        return text;
    }
}
