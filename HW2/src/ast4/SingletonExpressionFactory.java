package ast4;

// SingletonExpressionFactory extends LoggingExpressionFactory
// Only one object of SingletonExpressionFactory exists at a time
public class SingletonExpressionFactory extends LoggingExpressionFactory {

    // a static object of SingletonExpressionFactory class is used
    private static SingletonExpressionFactory _theFactory= null;

    // constructor method is made private which stops user from creating other objects
    private SingletonExpressionFactory(){}

    // instance() method check if SingletonExpressionFactory object is already present.
    // If present, instance() method will return that object.
    // Else it will create a new object of type SingletonExpressionFactory
    public static SingletonExpressionFactory instance(){

        if(_theFactory==null)
            _theFactory = new SingletonExpressionFactory();

        return _theFactory;
    }
}
