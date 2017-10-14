package astNodeCountVisitor;

/**
 * Root of the expression sub hierarchy.  
 *
 */
public class Expression extends Node {
    
	
	  // calls visitor method of the particular object
	  public void accept(ASTNodeCountVisitor v){
			  v.visitor(this);
	  } 
}
