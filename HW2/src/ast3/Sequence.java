package ast3;

public class Sequence extends Statement {
    private String text;

    // count is used to keep the number of objects created
    private static int count =0;

    public Sequence(Statement first, Statement sec){
        text=first.textualRepresentation()+" "+sec.textualRepresentation();
        count++;
    }

    // count is used to keep the number of instances of objects created
    public static int getCount(){
        return count;
    }


    // returns the number of instances of object created
    public String report(){
        return "Number of instances of Sequence created :"+count;
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}
