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
	
	@Test
	public void testFindFact() {
		Calculator calc = new Calculator();
		assertTrue(calc.findFact(4) == 24);
		assertTrue(calc.findFact(0) == 1);
		assertTrue(calc.findFact(2) == 2);
	}
	
	@Test
	public void testFindNatLog() {
		Calculator calc = new Calculator();
		assertTrue(calc.findNatLog(1) == 0.0D);
		assertTrue(calc.findNatLog(2) == Math.log(2));
	}
	
	@Test
	public void testFindPow() {
		Calculator calc = new Calculator();
		assertTrue(calc.findPow(1, 5) == 1.0D);
		assertTrue(calc.findPow(2, 3) == Math.pow(2, 3));
	}
}
