package com.ejemplo.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertEquals(5,c.add(2, 3));
	}
	
	@Test
	public void testSubtract() {
		Calculator c = new Calculator();
		assertEquals(1,c.subtract(3, 2));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivideByZero() {
		Calculator c = new Calculator();
		c.divide(10, 0);
	}

}
