package TC_04;

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

public class TC_04 extends BaseClass
{
	@Test
	public void TC04() throws IOException
	{
		WebDriver driver=this.driver;
		WebdriverUtility wlib = new WebdriverUtility();
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

		wlib.SelectSpecialization(ele, 4);	

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
		
		driver.findElement(By.xpath("//ul[@class='main-navigation-menu']/li[5]")).click();
		
		Admin_page admin1 = new Admin_page(driver);
		admin1.AdminLogout();


	}

}
