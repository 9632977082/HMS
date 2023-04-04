package TC_07;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appName.objectRepository.AddDoctorPage;
import com.appName.objectRepository.AdminLogin;
import com.appName.objectRepository.Admin_page;
import com.appName.objectRepository.DoctorLogin;
import com.appName.objectRepository.DoctorPage;
import com.appName.objectRepository.HomePage;
import com.orgName.genericUtility.BaseClass;
import com.orgName.genericUtility.File_utility;
import com.orgName.genericUtility.Java_lib;
import com.orgName.genericUtility.WebdriverUtility;

public class TC_07 extends BaseClass
{
	@Test
	public void tc07() throws IOException
	{
		WebDriver driver=this.driver;

		WebdriverUtility wlib = new WebdriverUtility();
		Java_lib jlib = new Java_lib();

		File_utility file = new File_utility();
		String URl = file.Patient("url");
		String UN = file.Patient("un");
		String PW = file.Patient("pw");



		String USER = file.Admin("user");
		String PWD = file.Admin("pwd");

		String user2 = file.Doctor("un");
		String pw2 = file.Doctor("pw");

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

		wlib.SelectSpecialization(ele, 4);


		String Name = file.toFillDcotorDetails("DoctorName")+jlib.getRandomNum();


		String address = file.toFillDcotorDetails("ClinicAddress")+jlib.getRandomNum();


		String feez = file.toFillDcotorDetails("ConsultancyFeez");


		String contact1 = file.toFillDcotorDetails("ContactNo");


		String email1 = file.toFillDcotorDetails("Email")+jlib.getRandomNum();


		String pwd = file.toFillDcotorDetails("Password")+jlib.getRandomNum();

		AddDoctorPage add1 = new AddDoctorPage(driver);
		add1.prvoideDoctorDetials(Name, address, feez, contact1, email1, pwd);

		wlib.AlertAccept(driver);

		admin.AdminLogout();

		home.DoctorModule();

		DoctorLogin login1 = new DoctorLogin(driver);
		login1.DoctorsLogin(user2, pw2);

		DoctorPage doctor = new DoctorPage(driver);
		doctor.toUpdatProfile();

		wlib.AlertAccept(driver);
		
		doctor.logout();
		
	}

}
