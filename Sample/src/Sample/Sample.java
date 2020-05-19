package Sample;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class Sample
{
	@Test(timeOut=2000)
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://google.com");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).click();
		
	}
	@Test(dependsOnMethods="test1",alwaysRun=true)
	public void test2()
	{
		System.out.println("Depends on test1");
	}
}