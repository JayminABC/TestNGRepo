package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test1 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println(n+s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("print before evry method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("print after evry method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "abc1" },
      new Object[] { 2, "abc2" },
      new Object[] { 3, "abc3" },
      new Object[] { 4, "abc4" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("print before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("print after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("run once and first in class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("run once and last in class");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("higher priority,run first in suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("run last in suite");
  }
  
  @Test
  public void test1() {
	  System.out.println("Test 1");
  }
  
  @Test
  public void test2() {
	  System.out.println("Test 2");
  }
  
  @Test
  public void test3() {
	  System.out.println("Test 3");
  }
}