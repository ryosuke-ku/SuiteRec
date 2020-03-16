package jp.tcs.suiterec;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcMediumMinMaxNumTest {

	  @Test //引数を大中小の順に入力して中央値を返す
	  public void testCalcMediumOfThreeValues_Large_Medium_Small()  throws Throwable  {
	      CalcMediumMinMaxNum sut = new CalcMediumMinMaxNum();
	      int actual = sut.calcMediumMinMaxNum("Medium",300, 200, 100);
	      assertEquals(200, actual);
      }
      
	  @Test //引数を大小中の順に入力して中央値を返す
	  public void testCalcMediumOfThreeValues_Large_Small_Medium()  throws Throwable  {
	      CalcMediumMinMaxNum sut = new CalcMediumMinMaxNum();
	      int actual = sut.calcMediumMinMaxNum("Medium",300, 100, 200);
	      assertEquals(200, actual);
      }
      
	  @Test //引数を中大小の順に入力して中央値を返す
	  public void testCalcMediumOfThreeValues_Medium_Large_Small()  throws Throwable  {
	      CalcMediumMinMaxNum sut = new CalcMediumMinMaxNum();
	      int actual = sut.calcMediumMinMaxNum("Medium",200, 300, 100);
	      assertEquals(200, actual);
      }
      
	  @Test //引数を中小大の順に入力して中央値を返す
	  public void testCalcMediumOfThreeValues_Medium_Small_Large()  throws Throwable  {
	      CalcMediumMinMaxNum sut = new CalcMediumMinMaxNum();
	      int actual = sut.calcMediumMinMaxNum("Medium",200, 100, 300);
	      assertEquals(200, actual);
	  }
	  @Test //引数を小大中の順に入力して中央値を返す
	  public void testCalcMediumOfThreeValues_Small_Large_Medium()  throws Throwable  {
	      CalcMediumMinMaxNum sut = new CalcMediumMinMaxNum();
	      int actual = sut.calcMediumMinMaxNum("Medium",100, 300, 200);
	      assertEquals(200, actual);
      }
      
	  @Test //引数を小中大の順に入力して中央値を返す
	  public void testCalcMediumOfThreeValues_Small_Medium_Large()  throws Throwable  {
	      CalcMediumMinMaxNum sut = new CalcMediumMinMaxNum();
	      int actual = sut.calcMediumMinMaxNum("Medium",100, 200, 300);
	      assertEquals(200, actual);
	  }

	  @Test //int型の3引数の最小値を返す
	  public void testCalcMinimumOfThreeValues()  throws Throwable  {
	      CalcMediumMinMaxNum sut = new CalcMediumMinMaxNum();
	      int actual = sut.calcMediumMinMaxNum("min",300, 200, 100);
	      assertEquals(100, actual);
	  }

	  @Test //int型の3引数の最大値を返す
	  public void testCalcMaximumOfThreeValues()  throws Throwable  {
	      CalcMediumMinMaxNum sut = new CalcMediumMinMaxNum();
	      int actual = sut.calcMediumMinMaxNum("max", 200, 300, 100);
	      assertEquals(300, actual);
      }
      
	  @Test //無効な値を入力して-1を返す
	  public void testInputInvalidValue()  throws Throwable  {
	      CalcMediumMinMaxNum sut = new CalcMediumMinMaxNum();
	      int actual = sut.calcMediumMinMaxNum("xxxx",100, 200, 300);
	      assertEquals(-1, actual);
	  }

}
