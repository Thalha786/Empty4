package Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
	@FindBy(name="q")
	
	public static  WebElement editfield;
	
	@FindBy(xpath="(//*[@name='btnK'])[2]")
	public static WebElement btn;
}