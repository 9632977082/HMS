package TC_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.orgName.genericUtility.File_utility;

public class BookAnAppointment 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{

	
		
		File_utility file = new File_utility();
		String URl = file.Patient("url");
		String UN = file.Patient("un");
		String PW = file.Patient("pw");
		

		
		String USER = file.Doctor("un");
		String PWD = file.Doctor("pw");

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='hms/user-login.php']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PW);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//div[@class='container-fluid container-fullw bg-white']/descendant::div/div[3]/descendant::p")).click();

		WebElement ele = driver.findElement(By.xpath("//select[@name='Doctorspecialization']"));
		Select s = new Select(ele);
		s.selectByIndex(4);
		
		WebElement ele1 = driver.findElement(By.xpath("//select[@name='doctor']"));
		Select s1 = new Select(ele1);
		s1.selectByIndex(4);
    
		driver.findElement(By.xpath("//input[@class='form-control datepicker']")).click();
		driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']/div/table/tbody/tr[5]/td[7]")).click();
        driver.findElement(By.xpath("//input[@id='timepicker1']")).click();
        driver.findElement(By.xpath("//div[@class='bootstrap-timepicker-widget dropdown-menu timepicker-orient-left timepicker-orient-bottom open']/table/tbody/tr[1]/td[1]")).click();
        driver.findElement(By.xpath("//div[@class='bootstrap-timepicker-widget dropdown-menu timepicker-orient-left timepicker-orient-bottom open']/table/tbody/tr[3]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        
        Alert a = driver.switchTo().alert();
        a.accept();
        
        driver.findElement(By.xpath("//a[@class='dropdown-toggle']/span")).click();
        driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-dark']/li[3]")).click();
      
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(0,200)");
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//a[@href='hms/doctor/']")).click();
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USER);
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PWD);
       driver.findElement(By.xpath("//button[@name='submit']")).click();
       
       driver.findElement(By.xpath("//p[@class='cl-effect-1']/a")).click();
       driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
       driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-dark']/li[3]")).click();
	}


}
