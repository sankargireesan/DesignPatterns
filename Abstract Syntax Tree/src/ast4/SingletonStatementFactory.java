package ast4;

// SingletonStatementFactory extends LoggingExpressionFactory
// Only one object of SingletonStatementFactory exists at a time
public class SingletonStatementFactory extends LoggingStatementFactory {

    // a static object of SingletonStatementFactory class is used
    private static SingletonStatementFactory _theFactory= null;

    // constructor method is made private which stops user from creating other objects
    private SingletonStatementFactory(){}

    // instance() method check if SingletonStatementFactory object is already present.
    // If present, instance() method will return that object.
    // Else it will create a new object of type SingletonStatementFactory
    public static SingletonStatementFactory instance(){

        if(_theFactory==null)
            _theFactory = new SingletonStatementFactory();

        return _theFactory;
    }
}
