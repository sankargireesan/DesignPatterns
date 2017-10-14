package nodeSetTests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import nodeSet.*;

public class NodeSetTests {
  
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

  @Test
  public void test5(){
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
    NodeSet ns = new NodeSet();
    
    ns.add(one);
    ns.add(exp1);
    ns.add(exp2);
    ns.add(decl);
    
    assertEquals(ns.contains(Node.getNode(decl.getId())), true);
  }
  
  @Test
  public void test6(){
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
    NodeSet ns = new NodeSet();
    
    ns.add(one);
    ns.add(exp1);
    ns.add(exp2);
    ns.add(decl);
    ns.remove(decl);
    assertEquals(ns.size(),3);
    assertEquals(ns.contains(Node.getNode(decl.getId())), false);
  }
  
  
  @Test
  public void test7(){
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
    NodeSet ns = new NodeSet();
    NodeSet ns2 = new NodeSet();
    ns.add(one);
    ns.add(exp1);
    ns.add(exp2);
    ns.add(decl);

    Iterator<Node> it = ns.iterator();
    
    while(it.hasAnotherElement())
    	ns2.add(it.nextElement());
    
    assertEquals(ns2.size(),ns.size());
  }
  
  
  @Test
  public void test8(){
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
    NodeSet ns = new NodeSet();
    NodeSet ns2 = new NodeSet();
    ns.add(one);
    ns.add(exp1);
    ns.add(exp2);
    ns.add(decl);
    
    ns2.addAll(ns);
    assertEquals(ns2.size(),ns.size());
  }
  
  @Test
  public void test9(){
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
    NodeSet ns = new NodeSet();

    ns.add(one);
    ns.add(exp1);
    ns.add(exp2);
    ns.add(decl);
    
    assertEquals(ns.toString(),"1;+1;++1;var x;");
  }
  
  
}