package programs.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenConcepts {
	 WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargavi.kallagunta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
	}
	@Test(dataProvider="loginData")
	public void loginTest(String user,String pwd,String expectedData)
	{
		System.out.println(user+pwd+expectedData);
	}
	@DataProvider(name="loginData")
    public String [][] getData()
    {
    	String loginData[][]= {
    		                      {"bhargavi@gmail.com","chinni","valid"},
    		                    	  {"bhalu@gmail.com","chitti","invalid"},
    			 
    		                    	  {"bhagi@gmail.com","honey","invalid"},
    	                          };
		return loginData;
    			
    	                      
    	
    }
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
}
