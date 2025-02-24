package Prepration;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_broken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.analyticsvidhya.com/all-free-courses/?ref=Navbar");

List<WebElement> links = driver.findElements(By.tagName("img"));
System.out.println("total link on the page" + links.size());
int brokenlinks= 0;

for(WebElement element :links) {
	String url = element.getAttribute("href");


    try {
        URL linkUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) linkUrl.openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();

        int responseCode = connection.getResponseCode();
        if (responseCode >= 400) {
            System.out.println(url + " is a broken link (Response Code: " + responseCode + ")");
            brokenlinks++;
        }
        connection.disconnect();
    } catch (Exception e) {
        System.out.println("Error checking URL: " + url);
    }
}

System.out.println("Total broken links: " + brokenlinks);
}}
