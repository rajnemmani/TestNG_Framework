package apr18;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Using_PropertyFile {
WebDriver driver;
Properties conpro;
@Test
public void stsrtTest()throws Throwable
{
	conpro = new Properties();
	conpro.load(new FileInputStream("OR.properties"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(conpro.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath(conpro.getProperty("Objuser"))).sendKeys(conpro.getProperty("username"));
	driver.findElement(By.xpath(conpro.getProperty("Objpass"))).sendKeys(conpro.getProperty("password"));
	driver.findElement(By.xpath(conpro.getProperty("Objlogin"))).click();
	driver.quit();
	
}
}
