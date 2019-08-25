package com.ebay.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.BaseTest;
import com.ebay.qa.pages.HelpContactsPage;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.LoginPage;

public class HelpContactsPageTest extends BaseTest {
	LoginPage loginPage;
	HomePage homePage;
	HelpContactsPage helpContactsPage;
	
	public HelpContactsPageTest() {
		super();
		
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();		 
		helpContactsPage=new HelpContactsPage();
		loginPage.clickOnSignInButton();
		homePage=loginPage.loginEbay(prop.getProperty("username"), prop.getProperty("password"));
		helpContactsPage=homePage.clickOnHelpContactLink();
	}
	
	@Test
	public void verifyHelpLabelTest() {
		String ss=helpContactsPage.verifyHelpLabel();
		System.out.println(ss);
	}
	
	@Test
	public void searchHelpTest() {
		helpContactsPage.searchHelp();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
