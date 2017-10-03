package ast2;

public class Operator extends Expression {

    private String text;

    public Operator(String s){
        text = s;
    }

    @Override
    public String textualRepresentation(){
        return text;
    }
}
