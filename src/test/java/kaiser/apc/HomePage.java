package kaiser.apc;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import kaiser.apc.pageObjects.LandingPage;
import kaiser.apc.resources.base;

public class HomePage extends base{
	public WebDriver driver;
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		 driver =initializeDriver();
	}
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username,String Password) throws IOException
	{
		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getUsername().sendKeys(Username);
		l.getPassword().sendKeys(Password);
		l.getLogin().click();
	}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		// Array size is 1
		// 0,1
		Object[][] data=new Object[1][2];
		//0th row
		data[0][0]="B160381";
		data[0][1]="mmQQmm11";
		
		return data;
	}
}
