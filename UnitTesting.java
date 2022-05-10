import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;



class UnitTesting {
	
	AdjListGraph t1 = new AdjListGraph(5);
	AdjListGraph t2 = new AdjListGraph(5);

	@Test //Test 1
    public void testAddEdge() 
    {
		t1.addEdge(0, 1);
	    t1.addEdge(0, 3);
	    t1.addEdge(0, 4);
	    
	    t2.addEdge(0, 1);
	    t2.addEdge(0, 3);
	    t2.addEdge(0, 4);
	    
	    assertEquals(t1.list.toArray(), t2.list.toArray());
 
    }
	
	@Test //Test 2
    public void testGetNeighbors() 
    {
		t1.addEdge(0, 1);
	    t1.addEdge(0, 3);
	    t1.addEdge(0, 4);
	    
	    Object[] array = {1, 3, 4};
	    
	    assertEquals(t1.getNeighbors(0).toArray(), array);
 
    }
	
	@Test //Test 3
    public void testGetNumberOfNeighbors() 
    {
		t1.addEdge(0, 1);
	    t1.addEdge(0, 3);
	    t1.addEdge(0, 4);
	    
	    Object[] array = {1, 3, 4};
	    
	    assertEquals(t1.getNumberOfNeighbors(0), array.length);
 
    }
	
	@Test //Test 4
    public void testResetVisitedArray()
    {
		t1.addEdge(0, 1);
	    t1.addEdge(0, 3);
	    t1.addEdge(0, 4);
	   
	    t1.resetVisitedArray();
	    
	    t2.addEdge(0, 1);
	    t2.addEdge(0, 3);
	    t2.addEdge(0, 4);
	    
	    assertEquals(t1.list.toArray(), t2.list.toArray());
 
    }
	
	AdjMatrixGraph t3 = new AdjMatrixGraph(5);
	AdjMatrixGraph t4 = new AdjMatrixGraph(5);
	
	
	@Test //Test 5
    public void testAddEdge2()
    {
		t3.addEdge(0, 1);
	    t3.addEdge(0, 3);
	    t3.addEdge(0, 4);
	
	    
	    t4.addEdge(0, 1);
	    t4.addEdge(0, 3);
	    t4.addEdge(0, 4);
	    
	    assertEquals(t1.list.toArray(), t2.list.toArray());
 
    }
	
	@Test //Test 6
    public void testGetNumberOfNeighbors2()
    {
	    
	    t3.addEdge(0, 1);
	    t3.addEdge(0, 3);
	    t3.addEdge(0, 4);
	    
	    Object[] array = {1, 3, 4};
	    
	    assertEquals(t3.getNumberOfNeighbors(0), array.length);
    }
	
	@Test //Test 7
	public void testResetVisitedArray2()
    {
		t3.addEdge(0, 1);
	    t3.addEdge(0, 3);
	    t3.addEdge(0, 4);
	   
	    t3.resetVisitedArray();
	    
	    t4.addEdge(0, 1);
	    t4.addEdge(0, 3);
	    t4.addEdge(0, 4);
	    
	    
	    Assert.assertTrue(Arrays.equals(t3.visited, t4.visited));
    }
	
	
	@Test //Test 8
    public void testGetNeighbors2() 
    {
		t3.addEdge(0, 1);
	    t3.addEdge(0, 3);
	    t3.addEdge(0, 4);
	    
	    
	    int[] array = {1, 3, 4};
	 
	    
	    Assert.assertTrue(Arrays.equals(t3.getNeighbors(0), array));
	    
    }
	
}