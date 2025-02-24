package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	//constructor
	//Repository where we have elements and methods that will perform on that element
	
	LoginPage(WebDriver d){
		
		driver=d;
	}
	
	By username = By.id("user-name");
	By password = By.id("password");
	By LoginBtn = By.id("login-button");
	
	public void enterUserName(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickonLoginBtn()
	{
		driver.findElement(LoginBtn).click();
	}
}
