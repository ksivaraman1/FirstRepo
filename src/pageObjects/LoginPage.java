package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

@SuppressWarnings("unused")
public class LoginPage {
	WebDriver driver;
//	protected WebDriver driver;
	public By usrnameInp1 = By.className("username");
	@FindBy(className="username")
	WebElement usrnameInp;
	
	@FindBy(className="password")
	WebElement pswordInp;
	
	@FindBy(className="submit")
	WebElement submitBtn;
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void a(){
		
		driver.findElement(usrnameInp1).sendKeys("test");
		
		
	}
	
	}
