package iteratorBitVector;

public class BitVector implements IBitVector{

	public int[] numArray;
	private int maxSize = 31;
	
	public BitVector(){
		numArray = new int[1];
	}
	
	// getter method to get max size of array
	public int getMaxSize() {
		return maxSize;
	}
	
	// getter method to get number array
	public int[] getNumArray() {
		// TODO Auto-generated method stub
		return numArray;
	}
	
	/**
	 * Determine if the bit at position i is set.
	 */
	public boolean get(int i) {
		if(i>maxSize)
			return false;
		return getBit(numArray[i/32],i%32);
	}
	
	/**
	 *  Determines if the given bit of given number is '1'
	 */
	private boolean getBit(int num, int i){
		
		if(Integer.toBinaryString(num).length()==32) {
			String sb = Integer.toBinaryString(num).toString();
			return  (sb.charAt(32-i-1)=='1');
			
		}else{
			long newNum =(long) (Math.pow(2, 32)+num);
			String binStr = Long.toBinaryString(newNum).substring(1);
			return binStr.charAt(32-i-1)=='1';
		}
	}
	
	
	/**
	 * Set the bit at position i.
	 */
	public void set(int i) {
		// to handle the size of array dynamically
		if(i > maxSize) {
			maxSize = (i/32)*32+31;
			int newSize = (maxSize/32)+1;
			
			int[] newArray = new int[newSize];
			for(int j=0;j<newSize;j++) {
				// copy all elements to new array and sets new elements to zero
				if(j<numArray.length) {
					newArray[j]=numArray[j];
				}
			}
			numArray = newArray;
		}
		numArray[i/32] = setBit(numArray[i/32],i%32, '1');
	}
	
	
	/**
	 * Set the given character 'bit' at position i of the array element 'num'.
	 */
	private int setBit(int num, int i, char bit) {
		if(Integer.toBinaryString(num).length()==32) {
			StringBuffer sb = new StringBuffer(Integer.toBinaryString(num).toString());
			sb.setCharAt(32-i-1, bit);
			return   Integer.parseUnsignedInt(sb.toString(), 2);
		}else{
			long nextNum = (long) Math.pow(2, 32)+num;
			StringBuffer sb = new StringBuffer(Long.toBinaryString(nextNum).toString().substring(1));
			sb.setCharAt(32-i-1, bit);
			return   (int) Long.parseLong(sb.toString(), 2);
		}
	}
		
	
	/**
	 * Clear the bit at position i.
	 */
	public void clear(int i) {
		numArray[i/32] = setBit(numArray[i/32],i%32, '0');
	}
	
	
	
	/**
	 * Set the bits in the argument BitVector b.
	 */
	public void copy(BitVector b){
		Iterator<Integer> it = b.iterator();
 		while(it.hasAnotherElement()) {
 			this.set(it.nextElement());
 		}
 			
	}
	
	/**
	 * Determine the number of non-zero bits in the BitVector.
	 */
	public int size(){
		
		int sum = 0;
		for(int i: numArray) {
			sum+=Integer.bitCount(i);
		}
		
		return sum;
	}
	
	/**
	 * Iterator over the Integer values represented by this BitVector.
	 */
	public Iterator<Integer> iterator(){
		return new NumberIterator(this);
	}
	

	/**
	 * NumberIterator implements Iterator with Integer as generic
	 * It will help us extract the elements of the set which are stored as
	 * a single integer.
	 */
	private class NumberIterator implements Iterator<Integer>{

		private int[] numArray;
		private int counter =0;
		private int length; 
		
		NumberIterator(BitVector b){
			numArray = b.numArray;
			length = numArray.length*32-1;
		}
		
		
		@Override
		public boolean hasAnotherElement() {
			// TODO Auto-generated method stub
			if(counter <= length) {
				while(counter <= length) {
					if(get(counter)) {
						return true;
					}
					counter++;
				
				}
			}
			return false;
		}
		
		@Override
		public Integer nextElement() {
			// TODO Auto-generated method stub
			while(counter <= length) {
				if(get(counter)) {
					return counter++;
				}
				counter++;
			}
			return null;
		}
		
	}
	
}
