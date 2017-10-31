package tests3c;
import static org.junit.Assert.*;
import org.junit.Test;
import sorter.Sorter;
import tests2.HeapSorterTests;
/**
 * Extends HeapSorterTests to obtain 100 % statement coverage and branch coverage
 */
public class HeapSorterTestsExtended extends HeapSorterTests{
	
	// test with array with null elements as the largest and left as null inside method heapify
	// but right is not null
	@Test
	public void ArrayWithNullTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {2,8,4,null,null,1,9,10};
		Integer[] sortedArray = {null,null,1,2,4,8,9,10};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
	
	// test case with largest, left, right as null inside method heapify
	@Test
	public void ArrayWithFewNullTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {2,8,4,null,null,null,9,10};
		Integer[] sortedArray = {null,null,null,2,4,8,9,10};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
}
