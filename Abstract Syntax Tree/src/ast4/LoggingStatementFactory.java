package ast4;

// LoggingStatementFactory extends StatementFactory allowing users to create new objects of
// Statement type and also a report function
public class LoggingStatementFactory extends StatementFactory {

    // report function when called will return the total number of Statement objects created
    // It also give the individual count of objects created
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
