package ast2;

// Assignment extends class Statement
public class Assignment extends Statement {

    // text stores the textualRepresentation of the object
    private String text;

    // Constructor stores the value to string variable text
    public Assignment(Variable v, Expression exp){
        text=v.textualRepresentation()+" = "+exp.textualRepresentation();
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }

}
