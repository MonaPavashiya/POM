package orangeHRm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver driver;

	
	public  LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}
		
	By username = By.xpath("//input[@id='txtUsername']");
	By password =By.xpath("//input[@id='txtPassword']");
	By loginButton =By.xpath("//input[@name='Submit']");
	
	
	public void typeUserName(String user)
	{
		driver.findElement(username).sendKeys(user);;
	}
	
	public void typePassword(String psw)
	{
		driver.findElement(password).sendKeys(psw);
	}
	
	public void clickOnLoginbutton()
	{
		driver.findElement(loginButton).click();
	}
	
}


