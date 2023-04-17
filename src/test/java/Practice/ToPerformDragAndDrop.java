package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToPerformDragAndDrop 
{
	@Test
	public void Drag() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement src = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
		WebElement dst = driver.findElement(By.xpath("//p[.='Drop here']"));
         Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dst).build().perform();
		
	}

}
