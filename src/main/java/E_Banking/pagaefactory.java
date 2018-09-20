package E_Banking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagaefactory 
{
	
	@FindBy(id="txtuId")
	public static WebElement username;
	@FindBy(id="txtPword")
	public static WebElement password;
	@FindBy(id="login")
	public static WebElement login;
	

}
