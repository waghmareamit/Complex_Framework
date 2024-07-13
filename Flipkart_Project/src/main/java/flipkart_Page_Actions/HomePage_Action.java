package flipkart_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import WebCommonFunction.WebButton;
import WebCommonFunction.WebTextBox;
import flipkart_Page_Locators.HomePage_Locator;

public class HomePage_Action {
	WebDriver driver=null;
	HomePage_Locator homePagePL;
	ExtentTest logger;
	public HomePage_Action(WebDriver driver,ExtentTest graphicalTest)
	{
		this.driver=driver;
		logger=graphicalTest;
		homePagePL =new	HomePage_Locator(driver);
	}
	public void enterName(String productName)
	{   
		WebTextBox.sendInput(homePagePL.getProductName(),productName);
		logger.log(LogStatus.PASS, "I have sucssessfully enterd product Name");
		   
	}
	public void clickOnBtn()
	{
		WebButton.click(homePagePL.getClickOnSubmitBtn());
		logger.log(LogStatus.PASS,"I have  clicked on submit button");
	}
	
	public void homePageActions(String productName)
	{
		enterName(productName);
		clickOnBtn();
	}
	
}
