package astSearchVisitorTests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import astSearchVisitor.*;

public class ASTSearchVisitorTests {
  
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
    Statement assign2 = factory.createAssignment(x, exp2);
    
    Statement seq = factory.createSequence(decl1, assign1); 
    Statement seq3 = factory.createSequence(decl2, assign2);     
    
    Expression exp3 = factory.createInfixExpression(plus, one, two);
    Expression exp4 = factory.createInfixExpression(plus, one, two);
    
    Expression varexp1 = factory.createVariableExpression(y);
    Expression varexp2 = factory.createVariableExpression(y);
    
    Expression stringexp1 = factory.createStringExpression("one");
    Expression stringexp2 = factory.createStringExpression("two");
    
    ASTSearchVisitor v = new ASTSearchVisitor();
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
    
    NodeSet result = v.searchVariable("x");
    NodeSet result2 = v.searchVariable("y");
    NodeSet result3 = v.searchVariable("nothing");
    
    

    
    //uncomment for iterating through the result
//    Iterator<Node> it = result.iterator();
//    while(it.hasAnotherElement())
//    	System.out.println(it.nextElement().textualRepresentation());
    
    Iterator<Node> it = result2.iterator();
    Node n =it.nextElement();
    
    
    assertEquals(result.size(),3);
    
    // only one y is present
    assertEquals(result2.size(),1);
    
    // it should give an empty NodeSet
    assertEquals(result3.size(),0);
    
    // check if elements have same id
    assertEquals(n.getId(),assign1.getId());
    
    // Verify using textual representation
    assertEquals(n.textualRepresentation(),"y = ++1");
    
    
  }

  
  @Test
  public void test5(){
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
    Statement assign2 = factory.createAssignment(x, exp2);
    
    Statement seq = factory.createSequence(decl1, assign1); 
    Statement seq3 = factory.createSequence(decl2, assign2);     
    
    Expression exp3 = factory.createInfixExpression(plus, one, two);
    Expression exp4 = factory.createInfixExpression(plus, one, two);
    
    Expression varexp1 = factory.createVariableExpression(y);
    Expression varexp2 = factory.createVariableExpression(y);
    
    Expression stringexp1 = factory.createStringExpression("one");
    Expression stringexp2 = factory.createStringExpression("two");
    
    ASTSearchVisitor v = new ASTSearchVisitor();
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
    
    NodeSet result = v.searchVariable("x");
    NodeSet result2 = v.searchVariable("y");
    NodeSet result3 = v.searchVariable("nothing");
    
    

    
    //uncomment for iterating through the result
//    Iterator<Node> it = result.iterator();
//    while(it.hasAnotherElement())
//    	System.out.println(it.nextElement().textualRepresentation());
    
    Iterator<Node> it = result2.iterator();
    Node n =it.nextElement();
    
    
    assertEquals(result.size(),3);
    
    // only one y is present
    assertEquals(result2.size(),1);
    
    // it should give an empty NodeSet
    assertEquals(result3.size(),0);
    
    // check if elements have same id
    assertEquals(n.getId(),assign1.getId());
    
    // Verify using textual representation
    assertEquals(n.textualRepresentation(),"y = ++1");
    
    
  }
  
  

  @Test
  public void test6(){
    Variable x = factory.createVariable("x");
    Expression one = factory.createNumberExpression(1); 
    Operator plus = factory.createOperator("+");
    Expression exp1 = factory.createPrefixExpression(plus, one);
    Expression exp2 = factory.createPrefixExpression(plus, exp1);
    Statement decl = factory.createDeclaration(x);
    Statement assign = factory.createAssignment(x, exp2);
    Statement seq = factory.createSequence(decl, assign); 
    
    ASTSearchVisitor v = new ASTSearchVisitor();
    
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
  public void test7(){
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
    
    ASTSearchVisitor v = new ASTSearchVisitor();
    
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
  
  @Test
  public void test8(){
    Variable x = factory.createVariable("x");
    Expression one = factory.createNumberExpression(1); 
    Operator plus = factory.createOperator("+");
    Expression exp1 = factory.createPrefixExpression(plus, one);
    Expression exp2 = factory.createPrefixExpression(plus, exp1);
    Statement decl = factory.createDeclaration(x);
    Statement assign = factory.createAssignment(x, exp2);
    Statement seq = factory.createSequence(decl, assign); 
    
    ASTSearchVisitor v = new ASTSearchVisitor();
    
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
  
  
  NodeSet result = v.searchVariable("x");
  NodeSet result2 = v.searchVariable("y");

  
  // declaration and assignment will be present
  assertEquals(result.size(),2);
  
  assertEquals(result2.size(),0);

    
  }

}


