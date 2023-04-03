package com.orgName.genericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility 
{

	public void JavaScriptExecutorToScrollDown(WebDriver driver)
	{

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");

	}
	public void SelectSpecialization(WebElement ele ,int Index)
	{
		Select s = new Select(ele);
		s.selectByIndex(Index);
	}
	public void SelectDoctor(WebElement ele1 , int index )
	{
                  Select s = new Select(ele1);
                  s.selectByIndex(index);	
	}
	public void AlertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
    public void AlertDismiss(WebDriver driver)
    {
    	driver.switchTo().alert().dismiss();
    }
	
}
