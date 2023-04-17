package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToCheckElementisDidplayed 
{
	@Test
	public void ElementIsDisplayed()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Shivashankar/Favorites/Desktop/xpath_html_documents/checkbox.html");
		WebElement ele = driver.findElement(By.xpath("//body/input[2]"));
		boolean b = ele.isDisplayed();
		Assert.assertTrue(b);
		boolean c = ele.isEnabled();
		Assert.assertTrue(c);
		ele.click();
		boolean a = ele.isSelected();
		Assert.assertTrue(a);
		ele.sendKeys(Keys.ENTER);
		String value = ele.getAttribute("input");
		System.out.println(value);
		String text = ele.getText();
		System.out.println(text);
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(x);
		System.out.println(y);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		Point p = new Point(400,600);
		driver.manage().window().setPosition(p);
		
	}

}
