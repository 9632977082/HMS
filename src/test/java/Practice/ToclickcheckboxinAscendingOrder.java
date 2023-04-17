package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToclickcheckboxinAscendingOrder 
{
	@Test
	public void toClick()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/checkbox.html");
		List<WebElement> ele = driver.findElements(By.xpath("//body/input[@type='checkbox']"));
		for (WebElement webElement : ele) 
		{
			webElement.click();
			
		}
		for (WebElement webElement : ele) 
		{
			webElement.click();
			
		}
		
	}

}
