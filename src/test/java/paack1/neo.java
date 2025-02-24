package paack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class neo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://localneoqa.bridge2capital.com:3000/auth/login");
		
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	
		driver.findElement(By.name("mobileNumber")).sendKeys("1800000001");
		driver.findElement(By.name("password")).sendKeys("test1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
