package ast;


// Declaration class extends Statement class and add the method textualRepresentation()
public class Declaration extends Statement {

    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public Declaration(Variable v){
        text="var "+v.textualRepresentation()+";";
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}