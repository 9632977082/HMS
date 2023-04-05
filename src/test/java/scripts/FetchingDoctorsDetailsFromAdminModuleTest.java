package scripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appName.objectRepository.AdminDashBoardPage;
import com.appName.objectRepository.AdminLoginPage;
import com.appName.objectRepository.ManageDoctorsPage;
import com.appName.objectRepository.WelComePage;
import com.orgName.genericUtility.MainClass;
import com.orgName.genericUtility.UtilityClass;

public class FetchingDoctorsDetailsFromAdminModuleTest extends MainClass {
@Test
public void adminModule()
{
	WelComePage welComePage=new WelComePage();
	AdminLoginPage adminLoginPage=new AdminLoginPage();
	AdminDashBoardPage adminDashBoardPage=new AdminDashBoardPage();
	ManageDoctorsPage manageDoctorsPage=new ManageDoctorsPage();
	String aUserName = UtilityClass.getExcelLibrary().getData("CommonData",9,1);
	String aPassword = UtilityClass.getExcelLibrary().getData("CommonData",10,1);

	welComePage.getAClickHere();
	adminLoginPage.getAUserNameTextField(aUserName);
	adminLoginPage.getAPasswordTextField(aPassword);
	adminLoginPage.getALoginButton();
	
	adminDashBoardPage.getDoctorsButton();
	adminDashBoardPage.getManageDoctorsButton();
	
	List<WebElement> tHeadings = manageDoctorsPage.getTableHeadings();
	for(int i=0;i<=0;i++)
	{
		for(int j=0;j<tHeadings.size();j++)
		{
		String cName = tHeadings.get(j).getText();
		System.out.println(cName);
		UtilityClass.getExcelLibrary().setDataIntoExcel("DoctorsTable", i, j, cName);
		UtilityClass.getExcelLibrary().saveExcelData("./src/test/resources/testData.xlsx");
		}
	}
}
}
