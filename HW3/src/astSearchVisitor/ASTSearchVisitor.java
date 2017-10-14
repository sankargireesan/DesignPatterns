package astSearchVisitor;

/**
 * 
 * ASTSearchVisitor Class extends all methods from class ASTNodeCountVisitor
 * Two Visitor methods are overridden in this class
 */
public class ASTSearchVisitor extends ASTNodeCountVisitor implements ASTVisitor {

	private NodeSet allNode;
	
	public ASTSearchVisitor() {
		allNode = new NodeSet();
	}
	
	
	//calls super visitor method after updating it to the NodeSet allNode
	@Override
	public void visitor(Declaration d) {
		// TODO Auto-generated method stub
		allNode.add(d);
		super.visitor(d);
		
	}

	// calls super visitor method after updating it to the NodeSet allNode
	@Override
	public void visitor(Assignment a) {
		// TODO Auto-generated method stub
		allNode.add(a);
		super.visitor(a);
	}

	/**
	 * returns Set of assignments and declaration nodes 
	 * containing a variable with name as the specified name
	 * allNode will only contain Assignment and Declaration in it.
	 */
	public NodeSet searchVariable(String name) {
		NodeSet result = new NodeSet();
		
		Iterator<Node> it = allNode.iterator();
		while(it.hasAnotherElement()) {
			Node n = it.nextElement();
			String varName="";
			if(n instanceof Declaration) 
				varName = ((Declaration)n).getVar().getName();
						
			else if(n instanceof Assignment)
				varName = ((Assignment)n).getVar().getName();
			
			
			if(name.equals(varName))
				result.add(n);
		}
		
		return result;
	}
	
}
