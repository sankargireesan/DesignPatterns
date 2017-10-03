package ast4;

public class StringExpression extends Expression {

    // String variable text stores the textualRepresentation of StringExpression
    private String text;

    // count is used to keep the number of instances of StringExpression objects created
    private static int count =0;

    public StringExpression(String s){
        text=s;
        count++;
        }

    // The count is increased during the creation of a new object
    public static int getCount(){
        return count;
    }

    // Report method returns a string with the number of instances of the particular object created.
    public String report(){
        return "Number of instances of String Expression created :"+count;
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}
