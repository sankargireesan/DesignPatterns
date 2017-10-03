package ast2;

// Sequence extends class Statement
public class Sequence extends Statement {


    // text stores the textualRepresentation of the object
    private String text;

    // Constructor stores the value to string variable text
    public Sequence(Statement first, Statement sec){
        text=first.textualRepresentation()+" "+sec.textualRepresentation();
    }


    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}
