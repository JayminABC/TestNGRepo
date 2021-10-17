package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {
  @Test(priority=1)
  public void test6() {
	  System.out.println("I am in test 6");
	  System.out.println("before first assertion");
	  Assert.assertTrue(4>2, "element verify");
	  System.out.println("after first assertion");
	  Assert.assertEquals("abc", "abc");
  }
  
  SoftAssert softAssert = new SoftAssert();
  
  @Test(priority=2,dependsOnMethods="test6")
  public void test7() {
	  System.out.println("I am in test 7");
	  System.out.println("before first assertion");
	  softAssert.assertTrue(2>4, "element verify");
	  System.out.println("after first assertion");
	  softAssert.assertAll();
  }
  
  @Test(priority=3,dependsOnMethods = "test7")
  public void test8() {
	  System.out.println("I am in test 8");
	  System.out.println("before first assertion");
	  Assert.assertTrue(4>2, "element verify");
	  System.out.println("after first assertion");
	  Assert.assertEquals("abc", "abc1");
	  System.out.println("After second Assertion");
	  softAssert.assertAll();
  }
  
}
