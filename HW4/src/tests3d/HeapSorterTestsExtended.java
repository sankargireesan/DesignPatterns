package tests3d;
/**
 * Test suite to be used in CS5500 Homework 4, question 3.
 */
 
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import sorter.Sorter;
import professorsTests.SampleHeapSorterTests;

/**
 * Extends and adds more test case to achieve 100 % test coverage
 */
public class HeapSorterTestsExtended extends SampleHeapSorterTests {
  
   // test with multiple null values to make largest in heapify method null
   @Test
   public void ArrayWithSomeNullTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {-2,-4,10,null,-6,1,null};
		Integer[] sortedArray = {null,null,-6,-4,-2,1,10};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
	
   // test with largest and left as null inside method heapify
	@Test
	public void ArrayWithNullTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {2,8,4,null,null,1,9,10};
		Integer[] sortedArray = {null,null,1,2,4,8,9,10};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
	
	// test which has largest, left and right as null inisde method heapify
	@Test
	public void ArrayWithFewNullTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {2,8,4,null,null,null,9,10};
		Integer[] sortedArray = {null,null,null,2,4,8,9,10};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
}