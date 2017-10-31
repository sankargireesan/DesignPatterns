package sorter;

/**
 * test class to check the behavior of sorter on objects 
 */
public class TestClass implements Comparable<TestClass>{
	int id;
	String name;
	public TestClass(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	/**
	 * need to override compareTo to make it compare objects name
	 */
	@Override
	public int compareTo(TestClass o) {
		return name.compareTo(o.name);
	}
	
	
	/**
	 * Overrides to make object equals function compare 
	 * contents of the object instead of the address
	 */
	@Override
	public boolean equals(Object o) {
		return (o instanceof TestClass 
				&& ((TestClass) o).id == this.id 
				&& ((TestClass) o).name.equals(this.name));
	}
	
}
