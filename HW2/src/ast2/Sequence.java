package ast2;

public class Sequence extends Statement {
    private String text;

    public Sequence(Statement first, Statement sec){
        text=first.textualRepresentation()+" "+sec.textualRepresentation();
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
