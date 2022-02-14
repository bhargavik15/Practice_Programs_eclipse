package programs.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommands {
	public static WebDriver driver;

	public static void main(String[] args) {

		// Expected Title
		String expectedTitle = "Selenium";

		// Set Path of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargavi.kallagunta\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();

		// Open URL of Website
		
		driver.get("https://www.selenium.dev/");

		// Maximize Window
		driver.manage().window().maximize();

		// Navigate directly to some URL
		
		driver.navigate().to("https://www.selenium.dev/downloads/");
		// Navigate Back
		driver.navigate().back();	

		// Navigate Forward
		driver.navigate().forward();

		// Refresh Page
		driver.navigate().refresh();

		// Close Browser
		driver.close();

		}
	
	}


