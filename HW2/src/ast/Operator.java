package ast;

// Operator implements Node
public class Operator implements Node {

    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public Operator(String s){
        text = s;
    }

    @Override
    public String textualRepresentation(){
        return text;
    }
}
