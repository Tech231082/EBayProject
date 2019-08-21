package com.ebay.qa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.BaseTest;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	static LoginPage loginPage;
	static HomePage homePage;
	
	public LoginPageTest()  {
		super();
		
	}
	
	@BeforeMethod
	public void setUp()  {
		initialization();
		//create object of LoginPage class
		loginPage=new LoginPage();
		homePage=new HomePage();
	}
	
	@Test(priority=4)
	public void loginPageTitleTest() {
		String title=loginPage.loginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
		
	}
	
	@Test(priority=2)
	public void test() {
		//loginPage=new LoginPage();
		loginPage.clickOnSignInButton();
		System.out.println("test passed");
	}
	
	@Test(priority=1)
	public void logoImageTest() {
		boolean flag=loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginEbayTest() {
		loginPage.clickOnSignInButton();
		homePage=loginPage.loginEbay(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
