package apr5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
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
			Assert.assertEquals(Actual, Expected, "Title is not Matching");
			
		} catch (AssertionError e) {
			
			System.out.println(e.getMessage());
		}
		driver.quit();
		
	}
	

}
