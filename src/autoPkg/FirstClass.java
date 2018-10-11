package autoPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class FirstClass {
	
	WebDriver driver;
	LoginPage loginPage;
	
	@BeforeMethod
	public void setup(){
		String exePath = "C:\\Siva_Official\\SelFiles\\chromedriver_win32_1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://cwcot103-test.mendixcloud.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void main() {
			
		System.out.println("Hello");
		loginPage = new LoginPage(driver);
		loginPage.a();
		WebDriverWait wait = new WebDriverWait(driver, 20);
//		By btnSubmit = By.className("submit");
//		WebElement eleSubmit = wait.until(ExpectedConditions.presenceOfElementLocated(btnSubmit));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("submit")));
		driver.findElement(By.className("username1")).sendKeys("kuppusam");
		driver.findElement(By.className("password")).sendKeys("Welcome@2");
		driver.findElement(By.className("submit")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='kuppusam']")));
		driver.findElement(By.xpath("//button[text()='kuppusam']"));
		driver.close();
	}

}
