package ast2;

public class Assignment extends Statement {

    private String text;

    public Assignment(Variable v, Expression exp){
        text=v.textualRepresentation()+" = "+exp.textualRepresentation();
    }

    @Override
    public String textualRepresentation() {
        return text;
    }

}
