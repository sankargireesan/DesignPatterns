package ast4;

public class LoggingExpressionFactory extends ExpressionFactory {

    public String report(){

        int infixExp = InfixExpression.getCount();
        int preExp = PrefixExpression.getCount();
        int numExp = NumberExpression.getCount();
        int varExp = VariableExpression.getCount();
        int stringExp = StringExpression.getCount();

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
