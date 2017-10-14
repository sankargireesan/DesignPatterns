package astNodeCountVisitorTests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import astNodeCountVisitor.*;

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
    Expression one = factory.createNumberExpression(1); 
    Operator plus = factory.createOperator("+");
    Expression exp1 = factory.createPrefixExpression(plus, one);
    Expression exp2 = factory.createPrefixExpression(plus, exp1);
    Statement decl = factory.createDeclaration(x);
    Statement assign = factory.createAssignment(x, exp2);
    Statement seq = factory.createSequence(decl, assign); 
    
    ASTNodeCountVisitor v = new ASTNodeCountVisitor();
    
    seq.accept(v);
//    v.report();
    
  assertEquals(v.get_nrExpression(), 3);

  assertEquals(v.get_nrInfixExpression(), 0);
  assertEquals(v.get_nrPrefixExpression(), 2);
  assertEquals(v.get_nrNumberExpression(), 1);
  assertEquals(v.get_nrVariableExpression(), 0);
  assertEquals(v.get_nrStringExpression(), 0);
  assertEquals(v.get_nrStatement(), 3);
  assertEquals(v.get_nrAssignment(), 1);
  assertEquals(v.get_nrDeclaration(), 1);
  assertEquals(v.get_nrSequence(), 1);
    
  }
  
  
  @Test
  public void test5(){
    Variable x = factory.createVariable("x");
    Expression one = factory.createNumberExpression(1); 
    Operator plus = factory.createOperator("+");
    Expression exp1 = factory.createPrefixExpression(plus, one);
    Expression exp2 = factory.createPrefixExpression(plus, exp1);
    Statement decl = factory.createDeclaration(x);
    Statement assign = factory.createAssignment(x, exp2);
    Statement seq = factory.createSequence(decl, assign); 
    assertFalse(exp2.getId() == exp1.getId());
    
    
    Variable y = factory.createVariable("x");
    Expression two= factory.createNumberExpression(2); 
    Operator minus = factory.createOperator("-");
    Expression strexp = factory.createStringExpression("test");
    Expression exp3 = factory.createPrefixExpression(minus, two);
    Expression exp4 = factory.createPrefixExpression(minus, exp3);
    Expression exp5 = factory.createInfixExpression(minus, exp4, strexp);
    Statement decl2 = factory.createDeclaration(y);
    Statement assign2 = factory.createAssignment(y, exp5);
    Statement seq2 = factory.createSequence(decl2, assign2); 
    
    ASTNodeCountVisitor v = new ASTNodeCountVisitor();
    
    seq.accept(v);
    seq2.accept(v);
//    v.report();
    
  assertEquals(v.get_nrExpression(), 8);
  assertEquals(v.get_nrInfixExpression(), 1);
  assertEquals(v.get_nrPrefixExpression(), 4);
  assertEquals(v.get_nrNumberExpression(), 2);
  assertEquals(v.get_nrVariableExpression(), 0);
  assertEquals(v.get_nrStringExpression(), 1);
  assertEquals(v.get_nrStatement(), 6);
  assertEquals(v.get_nrAssignment(), 2);
  assertEquals(v.get_nrDeclaration(), 2);
  assertEquals(v.get_nrSequence(), 2);
    
  }
  
}


