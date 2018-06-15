package ast3;

// LoggingStatementFactory extends StatementFactory and adds an extra method
// report which enables to report the number of objects created
public class LoggingStatementFactory extends StatementFactory{

    // report function is used to give the total number of Statement objects created by the factory
    public String report(){
        int decl = Declaration.getCount();
        int assgn = Assignment.getCount();
        int seq = Sequence.getCount();

        // total number of statements created
        int total = decl+assgn+seq;

        String countString =  "Total number of Statements :"+Integer.toString(total)+
                "\n number of Declarations :"+Integer.toString(decl)+
                "\n number of Assignment :"+Integer.toString(assgn)+
                "\n number of Sequence :"+Integer.toString(seq);
        return countString;
    }
}
