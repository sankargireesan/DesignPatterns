package ast4;

// Variable extends Expression class
public class Variable extends Expression {

    // String variable text stores the textualRepresentation of Variable
    private String text;

    // count is used to keep the number of instances of Variable objects created
    private static int count =0;

    // The count is increased during the creation of a new object
    public Variable(String s){
        text = s;
        count++;
    }

    // getter method to get the count of instances created
    public static int getCount(){
        return count;
    }


    // Report method returns a string with the number of instances of the particular object created.
    public String report(){
        return "Number of instances of variable created :"+count;
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation(){
        return text;
    }
}
