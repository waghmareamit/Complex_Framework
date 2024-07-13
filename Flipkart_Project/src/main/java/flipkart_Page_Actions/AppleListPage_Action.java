package flipkart_Page_Actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import WebCommonFunction.WebButton;
import WebCommonFunction.WebWindowsHandel;
import flipkart_Page_Locators.AppleListPage_locator;

public class AppleListPage_Action {
	 WebDriver driver = null;
     ExtentTest logger;
	public AppleListPage_locator listPagePL;

	public AppleListPage_Action(WebDriver driver,ExtentTest graphicalTest) {
		this.driver = driver;
		logger=graphicalTest;
		listPagePL = new AppleListPage_locator(driver);
	}

	public void selectApple() {
		List<WebElement> appleList = listPagePL.selectApple14();
		for (WebElement list : appleList) {
			if (list.getText().equals("Apple iPhone 14 Plus (Blue, 256 GB)")) {
				WebButton.click(list);
			}
		}
		logger.log(LogStatus.PASS, "I have searched right product");
	        
		
				WebWindowsHandel.windowHandle(driver);
	}

	public void clickOnBuyOption() {
		
		
		WebButton.click(listPagePL.clickOnBuyBtn());
		logger.log(LogStatus.PASS, "I have successfully buy the product");
	}

	public void applePageAction() {
		selectApple();
		clickOnBuyOption();
	}

}
