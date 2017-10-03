package tests2;

import ast2.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

public class AST2Tests {

    @Test
    public void test1() {

        ExpressionFactory expFactory = new ExpressionFactory();
        StatementFactory stmtFactory = new StatementFactory();

        Variable x = expFactory.makeVariable("x");
        Expression one = expFactory.makeNumberExpression(1);
        Expression two = expFactory.makeNumberExpression(2);
        Operator plus = expFactory.makeOperator("+");
        Expression exp = expFactory.makeInfixExpression(plus, one, two);
        Statement decl = stmtFactory.makeDeclaration(x);
        Statement assign = stmtFactory.makeAssignment(x, exp);
        Statement seq = stmtFactory.makeSequence(decl, assign);
        assertEquals(seq.textualRepresentation(), "var x; x = 1+2");
    }

    // Test for PrefixExpression
    @Test
    public void test2(){


        ExpressionFactory expFactory = new ExpressionFactory();
        StatementFactory stmtFactory = new StatementFactory();

        Variable x =expFactory.makeVariable("x");
        Expression one =expFactory.makeNumberExpression(1);
        Expression two = expFactory.makeNumberExpression(2);
        Operator plus = expFactory.makeOperator("+");
        Operator minus = expFactory.makeOperator("-");
        Expression exp = expFactory.makePrefixExpression(minus, one, two);
        Statement decl = stmtFactory.makeDeclaration(x);
        Statement assign = stmtFactory.makeAssignment(x, exp);
        Statement seq = stmtFactory.makeSequence(decl, assign);
        assertEquals("var x; x = -12",seq.textualRepresentation());
    }


    // Test for chaining two InfixExpression
    @Test
    public void test3(){
        ExpressionFactory expFactory = new ExpressionFactory();
        StatementFactory stmtFactory = new StatementFactory();

        Variable x = expFactory.makeVariable("x");
        Expression one = expFactory.makeNumberExpression(1);
        Expression two = expFactory.makeNumberExpression(2);
        Expression three = expFactory.makeNumberExpression(3);
        Operator plus = expFactory.makeOperator("+");
        Operator minus = expFactory.makeOperator("-");
        Expression exp = expFactory.makeInfixExpression(plus, one, two);
        Expression newExp = expFactory.makeInfixExpression(minus, exp, three);
        Statement decl = stmtFactory.makeDeclaration(x);
        Statement assign = stmtFactory.makeAssignment(x, newExp);
        Statement seq = stmtFactory.makeSequence(decl, assign);
        assertEquals("var x; x = 1+2-3",seq.textualRepresentation());
    }


    // Test for Statement
    @Test
    public void test4(){
        ExpressionFactory expFactory = new ExpressionFactory();
        StatementFactory stmtFactory = new StatementFactory();

        Variable x = expFactory.makeVariable("Name");
        Expression name = expFactory.makeStringExpression("UserName");
        Statement decl = stmtFactory.makeDeclaration(x);
        Statement assign = stmtFactory.makeAssignment(x, name);
        Statement seq = stmtFactory.makeSequence(decl, assign);
        assertEquals("var Name; Name = UserName",seq.textualRepresentation());
    }

}
