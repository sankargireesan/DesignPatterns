package ast2;

public class Variable extends Expression {

    private String text;

    public Variable(String s){
        text = s;
    }

    @Override
    public String textualRepresentation(){
        return text;
    }
}
