package programs.com;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data1 extends Data {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargavi.kallagunta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Data d=new Data();
		ArrayList<String> datas=d.getData("sheet1", driver) ;
		for(int i=0;i<datas.size();i++)
		{
			System.out.println(datas.get(i));
		}

	}

}
