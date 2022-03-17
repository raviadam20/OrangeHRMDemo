package base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public BaseClass(WebDriver driver) 
	{
		BaseClass.driver = driver;
	}
	public static WebDriver getdriver()
	{
		return driver;
	}
	public void setup(String data) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to(data);
		Thread.sleep(2000);
		
	}
	public void Teardown()
	{
		driver.quit();
	}
	
	public void SendKeys(By ElementName,String Data)
	{
		WebElement Ele = driver.findElement(ElementName);
		Ele.sendKeys(Data);
	}
	
	public void Clear(By ElementName) {
		WebElement ELe=driver.findElement(ElementName);
		ELe.clear();
	}
	public void ActionsOnLink(By ElementName) {
		Actions ac=new Actions(driver);
		WebElement Ele = driver.findElement(ElementName);
		ac.moveToElement(Ele).clickAndHold().build().perform();
	}
	public void ActionsOnList(By ElementName) {
		Actions act= new Actions(driver);
		WebElement Ele = driver.findElement(ElementName);
		act.moveToElement(Ele).sendKeys(Keys.ENTER).build().perform();
	}
	public void Click(By ElementName)
	{
		
		WebElement Ele = driver.findElement(ElementName);
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By) Ele));
		Ele.click();
	}
	
	public void WaitTime(By ElementName) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ElementName));
	}
	
	public void robotClass() throws Exception {
		Robot robot=new Robot();
		 robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public long CountStatusOnAdmin(By ElementName)
	{
		List<WebElement> statusCount= driver
				.findElements(ElementName);
		return statusCount.size();
	}
}
