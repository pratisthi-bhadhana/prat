package paack1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
		
	WebDriver driver;
	
		@BeforeMethod
	public void initiate()
	{
			 driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());		
	}
		
		
@Test(priority=0)
public void Login_with_Wrong_Password()
{
	WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	Email.sendKeys("pratyau@gmail.com");
	 
	WebElement password = driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
	password.sendKeys("jkdsgdsyyd");
	
	WebElement clickbtn = driver.findElement(By.xpath("//*[@name=\"login\"]"));
	clickbtn.click();
	
	Assert.assertEquals("https://www.facecbook.com/","https://www.facebook.com/");
	

}
@Test(priority=2)

public void login_with_wrong_email()

{
	WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	Email.sendKeys("Wrong@gmail.com");
	 
	WebElement password = driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
	password.sendKeys("jkdsgdsyyd");
	
	WebElement clickbtn = driver.findElement(By.xpath("//*[@name=\"login\"]"));
	clickbtn.click();
	//Assert.assertEquals("https://www.facebook.com/","https://www.facebook.com/");
	Assert.assertEquals("The email address or mobile number you entered isn't connected to an account. Find your account and log in.", "jhcsgcd");

}


		@Test(priority=1)
		public void login_with_Both_wrong()
		

		{
			WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
			Email.sendKeys("Wrong@gmail.com");
			 
			WebElement password = driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
			password.sendKeys("jkdsgdsyyd");
			
			WebElement clickbtn = driver.findElement(By.xpath("//*[@name=\"login\"]"));
			clickbtn.click();
			
			Assert.assertEquals("https://www.facecbook.com/","https://www.facebook.com/");

		}
		
		@Test(priority=2)
		public void login_with_Both_Right()
		

		{
			WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
			Email.sendKeys("Right@gmail.com");
			 
			WebElement password = driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
			password.sendKeys("jkdsgdsyyd");
			
			WebElement clickbtn = driver.findElement(By.xpath("//*[@name=\"login\"]"));
			clickbtn.click();
			
			Assert.assertEquals("https://www.facecbook.com/","https://www.facebook.com/");

		}
		
		
		
		
	@AfterMethod
	public void end()
	
		{
			driver.close();
	}

}

