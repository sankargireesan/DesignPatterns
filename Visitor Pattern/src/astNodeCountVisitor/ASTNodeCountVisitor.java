package astNodeCountVisitor;

public class ASTNodeCountVisitor implements ASTVisitor{

	private int _nrInfixExpression;
	private int _nrPrefixExpression;
	private int _nrNumberExpression;	
	private int _nrVariableExpression;
	private int _nrStringExpression;
	private int _nrDeclaration;
	private int _nrAssignment;
	private int _nrSequence;
	
	public ASTNodeCountVisitor(){
		_nrInfixExpression=0;
		_nrPrefixExpression=0;
		_nrNumberExpression=0;
		_nrVariableExpression=0;
		_nrStringExpression=0;
		_nrDeclaration=0;
		_nrAssignment=0;
		_nrSequence=0;
	}



	@Override
	public void visitor(InfixExpression i) {
		// TODO Auto-generated method stub
		_nrInfixExpression++;
	}

	@Override
	public void visitor(PrefixExpression p) {
		// TODO Auto-generated method stub
		_nrPrefixExpression++;
	}

	@Override
	public void visitor(NumberExpression n) {
		// TODO Auto-generated method stub
		_nrNumberExpression++;
	}

	@Override
	public void visitor(VariableExpression v) {
		// TODO Auto-generated method stub
		_nrVariableExpression++;
	}

	@Override
	public void visitor(StringExpression se) {
		// TODO Auto-generated method stub
		_nrStringExpression++;
	}

	@Override
	public void visitor(Declaration d) {
		// TODO Auto-generated method stub
		_nrDeclaration++;
	}

	@Override
	public void visitor(Assignment a) {
		// TODO Auto-generated method stub
		_nrAssignment++;
	}

	@Override
	public void visitor(Sequence seq) {
		// TODO Auto-generated method stub
		_nrSequence++;
	}
	
	@Override
	public void visitor(Expression expression) {
		// TODO Auto-generated method stub
		visitor(expression);
	}
	

	@Override
	public void visitor(Statement s) {
		// TODO Auto-generated method stub
		visitor(s);
	}
	
	public int get_nrExpression() {
		return (_nrInfixExpression+_nrPrefixExpression+_nrNumberExpression+_nrVariableExpression+_nrStringExpression);
	}

	
	
	public int get_nrStatement() {
		return (_nrDeclaration+_nrAssignment+_nrSequence);
	}

	
	public int get_nrInfixExpression() {
		return _nrInfixExpression;
	}



	public int get_nrPrefixExpression() {
		return _nrPrefixExpression;
	}



	public int get_nrNumberExpression() {
		return _nrNumberExpression;
	}



	public int get_nrVariableExpression() {
		return _nrVariableExpression;
	}



	public int get_nrStringExpression() {
		return _nrStringExpression;
	}



	public int get_nrDeclaration() {
		return _nrDeclaration;
	}



	public int get_nrAssignment() {
		return _nrAssignment;
	}



	public int get_nrSequence() {
		return _nrSequence;
	}




	
	 public void report(){
		 System.out.println("Expressions: " +
	 (_nrInfixExpression+_nrPrefixExpression+_nrNumberExpression+_nrVariableExpression+_nrStringExpression));
		 
		 System.out.println("InfixExpression: " + _nrInfixExpression);
		 System.out.println("PrefixExpression: " + _nrPrefixExpression);
		 System.out.println("NumberExpression: " + _nrNumberExpression);
		 System.out.println("VariableExpression: " + _nrVariableExpression);
		 System.out.println("StringExpression: " + _nrStringExpression);
		 
		 System.out.println("Staement: " + (_nrDeclaration+_nrAssignment+_nrSequence));
		 System.out.println("Declaration: " + _nrDeclaration);
		 System.out.println("Assignment: " + _nrAssignment);
		 System.out.println("Sequence: " + _nrSequence);
		 
	 }








}
