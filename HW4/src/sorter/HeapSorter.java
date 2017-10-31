package sorter;

/**
 * HeapSorter class implements heap sort as the sorting method
 * runtime: O(n.lgn)
 */
public class HeapSorter<T extends Comparable<T>> implements Sorter<T>{
	
	@Override
	public void sort(T[] list) {
		
		// length of the given array
        int n = list.length;
        
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(list, n, i);
        
        
        // extract max element and place it at the end
        for(int i=0; i<n;i++) {
        	swap(list, 0,n-i-1);
        	heapify(list,n-i-1,0);
        }
        
	}
	
	
    // To heapify a subtree rooted with node i which is
    // an index in T[] list. n is size of heap
    public <T extends Comparable<T>> void heapify(T[] list, int n, int i){
    	
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2
 
        // if largest is null, 
        // replace it to either left or right
        if(list[largest]==null) {
        	if(l<n &&  list[l]!=null)
        		largest=l;
        	else if(r<n && list[r]!=null)
        		largest=r;
        }
        	
        // If left child is larger than root
        if (l < n  && list[l]!=null && list[l].compareTo(list[largest])>=1)
        	largest = l;
 
        // If right child is larger than largest so far
        if (r < n && list[r]!=null && list[r].compareTo(list[largest])>=1)
        	largest = r;
    

        // If largest is not root
        if (largest != i){
        	swap(list, i,largest);
            // Recursively heapify the affected sub-tree
            heapify(list, n, largest);
        }
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
