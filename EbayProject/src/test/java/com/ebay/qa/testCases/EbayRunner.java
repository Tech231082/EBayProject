package com.ebay.qa.testCases;

import org.testng.TestNG;

public class EbayRunner {

	static TestNG testNG;
	
	public static void main(String[] args) {
		testNG=new TestNG();
		testNG.setTestClasses(new Class[] {LoginPageTest.class,HomePageTest.class});
		testNG.run();

	}

}
