package astSearchVisitor;

/**
 * Represents an assignment statement  
 */
public class Assignment extends Statement {
  public Assignment(Variable var, Expression exp){
    this.var = var;
    this.exp = exp;
  }
  
  // getter method
  public Variable getVar() {
	return var;
  }
  
  @Override
  public String textualRepresentation(){
    return var.getName() + " = " + exp.textualRepresentation();
  } 
  
  private Variable var;
  private Expression exp;
  
  
  // calls visitor method of the particular object
  public void accept(ASTNodeCountVisitor v){
		  v.visitor(this);
		  exp.accept(v);
 } 
  
}
