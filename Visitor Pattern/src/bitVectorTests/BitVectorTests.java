package bitVectorTests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import bitVector.*;


public class BitVectorTests {
	 
	// test for set(i)
    @Test
    public void test1(){
    	BitVector b = new BitVector();
    	
    	b.set(31);
    	b.set(0);
    	b.set(15);
    	b.set(5);
    	b.set(20);
    	
    	assertEquals("10000000000100001000000000100001",Integer.toBinaryString(b.getNumArray()[0]));
    }
	
	// test for clear()
    @Test
    public void test2(){
    	BitVector b = new BitVector();
    	b.set(0);
    	b.set(15);
    	b.set(31);
    	b.set(5);
    	b.set(20);
    	b.clear(0);
    	b.clear(15);
    	b.clear(5);
    	b.clear(20);
    	b.clear(31);
    	assertEquals(0,b.getNumArray()[0]);
    }
    
    
	// test for get(i)
    @Test
    public void test3(){
    	BitVector b = new BitVector();
    	b.set(100);
    	b.set(60);
    	assertEquals(false,b.get(0));
    	assertEquals(true,b.get(60));
    	assertEquals(true,b.get(100));
    }
    
    
	// test for size()
    @Test
    public void test4(){
    	BitVector b = new BitVector();
    	b.set(100);
    	b.set(0);
    	b.set(15);
    	b.set(31);
    	b.set(60);
    	assertEquals(5,b.size());
    }
    
    
    
	// test for copy()
    @Test
    public void test5(){
    	BitVector b = new BitVector();
    	BitVector c = new BitVector();
    	b.set(100);
    	b.set(0);
    	b.set(15);
    	b.set(31);
    	b.set(60);
    	c.copy(b);
    	assertEquals(5,b.size());
    	assertEquals(true,b.get(100));
    }
}
