package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactoryPages.LoginPage;
import PageFactoryPages.OverviewPage;


public class TestToVerifyIAmOnOverviewPage {

	WebDriver driver;
	LoginPage objLoginPage;
	OverviewPage objOverviewPage;
	
	@BeforeTest
	public void setUp(){
		driver = new FirefoxDriver();   // Considering Firefox to test with
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.voyanta.com");
	}

	/**
	 * 1. Goes to the Log in page (URL being http://www.test.voyanta.com) 
	 * 2. Enters Email Address 
	 * 3. Enters Password
	 * 4. Clicks the Login button
	 * 5. Verifies that you are on the Overview page
	 */
	
	@Test(priority=0)
	public void test_Landing_To_Overview_Page(){
	
	objLoginPage = new LoginPage(driver); //Create Login Page object
	objLoginPage.loginToVoyanta("vkayyam@voyanta.com", "password"); //Assuming "vkayyam@voyanta.com", "password" are valid credentials
	objOverviewPage = new OverviewPage(driver); // Create overview page object
	Assert.assertTrue(objOverviewPage.getOverviewPageDashboardText().toLowerCase().contains("overview")); //Verify Overview Page
	
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit(); //Close the browser
	}
	
}
