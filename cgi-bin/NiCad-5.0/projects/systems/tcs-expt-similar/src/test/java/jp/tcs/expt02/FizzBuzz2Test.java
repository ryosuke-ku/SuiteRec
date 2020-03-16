package jp.tcs.expt02;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzz2Test {

	private FizzBuzz2 fizzBuzz = new FizzBuzz2();
	@Test
	public void fizzBussReturnFizz(){
		assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
		assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
	}

	@Test
	public void fizzBuzzReturnBuzz() {
		assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
		assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
	}

	@Test
	public void fizzBuzzReturnOther() {
		assertEquals("4", fizzBuzz.fizzBuzz(4));
	}

	@Test
	public void fizzBuzzReturnFizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
	}

	@Test(expected = RuntimeException.class)
	public void fizzBuzzIfInputMinus(){
		fizzBuzz.fizzBuzz(-1);
	}

	@Test(expected = RuntimeException.class)
	public void fizzBuzzIfInputZero(){
		fizzBuzz.fizzBuzz(0);
	}

}
