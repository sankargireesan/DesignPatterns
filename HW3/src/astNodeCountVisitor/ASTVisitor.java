package astNodeCountVisitor;

public interface ASTVisitor {
	
	void visitor(Expression e);
	void visitor(InfixExpression i);
	void visitor(PrefixExpression p);
	void visitor(NumberExpression n);
	void visitor(VariableExpression v);
	void visitor(StringExpression se);
	
	void visitor(Statement s);
	void visitor(Declaration d);
	void visitor(Assignment a);
	void visitor(Sequence seq);
	
}
