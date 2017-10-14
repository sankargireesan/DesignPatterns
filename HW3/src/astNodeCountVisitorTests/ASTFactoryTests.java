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
    Variable y = factory.createVariable("y");
    
    Expression one = factory.createNumberExpression(1); 
    Expression two = factory.createNumberExpression(2); 
    
    Operator plus = factory.createOperator("+");
    
    Expression exp1 = factory.createPrefixExpression(plus, one);
    Expression exp2 = factory.createPrefixExpression(plus, exp1);
    
    Statement decl1 = factory.createDeclaration(x);
    Statement decl2 = factory.createDeclaration(x);
    
    Statement assign1 = factory.createAssignment(y, exp2);
    Statement assign2 = factory.createAssignment(y, exp2);
    
    Statement seq = factory.createSequence(decl1, assign1); 
    Statement seq3 = factory.createSequence(decl2, assign2);     
    
    Expression exp3 = factory.createInfixExpression(plus, one, two);
    Expression exp4 = factory.createInfixExpression(plus, one, two);
    
    Expression varexp1 = factory.createVariableExpression(y);
    Expression varexp2 = factory.createVariableExpression(y);
    
    Expression stringexp1 = factory.createStringExpression("one");
    Expression stringexp2 = factory.createStringExpression("two");
    
    ASTNodeCountVisitor v = new ASTNodeCountVisitor();
    one.accept(v);
    two.accept(v);
    
    exp1.accept(v);
    exp2.accept(v);
    
    exp3.accept(v);
    exp4.accept(v);
    
    varexp1.accept(v);
    varexp2.accept(v);
    
    assign1.accept(v);
    assign2.accept(v);
    
    decl1.accept(v);
    decl2.accept(v);
    
    seq.accept(v);
    seq3.accept(v);
    
    stringexp1.accept(v);
    stringexp2.accept(v);
    
    
    v.report();
    
    assertEquals(v.get_nrExpression(), 10);
    assertEquals(v.get_nrStatement(), 6);
    assertEquals(v.get_nrInfixExpression(), 2);
    assertEquals(v.get_nrPrefixExpression(), 2);
    assertEquals(v.get_nrNumberExpression(), 2);
    assertEquals(v.get_nrVariableExpression(), 2);
    assertEquals(v.get_nrStringExpression(), 2);
    assertEquals(v.get_nrAssignment(), 2);
    assertEquals(v.get_nrDeclaration(), 2);
    assertEquals(v.get_nrSequence(), 2);
    
  }

  
  
}

