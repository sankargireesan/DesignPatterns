package ast;

// Assignment class extends Statement class and add the method textualRepresentation()
public class Assignment extends Statement {

    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public Assignment(Variable v, Expression exp){
        text=v.textualRepresentation()+" = "+exp.textualRepresentation();
    }

    @Override
    public String textualRepresentation() {
        return text;
    }

}
