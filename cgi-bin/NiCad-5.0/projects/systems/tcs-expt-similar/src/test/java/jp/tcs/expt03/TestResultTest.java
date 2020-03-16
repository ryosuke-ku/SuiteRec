package jp.tcs.expt03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestResultTest {

	  @Test
	  public void test01()  throws Throwable  {
	      TestResult testResult0 = new TestResult();
	      String string0 = testResult0.testResult(100, 100);
	      String string1 = testResult0.testResult(10, 100);
	      String string2 = testResult0.testResult(90, 10);
	      String string3 = testResult0.testResult(100, 25);
	      String string4 = testResult0.testResult(60, 60);
	      String string5 = testResult0.testResult(100, 20);
	      assertEquals("pass", string0);
	      assertEquals("pass", string1);
	      assertEquals("pass", string2);
	      assertEquals("pass", string3);
	      assertEquals("pass", string4);
	      assertEquals("pass", string5);
	  }

	  @Test
	  public void test02()  throws Throwable  {
	      TestResult testResult0 = new TestResult();
	      String string0 = testResult0.testResult(10, 0);
	      String string1 = testResult0.testResult(0, 10);
	      String string2 = testResult0.testResult(10, 10);
	      String string3 = testResult0.testResult(50, 50);
	      assertEquals("failure", string0);
	      assertEquals("failure", string1);
	      assertEquals("failure", string2);
	      assertEquals("failure", string3);
	  }

	  @Test
	  public void test03()  throws Throwable  {
	      TestResult testResult0 = new TestResult();
	      String string0 = testResult0.testResult(14, 118);
	      String string1 = testResult0.testResult(118, 0);
	      String string2 = testResult0.testResult(60, (-139));
	      String string3 = testResult0.testResult((-1), 0);
	      assertEquals("Invalid input", string0);
	      assertEquals("Invalid input", string1);
	      assertEquals("Invalid input", string2);
	      assertEquals("Invalid input", string3);
	  }

}
