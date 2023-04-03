package com.orgName.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass 
{
	File_utility file = new File_utility();
	
	public	static WebDriver driver;
	@BeforeSuite
	public void BS()
	{
		System.out.println("openDb");
	}
	@BeforeClass
	public void BC()
	{
		System.out.println(" execute in parallel");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("launch the browser");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			driver=new ChromeDriver();	
            

	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("login to app");
	}
	@AfterMethod
	public void  AM()
	{
		System.out.println(" logout from app");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("close the browser");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("executed succesfully");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("close data base");
	}

}
