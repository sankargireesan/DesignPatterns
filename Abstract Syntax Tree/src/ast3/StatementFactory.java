package ast3;

// Statement Factory lets user to create objects of Statement sub class
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
