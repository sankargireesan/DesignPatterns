package astVisitorInterface;

/**
 * Represents a variable 
 */
public class Variable {
  public Variable(String name){
    this.name = name;
  }
  
  public String getName(){
    return name;
  }
  
  private String name;
}
