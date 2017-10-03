package ast4;

// Declaration class extends abstract class Statement
public class Declaration extends Statement {

    private String text;

    // count is used to keep the number of instances of Declaration objects created
    private static int count =0;

    public Declaration(Variable v){
        text="var "+v.textualRepresentation()+";";
        count++;
    }

    public static int getCount(){
        return count;
    }

    // returns the number of instances of Declaration created
    public String report(){
        return "Number of instances of Declaration created :"+count;
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}