package ast_factoryTests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ast_factory.Expression;
import ast_factory.Node;
import ast_factory.Operator;
import ast_factory.Statement;
import ast_factory.Variable;
import ast_factory.AbstractASTFactory;
import ast_factory.StandardASTFactory;

public class ASTFactoryTests {
  
  private static AbstractASTFactory factory;
  
  @BeforeClass 
  public static void setUpClass() {      
      factory = new StandardASTFactory();
  }
  
  @Test
  public void test1(){
    Variable x = factory.createVariable("x");
    
    Expression one = factory.createNumberExpression(1);
    Expression two = factory.createNumberExpression(2);
    
    // array size became two. Dynamically increasing size 
    assertEquals(2,one.getNodeArrLength());
    
    Operator plus = factory.createOperator("+");
    Expression exp = factory.createInfixExpression(plus, one, two);
    Statement decl = factory.createDeclaration(x);
    Statement assign = factory.createAssignment(x, exp);
    Statement seq = factory.createSequence(decl, assign); 
    assertEquals(8,seq.getNodeArrLength());
  }
  
  @Test
  public void test2(){
    Variable x = factory.createVariable("x");
    Expression one = factory.createNumberExpression(1); 
    Operator plus = factory.createOperator("+");
    Expression exp = factory.createPrefixExpression(plus, one);
    Statement decl = factory.createDeclaration(x);
    Statement assign = factory.createAssignment(x, exp);
    Statement seq = factory.createSequence(decl, assign); 
    assertEquals(seq.textualRepresentation(), "var x; x = +1");
  }
  
  @Test
  public void test3(){
    Variable x = factory.createVariable("x");
    Expression one = factory.createNumberExpression(1); 
    Operator plus = factory.createOperator("+");
    Expression exp1 = factory.createPrefixExpression(plus, one);
    Expression exp2 = factory.createPrefixExpression(plus, exp1);
    Statement decl = factory.createDeclaration(x);
    Statement assign = factory.createAssignment(x, exp2);
    Statement seq = factory.createSequence(decl, assign); 
    assertFalse(exp2.getId() == exp1.getId());
  }
  
  @Test
  public void test4(){
    Variable x = factory.createVariable("x");
    Variable y = factory.createVariable("y");
    Expression one = factory.createNumberExpression(1); 
    Operator plus = factory.createOperator("+");
    Expression exp1 = factory.createPrefixExpression(plus, one);
    Expression exp2 = factory.createPrefixExpression(plus, exp1);
    Statement decl = factory.createDeclaration(x);
    Statement assign = factory.createAssignment(y, exp2);
    Statement seq = factory.createSequence(decl, assign); 

    int id = seq.getId();
    Node seq2 = Node.getNode(id);
    
    assertEquals(seq, seq2);
  }

  
  
}