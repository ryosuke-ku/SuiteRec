package jp.tcs.expt02;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzz3Test {

	@Test
	public void Fizz() {
		FizzBuzz3 fb = new FizzBuzz3();
		assertEquals("Fizz", fb.fizzBuzz(3));
	}

	@Test
	public void Buzz() {
		FizzBuzz3 fb = new FizzBuzz3();
		assertEquals("Buzz", fb.fizzBuzz(5));
	}

	@Test(expected=RuntimeException.class)
	public void FizzNegative() {
		FizzBuzz3 fb = new FizzBuzz3();
		fb.fizzBuzz(-1);
	}

	@Test
	public void FizzBuzz() {
		FizzBuzz3 fb = new FizzBuzz3();
		assertEquals("FizzBuzz", fb.fizzBuzz(15));
	}

}
