package E_Banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Roles 
{
	public static WebElement role(WebDriver driver)
	{
	return driver.findElement(By.xpath("//img[@src='images/Roles_but.jpg']"));
	}
	
	public static WebElement newrole(WebDriver driver)
	{
	return driver.findElement(By.id("btnRoles"));
	}
	
	public static WebElement rolename(WebDriver driver)
	{
	return driver.findElement(By.id("txtRname"));
	}
	
	public static WebElement roletype(WebDriver driver)
	{
	return driver.findElement(By.id("lstRtypeN"));
	}
	
	public static WebElement submit(WebDriver driver)
	{
	return driver.findElement(By.id("btninsert"));
	}
}
