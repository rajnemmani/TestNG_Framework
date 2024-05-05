package apr3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTestNGClass {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Reporter.log("Running in BeforMethod",true);
	}
	@Test (priority = 2)
	public void admin()
	{
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		Reporter.log("Executing Admin Test",true);
	}
	@Test (priority = 0)
	public void pim()
	{
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		Reporter.log("Executing PIM Test",true);
	}
	@Test (priority = 1)
	public void leave()
	{
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		Reporter.log("Executing Leave Test",true);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		Reporter.log("Running in AfterMethod", true);
	}



}
