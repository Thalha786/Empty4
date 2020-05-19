package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;



class Sample
{
	ExtentReports extentreport;
	ExtentHtmlReporter exhtml;
	@Test
	public void method()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		WebElement cal=driver.findElement(By.xpath("//*[@id='datepicker']"));
		cal.click();
		WebElement next=driver.findElement(By.xpath("//*[text()='Next']"));
		next.click();
		WebElement date=driver.findElement(By.xpath("//*[text()='10']"));
		date.click();
			}
	
	@BeforeSuite
	public void methois()
	{
		extentreport=new ExtentReports();
	}
}