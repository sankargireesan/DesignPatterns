package ast4;

public class LoggingStatementFactory extends StatementFactory {
    public String report(){
        int decl = Declaration.getCount();
        int assgn = Assignment.getCount();
        int seq = Sequence.getCount();
        int total = decl+assgn+seq;

        String countString =  "Total number of Statements :"+Integer.toString(total)+
                "\n number of Declarations :"+Integer.toString(decl)+
                "\n number of Assignment :"+Integer.toString(assgn)+
                "\n number of Sequence :"+Integer.toString(seq);
        return countString;
    }
}
