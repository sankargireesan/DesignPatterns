package ast4;

// Sequence extends Statement class
public class Sequence extends Statement {
    private String text;

    // count is used to keep the number of instances of Sequence objects created
    private static int count =0;

    public Sequence(Statement first, Statement sec){
        text=first.textualRepresentation()+" "+sec.textualRepresentation();
        count++;
    }

    public static int getCount(){
        return count;
    }

    // returns the number of instances of Sequence created
    public String report(){
        return "Number of instances of Sequence created :"+count;
    }

    // returns textual Representation
    @Override
    public String textualRepresentation() {
        return text;
    }
}
