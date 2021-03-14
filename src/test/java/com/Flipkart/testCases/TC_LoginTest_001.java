package com.Flipkart.testCases;


import java.util.Properties;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.Flipkart.pageObjects.LoginPage;
import com.Flipkart.utilities.ReadConfig;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public static void loginTest() throws Exception
	{
		Properties p = ReadConfig.GetPropertyData();
		driver.get(p.getProperty("baseURL"));
		Thread.sleep(2000);
		logger.info("URL is opened");
		
		LoginPage lp= new LoginPage(driver);
				
		lp.setUserName(p.getProperty("username"));
		logger.info("enter username");
		
		lp.setPassword(p.getProperty("password"));
		logger.info("enter password");
		
		lp.clickSubmit(); 
		logger.info("click submit");
		Thread.sleep(3000);
		
		lp.setSearch(p.getProperty("searchI"));
		logger.info("Search an item");
		Thread.sleep(2000);
		
		lp.clickSearch();
		logger.info("click search button");
		Thread.sleep(2000);
		
		lp.clickCart();
		logger.info("click cart");
		Thread.sleep(2000);
		lp.clickPlaceOrder();
		logger.info("click place order");
		if(driver.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			Assert.assertTrue(true);
			logger.info("Login test pass");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
}
