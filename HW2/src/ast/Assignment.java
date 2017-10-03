package ast;

// Assignment class extends Statement class and add the method textualRepresentation()
public class Assignment extends Statement {

    // text stores the textualRepresentation of the object
    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public Assignment(Variable v, Expression exp){
        text=v.textualRepresentation()+" = "+exp.textualRepresentation();
    }

    // returns the textual representation of the object
    @Override
    public String textualRepresentation() {
        return text;
    }

}
