package autoPkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class test1 {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String exePath = "C:\\Siva_Official\\SelFiles\\chromedriver_win32_1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		File f = new File("C:\test.html");
		FileInputStream fis;
		fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		prop.load(fis);
		prop.getProperty("");
		
		TakesScreenshot aa = (TakesScreenshot) driver;
		
		File fl = aa.getScreenshotAs(OutputType.FILE);
		
		ITestResult result;
		
		
		fis.close();
		
		
		try{
		
		driver.get("https://www.google.com/");
		int a =3;
		switch(a){
		case 1:
			if(a==1)
				throw new CustomException("Own_Error");
			break;
		case 2:	
			driver.findElement(By.className("test"));
			break;
		case 3:
			System.out.println("close the window");
			driver.close();
			driver.findElement(By.className("test"));
			break;
			
		}
		}
		catch(NoSuchElementException nswe){
			System.out.println("--------");
			System.out.println(nswe.toString());
			System.out.println("--------");
		}
		catch(CustomException cex){
			System.out.println("--------");
			System.out.println(cex.toString());
			System.out.println("--------");
		}
		catch(NoSuchSessionException nsse){
			System.out.println("--------");
			System.out.println(nsse.toString());
			System.out.println("--------");
		}
//		catch(WebDriverException wde){
//			System.out.println("--------");
//			System.out.println(wde.toString());
//			System.out.println("--------");
//		}		
		catch(Exception e){
			System.out.println("--------");
			System.out.println(e.toString());
			System.out.println("--------");
		}
		finally{
			System.out.println("Finallllly");
			driver.close();
		}
		System.out.println("Enf od Testcase");

	}

}
