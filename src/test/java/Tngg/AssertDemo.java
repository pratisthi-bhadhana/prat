package Tngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
@Test
	public void testMehod() {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("browser launched....");
		
		SoftAssert Softverify = new SoftAssert();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		Reporter.log("link open....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Verify the title");
		String expectedtitle ="Automation Testing Practice1";
		String actualtitle = driver.getTitle();
		Softverify.assertEquals(actualtitle, expectedtitle, "Title verified");

		System.out.print("Verify wekipida icon presence");
		WebElement searchBtn=driver.findElement(By.xpath("//*[@align='top']"));
		Softverify.assertTrue(searchBtn.isDisplayed());
		
		System.out.print("Verify wekipida search box");
		WebElement searchBox=	driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		Softverify.assertTrue(searchBox.isDisplayed());
		driver.close();
	}

}
