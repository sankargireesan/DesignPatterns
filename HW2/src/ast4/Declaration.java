package ast4;

public class Declaration extends Statement {

    private String text;
    private static int count =0;

    public Declaration(Variable v){
        text="var "+v.textualRepresentation()+";";
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String report(){
        return "Number of instances of Declaration created :"+count;
    }

    @Override
    public String textualRepresentation() {
        return text;
    }
}