package astNodeCountVisitor;

/**
 * Represents a variable declaration  
 */
public class Declaration extends Statement {
   public Declaration(Variable var){
     this.var = var;
   }
   
   @Override
   public String textualRepresentation() {
     return "var " + var.getName();
   }
   
   private Variable var;  
   
   // calls visitor method of the particular object
   public void accept(ASTNodeCountVisitor v){
		  v.visitor(this);
  } 
}
