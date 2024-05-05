package apr2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstClass {
  @Test
  public void login() {
	 org.testng.Reporter.log("Executing login testing", true);
 }
  @Test
  public void compose() {
	  org.testng.Reporter.log("executing Compose testing",true);
  }
  @Test
  public void reply() {
	  org.testng.Reporter.log("Executing Reply Testing",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  org.testng.Reporter.log("Executing beforMethod", true);
  }

  @AfterMethod
  public void afterMethod() {
	  org.testng.Reporter.log("Executing afterMethod", true);
  }

  @BeforeTest
  public void beforeTest() {
	  org.testng.Reporter.log("Executing beforeTest", true);
  }

  @AfterTest
  public void afterTest() {
	  org.testng.Reporter.log("Executing afterTest", true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  org.testng.Reporter.log("Executing BeforSuite", true);
  }

  @AfterSuite
  public void afterSuite() {
	  org.testng.Reporter.log("Executing afterSuite", true);
  }

}
