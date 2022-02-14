package programs.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SynchronizationWaits {
	//public static WebDriver driver;
	static WebElement element;
	

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargavi.kallagunta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		//driver.manage().window();
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	  //  send(driver,element,20,"bkallagunta");
		
		
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("honey");
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("12345");
		WebElement btn=driver.findElement(By.linkText("href"));
		
		
	}
/*	public static WebElement send(WebDriver driver,WebElement element,int timeout,String value)
	{
		new WebDriverWait(driver,timeout);
	    until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
		
	}*/
	

}
