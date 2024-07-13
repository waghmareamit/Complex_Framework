package WebCommonFunction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebWindowsHandel {
	
	public WebDriver driver=null;
	
	public  WebWindowsHandel(WebDriver driver) 
	{
		
	//WebDriver driver=null;
		this.driver=driver;
	Set<String>windows=driver.getWindowHandles();//[parent,child window]
	Iterator<String> it=windows.iterator();
	String parentId=it.next();
	String childId=it.next();
	driver.switchTo().window(childId);
	driver.manage().window().maximize();
	//return driver;
	
	}
	static public WebDriver windowHandle(WebDriver driver)
	{
		String parentHandle= driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles)
		{
			if(!handle.equals(parentHandle))
			{
				driver.switchTo().window(handle);
			}
		}
		return driver;
	}

}
