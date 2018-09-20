package E_Banking;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class Repository {
	public WebDriver driver;
	public  int rnum = 0;

	public void launch() {

		driver = new FirefoxDriver();
		driver.get("http://192.168.1.4/ranford2");
		driver.manage().window().maximize();

	}

	/*public void login() {
		Loginpage.username(driver).sendKeys("Admin");
		Loginpage.password(driver).sendKeys("Admin");
		Loginpage.sigin(driver).click();
	}
*/
	public void login()
	{
		PageFactory.initElements(driver, pagaefactory.class);
		pagaefactory.username.sendKeys("Admin");
		pagaefactory.password.sendKeys("Admin");
		pagaefactory.login.click();
	}
	
	public void branch() {
		Branches.branches(driver).click();
		new Select(Branches.country(driver)).selectByVisibleText("INDIA");
		new Select(Branches.state(driver)).selectByVisibleText("Delhi");
		new Select(Branches.city(driver)).selectByVisibleText("Delhi");
		Branches.search(driver).click();

	}

	public void newbranch(String bname, String address1, String zipcode, String country, String state, String city)
			throws Exception {
		++rnum;

		Newbranch.newbran(driver).click();
		Newbranch.branname(driver).sendKeys(bname);
		Newbranch.address1(driver).sendKeys(address1);
		Newbranch.zipcode(driver).sendKeys(zipcode);
		new Select(Newbranch.country(driver)).selectByVisibleText(country);
		new Select(Newbranch.state(driver)).selectByVisibleText(state);
		new Select(Newbranch.city(driver)).selectByVisibleText(city);
		Newbranch.submit(driver).click();
		String alert = driver.switchTo().alert().getText();
		Excel.writedata(6,0,"result");
		Excel.writedata(6,rnum,alert);
		driver.switchTo().alert().accept();
	}

	public String[][] getExcelOperation(String filename, String Ofilename, String Sheetname) throws Exception {

		
			Excel.createExcelConnection(filename, Sheetname);
			Excel.createOutputConn(filename, Ofilename, Sheetname);
			int rc = Excel.getRows();
			int cc = Excel.getCols();
			String data[][] = new String[rc-1][cc];
			for (int r=1; r<rc;r++) {
				for (int c=0; c<cc;c++) {
					data[r-1][c] = Excel.readData(c,r);
				}

			}
			return data;
		
	}
	
	
	public void savedata() throws Exception
	{
		Excel.savedata();
	}
	
	public void roles() {
		Roles.role(driver).click();
		Roles.newrole(driver).click();
		Roles.rolename(driver).sendKeys("manager");
		new Select(Roles.roletype(driver)).selectByIndex(1);
		Roles.submit(driver).click();
		driver.switchTo().alert().accept();

	}

}
