package ast;

// Sequence class extends Statement
public class Sequence extends Statement {
    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public Sequence(Statement first, Statement sec){
        text=first.textualRepresentation()+" "+sec.textualRepresentation();
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
