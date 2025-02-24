package paack1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rere {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

//WebDriver driver = new ChromeDriver();
//driver.manage().window().maximize();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		int rescode=200;
		int brokenLinkCnt=0;
		
		System.out.println(linklist.size());
		
		for(WebElement element : linklist) {
			//will store the links of element in url variable 
			String url = element.getAttribute("href");
			try {
				URL urlLink = new URL(url);
				
				HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				rescode = huc.getResponseCode();
				if(rescode>=400) {
					System.out.println("Deadlink" + url);
					brokenLinkCnt++;
				}
			}
			catch(MalformedURLException e)
			{
				
			}
			catch(Exception e)
			{
		}
		}
		System.out.println(brokenLinkCnt);
		
	}}
