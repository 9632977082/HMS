package TC_03;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.appName.objectRepository.AdminLogin;
import com.appName.objectRepository.HomePage;
import com.orgName.genericUtility.BaseClass;
import com.orgName.genericUtility.File_utility;
import com.orgName.genericUtility.Java_lib;

public class TC_03 extends BaseClass
{
	@Test
	public void Tc_03() throws IOException
	{
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
		
		driver.findElement(By.xpath("//ul[@class='main-navigation-menu']/li[2]")).click();
		driver.findElement(By.xpath("//ul[@class='sub-menu']/li[2]/a/span[.=' Add Doctor']")).click();
	
		WebElement ele = driver.findElement(By.xpath("//select[@name='Doctorspecialization']"));
		
		Select s = new Select(ele);
		s.selectByIndex(4);
		
		String Name = file.toFillDcotorDetails("DoctorName")+jlib.getRandomNum();
		
		driver.findElement(By.xpath("//label[@for='doctorname']/following-sibling::input[@name='docname']")).sendKeys(Name);
		String address = file.toFillDcotorDetails("ClinicAddress")+jlib.getRandomNum();
		driver.findElement(By.xpath("//textarea[@name='clinicaddress']")).sendKeys(address);
		
		      String feez = file.toFillDcotorDetails("ConsultancyFeez");
		      
		driver.findElement(By.xpath("//input[@name='docfees']")).sendKeys(feez);
		
		
	}

}
