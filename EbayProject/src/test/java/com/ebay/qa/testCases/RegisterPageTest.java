package com.ebay.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ebay.qa.base.BaseTest;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.LoginPage;
import com.ebay.qa.pages.RegisterPage;

public class RegisterPageTest extends BaseTest{
	RegisterPage regPage;
	HomePage homePage;
	LoginPage loginPage;
	
	public RegisterPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		regPage=new RegisterPage();
		homePage=new HomePage();
		loginPage=new LoginPage();
				
	}
	
	@Test(enabled=false)
	public void registerTest() {
		loginPage.clickOnRegister();
		homePage=regPage.register(prop.getProperty("firstname"), prop.getProperty("lasname"), prop.getProperty("email"), prop.getProperty("registerPass"));
		
		
	}
	
	@Test(priority=1,invocationCount=1) 
	public void regTitleTest() {
		loginPage.clickOnRegister();
		String rtitle=regPage.regPageTitle();
		//softassert
		//SoftAssert sa =new SoftAssert();
		//sa.assertEquals(rtitle, "Sign in or Register | eBay","Title is not as expected");
		
		Assert.assertEquals(rtitle, "Sign in or Register | eBay1","Title is not as expected");
		System.out.println("Welcome to registration page");
		//putting this statement in the end ensures the execution of code after the assertion statement in case assertion got fail
		//sa.assertAll();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
