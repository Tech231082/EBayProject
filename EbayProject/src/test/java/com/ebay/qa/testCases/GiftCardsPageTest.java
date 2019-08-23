package com.ebay.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.BaseTest;
import com.ebay.qa.pages.GiftCardsPage;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.LoginPage;

public class GiftCardsPageTest extends BaseTest{
	LoginPage loginPage;
	HomePage homePage;
	GiftCardsPage giftCardsPage;
	CouponsPageTest couponsPage;
	public GiftCardsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		giftCardsPage=new GiftCardsPage();
		couponsPage=new CouponsPageTest();
		loginPage.clickOnSignInButton();
		homePage=loginPage.loginEbay(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickOnGiftCardsLink();

}
	
	@Test
	public void giftCardsPageTitleTest() {
		String title=giftCardsPage.giftCardsPageTitle();
		Assert.assertEquals(title, "Gift Cards & Coupons for sale | eBay");
		
	}
	
	@Test
	public void clickOnCouponsLinkTextTest() {
		
		giftCardsPage.clickOnCouponsLinkText();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
