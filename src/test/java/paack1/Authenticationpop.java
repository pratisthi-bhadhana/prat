package paack1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authenticationpop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
	//	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		

	}

}
