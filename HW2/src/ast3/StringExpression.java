package ast3;

public class StringExpression extends Expression {

    private String text;
    private static int count =0;

    public StringExpression(String s){
        text=s;
        count++;
        }

    public static int getCount(){
        return count;
    }

    public String report(){
        return "Number of instances of String Expression created :"+count;
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
