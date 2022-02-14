package programs.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargavi.kallagunta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(); 
		
		driver.manage().window();
		driver.get("https://www.facebook.com/");
		takeScreenshot("login_page");

	}
	public static void takeScreenshot(String fileName) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Users\\bhargavi.kallagunta\\eclipse-workspace\\Selenium\\src\\screenshots\\"+fileName+".png"));
	}

}
