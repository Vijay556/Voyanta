package PageFactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	/**
	 * All WebElements are identified by @FindBy annotation
	 */
	WebDriver driver;
	@FindBy(id="Email")  
	WebElement userEmail;
	
	@FindBy(name="Password")
	WebElement usrPassword;
	
	@FindBy(xpath="//button[@id='button']") 
	WebElement loginButton;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	//Enter email in textbox
	public void setUserName(String strEmail){
		userEmail.sendKeys(strEmail);
		
	}
	
	//Enter password in password textbox
	public void setPassword(String strPassword){
		usrPassword.sendKeys(strPassword);
	}
	
	//Click on login button
	public void clickLogin(){
		loginButton.click();
	}
	
	/**
	 * Allows the users to login into the application
	 */
	public void loginToVoyanta(String strEmail,String strPasword){
		//Fill user name
		this.setUserName(strEmail);
		//Fill password
		this.setPassword(strPasword);
		//Click Login button
		this.clickLogin();
				
	}
}
