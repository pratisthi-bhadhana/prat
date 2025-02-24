package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	//	LoginPage loginpg = new LoginPage(driver);
		LoginPage2 loginpg = new LoginPage2(driver);

		driver.get("https://www.saucedemo.com/v1/");

		
		loginpg.enterUserName("standard_user");
		loginpg.enterPassword("secret_sauce");
		loginpg.clickonLoginBtn();
		
		
	}

}
