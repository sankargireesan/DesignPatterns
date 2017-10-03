package ast4;

public class SingletonExpressionFactory extends LoggingExpressionFactory {
    private static SingletonExpressionFactory _theFactory= null;

    private SingletonExpressionFactory(){}

    public static SingletonExpressionFactory instance(){

        if(_theFactory==null)
            _theFactory = new SingletonExpressionFactory();

        return _theFactory;
    }
}
