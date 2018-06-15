package ast3;

// LoggingExpressionFactory extends ExpressionFactory and adds an extra method
// report which enables to report the number of objects created
public class LoggingExpressionFactory extends ExpressionFactory{

    // report function is used to give the total number of Expression objects created by the factory
    public String report(){
        int infixExp = InfixExpression.getCount();
        int preExp = PrefixExpression.getCount();
        int numExp = NumberExpression.getCount();
        int varExp = VariableExpression.getCount();
        int stringExp = StringExpression.getCount();

        // total calculates the total expressions created
        int total = infixExp+preExp+numExp+varExp+stringExp;

        String countString =  "Total number of Expressions :"+Integer.toString(total)+
                "\n number of InfixExpression :"+Integer.toString(infixExp)+
                "\n number of PrefixExpression :"+Integer.toString(preExp)+
                "\n number of NumberExpression :"+Integer.toString(numExp)+
                "\n number of VariableExpression :"+Integer.toString(varExp)+
                "\n number of StringExpression :"+Integer.toString(stringExp);


        return countString;
    }

}
