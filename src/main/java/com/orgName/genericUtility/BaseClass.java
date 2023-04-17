package com.orgName.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	File_utility flib = new File_utility();
	
	
	public	static WebDriver driver;
	@BeforeSuite(groups ={"smokeTest" ,"RegressionTest"})
	public void BS()
	{
		System.out.println("openDb");
	}
	@BeforeClass(groups =  {"smokeTest" ,"RegressionTest"} )
	public void BC()
	{
		System.out.println(" execute in parallel");
	}
	//@Parameters("Browser")
	@BeforeTest(groups =  {"smokeTest" ,"RegressionTest"} )
	public void BT() throws IOException
	{
		//System.out.println("launch the browser");
	//	System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		//	driver=new ChromeDriver();	
            String Browser = flib.Patient("browser");
            if(Browser.equalsIgnoreCase("chrome"))
            {
            	WebDriverManager.chromedriver().setup();
            	driver=new ChromeDriver();
            }
            else if(Browser.equalsIgnoreCase("firefox"))
            {
            	WebDriverManager.firefoxdriver().setup();
            	     driver=new FirefoxDriver();
            }
            

	}
	@BeforeMethod(groups= {"smokeTest" ,"RegressionTest"} )
	public void BM()
	{
		System.out.println("login to app");
	}
	@AfterMethod(groups={"smokeTest" ,"RegressionTest"} )
	public void  AM()
	{
		System.out.println(" logout from app");
	}
	@AfterTest(groups={"SmokeTest" ,"RegressionTest"} )
	public void AT()
	{
		System.out.println("close the browser");
	}
	@AfterClass(groups={"smokeTest" ,"RegressionTest"} )
	public void AC()
	{
		System.out.println("executed succesfully");
	}
	@AfterSuite(groups={"smokeTest" ,"RegressionTest"} )
	public void AS()
	{
		System.out.println("close data base");
	}

}
