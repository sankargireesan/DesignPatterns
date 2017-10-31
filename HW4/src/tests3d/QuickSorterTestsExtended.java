package tests3d;
/**
 * Test suite to be used in CS5500 Homework 4, question 3.
 */
 
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import professorsTests.SampleQuickSorterTests;
import sorter.Sorter;

/**
 * Extends and adds more test case to achieve 100 % test coverage
 */
public class QuickSorterTestsExtended extends SampleQuickSorterTests{
  
	// test to check with list end element null
    @Test
	public void ArrayWithOneNonNullTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {null,-2};
		Integer[] sortedArray = {null,-2};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
  
}