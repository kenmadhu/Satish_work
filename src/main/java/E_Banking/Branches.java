package E_Banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Branches {

	public static WebElement branches(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']"));
	  return element;
	}
	public static WebElement country(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("lst_countryS"));
	  return element;
	}
	public static WebElement state(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("lst_stateS"));
	  return element;
	}
	public static WebElement city(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("lst_cityS"));
	  return element;
	}
	public static WebElement search(WebDriver driver)
	{
	  WebElement search =driver.findElement(By.id("btn_search"));
	  return search;
	}

}
