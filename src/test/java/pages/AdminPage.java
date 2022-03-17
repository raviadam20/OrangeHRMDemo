package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import base.BaseClass;

public class AdminPage extends BaseClass{

	public AdminPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static By adminMenuLink=By.xpath("//b[contains(text(),'Admin')]");
	public static By clickAdmin=By.xpath("//a[text()='Admin']");
	public static By clickEditAndSavebtn=By.xpath("//input[@id='btnSave']");
	public static By textBoxEMPName=By.xpath("//input[@id='systemUser_employeeName_empName']");
	public static By listCountEnabled=By.xpath("//table[@id='resultTable']//td[text()='Enabled']");
	public static By listCountDisabled=By.xpath("//table[@id='resultTable']//td[text()='Disabled']");
	
	
	public void AdminLink()
	{
		Click(adminMenuLink);
	}
	
	public void ClickOnAdminEmp() {
		Click(clickAdmin);
	}
	
	public void clickOnEditBtn() {
		Click(clickEditAndSavebtn);
	}
	
	public void sendTextToEmpName(String data) {
		Clear(textBoxEMPName);
		SendKeys(textBoxEMPName, data);
		ActionsOnList(textBoxEMPName);
	}
	
	public void clickOnSaveBtn() {
		Click(clickEditAndSavebtn);
	}
	
	public void Count() {
		long count;
		count=CountStatusOnAdmin(listCountEnabled);
		Reporter.log("Count of employees status having 'Enabled' is " +count);
		count=CountStatusOnAdmin(listCountDisabled);
		Reporter.log("Count of employees status having 'Disabled' is " +count);
	}
}
