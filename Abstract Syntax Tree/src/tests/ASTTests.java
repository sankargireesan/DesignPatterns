package tests;
import ast.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ASTTests {

    // Test for InfixExpression
    @Test
    public void test1(){
        Variable x = new Variable("x");
        Expression one = new NumberExpression(1);
        Expression two = new NumberExpression(2);
        Operator plus = new Operator("+");
        Expression exp = new InfixExpression(plus, one, two);
        Statement decl = new Declaration(x);
        Statement assign = new Assignment(x, exp);
        Statement seq = new Sequence(decl, assign);
        assertEquals("var x; x = 1+2",seq.textualRepresentation());
    }


    // Test for PrefixExpression
    @Test
    public void test2(){
        Variable x = new Variable("x");
        Expression one = new NumberExpression(1);
        Expression two = new NumberExpression(2);
        Operator plus = new Operator("+");
        Operator minus = new Operator("-");
        Expression exp = new PrefixExpression(minus, one, two);
        Statement decl = new Declaration(x);
        Statement assign = new Assignment(x, exp);
        Statement seq = new Sequence(decl, assign);
        assertEquals("var x; x = -12",seq.textualRepresentation());
    }


    // Test for chaining two InfixExpression
    @Test
    public void test3(){
        Variable x = new Variable("x");
        Expression one = new NumberExpression(1);
        Expression two = new NumberExpression(2);
        Expression three = new NumberExpression(3);
        Operator plus = new Operator("+");
        Operator minus = new Operator("-");
        Expression exp = new InfixExpression(plus, one, two);
        Expression newExp = new InfixExpression(minus, exp, three);
        Statement decl = new Declaration(x);
        Statement assign = new Assignment(x, newExp);
        Statement seq = new Sequence(decl, assign);
        assertEquals("var x; x = 1+2-3",seq.textualRepresentation());
    }


    // Test for Statement
    @Test
    public void test4(){
        Variable x = new Variable("Name");
        Expression name = new StringExpression("UserName");
        Statement decl = new Declaration(x);
        Statement assign = new Assignment(x, name);
        Statement seq = new Sequence(decl, assign);
        assertEquals("var Name; Name = UserName",seq.textualRepresentation());
    }
}
