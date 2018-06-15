package ast_factory;

import static org.junit.Assert.assertEquals;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StandardASTFactory factory = new StandardASTFactory();
			    Variable x = factory.createVariable("x");
			    Expression one = factory.createNumberExpression(1);
			    Expression two = factory.createNumberExpression(2);
			    Operator plus = factory.createOperator("+");
			    Expression exp = factory.createInfixExpression(plus, one, two);
			    Statement decl = factory.createDeclaration(x);
			    Statement assign = factory.createAssignment(x, exp);
			    Statement seq = factory.createSequence(decl, assign); 
			    assertEquals(seq.textualRepresentation(), "var x; x = 1+2");

		  
	}

}
