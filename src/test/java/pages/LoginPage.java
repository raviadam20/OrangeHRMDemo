package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static By userNameTextField = By.xpath("//input[@id='txtUsername']");
	public static By passtextfield = By.xpath("//input[@id='txtPassword']");
	public static By loginfield = By.xpath("//input[@id='btnLogin']");
	
	
	public void sendUserName(String Data)
	{
		SendKeys(userNameTextField, Data);
		
	}
	public void sendPassword(String Data)
	{
		SendKeys(passtextfield, Data);
		
	}
	public void clickOnLoginBtn()
	{
		Click(loginfield);
		
	}

}
