package com.appName.domainName;

import org.testng.annotations.Test;

import com.appName.objectRepository.AdminAddDoctorPage;
import com.appName.objectRepository.AdminDashboardPage;
import com.appName.objectRepository.DoctorHomePage;
import com.appName.objectRepository.HomePage;
import com.appName.objectRepository.ListOfDoctorAdminPage;
import com.appName.objectRepository.LoginPage;
import com.appName.objectRepository.PatientHomePage;
import com.orgName.genericUtility.ExcelLibrary;
import com.orgName.genericUtility.MainClass;
import com.orgName.genericUtility.UtilityClass;

public class Test07 extends MainClass {
	@Test
	public void test06() throws Throwable {
		
		ExcelLibrary excel = UtilityClass.getExcelLibrary();
		
		String AdUn=UtilityClass.getExcelLibrary().getData("CommonData", 5, 1);
		String Adpwd=UtilityClass.getExcelLibrary().getData("CommonData", 6, 1);
		String DocUn=UtilityClass.getExcelLibrary().getData("AddDoctor", 4, 1);
		String DocPwd=UtilityClass.getExcelLibrary().getData("AddDoctor", 5, 1);
		
		HomePage hm=new HomePage();
		hm.clickAdminbtn();
		LoginPage lg=new LoginPage();
		lg.loginAction(AdUn, Adpwd);
		AdminDashboardPage ad=new AdminDashboardPage();
		ad.addDoctor();
		AdminAddDoctorPage addoc= new AdminAddDoctorPage();
		addoc.getSpecialization();
		excel.getList("AddDoctor", (UtilityClass.getDriver()));
		addoc.getSubmitbtn();
		ListOfDoctorAdminPage list=new ListOfDoctorAdminPage();
		list.ValidateNameOfDoctor("Arun");
		PatientHomePage patienthomepage=new PatientHomePage();
		patienthomepage.logoutaspatient();
		hm.clickOnDoctorbtn();
		lg.loginAction(DocUn, DocPwd);
		DoctorHomePage doctorHomePage=new DoctorHomePage();
		doctorHomePage.clickOnUpdateProfileBtn();
		addoc.getSubmitbtn();
		
		
	}
}
