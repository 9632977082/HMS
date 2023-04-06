package TC_013;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appName.objectRepository.AddDoctorPage;
import com.appName.objectRepository.AdminLogin;
import com.appName.objectRepository.Admin_page;
import com.appName.objectRepository.HomePage;
import com.orgName.genericUtility.BaseClass;
import com.orgName.genericUtility.File_utility;
import com.orgName.genericUtility.Java_lib;
import com.orgName.genericUtility.WebdriverUtility;

public class TC_13 extends BaseClass
{
	@Test
	public void TC13() throws IOException
	{

		File_utility flib = new File_utility();
		
		WebdriverUtility wlib = new WebdriverUtility();
		Java_lib jlib = new Java_lib();
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
		home.AdminModule();
		AdminLogin login = new AdminLogin(driver);
		login.Adminlogin(USER, PWD);
		
		Admin_page admin = new Admin_page(driver);
		admin.toCreateDoctor();
		
		AddDoctorPage add = new AddDoctorPage(driver);
		WebElement ele = add.getSpecialization();
		
		wlib.SelectSpecialization(ele, 1);
		
		String name = flib.toFillDcotorDetails("DoctorName")+jlib.getRandomNum();
		String address = flib.toFillDcotorDetails("ClinicAddress")+jlib.getRandomNum();
		String fees = flib.toFillDcotorDetails("ConsultancyFeez");
		String Num = flib.toFillDcotorDetails("ContactNo");
		String email = flib.toFillDcotorDetails("Email")+jlib.getRandomNum();
		String pwd = flib.toFillDcotorDetails("Password")+jlib.getRandomNum();
		
		add.prvoideDoctorDetials(name, address, fees, Num, email, pwd);
		
		wlib.AlertAccept(driver);
		
		admin.toClickOnManageDoctor();
		
	}

}
