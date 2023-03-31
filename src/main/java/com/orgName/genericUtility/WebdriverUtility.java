package com.orgName.genericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WebdriverUtility 
{
	
	public void JavaScriptExecutorToScrollDown(WebDriver driver)
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
	}

}
