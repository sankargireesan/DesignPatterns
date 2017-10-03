package ast3;

// ExpressionFactory is used to create objects of Expression objects
// It lets user create objects maintaining a layer of abstraction
public class ExpressionFactory {

    public InfixExpression makeInfixExpression(Operator o, Expression first, Expression second){
        return new InfixExpression(o, first, second);
    }

    public PrefixExpression makePrefixExpression(Operator o, Expression first, Expression second){
        return new PrefixExpression(o, first, second);
    }

    public NumberExpression makeNumberExpression(int newNumber){
        return new NumberExpression(newNumber);
    }

    public VariableExpression makeVariableExpression(Variable newVariable){
        return new VariableExpression(newVariable);
    }

    public Variable makeVariable(String newVariable){
        return new Variable(newVariable);
    }

    public Operator makeOperator(String newOperator){
        return new Operator(newOperator);
    }

    public StringExpression makeStringExpression(String newString){
        return new StringExpression(newString);
    }


}
