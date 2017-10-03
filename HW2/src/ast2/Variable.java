package ast2;

// Variable extends class Expression
public class Variable extends Expression {


    // text stores the textualRepresentation of the object
    private String text;

    // Constructor stores the value to string variable text
    public Variable(String s){
        text = s;
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation(){
        return text;
    }
}
