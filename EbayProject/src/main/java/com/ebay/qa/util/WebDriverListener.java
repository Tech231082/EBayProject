package com.ebay.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.ebay.qa.base.BaseTest;
import com.ebay.qa.util.*;

public class WebDriverListener extends BaseTest implements WebDriverEventListener{

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicked on element"+element);
		
	}

	
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Element has found:"+by.toString());
		
	}

	
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("Text has been retrieved");
		
	}


	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Navigated back");
		
	}

	
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Navigated forward");
		
	}

	
	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("Navigation refreshed");
		
	}


	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigated to the url:--"+url);
		
	}

	
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicking on element"+element);
		
	}

	
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Navigated back");
		
	}

	
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Navigating back");
		
	}

	
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Navigating forward");
		
	}

	
	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("Getting refreshed");
		
	}

	
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigating to url:"+url);
		
	}

	
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Switching to window:"+windowName);
		
	}

	
	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("Exception ocurred:"+throwable);
		try {
			TestUtil.takeScreenShotAtEndOfTest();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	

	
		
}


