package apr5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
	WebDriver driver;
	@Test
	public void startTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		String Expected = "Google";
		String Actual = driver.getTitle();
		try {
			Assert.assertFalse(Actual.equalsIgnoreCase(Expected),"Title is Matching");
		} catch (AssertionError e) {
			
			org.testng.Reporter.log(e.getMessage(),true);
		}
		driver.quit();
	}
	


}
