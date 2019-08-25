package com.ebay.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.BaseTest;
import com.ebay.qa.pages.DailyDealsPage;
import com.ebay.qa.pages.GiftCardsPage;
import com.ebay.qa.pages.HelpContactsPage;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.LoginPage;
import com.ebay.qa.pages.MyEbayPage;

public class HomePageTest extends BaseTest{
	LoginPage loginPage;
	HomePage homePage;
	MyEbayPage myEbayPage;
	HelpContactsPage helpContacts;
	GiftCardsPage giftCards;
	DailyDealsPage dailyDealsPage;
	
	public HomePageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		    loginPage=new LoginPage();
			homePage=new HomePage();
			myEbayPage=new MyEbayPage();
			giftCards=new GiftCardsPage();
			helpContacts=new HelpContactsPage();
			dailyDealsPage=new DailyDealsPage();
			loginPage.clickOnSignInButton();
			homePage=loginPage.loginEbay(prop.getProperty("username"), prop.getProperty("password"));
			
		
	}
	
	@Test(enabled=false)
	public void varifyHomePageTitleTest() {
		String title=homePage.homePageTitle();
		Assert.assertEquals(title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay","HomePage title not as expected");
	}
	
	@Test(enabled=false)
	public void clickOnEbayLinkTest() {
		myEbayPage=homePage.ClickOnMyEbaylink();
		
	}
	
	
	@Test(enabled=false)
	public void clickOnDailyDealsLinkTest() {
		dailyDealsPage=homePage.clickOnDailyDealsLink();
		
	}
	
	@Test(enabled=false)
	public void clickOnHelpContactsLinkTest() {
		helpContacts=homePage.clickOnHelpContactLink();
		
	}
	
	@Test(enabled=false)
	public void clickOnGiftCardsLinkTest() {
		giftCards=homePage.clickOnGiftCardsLink();
		
	}
	
	@Test
	public void getDropDownListTest() {
		homePage.getDropDownList();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
