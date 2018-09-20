package keyword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import E_Banking.Excel;

public class Driver 
{

	public WebDriver driver;

	@Test
	public void KeywordOperations() throws Exception 
           {

		// Read Data from Excel
		Excel.createExcelConnection("Input.xls", "role");

		// Count Number of Rows In keyWord Sheet

		int Rcount = Excel.getRows();

		// Iterate Number of rows Time

		for (int i = 1; i < Rcount; i++) 
		   {
			String ClassName = Excel.readData(2, i);
			String locType = Excel.readData(3, i);
			String locval = Excel.readData(4, i);
			
			String InputData = Excel.readData(5, i);
		
		   switch (ClassName) 
		      {
			case "editbox":
				driver.findElement(Locaters.locatorValue(locType, locval )).clear();
				driver.findElement(Locaters.locatorValue(locType,locval )).sendKeys(InputData);
				break;

			case "button":
				driver.findElement(Locaters.locatorValue(locType, locval )).click();
				break;

			case "link":
				driver.findElement(Locaters.locatorValue(locType, locval )).click();
				break;

			case "checkbox":
				driver.findElement(Locaters.locatorValue(locType, locval )).click();
				break;

			case "dropdown":
				new Select(driver.findElement(Locaters.locatorValue(locType,locval ))).selectByVisibleText(InputData);
				break;

			case "alert":
				driver.switchTo().alert().accept();
				break;

			case "wait":
				try 
				    {
				     Thread.sleep(5000);
				    } 
				catch (Exception e) 
				    {
					e.getMessage();
				    }
				break;

			case "image":
				driver.findElement(Locaters.locatorValue(locType, locval)).click();
				break;

			default:
				break;
		    }
		}
	   }

	@BeforeTest
	public void launchApp() 
	  {

		driver = new FirefoxDriver();
		driver.get("http://192.168.1.4/ranford2/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	
	@AfterTest
	public void closeApp()
	  {
		driver.close();
	  }

}
