package TC_17;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appName.objectRepository.BookMyAppointment_page;
import com.appName.objectRepository.DoctorLogin;
import com.appName.objectRepository.DoctorPage;
import com.appName.objectRepository.HomePage;
import com.appName.objectRepository.LoginPage;
import com.appName.objectRepository.User_page;
import com.orgName.genericUtility.BaseClass;
import com.orgName.genericUtility.File_utility;
import com.orgName.genericUtility.WebdriverUtility;

public class TC17 extends BaseClass
{
	@Test
	public void TC_17() throws IOException
	{
		WebDriver driver=this.driver;

		WebdriverUtility wlib = new WebdriverUtility();

		File_utility file = new File_utility();
		String URl = file.Patient("url");
		String UN = file.Patient("un");
		String PW = file.Patient("pw");



		String USER = file.Admin("user");
		String PWD = file.Admin("pwd");



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

		home.DoctorModule();
		String USER1 = file.Doctor("un");
		String PW1 = file.Doctor("pw");

		DoctorLogin doc = new DoctorLogin(driver);
		doc.DoctorsLogin(USER1, PW1);
         
	//    driver.findElement(By.xpath("//h2[.='My Appointments']/../descendant::p/a")).click();
		
		DoctorPage page = new DoctorPage(driver);
		page.BookAppointMents();
		
		page.Logout2();
		page.logout();

	}

}
