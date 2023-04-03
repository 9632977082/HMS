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

public class TC_01 extends BaseClass
{
	@Test
	public void Tc_01() throws IOException, InterruptedException 
	{
		WebDriver driver=this.driver;

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
		user.toClickOnMyProfile();

		WebdriverUtility web = new WebdriverUtility();
		web.JavaScriptExecutorToScrollDown(driver);

		Thread.sleep(5000);
		String data = "udupi";
		EditPatientInformationPage edit = new EditPatientInformationPage(driver);
		edit.EditPageInformation(data);

		user.Logout();
		home.AdminModule();

		AdminLogin admin = new AdminLogin(driver);
		admin.Adminlogin(USER, PWD);

		Admin_page admin1 = new Admin_page(driver);
		admin1.ClickOnUserIconandManageUserIcon();

         admin1.AdminLogout();
        
         driver.close();
		

	}

}
