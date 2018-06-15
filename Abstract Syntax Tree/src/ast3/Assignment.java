package ast3;

// Assignment class extends Statement
public class Assignment extends Statement {

    private String text;

    // count is used to keep the number of objects created
    private static int count =0;

    public Assignment(Variable v, Expression exp){
        text=v.textualRepresentation()+" = "+exp.textualRepresentation();
        count++;
    }

    // count is used to keep the number of instances of objects created
    public static int getCount(){
        return count;
    }

    // returns the number of instances of object created
    public String report(){
        return "Number of instances of Assignment created :"+count;
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }

}
