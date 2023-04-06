package TC_12;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.appName.objectRepository.AdminLogin;
import com.appName.objectRepository.Admin_page;
import com.appName.objectRepository.EditPatientInformationPage;
import com.appName.objectRepository.HomePage;
import com.appName.objectRepository.LoginPage;
import com.appName.objectRepository.User_page;
import com.orgName.genericUtility.BaseClass;
import com.orgName.genericUtility.File_utility;
import com.orgName.genericUtility.WebdriverUtility;

public class TC12 extends BaseClass
{
	@Test
	public void TC12() throws IOException, InterruptedException
	{
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
		user.toClickOnMyProfile();
		
		WebdriverUtility web = new WebdriverUtility();
		web.JavaScriptExecutorToScrollDown(driver);

		Thread.sleep(5000);
		String data = "udupi";
		EditPatientInformationPage edit = new EditPatientInformationPage(driver);
		edit.EditPageInformation(data);
		
		user.Logout();
		home.AdminModule();
		AdminLogin login1 = new AdminLogin(driver);
		login1.Adminlogin(USER, PWD);
		
		Admin_page admin = new Admin_page(driver);
		admin.Appointment();
	}
	

}
