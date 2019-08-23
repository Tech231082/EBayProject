package com.ebay.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.BaseTest;
import com.ebay.qa.pages.HomePage;

public class LoginPage extends BaseTest {
	
		//define page factory/object repository
		@FindBy(xpath="//a[contains(text(),'Sign in')]")
		WebElement signin;
		
		@FindBy(linkText="register")
		WebElement register;
		
		@FindBy(id="userid")
		WebElement userid;
		
		@FindBy(id="pass")
		WebElement pass;
		
		@FindBy(id="sgnBt")
		WebElement signInButton;
		
		@FindBy(xpath="//td[@class='gh-td']//h1//a[@id='gh-la']")
		WebElement logo;
		
		//initialize object elements
		public LoginPage() {
			
			PageFactory.initElements(driver, this);
			
		}
		
		//methods on login page
		public String loginPageTitle() {
			return driver.getTitle();
		}
		
		public boolean validateLogo() {
			return logo.isDisplayed();
		}
		
		
		public void clickOnSignInButton() {
			//WebElement signin=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			signin.click();
			
		}
		
		public RegisterPage clickOnRegister() {
			register.click();
			return new RegisterPage();
		}
		
		public HomePage loginEbay(String username,String password) {
			userid.sendKeys(username);
			pass.sendKeys(password);
			signInButton.click();
			return new HomePage();
			
		}

		
}
