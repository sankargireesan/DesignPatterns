package ast4;

public class SingletonStatementFactory extends LoggingStatementFactory {
    private static SingletonStatementFactory _theFactory= null;

    private SingletonStatementFactory(){}

    public static SingletonStatementFactory instance(){

        if(_theFactory==null)
            _theFactory = new SingletonStatementFactory();

        return _theFactory;
    }
}
