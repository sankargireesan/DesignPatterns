package astNodeCountVisitor;
 
/**
 * Represents a unary prefix expression. 
 */
public class PrefixExpression extends Expression {

  public PrefixExpression(Operator operator, Expression operand){
    this.operator = operator;
    this.operand = operand;
  }
  
  @Override
  public String textualRepresentation() {
   return operator.getOperator() + operand.textualRepresentation();
  }

  private Operator operator;
  private Expression operand;
  
  // calls visitor method of the particular object
  public void accept(ASTNodeCountVisitor v){
		  v.visitor(this);
 }
  
}
