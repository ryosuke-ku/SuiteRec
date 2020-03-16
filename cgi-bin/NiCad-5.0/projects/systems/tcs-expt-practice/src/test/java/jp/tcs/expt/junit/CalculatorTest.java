package jp.tcs.expt.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		int result1 = calc.multiply(10,20);
		int result2 = calc.multiply(10,30);
		assertEquals(200,result1);
		assertEquals(300,result2);
	}

}
