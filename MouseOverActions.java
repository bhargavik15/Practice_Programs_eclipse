package programs.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {
	public static WebDriver driver;
	public static WebElement Menu_Link;
	public static WebElement Sub_Link;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargavi.kallagunta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(); 

	  // Open Techlcistic.com's practice form
	  driver.get("https://www.selenium.dev/");

	  // Set Implicit Wait
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	  // Maximize Window
	  driver.manage().window().maximize();

	    
	  
	  /* KeyUP and KeyDown
	   */
	  
	  /* Mouse Hover
	   */

	  // Xpath for Menu
	  WebElement Menu_Link=driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]"));

	  // Xpath for Sub Menu
	  WebElement Sub_Link=driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/div/a[5]"));

	 // Create object of Actions class
	  Actions actions = new Actions(driver);

	  // Move cursor to Menu link (Mouse hover on menu link so that sub menu is displayed)
	  actions.moveToElement(Menu_Link);

	 

	// Click on Submenu link (whcih is displayed after mouse hovering curson on menu link)
	  actions.click(Sub_Link).build().perform();
	   
		
		

	}

}
