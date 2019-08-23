package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.BaseTest;

public class HomePage extends BaseTest{
	//create page object repo for homepage
	@FindBy(xpath="//div[@id='gh-top']//descendant::button[@id='gh-ug']")
	WebElement usernameLabel;
	
	@FindBy(className="gh-eb-li-a")
	WebElement myEbay;
	
	@FindBy(xpath="//a[contains(text(),' Daily Deals')]")
	WebElement dailyDeals;
	
	@FindBy(xpath="//a[contains(text(),' Help & Contact')]")
	WebElement helpContact;
	
	@FindBy(xpath="//a[contains(text(),' Gift Cards')]")
	WebElement giftCards;
	
	//initialization of page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//home page class methods
	
	public String homePageTitle() {
		String title=driver.getTitle();
		return title;
	}
	
	
	public MyEbayPage ClickOnMyEbaylink() {
		myEbay.click();
		return new MyEbayPage();
	}
	
	public DailyDealsPage clickOnDailyDealsLink() {
		dailyDeals.click();
		return new DailyDealsPage();
	}

	public HelpContactsPage clickOnHelpContactLink() {
		helpContact.click();
		return new HelpContactsPage();
	}
	
	public GiftCardsPage clickOnGiftCardsLink() {
		giftCards.click();
		return new GiftCardsPage();
	}
}
