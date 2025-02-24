package Tngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v122.serviceworker.model.ServiceWorkerErrorMessage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TNG_Neo {
@Test(dataProvider="credentials")
	public void verifyLoginCredentials(String scenario, String mobile, String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localneoqa.bridge2capital.com:3000/auth/login");

		System.out.println(driver.getTitle());
		driver.manage().window().maximize();

		driver.findElement(By.name("mobileNumber")).sendKeys(mobile);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		if(scenario.equals("bothcorrect")) {
			WebElement home = driver.findElement(null);
			Assert.assertTrue(home.isDisplayed());
		}
		else if(scenario.equals("bothwrong")) {
			String error =driver.findElement(By.xpath("//p[@id=':R59alauuuta:-helper-text']")).getText();
			Assert.assertEquals(error,"Incorrect mobile number");
		}
	}
	@DataProvider(name="credentials")
	public Object[][] getData(){
		return new Object[][] {
			{"bothcorrect","1800000001","test1234"},
			{"bothwrong","1800000001","test1234"}
		};
	}
	}
