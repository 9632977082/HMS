package TC08;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appName.objectRepository.AdminLogin;
import com.appName.objectRepository.Admin_page;
import com.appName.objectRepository.BookMyAppointment_page;
import com.appName.objectRepository.HomePage;
import com.appName.objectRepository.LoginPage;
import com.appName.objectRepository.User_page;
import com.orgName.genericUtility.BaseClass;
import com.orgName.genericUtility.File_utility;
import com.orgName.genericUtility.WebdriverUtility;

import TC_02.BookAnAppointment;

public class TC_08 extends BaseClass
{
	@Test
	public void TC08() throws IOException
	{
		WebdriverUtility wlib = new WebdriverUtility();
		
		WebDriver driver=this.driver;

		File_utility file = new File_utility();
		String URl = file.Patient("url");
		String UN = file.Patient("un");
		String PW = file.Patient("pw");



		String USER = file.Admin("user");
		String PWD = file.Admin("pwd");
		
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
		
		home.AdminModule();
		
		AdminLogin admin = new AdminLogin(driver);
		admin.Adminlogin(USER, PWD);
		
		Admin_page admin1 = new Admin_page(driver);
		admin1.Appointment();

			
		
	}

}
