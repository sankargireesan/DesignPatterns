package astVisitorInterface;

import java.util.NoSuchElementException;

/**
 * Root of the AST Node hierarchy.  
 *
 */
public class Node {
	
	private int nodeId;
	private static int counter=0;
	private static Node[] nodeArr = new Node[1];
	
	public static Node[] getNodeArr() {
		return nodeArr;
	}


	public int getNodeArrLength() {
		return nodeArr.length;
	}


	/**
	 * Node Constructor will be called when new node is created
	 * It will check for array size and increases dynamically if it is full
	 * like an array list
	 */
	Node(){
		
		if(nodeArr==null || counter>=nodeArr.length)
			doubleArraySize();

		this.nodeId = counter;
		
		nodeArr[counter++] = this;
	}
	
	
	/**
	 * double the size of static node array
	 */
	public static void doubleArraySize() {
		Node temp[] = new Node[(nodeArr.length)*2];
		
		for(int i=0;i<nodeArr.length;i++)
			temp[i]=nodeArr[i];
		
		nodeArr=temp;
	}
	
	
	/**
	 * Returns unique identifier for each node.
	 */
	public int getId(){
		return nodeId;
	}
	
	

	/**
	 * Reverse mapping from Nodes to their unique identifiers
	 */
	public static Node getNode(int id) throws NoSuchElementException {
		
		for(Node n: nodeArr) {
			if(n.getId()==id)
				return n;
		}
		
		throw new NoSuchElementException();
		
	}

	
  /**
   * Generate textual representation for subtree rooted at this node. 
   */
  public String textualRepresentation() {
	  return this.textualRepresentation();
  }
  
}