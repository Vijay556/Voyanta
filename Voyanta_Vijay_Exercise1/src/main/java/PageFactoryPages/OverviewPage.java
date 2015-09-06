package PageFactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

	WebDriver driver;
	
	/**
	 * All WebElements are identified by @FindBy annotation
	 */
	
	@FindBy(css="div.pageheader > h3")
	WebElement overviewPageDashboardText;
	
	public OverviewPage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	
	//Allows to get the dashboard text 
		public String getOverviewPageDashboardText(){
		 return	overviewPageDashboardText.getText();
		}
}
