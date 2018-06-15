package tests3;

import ast3.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AST3Tests {

    @Test
    public void test1(){

        LoggingExpressionFactory expFactory = new LoggingExpressionFactory();
        LoggingStatementFactory stmtFactory = new LoggingStatementFactory();

        Variable x = expFactory.makeVariable("x");
        Expression one = expFactory.makeNumberExpression(1);
        Expression two = expFactory.makeNumberExpression(2);
        Operator plus = expFactory.makeOperator("+");
        Expression exp = expFactory.makeInfixExpression(plus, one, two);
        Statement decl = stmtFactory.makeDeclaration(x);
        Statement assign = stmtFactory.makeAssignment(x, exp);
        Statement seq = stmtFactory.makeSequence(decl, assign);

        assertEquals("var x; x = 1+2",seq.textualRepresentation());
        String expectedOutput = "Total number of Expressions :3" +
                "\n number of InfixExpression :1" +
                "\n number of PrefixExpression :0" +
                "\n number of NumberExpression :2" +
                "\n number of VariableExpression :0" +
                "\n number of StringExpression :0";
        assertEquals(expectedOutput, expFactory.report());


        expectedOutput = "Total number of Statements :3" +
                "\n number of Declarations :1" +
                "\n number of Assignment :1"+
                "\n number of Sequence :1";
        assertEquals(expectedOutput, stmtFactory.report());



    }

    // Test for PrefixExpression
    @Test
    public void test2(){


        LoggingExpressionFactory expFactory = new LoggingExpressionFactory();
        LoggingStatementFactory  stmtFactory = new LoggingStatementFactory();

        Variable x =expFactory.makeVariable("x");
        Expression one =expFactory.makeNumberExpression(1);
        Expression two = expFactory.makeNumberExpression(2);
        Operator plus = expFactory.makeOperator("+");
        Operator minus = expFactory.makeOperator("-");
        PrefixExpression exp = expFactory.makePrefixExpression(minus, one, two);
        Statement decl = stmtFactory.makeDeclaration(x);
        Statement assign = stmtFactory.makeAssignment(x, exp);
        Statement seq = stmtFactory.makeSequence(decl, assign);

        assertEquals("Number of instances of Prefix Expression created :1",exp.report());
        PrefixExpression exp2 = expFactory.makePrefixExpression(minus, one, two);
        assertEquals("Number of instances of Prefix Expression created :2",exp.report());
        assertEquals("Number of instances of Prefix Expression created :2",exp2.report());

    }


    // Test for chaining two InfixExpression
    @Test
    public void test3(){
        LoggingExpressionFactory expFactory = new LoggingExpressionFactory();
        LoggingStatementFactory stmtFactory = new LoggingStatementFactory();

        Variable x = expFactory.makeVariable("x");
        Expression one = expFactory.makeNumberExpression(1);
        Expression two = expFactory.makeNumberExpression(2);
        Expression three = expFactory.makeNumberExpression(3);
        Operator plus = expFactory.makeOperator("+");
        Operator minus = expFactory.makeOperator("-");
        Expression exp = expFactory.makeInfixExpression(plus, one, two);
        Expression newExp = new InfixExpression(minus, exp, three);
        Statement decl = stmtFactory.makeDeclaration(x);
        Statement assign = stmtFactory.makeAssignment(x, newExp);
        Statement seq = stmtFactory.makeSequence(decl, assign);
        assertEquals("var x; x = 1+2-3",seq.textualRepresentation());
    }


    // Test for StringExpression
    @Test
    public void test4(){
        LoggingExpressionFactory expFactory = new LoggingExpressionFactory();

        StringExpression name = expFactory.makeStringExpression("UserName");
        assertEquals("Number of instances of String Expression created :1",name.report());

        StringExpression address= expFactory.makeStringExpression("Address");
        assertEquals("Number of instances of String Expression created :2",name.report());
        assertEquals("Number of instances of String Expression created :2",address.report());

    }
}
