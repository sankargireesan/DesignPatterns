package ast4;

public class Sequence extends Statement {
    private String text;
    private static int count =0;

    public Sequence(Statement first, Statement sec){
        text=first.textualRepresentation()+" "+sec.textualRepresentation();
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String report(){
        return "Number of instances of Sequence created :"+count;
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}
