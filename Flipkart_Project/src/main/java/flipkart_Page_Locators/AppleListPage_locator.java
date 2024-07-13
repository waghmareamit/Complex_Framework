package flipkart_Page_Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppleListPage_locator {
	
	WebDriver driver;
	public AppleListPage_locator(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class=\"KzDlHZ\"]")
	private List<WebElement> appleList;
	public List<WebElement> selectApple14()
	{
	
		return appleList;
	}
	@FindBy(xpath="//button[@type=\"button\"]")
	private WebElement clickOnBtn;
	
	public WebElement clickOnBuyBtn()
	{
	
		return clickOnBtn;
	}
	
					
	

}
