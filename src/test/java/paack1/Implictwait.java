package paack1;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;
public class Implictwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Stopwatch watch =null;
		
		try {
		watch = Stopwatch.createStarted();
		
		driver.findElement(By.linkText("START SELLING"));
		
		}
		catch(Exception e) {
			
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS)  + "seconds");
		}
		
	}

}
