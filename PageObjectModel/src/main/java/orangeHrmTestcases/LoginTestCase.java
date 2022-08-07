package orangeHrmTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import orangeHRm.LoginPage;

public class LoginTestCase {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); //maximize window
		
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			
			LoginPage login = new LoginPage(driver);
			
			login.typeUserName("Admin");
			login.typePassword("admin123");
			login.clickOnLoginbutton();
			
			
			driver.quit();
			
			
	}

}
