package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;

import base.BaseClass;

public class PIMPage extends BaseClass {
	
	public PIMPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static By PIMmenuLink=By.xpath("//b[contains(text(),'PIM')]");
	public static By addEmployeeLink=By.id("menu_pim_addEmployee");
	public static By textBoxFirstName=By.id("firstName");
	public static By textBoxMiddleName=By.id("middleName");
	public static By textBoxLastName=By.id("lastName");
	public static By CheckBoxClick=By.id("chkLogin");
	public static By textBoxUserName=By.id("user_name");
	public static By textBoxUserPassword=By.id("user_password");
	public static By textBoxConfirmPassword=By.id("re_password");
	public static By ButtonSave=By.id("btnSave");
	public static By choosePhoto=By.xpath("//input[@id='photofile']");
	
	public void PIMLink() {
		ActionsOnLink(PIMmenuLink);
	}
	
	public void addEmployeeLink() {
		Click(addEmployeeLink);
	}
	
	public void sendTextToFirstName(String data) {
		SendKeys(textBoxFirstName, data);
	}
	
	public void sendTextToMiddleName(String data) {
		SendKeys(textBoxMiddleName, data);
	}	

	public void sendTextToLastName(String data) {
		SendKeys(textBoxLastName, data);
	}
	
	public void uploadPhoto() throws Exception {
		Click(choosePhoto);
		StringSelection ss = new StringSelection("D:\\Jellyfish.jpg");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     robotClass();
	}
	
	public void clickCheckBox() {
		Click(CheckBoxClick);
	}
	
	public void sendTextToUserName(String data) {
		SendKeys(textBoxUserName, data);
	}
	
	public void sendTextToUserPassword(String data) {
		SendKeys(textBoxUserPassword, data);
	}
	
	public void sendTextToConfirmPassword(String data) {
		SendKeys(textBoxConfirmPassword, data);
	}
	
	public void clickOnSaveButton()
	{
		Click(ButtonSave);
	}

}
