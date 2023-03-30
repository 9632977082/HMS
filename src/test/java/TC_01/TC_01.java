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

public class TC_01 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FileInputStream fis = new FileInputStream("./Credentials.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String URl = pro.getProperty("url");
		String UN = pro.getProperty("un");
		String pwd = pro.getProperty("pw");
		System.out.println(pwd);

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='hms/user-login.php']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("123@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-dark']/li[1]")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//div[@class='panel-body']/form/div[3]/input"));
		ele.sendKeys("udupi"); 
		driver.findElement(By.xpath("//div[@class='panel-body']/form/button")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-dark']/li[3]")).click();
		driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
		
	}

}
