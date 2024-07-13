package flipkart_Test;

import java.io.IOException;

import org.testng.annotations.Test;

import common_Static_Data.Common_Static_Data;
import dataSources.PropertyReader;
import dataSources.WebBaseClass;
import flipkart_Page_Actions.AppleListPage_Action;
import flipkart_Page_Actions.HomePage_Action;

public class flipkart_Test extends WebBaseClass {

	@Test(description = "Flipkart Home page Access")
	public void homePageProcess() throws IOException {
		HomePage_Action homePagePA = new HomePage_Action(driver,graphicalTest);
		homePagePA.homePageActions(PropertyReader.getPropertyValue(Common_Static_Data.ConfigPropertyPath, "productName"));
		
	//	Assert.assertEquals(WebBrowser.validateTitle(driver, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"), true);
		AppleListPage_Action appleListPagePA = new AppleListPage_Action(driver,graphicalTest);
		appleListPagePA.applePageAction();
	}

	
	@Test(description = "Flipkart Home page Access")
	public void flipkartPageProcess() throws IOException {
		HomePage_Action homePagePA = new HomePage_Action(driver,graphicalTest);
		homePagePA.homePageActions(PropertyReader.getPropertyValue(Common_Static_Data.ConfigPropertyPath, "productName"));
		
	//	Assert.assertEquals(WebBrowser.validateTitle(driver, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"), true);
		AppleListPage_Action appleListPagePA = new AppleListPage_Action(driver,graphicalTest);
		appleListPagePA.applePageAction();
}
}
