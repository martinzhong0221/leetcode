package leetcode.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import leetcode.dynamicprogramming.Solution70;
import leetcode.string.Solution67;

class SolutionTest {

	@Test
	void testClimbStairs() {
		Solution70 s70 = new Solution70();
		int result = s70.climbStairs(11);
		assertEquals(144, result);
	}
	
	@Test
	void testSolution67() {
		Solution67 s67 = new Solution67();
		String result = s67.addBinary("1010", "1011");
		System.out.println(result);
	}
	
}
