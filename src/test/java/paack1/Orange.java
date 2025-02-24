package paack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Orange {

	
	WebDriver driver;
	
	@BeforeMethod
	
	public void login_orange() throws InterruptedException
	{
	
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	    Thread.sleep(8000);
	}	
	
	@Test(priority=0)
	public void Login_with_correct_id_password()
	{
		WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		
		Username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		login.click();
		
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
	}
	
	
	@Test(priority=1)
	public void Login_with_incorrect_id_password() throws InterruptedException
	{
	    Thread.sleep(1000);

		WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		
		Username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		password.sendKeys("adm0in123");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		login.click();
		
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
	}
	

	@AfterMethod
	public void end()
	
		{
			driver.close();

}
}
