package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import base.Configuration;
import pages.LoginPage;

public class LoginTest extends Configuration {
	public WebDriver driver = BaseClass.getdriver();
	BaseClass bcl = new BaseClass(driver);
	LoginPage la=new LoginPage(driver);
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		bcl.setup(properties.getProperty("URL"));
	}
	
	@Test
	public void TestScript() throws InterruptedException
	{
		la.sendUserName(properties.getProperty("username"));
		Thread.sleep(1500);
		la.sendPassword(properties.getProperty("password"));
		Thread.sleep(1500);
		la.clickOnLoginBtn();
		Thread.sleep(1500);
	}
	
	@AfterTest
	public void Aftertest()
	{
		bcl.Teardown();
	}
}
