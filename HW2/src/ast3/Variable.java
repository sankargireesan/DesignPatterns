package ast3;

public class Variable extends Expression {

    private String text;
    private static int count =0;

    public Variable(String s){
        text = s;
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String report(){
        return "Number of instances of variable created :"+count;
    }

    @Override
    public String textualRepresentation(){
        return text;
    }
}
