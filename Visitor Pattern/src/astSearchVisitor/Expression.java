package astSearchVisitor;

/**
 * Root of the expression sub hierarchy.  
 *
 */
public class Expression extends Node {
    
	
	  // calls visitor method of the particular object
	  public void accept(ASTNodeCountVisitor v){
			  this.accept(v);
	  } 
}
