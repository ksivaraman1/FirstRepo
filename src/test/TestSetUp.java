package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestSetUp {
	@BeforeTest
	  public void beforeTest() {
		  System.out.println("BT1");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("AT1");
	  }
}
