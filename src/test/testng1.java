package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testng1 {
  @Test(groups="gr1")
  public void f() {
	  System.out.println("test1-met1");
  }
  
  @Test
  public void f1() {
	  System.out.println("test1-met2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BM1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AM1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BC1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AC1");
  }

  

  

}
