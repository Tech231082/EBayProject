package com.ebay.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ebay.qa.util.TestUtil;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTest()  {
		try {
			prop=new Properties();
			//FileInputStream fis;
			
				FileInputStream fis = new FileInputStream("C:\\Users\\parmod.kumar\\git\\EBayProject\\EbayProject\\src\\main\\java\\com\\ebay\\qa\\config\\config.properties");
			 
				prop.load(fis);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
			
			//launching chrome browser
			driver=new ChromeDriver();
		}else {
       System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
			
			//launching chrome browser
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		
		//launch the url
		driver.get(prop.getProperty("url"));
		
	}

}
