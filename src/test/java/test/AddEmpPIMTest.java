package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import base.Configuration;
import pages.PIMPage;

public class AddEmpPIMTest extends Configuration {
	public WebDriver driver = BaseClass.getdriver();
	BaseClass bcl = new BaseClass(driver);
	LoginTest lt=new LoginTest();
	PIMPage pimp=new PIMPage(driver);
	
	/*@BeforeTest
	public void beforetest() throws InterruptedException
	{
		bcl.setup(properties.getProperty("URL"));
	}*/
	
	@Test
	public void UpdateEMPName() throws Exception
	{
		//lt.TestScript();
		Thread.sleep(1500);
		pimp.PIMLink();
		Thread.sleep(1500);
		pimp.addEmployeeLink();
		Thread.sleep(1500);
		pimp.sendTextToFirstName(properties.getProperty("firstname"));
		Thread.sleep(1500);
		pimp.sendTextToMiddleName(properties.getProperty("middlename"));
		Thread.sleep(1500);
		pimp.sendTextToLastName(properties.getProperty("lastname"));
		Thread.sleep(1500);
		//pimp.uploadPhoto();
		//Thread.sleep(1500);
		pimp.clickCheckBox();
		Thread.sleep(1500);
		pimp.sendTextToUserName(properties.getProperty("newusername"));
		Thread.sleep(1500);
		pimp.sendTextToUserPassword(properties.getProperty("newuserpassword"));
		Thread.sleep(1500);
		pimp.sendTextToConfirmPassword(properties.getProperty("newuserconfimpass"));
		Thread.sleep(1500);
		pimp.clickOnSaveButton();
		Thread.sleep(1500);
	}
	
	/*@AfterTest
	public void Aftertest()
	{
		bcl.Teardown();
	}*/
}
