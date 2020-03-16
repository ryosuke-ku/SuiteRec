package jp.tcs.expt02;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzz1Test {

	@Test(expected=RuntimeException.class) //引数に負の数を入力した場合、例外処理をする
	public void test1() {
		FizzBuzz1 fb = new FizzBuzz1();
		fb.fizzBuzz(-1);
	}

    @Test　//引数に5を入力してBuzzを返す
    public void returnBuzz_input5()  throws Throwable  {
        FizzBuzz1 fizzBuzz = new FizzBuzz1();
        String actual = fizzBuzz.fizzBuzz(5);
        String expected = "Buzz";
        assertEquals(expected, actual);
    }

    @Test //引数に2を入力して2を返す
    public void returnNum_input2()  throws Throwable  {
        FizzBuzz1 fizzBuzz = new FizzBuzz1();
        String actual = fizzBuzz.fizzBuzz(2);
        String expected = "2";
        assertEquals(expected, actual);
    }

    @Test //引数に3を入力してFizzを返す
    public void returnFizz_input3()  throws Throwable  {
        FizzBuzz1 fizzBuzz = new FizzBuzz1();
        String actual = fizzBuzz.fizzBuzz(3);
        String expected = "Fizz";
        assertEquals(expected, actual);
    }

    @Test //引数に15を入力してFizzBuzzを返す
    public void returnFizzBuzz_input15()  throws Throwable  {
        FizzBuzz1 fizzBuzz = new FizzBuzz1();
        String actual = fizzBuzz.fizzBuzz(15);
        String expected = "FizzBuzz";
        assertEquals(expected, actual);
    }


}
