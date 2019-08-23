package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.BaseTest;
import com.ebay.qa.pages.CouponsPage;

public class GiftCardsPage extends BaseTest{
	
	//create page factory
	@FindBy(linkText="Coupons")
	WebElement coupons;
	
	
	
	//initialize page objects
	public GiftCardsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//methods
	public String  giftCardsPageTitle() {
		return driver.getTitle();
	}
	
	public CouponsPage clickOnCouponsLinkText() {
		coupons.click();
		return new CouponsPage();
	}


	
	

}
