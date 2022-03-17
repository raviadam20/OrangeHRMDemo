package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import base.Configuration;
import pages.AdminPage;

public class UpdateAdminEMPTest extends Configuration {
	public WebDriver driver = BaseClass.getdriver();
	BaseClass bcl = new BaseClass(driver);
	AdminPage ap = new AdminPage(driver);
	LoginTest lt = new LoginTest();

	/*@BeforeTest
	public void beforetest() throws InterruptedException {
		bcl.setup(properties.getProperty("URL"));
	}*/

	@Test(priority = 1)
	public void UpdateEMPName() throws InterruptedException {
		//lt.TestScript();
		Thread.sleep(1500);
		ap.AdminLink();
		Thread.sleep(1500);
		ap.ClickOnAdminEmp();
		Thread.sleep(1500);
		ap.clickOnEditBtn();
		Thread.sleep(1500);
		ap.sendTextToEmpName(properties.getProperty("searchEMPname"));
		Thread.sleep(1500);
		ap.clickOnSaveBtn();
		Thread.sleep(1500);
	}

	/*@AfterTest
	public void Aftertest() {
		bcl.Teardown();
	}*/
}
