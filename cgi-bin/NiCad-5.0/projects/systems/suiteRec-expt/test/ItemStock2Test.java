/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 25 03:47:50 GMT 2019
 */

package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tutorial.ItemStock2;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ItemStock2_ESTest extends ItemStock2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ItemStock2 itemStock2_0 = new ItemStock2();
      int[] intArray0 = new int[4];
      intArray0[0] = 1970;
      int int0 = itemStock2_0.addition02(intArray0);
      assertEquals(1970, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ItemStock2 itemStock2_0 = new ItemStock2();
      // Undeclared exception!
      try { 
        itemStock2_0.addition02((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("tutorial.ItemStock2", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[0];
      ItemStock2 itemStock2_0 = new ItemStock2();
      int int0 = itemStock2_0.addition02(intArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ItemStock2 itemStock2_0 = new ItemStock2();
      int[] intArray0 = new int[2];
      int int0 = itemStock2_0.addition02(intArray0);
      assertEquals(0, int0);
  }
}
