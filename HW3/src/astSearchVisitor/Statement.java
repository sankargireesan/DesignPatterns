package astSearchVisitor;

/**
 * Root of the statement sub hierarchy.  
 *
 */
public class Statement extends Node {

	  // calls visitor method of the particular object
	  public void accept(ASTNodeCountVisitor v){
			  v.visitor(this);
	  } 
}
