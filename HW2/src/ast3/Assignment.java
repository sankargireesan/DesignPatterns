package ast3;

public class Assignment extends Statement {

    private String text;
    private static int count =0;

    public Assignment(Variable v, Expression exp){
        text=v.textualRepresentation()+" = "+exp.textualRepresentation();
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String report(){
        return "Number of instances of Assignment created :"+count;
    }

    @Override
    public String textualRepresentation() {
        return text;
    }

}
