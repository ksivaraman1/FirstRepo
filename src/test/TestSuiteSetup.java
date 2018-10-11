package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@SuppressWarnings("unused")
public class TestSuiteSetup {
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BS1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AS1");
  }
}
