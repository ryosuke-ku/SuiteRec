package jp.tcs.expt01;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReturnMidiumNumTest {

	  @Test
	  public void test0()  throws Throwable  {
	      ReturnMidiumNum returnMidiumNum0 = new ReturnMidiumNum();
	      int int0 = returnMidiumNum0.returnMidiumNum(530, 0, (-505));
	      assertEquals(0, int0);
	      int int1 = returnMidiumNum0.returnMidiumNum(0, (-4535), 1);
	      assertEquals(0, int1);
	      int int2 = returnMidiumNum0.returnMidiumNum(0, 1878, (-4309));
	      assertEquals(0, int2);
	  }

	  @Test
	  public void test3()  throws Throwable  {
	      ReturnMidiumNum returnMidiumNum0 = new ReturnMidiumNum();
	      int int0 = returnMidiumNum0.returnMidiumNum(0, 1731, 947);
	      assertEquals(947, int0);
	      int int1 = returnMidiumNum0.returnMidiumNum(0, (-49), (-1));
	      assertEquals((-1), int1);
	      int int2 = returnMidiumNum0.returnMidiumNum(0, 0, 0);
	      assertEquals(0, int2);
	  }

	  @Test
	  public void test6()  throws Throwable  {
	      ReturnMidiumNum returnMidiumNum0 = new ReturnMidiumNum();
	      int int0 = returnMidiumNum0.returnMidiumNum((-1587), 0, 0);
	      assertEquals(0, int0);
	      int int1 = returnMidiumNum0.returnMidiumNum((-1764), 0, 1731);
	      assertEquals(0, int1);
	      int int2 = returnMidiumNum0.returnMidiumNum(0, 666, 0);
	      assertEquals(0, int2);
	  }
}
