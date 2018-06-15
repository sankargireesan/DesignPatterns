package astNodeCountVisitor;

/**
 * Represents a sequence a statements.
 */
public class Sequence extends Statement {
  public Sequence(Statement stat1, Statement stat2){
    this.stat1 = stat1;
    this.stat2 = stat2;
  }
  
  @Override
  public String textualRepresentation() {
    return stat1.textualRepresentation() + "; " + stat2.textualRepresentation();
  }
  
  private Statement stat1;
  private Statement stat2;
  
  
  // calls visitor method of the particular object
  public void accept(ASTNodeCountVisitor v){
		  v.visitor(this);
		  stat1.accept(v);
		  stat2.accept(v);
 } 
}
