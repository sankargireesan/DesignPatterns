package ast;

//Variable implements Node
public class Variable implements Node {

    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public Variable(String s){
        text = s;
    }

    @Override
    public String textualRepresentation(){
        return text;
    }
}
