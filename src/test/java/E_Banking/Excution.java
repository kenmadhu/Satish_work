package E_Banking;

import org.testng.annotations.*;

public class Excution extends Repository 
{
	@BeforeTest()
	public void vlaunch()
	{
		launch();
	}
	
	@Test(priority=0)
	public void vlogin()
	{
		login();
	}
	@Test(priority=1)	
	public void vbranch()
	{
		branch();
	}
	
	@DataProvider(name = "aaaaa" )
	public String[][] getExcelOperation() throws Exception
	{
		return getExcelOperation("Inputdata1.xls","Outputdata.xls","branches");
	}
	@Test(priority=2, dataProvider ="aaaaa")	
	public void vnewbranch(String bname, String address1, String zipcode, String country, String state, String city) throws Exception
	
	{
		newbranch(bname,address1,zipcode,country,state, city);
	}
	
	@Test(priority =3)
	public void  vvsavedata() throws Exception
	{
		savedata();
	}
	
	@Test(priority=4)	
	public void vrooles()
	
	{
		roles();
	}
	

}
