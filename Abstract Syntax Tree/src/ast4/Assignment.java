package ast4;

// Assignment class extends abstract class Statement
public class Assignment extends Statement {

    private String text;

    // count is used to keep the number of instances of Assignment objects created
    private static int count =0;

    public Assignment(Variable v, Expression exp){
        text=v.textualRepresentation()+" = "+exp.textualRepresentation();
        count++;
    }

    public static int getCount(){
        return count;
    }


    // returns the number of instances of Assignment created
    public String report(){
        return "Number of instances of Assignment created :"+count;
    }

    @Override
    public String textualRepresentation() {
        return text;
    }

}
