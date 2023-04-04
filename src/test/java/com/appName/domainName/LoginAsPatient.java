package com.appName.domainName;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appName.objectRepository.AdminDashboardPage;
import com.appName.objectRepository.BookMyAppointmentPage;
import com.appName.objectRepository.DoctorHomePage;
import com.appName.objectRepository.HomePage;
import com.appName.objectRepository.LoginPage;
import com.appName.objectRepository.PatientHomePage;
import com.orgName.genericUtility.ExcelLibrary;
import com.orgName.genericUtility.MainClass;
import com.orgName.genericUtility.UtilityClass;

public class LoginAsPatient extends MainClass {

	@Test(priority=0, enabled=false)
	public void testLoginTest() {
		//read all the testdata
		ExcelLibrary excel = UtilityClass.getExcelLibrary();
		String usName=excel.getData("CommonData", 1, 1);
		String pwd=excel.getData("CommonData", 2, 1);
		String AdUn=UtilityClass.getExcelLibrary().getData("CommonData", 5, 1);
		String Adpwd=UtilityClass.getExcelLibrary().getData("CommonData", 6, 1);
		

		//create object for POM class instance
		HomePage hm=new HomePage();
		hm.clickpatientbtn();
		LoginPage lg=new LoginPage();
		lg.loginAction(usName, pwd);
		PatientHomePage patienthomepage=new PatientHomePage();
		patienthomepage.clickOnUpdateProfileLink();
		patienthomepage.editAdressTxt(" New River");
		hm.clickAdminbtn();
		lg.loginAction(AdUn, Adpwd);
		AdminDashboardPage ad=new AdminDashboardPage();
		ad.ClickonUserOption();
		ad.ClickonManageOption();
		ad.AdminLogOut();
		
	}
	
	@Test(priority=1)
	public void Tc2test() throws Throwable {
		ExcelLibrary excel = UtilityClass.getExcelLibrary();
		String usName=excel.getData("CommonData", 1, 1);
		String pwd=excel.getData("CommonData", 2, 1);
		
		
		HomePage hm=new HomePage();
		hm.clickpatientbtn();
		LoginPage lg=new LoginPage();
		lg.loginAction(usName, pwd);
		PatientHomePage patienthomepage=new PatientHomePage();
		patienthomepage.bookMyAppointment();
		BookMyAppointmentPage bookmyappointment=new BookMyAppointmentPage();
		bookmyappointment.bookMyAppointment();
		Thread.sleep(2000);
		patienthomepage.logoutaspatient();
		hm.clickOnDoctorbtn();
		lg.loginAction("arun@gmail.com", "arun123");
		DoctorHomePage doc=new DoctorHomePage();
		doc.appointments();
		doc.patirntNameInListValidation("shyamprasad sharma");
		patienthomepage.logoutaspatient();

	}
	
	@Test(priority=2)
	public void testcase3() throws Throwable {
	ExcelLibrary excel = UtilityClass.getExcelLibrary();
	String usName=excel.getData("CommonData", 1, 1);
	String pwd=excel.getData("CommonData", 2, 1);
	String AdUn=UtilityClass.getExcelLibrary().getData("CommonData", 5, 1);
	String Adpwd=UtilityClass.getExcelLibrary().getData("CommonData", 6, 1);
	
	HomePage hm=new HomePage();
	hm.clickpatientbtn();
	LoginPage lg=new LoginPage();
	lg.loginAction(usName, pwd);
	PatientHomePage patienthomepage=new PatientHomePage();
	patienthomepage.bookMyAppointment();
	BookMyAppointmentPage bookmyappointment=new BookMyAppointmentPage();
	bookmyappointment.bookMyAppointment();
	Thread.sleep(2000);
	patienthomepage.logoutaspatient();
	hm.clickAdminbtn();
	lg.loginAction(AdUn, Adpwd);
	AdminDashboardPage ad=new AdminDashboardPage();
	ad.getAppointmentHistoryAtLN();
	ad.validationOfDoctorName("Arun");
	}
	
}
