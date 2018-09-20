package E_Banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	
	public static WebElement username(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath("//*[@id='txtuId']"));
	  return element;
	}
	public static WebElement password(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='txtPword']"));
	  return element;
	}
	public static WebElement sigin(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='login']"));
	  return element;
	}
	

}
