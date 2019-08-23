package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.BaseTest;

public class RegisterPage extends BaseTest{
	//define page elements
	@FindBy(id="firstname")
	WebElement firstname;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="PASSWORD")
	WebElement registerPass;
	
	@FindBy(xpath="//input[@name='checkbox-default']")
	WebElement checkBox;
	
	@FindBy(xpath="//button[contains(text(),'Create account')]")
	WebElement createAccountBtn;
	
	//initialization
	public RegisterPage() {
		PageFactory.initElements(driver,this);
	}
	
	//methods or actions
	public HomePage register(String fn,String ln,String em,String pass) {
		firstname.sendKeys(prop.getProperty("firstname"));
		lastname.sendKeys(prop.getProperty("lastname"));
		email.sendKeys(prop.getProperty("email"));
		firstname.sendKeys(prop.getProperty("registerPass"));
		checkBox.click();
		
		
		createAccountBtn.click();
		return new HomePage();
		
	}
	
	
	
	public String regPageTitle() {
		return driver.getTitle();
	}

	
	
	

}
