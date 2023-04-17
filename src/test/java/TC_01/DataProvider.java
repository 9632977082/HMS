package TC_01;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.appName.objectRepository.AdminLogin;
import com.appName.objectRepository.Admin_page;
import com.appName.objectRepository.EditPatientInformationPage;
import com.appName.objectRepository.HomePage;
import com.appName.objectRepository.LoginPage;
import com.appName.objectRepository.User_page;
import com.aventstack.extentreports.util.Assert;
import com.orgName.genericUtility.BaseClass;
import com.orgName.genericUtility.File_utility;
import com.orgName.genericUtility.Java_lib;
import com.orgName.genericUtility.WebdriverUtility;

public class DataProvider extends BaseClass
{
	
	@Test(dataProvider = "getData")
	public void Data(String data) throws IOException, InterruptedException
	{
		WebDriver driver=this.driver;
		Java_lib jlib = new Java_lib();
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
		//	data+jlib.getRandomNum();
		//	String data = "udupi";
		EditPatientInformationPage edit = new EditPatientInformationPage(driver);
		edit.EditPageInformation(data+jlib.getRandomNum());

		user.Logout();
		home.AdminModule();

		AdminLogin admin = new AdminLogin(driver);
		admin.Adminlogin(USER, PWD);

		org.testng.Assert.fail();
		Admin_page admin1 = new Admin_page(driver);
		admin1.ClickOnUserIconandManageUserIcon();

		admin1.AdminLogout();
	   

	//	driver.close();

	}
	@org.testng.annotations.DataProvider(name = "getData")
	public Object[][] data()
	{
		Object[][] data = new Object[4][1];

		data[0][0]="good1";

		data[1][0]="Bad";

		data[2][0]="veryBAd";

		data[3][0]="no";

		return data;
	}

}
