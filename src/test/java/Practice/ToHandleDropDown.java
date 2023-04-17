package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ToHandleDropDown 
{
	@Test
	public void DropDown()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/multiSelectDropdown.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//select[@id='hotel']"));
		Select s = new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("j");
		s.selectByVisibleText("biryani");
		s.deselectAll();
		List<WebElement> options = s.getOptions();
		
		ArrayList  a = new ArrayList();
		for (WebElement webElement : options) 
		{
			a.add(webElement.getText());
		}
	
	
		Collections.sort(a);
		for (Object a1 : a) 
		{
			System.out.println(a1);
		}
		
	}

}
