package ast;

// Sequence class extends Statement
public class Sequence extends Statement {

    // text stores the textualRepresentation of the object
    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public Sequence(Statement first, Statement sec){
        text=first.textualRepresentation()+" "+sec.textualRepresentation();
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }
}
