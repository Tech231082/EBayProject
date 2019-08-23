package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.BaseTest;

public class HelpContactsPage extends BaseTest{
	
	//initialize page elements
	@FindBy(xpath="//td[@id='gh-title']")
	WebElement helpLabel;
	
	@FindBy(id="search_input_element")
	WebElement searchHelp;
	
	//initialization
	public HelpContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public String verifyHelpLabel() {
		String text=helpLabel.getText();
		return text;
	}
		
	public void searchHelp() {
		searchHelp.sendKeys("Ebay help");
		System.out.println("Asking for help");
		
		
	}
	

}
