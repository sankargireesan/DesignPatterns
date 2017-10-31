package sorter;

/**
 * QuickSorter class implements quick sort as the sorting method
 * runtime: O(n.lgn)
 * partitioner: random
 */

public class QuickSorter<T extends Comparable<T>> implements Sorter<T>{

	@Override
	public void sort(T[] list) {
		
		quickSort(list, 0, list.length-1);
	}
	
	/**
	 * calls quick sort the the given array recursively
	 */
	public <T extends Comparable<T>> void quickSort(T[] list, int start, int end) {
		
		if(start < end) {
			int p = partition(list, start,end);
			quickSort(list,start,p-1);
			quickSort(list,p+1,end);
		}
	}
	
	
	/**
	 * partition the given array from the index start to end
	 * use random function to generate partitioner index
	 * 
	 */
	public <T extends Comparable<T>> int partition(T[] list, int start, int end) {
		
		// generating partitioner index
		int p = (int) (Math.floor(Math.random()*(end-start+1)+start));
		
		// swap it to last element
		swap(list, p, end);
		
		
		int i = start-1;
		
		// compare the other element with the pivot element
		for(int j = start; j < end;j++)
			if(list[j] == null 
			|| (list[end] !=null 
			&& list[j].compareTo(list[end]) < 0))
				swap(list,++i,j);
			
		// place the pivot element such a away that it
		// divides the array to two parts
		swap(list, ++i, end);
		
		// return pivot index
		return i;
		
	}
	
	
    /**
     * elements at index @param p and @param q of the @param list is swapped 
     */
	public  <T extends Comparable<T>> void swap(T[] list, int p , int q) {
		T temp = list[p];
		list[p]=list[q];
		list[q]=temp;
	}
	

}
