package com.Flipkart.testCases;


import java.util.Properties;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.Flipkart.pageObjects.LoginPage;
import com.Flipkart.utilities.ReadConfig;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws Exception
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
		Thread.sleep(2000);
		lp.setMobileNumber(p.getProperty("mobile"));
		logger.info("enter mobile number");

		lp.clickContinue(); 
		logger.info("click continue");
		Thread.sleep(2000);
		
		lp.setPassword1(p.getProperty("password"));
		logger.info("enter password again");
		
		lp.clickLogin(); 
		logger.info("click Login");
		
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
