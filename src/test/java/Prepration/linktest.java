package Prepration;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.analyticsvidhya.com/blog/?ref=global_footer");
List<WebElement> links = driver.findElements(By.tagName("img"));
System.out.println("Total link on the page is " + links.size());
int brokenlinks =0;
for(WebElement element : links) {
	String url = element.getAttribute("href");
	
	try {
		URL linkurl = new URL(url);
		HttpURLConnection connection =(HttpURLConnection)linkurl.openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		
		int ResCode = connection.getResponseCode();
		if(ResCode>+400) {
			System.out.println( url + "link is broken" + ResCode);
			brokenlinks ++;
			}
		connection.disconnect();
	} catch (Exception e) {
		// TODO Auto-generated catch block
	System.out.println("error" + url);
	}
	
}
System.out.println("broken links are " + brokenlinks);
	}

}
