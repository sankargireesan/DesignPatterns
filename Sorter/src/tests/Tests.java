package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import sorter.Sorter;
import sorter.TestClass;

public class Tests {
	/**
	 * Needs to implement createSorter() method
	 */
	public static <T extends Comparable<T>> Sorter<T> createSorter() {
	      return null;
	}
	
	// test with an empty Integer array
	@Test
	public void emptyIntegerArrayTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {};
		Integer[] sortedArray = {};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);  
	}
	
	// test with an Integer array with duplicates
	@Test
	public void integersArrayTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {2,4,10,3,12,4,6,8,3,12};
		Integer[] sortedArray = {2,3,3,4,4,6,8,10,12,12};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
	
	// test with an Integer array without duplicates
	@Test
	public void uniqueIntegesrArrayTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {2,4,10,3,12,6,8};
		Integer[] sortedArray = {2,3,4,6,8,10,12};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
	
	// test with a sorted Integer array
	@Test
	public void uniqueIntegersSortedAscArrayTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {2,4,6,8,10,12};
		Integer[] sortedArray = {2,4,6,8,10,12};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
	
	// test with an Integer array sorted in descending order
	@Test
	public void uniqueIntegersSortedDescArrayTest() {
		Sorter<Integer> sorter = createSorter();
		Integer [] intArray = {12,8,5,3,2};
		Integer[] sortedArray = {2,3,5,8,12};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
	
	// test with an Integer array with negative elements
	@Test
	public void uniqueNegIntegersArrayTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {-2,-4,-10,-6,-1};
		Integer[] sortedArray = {-10,-6,-4,-2,-1};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
	
	// test with an Integer array with positive and negative elements
	@Test
	public void mixIntegersArrayTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {-2,-4,10,-6,1};
		Integer[] sortedArray = {-6,-4,-2,1,10};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
	
	// test with an Integer array with null elements
	@Test
	public void ArrayWithNullTest() {
		Sorter<Integer> sorter = createSorter();
		Integer[] intArray = {-2,-4,10,null,-6,1,null};
		Integer[] sortedArray = {null,null,-6,-4,-2,1,10};
		sorter.sort(intArray);
		assertArrayEquals(intArray,sortedArray);
		
	}
	
	// test with a Character array
	@Test
	public void charArrayTest() {
		Sorter<Character> sorter = createSorter();
		Character[] charArray = {'a','c','z','e','k','m'};
		Character[] sortedArray = {'a','c','e','k','m','z'};
		sorter.sort(charArray);
		assertArrayEquals(charArray,sortedArray);
		
	}
	
	// test with sorted Character array 
	@Test
	public void sortedCharArrayTest() {
		Sorter<Character> sorter = createSorter();
		Character[] charArray = {'a','c','e','z'};
		Character[] sortedArray = {'a','c','e','z'};
		sorter.sort(charArray);
		assertArrayEquals(charArray,sortedArray);
		
	}
	
	// test with a Character array sorted in descending order
	@Test
	public void sortedDescCharArrayTest() {
		Sorter<Character> sorter = createSorter();
		Character [] charArray = {'z','e','c','a'};
		Character[] sortedArray = {'a','c','e','z'};
		sorter.sort(charArray);
		assertArrayEquals(charArray,sortedArray);
		
	}
	
	// test with String array
	@Test
	public void stringArrayTest() {
		Sorter<String> sorter = createSorter();
		String[] stringArray = {"abc","xyz","jkl","def"};
		String[] sortedArray = {"abc","def","jkl","xyz"};
		sorter.sort(stringArray);
		assertArrayEquals(stringArray,sortedArray);
		
	}
	
	// test with a sorted String array
	@Test
	public void sortedStringArrayTest() {
		Sorter<String> sorter = createSorter();
		String[] stringArray = {"abc","def","jkl","xyz"};
		String[] sortedArray = {"abc","def","jkl","xyz"};
		sorter.sort(stringArray);
		assertArrayEquals(stringArray,sortedArray);
	}
	
	// test with String array sorted in descending order
	@Test
	public void sortedDescStringArrayTest() {
		Sorter<String> sorter = createSorter();
		String[] stringArray = {"xyz","jkl","def","abc"};
		String[] sortedArray = {"abc","def","jkl","xyz"};
		sorter.sort(stringArray);
		assertArrayEquals(stringArray,sortedArray);
		
	}
	
	// test with Double sorted array
	@Test
	public void doubleSortedArrayTest() {
		Sorter<Double> sorter = createSorter();
		Double[] doubleArray = {1.01,2.02,3.03,4.04};
		Double[] sortedArray = {1.01,2.02,3.03,4.04};
		sorter.sort(doubleArray);
		assertArrayEquals(doubleArray,sortedArray);
		
	}
	
	// test with double unsorted array
	@Test
	public void doubleUnSortedArrayTest() {
		Sorter<Double> sorter = createSorter();
		Double[] doubleArray = {2.02,1.01,4.04,3.03};
		Double[] sortedArray = {1.01,2.02,3.03,4.04};
		sorter.sort(doubleArray);
		assertArrayEquals(doubleArray,sortedArray);
		
	}
	

	// test with double sorted in descending order
	@Test
	public void doubleDescSortedArrayTest() {
		Sorter<Double> sorter = createSorter();
		Double[] doubleArray = {4.04,3.03,2.02,1.01};
		Double[] sortedArray = {1.01,2.02,3.03,4.04};
		sorter.sort(doubleArray);
		assertArrayEquals(doubleArray,sortedArray);
		
	}
	
	// test with custom objects array
	@Test
	public void testClassArrayTest() {
		Sorter<TestClass> sorter = createSorter();
		TestClass [] testClassArray = {new TestClass(1,"abc"), new TestClass(2,"xyz"), new TestClass(3,"jkl"), new TestClass(4,"def")};
		TestClass[] sortedArray = {new TestClass(1,"abc"), new TestClass(4,"def"), new TestClass(3,"jkl"), new TestClass(2,"xyz") };
		sorter.sort(testClassArray);
		assertArrayEquals(testClassArray,sortedArray);
		
	}
	
	// test with custom objects array sorted
	@Test
	public void sortedTestClassArrayTest() {
		Sorter<TestClass> sorter = createSorter();
		TestClass [] testClassArray = {new TestClass(1,"abc"),new TestClass(3,"def"),new TestClass(2,"jkl"),new TestClass(4,"xyz")}; 
		TestClass[] sortedArray = {new TestClass(1,"abc"), new TestClass(3,"def"), new TestClass(2,"jkl"), new TestClass(4,"xyz") };
		sorter.sort(testClassArray);
		assertArrayEquals(testClassArray,sortedArray);
	}
	
	// test with custom objects array sorted in descending order
	@Test
	public void sortedDescTestClassArrayTest() {
		Sorter<TestClass> sorter = createSorter();
		TestClass [] testClassArray = {new TestClass(4,"xyz"),new TestClass(2,"jkl"),new TestClass(3,"def"),new TestClass(1,"abc")};
		TestClass[] sortedArray = {new TestClass(1,"abc"), new TestClass(3,"def"), new TestClass(2,"jkl"), new TestClass(4,"xyz") };
		sorter.sort(testClassArray);
		assertArrayEquals(testClassArray,sortedArray);
		
	}
	
	// test with empty object array
	@Test
	public void emptyTestClassArrayTest() {
		Sorter<TestClass> sorter = createSorter();
		TestClass[] testClassArray = {};
		TestClass[] sortedArray = {};
		sorter.sort(testClassArray);
		assertArrayEquals(testClassArray,sortedArray);
		
	}
}
