package flipkart_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Locator {
	WebDriver driver;
	public HomePage_Locator(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name=\"q\"]")
	private WebElement enterProductName;
	public WebElement getProductName()
	{
		return enterProductName;
	}
	@FindBy(xpath="//input[@name=\"q\"]/preceding::button[@type=\"submit\"]")
	private WebElement cllickOnSubmitBtn;
	
	public WebElement getClickOnSubmitBtn()
	{
		return cllickOnSubmitBtn;
	}
	
	

}
