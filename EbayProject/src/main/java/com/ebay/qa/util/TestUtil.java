package com.ebay.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ebay.qa.base.BaseTest;

public class TestUtil extends BaseTest{
	public static int page_load_timeout=20;
	static int implicit_wait=20;

	public static  void takeScreenShotAtEndOfTest() throws IOException{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\parmod.kumar\\git\\EBayProject\\EbayProject\\src\\main\\java\\screenShots\\"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(source,dest);
		
		
	}
}
