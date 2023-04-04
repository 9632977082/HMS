package com.appName.domainName;

import org.testng.annotations.Test;

import com.appName.objectRepository.AdminAddDoctorPage;
import com.appName.objectRepository.AdminDashboardPage;
import com.appName.objectRepository.HomePage;
import com.appName.objectRepository.ListOfDoctorAdminPage;
import com.appName.objectRepository.LoginPage;
import com.orgName.genericUtility.ExcelLibrary;
import com.orgName.genericUtility.MainClass;
import com.orgName.genericUtility.SeleniumActions;
import com.orgName.genericUtility.UtilityClass;

public class Test05 extends MainClass{
	
	@Test
	public void creatingDoctor() throws Throwable {
		ExcelLibrary excel = UtilityClass.getExcelLibrary();
		
		String AdUn=UtilityClass.getExcelLibrary().getData("CommonData", 5, 1);
		String Adpwd=UtilityClass.getExcelLibrary().getData("CommonData", 6, 1);
		
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
		ad.manageDoctor();
		ListOfDoctorAdminPage list=new ListOfDoctorAdminPage();
		list.ValidateNameOfDoctor("Arun");
		
		
	}

}
