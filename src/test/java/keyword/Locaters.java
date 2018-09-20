package keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locaters 
{
	public static WebDriver driver;

	public static By locatorValue(String locType, String locVal) {
		By loc = null;
		switch (locType) {
		case "id":
			loc = By.id(locVal); 
			break;
		case "name":
			loc = By.name(locVal); 
			break;
		case "xpath":
			loc = By.xpath(locVal); 
			break;
		case "cssSelector":
			loc = By.cssSelector(locVal);
			break;
		case "linkText":
			loc = By.linkText(locVal) ;
			break;
		case "partialLinkText":
			loc = By.partialLinkText(locVal) ;
			break;
		default:
			loc = null;
			break;
		}
		return loc;
	}


}
