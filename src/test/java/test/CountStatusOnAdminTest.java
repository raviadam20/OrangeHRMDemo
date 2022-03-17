package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import base.Configuration;
import pages.AdminPage;

public class CountStatusOnAdminTest extends Configuration {
	String Enabled = "Enabled";
	String Disabled = "Disabled";

	public WebDriver driver = BaseClass.getdriver();
	BaseClass bcl = new BaseClass(driver);
	AdminPage ap = new AdminPage(driver);
	LoginTest lt = new LoginTest();

	/*@BeforeTest
	public void beforetest() throws InterruptedException {
		bcl.setup(properties.getProperty("URL"));
	}*/

	@Test(priority = 1)
	public void CountStatus() throws InterruptedException {
		//lt.TestScript();
		ap.AdminLink();
		ap.Count();
		Thread.sleep(2000);
	}

	/*@AfterTest
	public void Aftertest() {
		bcl.Teardown();
	}*/
}
