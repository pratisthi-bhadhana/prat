package paack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hypeee_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		
			driver.get("https://www.calculator.net/");
			
			
			List <WebElement> linkElements =driver.findElements(By.tagName("a"));
			
			System.out.println("Total Link on web :" + linkElements.size());
			
			driver.close();
			
			

	}

	}}
