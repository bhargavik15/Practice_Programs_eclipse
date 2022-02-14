package programs.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class StudentRegistrationForm {
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargavi.kallagunta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
	
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Bhargavi");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Kallagunta");
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("bhargavi15419@gmail.com");
        driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label")).click();
		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("9100876755");
		driver.findElement(By.id("dateOfBirthInput")).click();
		new Select(driver.findElement(By.className("react-datepicker__month-select"))).selectByVisibleText("August");
		new Select(driver.findElement(By.className("react-datepicker__year-select"))).selectByVisibleText("1998");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[7]")).click();
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		//Thread.sleep(2000);
	   driver.findElement(By.id("subjectsInput")).sendKeys("selenium");
	   driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-3\"]")).click();
	   driver.findElement(By.id("currentAddress")).sendKeys("Computers");
	   driver.close();
	   
		

	}

}
