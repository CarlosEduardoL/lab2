/**
 * 
 */
package cUtilTest;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cUtil.CHeap;
import cUtil.CList;
import cUtil.Heap;

/**
 * @author Santiago
 *
 */
public class HeapTest {
	
	private Heap<Integer> heap;
	@BeforeEach
	void setUp1(){
		heap = new CHeap<Integer>();

	}

	@Test
	void constructorTest1() {
		
		setUp1();
//		1, 2, 3, 4, 7, 8, 9, 10, 14, 16 
		heap.add(1);
		heap.add(2);
		heap.add(3);
		heap.add(4);
		heap.add(5);
//		heap.add(7);
//		heap.add(8);
//		heap.add(9);
//		heap.add(10);
//		heap.add(14);
//		heap.add(16);
//		
		
		printHeap();
	}
	
	void printHeap() {
		
		for (int i = 0; i < heap.size(); i++) {
			System.out.println(heap.getElement(i));
		}
	}
}