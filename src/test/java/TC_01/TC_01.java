package TC_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.appName.objectRepository.HomePage;
import com.appName.objectRepository.LoginPage;
import com.appName.objectRepository.User_page;
import com.orgName.genericUtility.File_utility;
import com.orgName.genericUtility.WebdriverUtility;

public class TC_01 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		
		File_utility file = new File_utility();
		String URl = file.Patient("url");
		String UN = file.Patient("un");
		String PW = file.Patient("pw");
		
		
			
		String USER = file.Admin("user");
		String PWD = file.Admin("pwd");

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage home = new HomePage(driver);
		home.PatientModule();
				
	
		LoginPage login = new LoginPage(driver);
		login.Log_in(UN, PW);
		
	
		User_page user = new User_page(driver);
		user.toClickOnMyProfile();
		
		WebdriverUtility web = new WebdriverUtility();
		web.JavaScriptExecutorToScrollDown(driver);
	
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//div[@class='panel-body']/form/div[3]/input"));
		ele.sendKeys("udupi"); 
		driver.findElement(By.xpath("//div[@class='panel-body']/form/button")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-dark']/li[3]")).click();
		driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USER);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PWD);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//ul[@class='main-navigation-menu']/li[3]")).click();
		driver.findElement(By.xpath("//span[.=' Manage Users ']")).click();
		
		driver.findElement(By.xpath("//li[@class='dropdown current-user']/a")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-dark']/li[2]")).click();
		
	}

}
