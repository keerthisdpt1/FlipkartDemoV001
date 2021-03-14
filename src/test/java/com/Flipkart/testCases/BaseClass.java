package com.Flipkart.testCases;


import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Flipkart.utilities.ReadConfig;


public class BaseClass{

	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String brow) throws Exception
	{
		Properties p1= ReadConfig.GetPropertyData();
		if(brow.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", p1.getProperty("chromepath"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(brow.equals("IE"))
		{
			//IEDriver
		}
		else if(brow.equals("firefox"))
		{
			//FirefoxDriver
		}
		logger=Logger.getLogger("Flipkart");
		PropertyConfigurator.configure("log4j.properties");
	}
		
	@AfterClass
	public void tearDown() 
	{
		//driver.quit(); 
	}
			
	
}
