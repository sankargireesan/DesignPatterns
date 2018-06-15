package astNodeCountVisitor;

/**
 * Represents a variable expression. 
 */
public class VariableExpression extends Expression {
  public VariableExpression(Variable var){
    this.var = var;
  }
  
  @Override
  public String textualRepresentation() {
    return var.getName();
  }
  
  private Variable var;
  
  
  
  // calls visitor method of the particular object
  public void accept(ASTNodeCountVisitor v){
		  v.visitor(this);
  } 
  
}
