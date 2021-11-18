// Author: Manikanda Raghavan and Naga Chalasani
// Project: Kaiser APC
// Date: 18-Nov-2021

package kaiser.apc.pageObjects;

//Raju Surapuraju

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By logIn=By.id("submitBtnID");
	By userName=By.id("username");
	By passWord=By.id("password");
		
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;	
	}

	//public LoginPage getLogin()
	//{
	//	 driver.findElement(logIn).click();
	//	 LoginPage lp=new LoginPage(driver);
	//	 return lp;		 
	//} 
	
	public WebElement getPassword()
	{
		return driver.findElement(passWord);
	}
	
	public WebElement getUsername()
	{
		return driver.findElement(userName);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(logIn);
	}
}
