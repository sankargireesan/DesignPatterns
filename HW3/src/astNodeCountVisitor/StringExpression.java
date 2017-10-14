package astNodeCountVisitor;

/**
 * Represents a string literal expression.
 * @author franktip
 *
 */
public class StringExpression extends Expression {
  public StringExpression(String text){
    this.text = text;
  }
  
  @Override
  public String textualRepresentation() { 
    return "\"" + text + "\"";
  }
 
  private String text;
  
  // calls visitor method of the particular object
  public void accept(ASTNodeCountVisitor v){
		  v.visitor(this);
 } 
}
