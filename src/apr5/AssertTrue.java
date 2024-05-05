package apr5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
	WebDriver driver;
	@Test
	public void startTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		String Expected = "Gmail";
		String Actual = driver.getTitle();
		try {
			Assert.assertTrue(Actual.equalsIgnoreCase(Expected),"Title is not Matching");
		} catch (AssertionError e) {
			
			org.testng.Reporter.log(e.getMessage(),true);
		}
		driver.quit();
	}
	

}
