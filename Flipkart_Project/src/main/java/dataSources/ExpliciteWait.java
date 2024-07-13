package dataSources;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {
	
	 static WebDriver driver;
	
	public ExpliciteWait(WebDriver driver)
	{
		this.driver=driver;
		
	
	}
	public static  WebElement waitForElementToAppear(WebElement findBy)
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(findBy));
		return findBy;
	}
	public static List<WebElement> waitForAllElementList (List<WebElement> findBy)
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfAllElements(findBy));
		return findBy;
		
	}
	
	public static void waitForElementToAppearAlert()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
	}



}