package programs.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Data {
	public ArrayList<String> getData(String sheetName,WebDriver driver) throws IOException
	{
		int numberOfEntries=0;
		ArrayList<String> headers=new ArrayList<String>();
		ArrayList<String> fname=new ArrayList<String>();
		ArrayList<String> lname=new ArrayList<String>();
		ArrayList<String> email=new ArrayList<String>();
		ArrayList<String> number=new ArrayList<String>();
		try
		{
			FileInputStream file=new FileInputStream ("C:\\Users\\bhargavi.kallagunta\\eclipse-workspace\\Selenium\\myFile\\excel_data.xlsx");
			XSSFWorkbook workBook =new XSSFWorkbook(file) ;
			int totalSheets=workBook.getNumberOfSheets();
			for(int i=0;i<totalSheets;i++)
			{
				if(workBook.getSheetName(i).equalsIgnoreCase(sheetName))
				{
					XSSFSheet sheet =workBook.getSheetAt(i);
					Iterator<Row> row=sheet.iterator();
					Row firstRow=row.next();
					Iterator<Cell> cellHeader=firstRow.iterator();
					while(cellHeader.hasNext())
					{
                          Cell ch = cellHeader.next();
						
						//grabbing all the headers into one arraylist
						headers.add(ch.getStringCellValue());
					}
					// it return ture if there is next value else false and stops
					while (row.hasNext()) {
						
						// if true it will go to next row
						Row r = row.next();
						
						//starts to iterate the cells 
						Iterator<Cell> ce = r.cellIterator();
						while (ce.hasNext()) {
							for (int j = 0; j < headers.size(); j++) {
								Cell c = ce.next();
								if (headers.get(j).contains("fname")) 
								{
								    numberOfEntries++;
								    System.out.println(numberOfEntries);
									fname.add(c.getStringCellValue());
//								    System.out.println(fname.get(j));
									driver.findElement(By.id("firstName")).click();
									driver.findElement(By.id("firstName")).sendKeys(c.getStringCellValue());
									driver.findElement(By.id("firstName")).clear();
								} 
								else if (headers.get(j).contains("lname")) 
								{
									lname.add(c.getStringCellValue());
//									System.out.println(lname.get(j));
									driver.findElement(By.id("lastName")).click();
									driver.findElement(By.id("lastName")).sendKeys(c.getStringCellValue());
									driver.findElement(By.id("lastName")).clear();

								} 
								else if (headers.get(j).contains("email")) 
								{
									email.add(c.getStringCellValue());
									driver.findElement(By.id("userEmail")).click();
									driver.findElement(By.id("userEmail")).sendKeys(c.getStringCellValue());
									driver.findElement(By.id("userEmail")).clear();
								}
							     else if (headers.get(j).contains("number")) {
								number.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								driver.findElement(By.id("userNumber")).click();
								driver.findElement(By.id("userNumber")).sendKeys(NumberToTextConverter.toText(c.getNumericCellValue()));
								driver.findElement(By.id("userNumber")).clear();
							}
								else
								{
									break;
								}
			
								
							}
						}
					}
				}
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file is not present in the given location");
		}
		return number;
	}
}
		
		
	


