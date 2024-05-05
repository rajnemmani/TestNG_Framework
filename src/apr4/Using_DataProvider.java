package apr4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Using_DataProvider {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@DataProvider
	public Object supplyData()
	{
		Object login [][]= {{"Admin", "Qedge123!@#"},{"Admin", "Qedge12e"},{"Admin", "Qedge123!@#"},
				{"Admin1", "Qedge123!@#"},{"Admin", "Qedge123!@#"}};
		return login;
	}
	@Test(dataProvider = "supplyData")
	public void verify_Login(String user, String pass) throws Throwable
	{
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtUsername")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			org.testng.Reporter.log("Login Success::"+Expected+"     "+Actual, true);
		}
		else
		{
			org.testng.Reporter.log("Login Fail::"+Expected+"     "+Actual, true);
		}
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
