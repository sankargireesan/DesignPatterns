package ast3;

public class VariableExpression extends Expression {
    private String text;
    private static int count =0;

    public VariableExpression(Variable v){
        text = v.textualRepresentation();
        count++;
    }


    // count is used to keep the number of instances of objects created
    public static int getCount(){
        return count;
    }


    // returns the number of instances of object created
    public String report(){
        return "Number of instances of variableExpression created :"+count;
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}
