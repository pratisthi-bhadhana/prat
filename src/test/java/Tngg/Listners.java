package Tngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Tngg.ListnerClass.class)
public class Listners {
	@Test
	public void login() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@Test
	public void fail() {
		System.out.println("Test is fail");
		Assert.assertTrue(false);
	}
	
	@Test
	public void skip() {
		System.out.println("Test is skip");
		throw new SkipException("skip exceptn thrown...");
	}

}
