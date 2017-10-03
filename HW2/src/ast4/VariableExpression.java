package ast4;

// VariableExpression extends Expression class
public class VariableExpression extends Expression {

    // String variable text stores the textualRepresentation of VariableExpressions
    private String text;

    // count is used to keep the number of instances of VariableExpression objects created
    private static int count =0;

    // VariableExpression takes a variable and assigns it to text variable.
    // The count is increased during the creation of a new object
    public VariableExpression(Variable v){
        text = v.textualRepresentation();
        count++;
    }

    // getter method to get the count
    public static int getCount(){
        return count;
    }

    // Report method returns a string with the number of instances of the particular object created.
    public String report(){
        return "Number of instances of variableExpression created :"+count;
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}
