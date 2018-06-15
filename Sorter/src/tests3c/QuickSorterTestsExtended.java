package tests3c;
import static org.junit.Assert.*;
import org.junit.Test;
import sorter.Sorter;
import tests2.QuickSorterTests;

public class QuickSorterTestsExtended extends QuickSorterTests{
	
	// test with pivot element as null
	@Test
	public void ArrayWithOneNonNullTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {null,null,-2};
		Integer[] sortedArray = {null,null,-2};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
}
