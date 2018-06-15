package nodeSet;

/**
* Class NodeSet represents a set of AST Nodes.
*
*/
public class NodeSet implements Set<Node> {
	
	// adapter object of class BitVector
	private IBitVector adaptee = new BitVector();
	
	
	public IBitVector getAdaptee() {
		return this.adaptee;
	}
	
	/**
	 * Adds the given node to the set
	 */
	@Override 
	public void add(Node n){
		adaptee.set(n.getId());
	}
	
	
	/**
	 * Add all the given nodes to the set
	 */
	@Override 
	public void addAll(Set<Node> n){
	 
		Iterator<Node> it = n.iterator();
		while(it.hasAnotherElement()) {
			adaptee.set(it.nextElement().getId());
		}
	}
	
	
	/**
	 * Removes the given node from the set
	 */
	@Override 
	public void remove(Node n){ 
		adaptee.clear(n.getId());
	}
	
	/**
	 * Returns true if the given element is present in the set
	 */
	@Override 
	public boolean contains(Node n) { 
		return adaptee.get(n.getId());
	}
	
	
	/**
	 * returns the size of the set
	 */
	@Override public int size(){ 
		return adaptee.size();
	}
	
	/**
	 * Returns an iterator of type Node
	 */
	@Override 
	public Iterator<Node> iterator(){
		return new NodeSetIterator(this.adaptee);
	}
	
	@Override
	public String toString(){
		Iterator<Node> it = this.iterator();
		String result ="";
		while(it.hasAnotherElement()) {
			result= result+it.nextElement().textualRepresentation()+";";
		}
		
		return result;
	}
	
	/**
	 * 
	 * NodeSetIterator implements Iterator<Node>
	 * It helps in creating an iterator for NodeSet
	 *
	 */
	private class NodeSetIterator implements Iterator<Node>{

		// adapter to call bit vector methods
		private IBitVector adaptee;
		/**
		 * BitVector Iterator
		 */
		Iterator<Integer> it;
		/**
		 * Constructor receive an adapter and assign it to this object's adaptee
		 */
		NodeSetIterator(IBitVector adaptee){
			this.adaptee= adaptee;
			this.it = adaptee.iterator();
		}
		
	
		
		/**
		 * Returns true if another element is present
		 */
		@Override
		public boolean hasAnotherElement() {
			// TODO Auto-generated method stub
			return it.hasAnotherElement();
		}


		/**
		 * Returns next element in the node set
		 */
		@Override
		public Node nextElement() {
			// TODO Auto-generated method stub
			return Node.getNode(it.nextElement());
		}
	}
}