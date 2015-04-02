package math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculTest {

	public Calcul calcul;
	
	@Before
	public void setUp () throws Exception {
		this.calcul = new Calcul();
	}
	
	@After
	public void tearDown () throws Exception {
		
	}
	
	@Test
	/**
	 * 
	 */
	public void testAddition() {
		
		assertEquals(2, this.calcul.addition(1, 1));
		assertEquals(4, this.calcul.addition(2, 2));
		assertEquals(11, this.calcul.addition(5, 6));
	}
	
	@Test
	/**
	 * 
	 */
	public void testSubstraction()  {
		
		assertEquals(0, this.calcul.substraction(1, 1));
		assertEquals(1, this.calcul.substraction(5, 4));
		assertEquals(8, this.calcul.substraction(18, 10));
	}
	
	@Test
	/**
	 * 
	 */
	public void testMultiplication() {
		
		assertEquals(1, this.calcul.multiplication(1, 1));
		assertEquals(10, this.calcul.multiplication(2, 5));
		assertEquals(30, this.calcul.multiplication(10, 3));
	}

	@Test (expected = ArithmeticException.class)
	/**
	 * 
	 */
	public void testDivBy0() {
		
		this.calcul.div(1, 0);
	}
	
	@Test
	/**
	 * 
	 */
	public void testDiv() {
		
		assertEquals(1, this.calcul.div(1, 1));
		assertEquals(2, this.calcul.div(2, 1));
	}
}
