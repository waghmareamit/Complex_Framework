package dataSources;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import WebCommonFunction.WebBrowser;
import common_Static_Data.Common_Static_Data;

public class WebBaseClass {
	public WebDriver driver = null;
	public static ExtentTest graphicalTest;
	public static ExtentReports graphicalReport;
	@BeforeSuite
	public void beforeSuiteStart()  {
		graphicalReport = new ExtentReports(Common_Static_Data.reportPath, true);
	}
	@BeforeMethod
	public void beforeEachTest(Method testMethod) throws IOException {
		graphicalTest = graphicalReport.startTest(testMethod.getName());
		String s = PropertyReader.getPropertyValue(Common_Static_Data.ConfigPropertyPath, "browser");
		driver = WebBrowser.openBrowser(s);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(PropertyReader.getPropertyValue(Common_Static_Data.ConfigPropertyPath, "flipkartUrl"));
	}
	@AfterMethod
	public void afterEachTest() {
		graphicalReport.endTest(graphicalTest);
		graphicalReport.flush();
		driver.close();
	}

	public static String screenCapture(WebDriver driver) throws IOException {
		TakesScreenshot takeSS = (TakesScreenshot) driver;
		File sourceOutputFile = takeSS.getScreenshotAs(OutputType.FILE);
		File Dest = new File("./Screenshot/fullpage13.png");
		FileUtils.copyFile(sourceOutputFile, Dest);
		String errflpath = Dest.getAbsolutePath();
		return errflpath;
	}

}
