import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSort {
	
	sampleArray sa = new sampleArray();
	
	
	@Test
	void testArray() {
		assertArrayEquals(new int[] {2,3,4,1,8}, sa.arr);
	}
	
	@Test
	void test() {
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3} );
	}

}
