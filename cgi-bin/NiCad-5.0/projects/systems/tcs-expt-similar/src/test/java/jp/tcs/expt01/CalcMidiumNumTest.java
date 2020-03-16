package jp.tcs.expt01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcMidiumNumTest {

    @Test //引数を大中小の順に入力して中央値を返す
    public void testCalcMidiumOfThreeValues_Large_Midium_Small()  throws Throwable  {
        CalcMidiumNum calcMidiumNum = new CalcMidiumNum();
        int actual = calcMidiumNum.calcMidiumNum(300, 200, 100);
        assertEquals(200, actual);
    }

    @Test //引数を大小中の順に入力して中央値を返す
    public void testCalcMidiumOfThreeValues_Large_Small_Midium()  throws Throwable  {
        CalcMidiumNum calcMidiumNum = new CalcMidiumNum();
        int actual = calcMidiumNum.calcMidiumNum(5232, (-250), 0);
        assertEquals(0, actual);
    }

    @Test //引数を中大小の順に入力して中央値を返す
    public void testCalcMidiumOfThreeValues_Midium_Large_Small()  throws Throwable  {
        CalcMidiumNum calcMidiumNum = new CalcMidiumNum();
        int actual = calcMidiumNum.calcMidiumNum(200, 300, 100);
        assertEquals(200, actual);
    }

    @Test //引数を中小大の順に入力して中央値を返す
    public void testCalcMidiumOfThreeValues_Midium_Small_Large()  throws Throwable  {
        CalcMidiumNum calcMidiumNum = new CalcMidiumNum();
        int actual = calcMidiumNum.calcMidiumNum(0, (-1), 739);
        assertEquals(0, actual);
    }

    @Test //引数を小大中の順に入力して中央値を返す
    public void testCalcMidiumOfThreeValues_Small_Large_Midium()  throws Throwable  {
        CalcMidiumNum calcMidiumNum = new CalcMidiumNum();
        int actual = calcMidiumNum.calcMidiumNum(100, 300, 200);
        assertEquals(200, actual);
    }

    @Test //引数を小中大の順に入力して中央値を返す
    public void testCalcMidiumOfThreeValues_Small_Midium_Large()  throws Throwable  {
        CalcMidiumNum calcMidiumNum = new CalcMidiumNum();
        int actual = calcMidiumNum.calcMidiumNum(0, 1, 1634);
        assertEquals(1, actual);
    }

    @Test //引数を大中中の順に入力して中央値を返す
    public void testCalcMidiumOfThreeValues_Large_Midium_Midium()  throws Throwable  {
        CalcMidiumNum calcMidiumNum = new CalcMidiumNum();
        int actual = calcMidiumNum.calcMidiumNum(542, 1, 1);
        assertEquals(1, actual);
    }

    @Test //引数を中中小の順に入力して中央値を返す
    public void testCalcMidiumOfThreeValues_Midium_Midium_Small()  throws Throwable  {
        CalcMidiumNum calcMidiumNum = new CalcMidiumNum();
        int actual = calcMidiumNum.calcMidiumNum(802, 802, (-2196));
        assertEquals(802, actual);
    }

    @Test //引数を小中中の順に入力して中央値を返す
    public void testCalcMidiumOfThreeValues_Small_Midium_Midium()  throws Throwable  {
        CalcMidiumNum calcMidiumNum = new CalcMidiumNum();
        int actual = calcMidiumNum.calcMidiumNum(0, 252, 252);
        assertEquals(252, actual);
    }

    @Test //引数を中大中の順に入力して中央値を返す
    public void testCalcMidiumOfThreeValues_Midium_Large_Midium()  throws Throwable  {
        CalcMidiumNum calcMidiumNum = new CalcMidiumNum();
        int actual = calcMidiumNum.calcMidiumNum((-584), (-1), (-584));
        assertEquals((-584), actual);
    }

    @Test //引数にすべて同じ値を入力して中央値を返す
    public void testCalcMidiumOfThreeValues_Midium_Midium_Midium()  throws Throwable  {
        CalcMidiumNum calcMidiumNum = new CalcMidiumNum();
        int actual = calcMidiumNum.calcMidiumNum(0, 0, 0);
        assertEquals(0, actual);
    }

}
