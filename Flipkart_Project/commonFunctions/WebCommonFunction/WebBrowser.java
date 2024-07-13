package WebCommonFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebBrowser 
{
	
		@Parameters("browserName")
		public static WebDriver openBrowser(String browserName){
			 WebDriver driver=null;
			switch(browserName.toLowerCase()){
			case "chrome":
				//WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.chrome.driver", "F:\\MyProjects\\Flipkart_Prpject\\Drivers\\chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				   options.addArguments("--remote-allow-origins=*");
				   options.setBinary("C:\\Users\\Amit\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
				
				driver = new ChromeDriver(options);
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				EdgeOptions edgeoption=new EdgeOptions();
				edgeoption.addArguments("--remote-allow-origins=*");
				driver=new EdgeDriver(edgeoption);
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			return driver;
		}
		public static void openUrl(WebDriver driver, String url)
		{
			driver.get(url);
		}
		public static boolean validateTitle(WebDriver driver, String expectedTitle)
		{
			boolean titleMatch= false;
			if(driver.getTitle().equals(expectedTitle))
			{
				titleMatch=true;
			}
			return titleMatch;
		}
	
}
