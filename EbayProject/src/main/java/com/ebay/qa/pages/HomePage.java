package com.ebay.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ebay.qa.base.BaseTest;

public class HomePage extends BaseTest{
	//create page object repo for homepage
	@FindBy(xpath="//div[@id='gh-top']//descendant::button[@id='gh-ug']")
	@CacheLookup
	WebElement usernameLabel;
	
	
	@FindBy(className="gh-eb-li-a")
	@CacheLookup
	WebElement myEbay;
	
	@FindBy(xpath="//a[contains(text(),' Daily Deals')]")
	@CacheLookup
	WebElement dailyDeals;
	
	@FindBy(xpath="//a[contains(text(),' Help & Contact')]")
	@CacheLookup
	WebElement helpContact;
	
	@FindBy(xpath="//a[contains(text(),' Gift Cards')]")
	@CacheLookup
	WebElement giftCards;
	
	@FindBy(id="gh-cat")
	@CacheLookup
	WebElement dropDown;
	
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
	
	public void getDropDownList() {
		Select select=new Select(dropDown);
		List<WebElement> list=new ArrayList();
		list=select.getOptions();
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	}
	
	
}
