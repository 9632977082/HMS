package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TreeSet 
{
	@Test
	public void set()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/multiSelectDropdown.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//select[@id='hotel']"));
		Select s = new Select(ele);
		List<WebElement> a = s.getOptions();
		java.util.TreeSet<String> t = new java.util.TreeSet<String>();
		for (WebElement e : a) 
		{
			t.add(e.getText());
		}
		ArrayList<String> a1 = new ArrayList(t);
		for (String g : a1) 
		{
			System.out.println(g);
		}
		
	}

}
