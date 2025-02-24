package CrossBrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo {
WebDriver driver;

@BeforeMethod
@Parameters("browser")
public void LauchBrowser(String browser) {
	
	switch(browser.toLowerCase()) {
	
	case "chrome":
	driver = new ChromeDriver();
	break;
	
	case "msedge":
		driver = new EdgeDriver();
		break;
		
		default:
			driver= null;
			break;
}}

@Test
public void VerifyTitle() {
	
	driver.get("https://www.google.com/");
	
	String expectedTitle="Google";
	String actualTitle= driver.getTitle();
	
	Assert.assertEquals(expectedTitle, actualTitle);
}

@AfterMethod
public void closebrowser() {
	
	driver.quit();
}
}
