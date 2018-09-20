package E_Banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Newbranch {
	public static WebElement newbran(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("BtnNewBR"));
	  return element;

}
	public static WebElement branname(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("txtbName"));
	  return element;

}

	public static WebElement address1(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.name("txtAdd1"));
	  return element;

}
	public static WebElement zipcode(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("txtZip"));
	  return element;

}
	public static WebElement country(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("lst_counrtyU"));
	  return element;
	}

	public static WebElement state(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("lst_stateI"));
	  return element;
	}

	public static WebElement city(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("lst_cityI"));
	  return element;
	}
	public static WebElement submit(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("btn_insert"));
	  return element;
	}
}
