package TC_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.appName.objectRepository.BookMyAppointment_page;
import com.appName.objectRepository.DoctorLogin;
import com.appName.objectRepository.HomePage;
import com.appName.objectRepository.LoginPage;
import com.appName.objectRepository.User_page;
import com.orgName.genericUtility.BaseClass;
import com.orgName.genericUtility.File_utility;
import com.orgName.genericUtility.WebdriverUtility;

public class BookAnAppointment extends BaseClass
{
	

	@Test
	public void BookAnAppointment() throws IOException, InterruptedException 
	{
             


		WebdriverUtility wlib = new WebdriverUtility();


		File_utility file = new File_utility();
		String URl = file.Patient("url");
		String UN = file.Patient("un");
		String PW = file.Patient("pw");



		String USER = file.Doctor("un");
		String PWD = file.Doctor("pw");

		WebDriver driver=this.driver;
	//	System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
	//	WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage home = new HomePage(driver);
		home.PatientModule();
		LoginPage login = new LoginPage(driver);
		login.Log_in(UN, PW);

		User_page user = new User_page(driver);
		user.Appointment();


		BookMyAppointment_page special = new BookMyAppointment_page(driver);
		WebElement ele = special.getSpecialization();

		wlib.SelectSpecialization(ele, 3);	

		WebElement ele1 = special.getDoctor();

		wlib.SelectDoctor(ele1, 0);

		special.PickDateInCalendar();


		special.SetTime();

		special.Submit();

		wlib.AlertAccept(driver);

		user.Logout();
            
		wlib.JavaScriptExecutorToScrollDown(driver);

	   

		Thread.sleep(2000);
	
		home.DoctorModule();
		
		DoctorLogin doc = new DoctorLogin(driver);
		doc.DoctorsLogin(USER, PWD);
	
	//	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USER);
	//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PWD);
	//	driver.findElement(By.xpath("//button[@name='submit']")).click();

	//	driver.findElement(By.xpath("//p[@class='cl-effect-1']/a")).click();
	//	driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	//	driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-dark']/li[3]")).click();
	}


}
