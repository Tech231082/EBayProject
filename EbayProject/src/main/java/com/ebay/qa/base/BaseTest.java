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
	
	static WebDriver driver;
	static Properties prop;
	
	public BaseTest() {
		prop=new Properties();
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("C:\\Users\\parmod.kumar\\git\\AmazonTest\\AmazonTest\\src\\main\\java\\com\\amazon\\qa\\config\\config.properties");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			System.out.println(e.getMessage());
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
	}

}
