package ast4;

public class VariableExpression extends Expression {
    private String text;
    private static int count =0;

    public VariableExpression(Variable v){
        text = v.textualRepresentation();
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String report(){
        return "Number of instances of variableExpression created :"+count;
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
