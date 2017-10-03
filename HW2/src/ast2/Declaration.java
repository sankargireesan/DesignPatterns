package ast2;

// Declaration extends class Statement
public class Declaration extends Statement {

    // text stores the textualRepresentation of the object
    private String text;

    // Constructor stores the value to string variable text
    public Declaration(Variable v){
        text="var "+v.textualRepresentation()+";";
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}