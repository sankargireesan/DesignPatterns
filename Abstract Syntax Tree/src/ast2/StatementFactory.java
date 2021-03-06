package ast2;

// StatementFactory creates factory which enables users to create objects of type Statement
public class StatementFactory {

    public Declaration makeDeclaration(Variable newVariable){
        return new Declaration(newVariable);
    }

    public Assignment makeAssignment(Variable newVariable, Expression exp){
        return new Assignment(newVariable, exp);
    }

    public Sequence makeSequence(Statement first, Statement sec){
        return new Sequence(first, sec);
    }
}
