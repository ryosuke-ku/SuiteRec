package jp.tcs.expt.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcMaxTest {

    @Test //引数を小中大の順に入力して最大値を返す
    public void testCalcMaxofThreeValues_Small_Midium_Large() throws Exception{
	    CalcMax calc = new CalcMax();
		int expected = 30;
		int actual = calc.max(10,20,30);
		assertEquals(expected,actual);
    }


    @Test　//引数を小大中の順に入力して最大値を返す
    public void testCalcMaxofThreeValues_Small_Large_Midium() throws Exception{
    	CalcMax calc = new CalcMax();
		int expected =30;
		int actual = calc.max(10,30,20);
		assertEquals(expected,actual);
    }

    @Test　//引数を中小大の順に入力して最大値を返す
    public void testCalcMaxofThreeValues_Midium_Small_Large() throws Exception{
    	CalcMax calc = new CalcMax();
		int expected =30;
		int actual = calc.max(20,10,30);
		assertEquals(expected,actual);
    }

    @Test //引数を中大小の順に入力して最大値を返す
    public void testCalcMaxofThreeValues_Midium_Large_Small() throws Exception{
    	CalcMax calc = new CalcMax();
		int expected =30;
		int actual = calc.max(20,30,10);
		assertEquals(expected,actual);
    }

    @Test //引数を大小中の順に入力して最大値を返す
    public void testCalcMaxofThreeValues_Large_Small_Midium() throws Exception{
    	CalcMax calc = new CalcMax();
		int expected =30;
		int actual = calc.max(30,10,20);
		assertEquals(expected,actual);
    }

    @Test //引数を大中小の順に入力して最大値を返す
    public void testCalcMaxofThreeValues_Large_Midium_Small() throws Exception{
    	CalcMax calc = new CalcMax();
		int expected =30;
		int actual = calc.max(30,20,10);
		assertEquals(expected,actual);
    }

    @Test //引数を小小大の順に入力して最大値を返す
    public void testCalcMaxofThreeValues_Small_Small_Large() throws Exception{
    	CalcMax calc = new CalcMax();
		int expected =30;
		int actual = calc.max(10,10,30);
		assertEquals(expected,actual);
    }

    @Test //引数を小大小の順に入力して最大値を返す
    public void testCalcMaxofThreeValues_Small_Large_Small() throws Exception{
    	CalcMax calc = new CalcMax();
		int expected =30;
		int actual = calc.max(10,30,10);
		assertEquals(expected,actual);
    }

    @Test //引数を大小小の順に入力して最大値を返す
    public void testCalcMaxofThreeValues_Large_Small_Small() throws Exception{
    	CalcMax calc = new CalcMax();
		int expected =30;
		int actual = calc.max(30,10,10);
		assertEquals(expected,actual);
    }

    @Test //引数を小大大の順に入力して最大値を返す
    public void testCalcMaxofThreeValues_Small_Large_Large() throws Exception{
    	CalcMax calc = new CalcMax();
		int expected =30;
		int actual = calc.max(10,30,30);
		assertEquals(expected,actual);
    }

    @Test //引数を大小大の順に入力して最大値を返す
    public void testCalcMaxofThreeValues_Large_Small_Large() throws Exception{
    	CalcMax calc = new CalcMax();
		int expected =30;
		int actual = calc.max(30,10,30);
		assertEquals(expected,actual);
    }

    @Test //引数を大大小の順に入力して最大値を返す
    public void testCalcMaxofThreeValues_Large_Large_Small() throws Exception{
    	CalcMax calc = new CalcMax();
		int expected =30;
		int actual = calc.max(30,30,10);
		assertEquals(expected,actual);
    }

    @Test //引数にすべて同じ値を入力して最大値を返す
    public void testMaxofThreeSameNum() throws Exception{
    	CalcMax calc = new CalcMax();
		int expected =30;
		int actual = calc.max(30,30,30);
		assertEquals(expected,actual);
    }

}
