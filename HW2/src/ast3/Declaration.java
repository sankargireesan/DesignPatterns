package ast3;

// Declaration extends class Statement
public class Declaration extends Statement {

    private String text;

    // count is used to keep the number of objects created
    private static int count =0;

    public Declaration(Variable v){
        text="var "+v.textualRepresentation()+";";
        count++;
    }

    // count is used to keep the number of instances of objects created
    public static int getCount(){
        return count;
    }


    // returns the number of instances of object created
    public String report(){
        return "Number of instances of Declaration created :"+count;
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}