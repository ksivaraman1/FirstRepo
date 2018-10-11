package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	protected static WebDriver wd;
	protected static String result;
	
  @Test
  public void t1() {
	  wd.get("http://www.floraindia.com");
	  wd.findElement(By.id("kwsch")).sendKeys("Red");
	  wd.findElement(By.xpath("//input[@src='images/go.gif']")).click();
	  result = wd.findElement(By.xpath("/font[text()='Total Items  :']//following::td[1]")).getText();
	  Assert.assertEquals(result, "115");
  }
  
  @Test
  public void t2(){
	  wd.get("http://www.floraindia.com");
	  wd.findElement(By.id("kwsch")).sendKeys("Blue");
	  wd.findElement(By.xpath("//input[@src='images/go.gif']")).click();
	  result = wd.findElement(By.xpath("/font[text()='Total Items  :']//following::td[1]")).getText();
	  Assert.assertEquals(result, "13");
  }
  
  
  
  @BeforeClass
  public void setUp() {
	  String exePath = "C:\\Siva_Official\\SelFiles\\chromedriver_win32_1\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", exePath);
		
	  wd = new ChromeDriver();
	  wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterClass
  public void tearDown() {
	  wd.close();
	  wd.quit();
  }

}
