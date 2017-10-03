package ast4;

// StatementFactory class help to create objects of Statement subclass
public class StatementFactory {

    // Calls constructor of Declaration class
    public Declaration makeDeclaration(Variable newVariable){
        return new Declaration(newVariable);
    }

    // Calls constructor of Assignment class
    public Assignment makeAssignment(Variable newVariable, Expression exp){
        return new Assignment(newVariable, exp);
    }

    // Calls constructor of Sequence class
    public Sequence makeSequence(Statement first, Statement sec){
        return new Sequence(first, sec);
    }
}
