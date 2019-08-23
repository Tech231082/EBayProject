package com.ebay.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.BaseTest;
import com.ebay.qa.pages.DailyDealsPage;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.LoginPage;

public class DailyDealsPageTest extends BaseTest {
	LoginPage loginPage;
	HomePage homePage;
	DailyDealsPage dailyDealsPage;
	
	public DailyDealsPageTest(){
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		dailyDealsPage=new DailyDealsPage();
		loginPage.clickOnSignInButton();
		homePage=loginPage.loginEbay(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickOnDailyDealsLink();
	}
	
	@Test
	public void dailyDealsPageTitleTest() {
		String dealsTitle=dailyDealsPage.dailyDealsPageTitle();
		Assert.assertEquals(dealsTitle, "Daily Deals on eBay | Best deals and Free Shipping");
		
	}
	
	@Test
	public void varifyOtherDealsPresentTest() {
		boolean flag=dailyDealsPage.varifyOtherDealsPresent();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
