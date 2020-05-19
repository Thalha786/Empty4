package project1;

import project1.ChromeDriver;
import project1.Test;
import project1.WebDriver;

class Sample
{
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://google.com");
	}
	
}