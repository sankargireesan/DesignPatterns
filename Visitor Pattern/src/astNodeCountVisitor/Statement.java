package astNodeCountVisitor;

/**
 * Root of the statement sub hierarchy.  
 *
 */
public class Statement extends Node {

	  // calls visitor method of the particular object
	  public void accept(ASTNodeCountVisitor v){
			  this.accept(v);
	  } 
}
