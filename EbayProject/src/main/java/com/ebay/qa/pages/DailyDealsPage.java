package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.BaseTest;

public class DailyDealsPage extends BaseTest{
	
	
	//creating page objects
	@FindBy(linkText="Other Deals")
	WebElement otherDeals;
	
	@FindBy(linkText="Featured")
	WebElement featured;
	
	@FindBy(linkText="Tech")
	WebElement tech;
	
	//initialize page objects
	public DailyDealsPage() {
		PageFactory.initElements(driver, this);
		
	}
	//methods
	public String dailyDealsPageTitle() {
		return driver.getTitle();
	}

	public boolean varifyOtherDealsPresent() {
		return otherDeals.isDisplayed();
		
	}
	
	public FeaturedPage clickOnFeaturedLink() {
		featured.click();
		return new FeaturedPage();
	}
	
	public TechPage techPageLink() {
		tech.click();
		return new TechPage();
		
	}
}
