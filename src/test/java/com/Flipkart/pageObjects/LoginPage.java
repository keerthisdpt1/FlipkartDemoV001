package com.Flipkart.pageObjects;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		System.out.println("keerthi at LoginPage");
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@class='_2IX_2- VJZDxU']")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="//*[@type='password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//*[@class='_2IX_2- VJZDxU']")
	@CacheLookup
	WebElement txtMobile;
	
	@FindBy(xpath="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	@CacheLookup
	WebElement btnContinue;
	
	
	@FindBy(xpath="//*[@class='_2IX_2- _3mctLh VJZDxU']")
	@CacheLookup
	WebElement txtPassword1;
	
	@FindBy(xpath="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	@CacheLookup
	WebElement btnLogin1;
	
	
	@FindBy(xpath="//*[@placeholder='Search for products, brands and more']")
	@CacheLookup
	WebElement txtSearch;
	
	@FindBy(xpath="//*[@class='L0Z3Pu']")
	@CacheLookup
	WebElement btnSearch;
	
	@FindBy(xpath="//*[@class='KK-o3G']")
	@CacheLookup
	WebElement btnCart;

	@FindBy(xpath="//*[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	@CacheLookup
	WebElement btnPlaceOrder;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnLogin.click();
	}
	public void setMobileNumber(String mobile)
	{
		txtMobile.sendKeys(mobile);
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
	public void setPassword1(String pwd)
	{
		txtPassword1.sendKeys(pwd);
	}
	public void clickLogin()
	{
		btnLogin1.click();
	}
	
	public void setSearch(String searchMe) throws InterruptedException
	{
		txtSearch.sendKeys(searchMe);
		
	}
	public void clickSearch()
	{
		System.out.println("keerthi at click search");
		btnSearch.click();
	}
	
	public void clickCart()
	{
		System.out.println("keerthi at click search");
		btnCart.click();
	}
	public void clickPlaceOrder()
	{
		System.out.println("keerthi at click search");
		btnPlaceOrder.click();
	}
	
}
