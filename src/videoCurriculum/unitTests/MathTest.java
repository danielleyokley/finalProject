package videoCurriculum.unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import videoCurriculum.unitTests.Math;

class MathTest {
	Math math = new Math();
	@Test
	void testmultiplyReturnsCorrectValues() {
		int product = math.multiply(2, 5);
		assertEquals(product, 10);
		
	}
	
	@Test
	void testDivideReturnsCorrectValues() {
		double result = math.divide(5.0, 2.0);
		assertEquals(2.5, result);
		
	}
	
	@Test
	void testIsPositiveReturnsTrueIfArgIsPositive() {
		int a = 5;
		assertTrue(math.isPositiveNumber(a));
	}
}