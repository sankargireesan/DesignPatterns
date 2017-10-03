package tests4;
import ast4.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AST4Tests {

    // Checking the functionality of the program using the new Singleton     factory class
    @Test
    public void test1() {

        SingletonExpressionFactory expFactory =  SingletonExpressionFactory.instance();
        SingletonStatementFactory stmtFactory = SingletonStatementFactory.instance();



        Variable x = expFactory.makeVariable("x");
        Expression one = expFactory.makeNumberExpression(1);
        Expression two = expFactory.makeNumberExpression(2);
        Operator plus = expFactory.makeOperator("+");
        Expression exp = expFactory.makeInfixExpression(plus, one, two);

        //one declaration is created
        Statement decl = stmtFactory.makeDeclaration(x);

        // two assignments are created
        Statement assign = stmtFactory.makeAssignment(x, exp);
        Statement assign2 = stmtFactory.makeAssignment(x, exp);
        Statement seq = stmtFactory.makeSequence(decl, assign);
        assertEquals("var x; x = 1+2", seq.textualRepresentation());

        String expectedOutput = "Total number of Expressions :3" +
                "\n number of InfixExpression :1" +
                "\n number of PrefixExpression :0" +
                "\n number of NumberExpression :2" +
                "\n number of VariableExpression :0" +
                "\n number of StringExpression :0";
        assertEquals(expectedOutput, expFactory.report());


        expectedOutput = "Total number of Statements :4" +
                "\n number of Declarations :1" +
                "\n number of Assignment :2" +
                "\n number of Sequence :1";
        assertEquals(expectedOutput, stmtFactory.report());


    }


    // Checking if the only one Instance of Expression Factory and Statement Factory is created
    @Test
    public void test2(){

        // Creating one object of each factory
        SingletonExpressionFactory expFactory =  SingletonExpressionFactory.instance();
        SingletonStatementFactory stmtFactory = SingletonStatementFactory.instance();

        // When trying to assign an object of a singleton class, it should provide the old class
        SingletonExpressionFactory expFactory2 =  SingletonExpressionFactory.instance();
        SingletonStatementFactory stmtFactory2 = SingletonStatementFactory.instance();

        // AssertEquals check if both the objects are same
        assertEquals(expFactory, expFactory2);
        assertEquals(stmtFactory, stmtFactory2);

    }
}
