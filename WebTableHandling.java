package programs.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTableHandling {
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargavi.kallagunta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(2000);
		
		
		//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[1]/td[1]
		//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[2]/td[1]
		
		
		
		//*[@id="customers"]/tbody/tr[1]/td[1]
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		//*[@id="customers"]/tbody/tr[1]
		
		/*List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\\\"post-body-5867683659713562481\\\"]/div[1]/div[1]/table/tbody/tr["));
				int rowsCount=rows.size();
				System.out.println("the total number of row count in a table :"+rowsCount);*/
		
		
		//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[1]/td[2]
	   //*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[2]/td[2]
		
		//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[1]/td[1]
		//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[2]/td[1]
				
				
		
	//------------first column list--------------
		
		String beforeXpath="//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
		String afterXpath="]/td[1]";
		for(int i=1;i<=4;i++)
		{
			String actualXpath=beforeXpath+i+afterXpath;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			
			if(element.getText().equalsIgnoreCase("UAE"))
			{
				
				System.out.println("country name:"+element.getText()+"is found");
				
				
				
			}
		}
		
		//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[1]/td[2]
		//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[2]/td[2]
		
	//-----------------second column list-----------
		
		String beforeXpathContact="//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
		String afterXpathContact="]/td[2]";
		for(int i=1;i<=4;i++)
		{
			String actualXpath=beforeXpathContact+i+afterXpathContact;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase("Dubai"))
		     {
				
		     System.out.println("city name:"+element.getText()+"is found");
		     
			
			}
		}
		
     //-----------------third column list---------------
		
		String beforeXpathContact1="//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
		String afterXpathContacts="]/td[3]";
		for(int i=1;i<=4;i++)
		{
			String actualXpath=beforeXpathContact1+i+afterXpathContacts;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		
			if(element.getText().equalsIgnoreCase("829m"))
		     {
				
		     System.out.println("height:"+element.getText()+"is found");
		     
			
			}
		}
		//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[1]
		//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr[2]
			
		
				WebElement element7=driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody"));{
				System.out.println(element7.getText());
			}
		

		
		
		
		
		
	/*	//-----------------handle web table columns----------------------
		
		
		
		//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/thead/tr/th[2]
		//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/thead/tr/th[3]
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		String colBeforeXpath="//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/thead/tr[";
		String colAfterXpath="]/th[2]";
		
		List<WebElement> coloumn=driver.findElements(By.xpath("//*[@id=\\\"post-body-5867683659713562481\\\"]/div[1]/div[1]/table/thead/tr["));
		int colCount=coloumn.size();
		System.out.println("the total number of col count in a table :"+colCount);
		
		
		
		
	for(int i=1;i<=colCount;i++)
		{
		
			String colActualXpath=colBeforeXpath+i+colAfterXpath;
			WebElement element=driver.findElement(By.xpath(colActualXpath));
			
			System.out.println(element.getText());
			
			//System.out.println("company:"+element.getText());
			
		}
		*/
		
		

	}
}



