package calculator;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testFindSquareRoot() {
		Calculator calc = new Calculator();
		assertTrue(calc.findSquareRoot(4) == 2.0D);
		assertTrue(calc.findSquareRoot(0) == 0.0D);
		assertTrue(calc.findSquareRoot(2) == Math.sqrt(2));
	}
}
