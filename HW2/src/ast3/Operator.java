package ast3;

public class Operator extends Expression {

    private String text;
    private static int count =0;

    public Operator(String s){
        text = s;
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String report(){
        return "Number of instances of Operator created :"+count;
    }
    @Override
    public String textualRepresentation(){
        return text;
    }
}
