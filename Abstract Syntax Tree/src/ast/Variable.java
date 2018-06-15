package ast;

//Variable implements Node
public class Variable implements Node {

    // text stores the textualRepresentation of the object
    private String text;

    // When an object is created, the text field is updated to its textual Representation
    public Variable(String s){
        text = s;
    }


    // returns the textual representation of the object
    @Override
    public String textualRepresentation(){
        return text;
    }
}
