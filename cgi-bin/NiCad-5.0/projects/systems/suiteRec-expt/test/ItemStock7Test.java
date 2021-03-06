/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 25 03:53:57 GMT 2019
 */

package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tutorial.ItemStock7;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ItemStock7_ESTest extends ItemStock7_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      ItemStock7 itemStock7_0 = new ItemStock7();
      int int0 = itemStock7_0.countItem(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ItemStock7 itemStock7_0 = new ItemStock7();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      int int0 = itemStock7_0.countItem(intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ItemStock7 itemStock7_0 = new ItemStock7();
      // Undeclared exception!
      try { 
        itemStock7_0.countItem((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("tutorial.ItemStock7", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[0];
      ItemStock7 itemStock7_0 = new ItemStock7();
      int int0 = itemStock7_0.countItem(intArray0);
      assertEquals((-1), int0);
  }
}
