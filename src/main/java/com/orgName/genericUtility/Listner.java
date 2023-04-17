package com.orgName.genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{ 
		WebDriver driver;
		String testName = result.getMethod().getMethodName();
		System.out.println(testName+"execute i am listening");
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.driver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		try
		{
			File dst = new File("./Screenshot/"+testName+".png");
		     FileHandler.copy(src, dst);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}