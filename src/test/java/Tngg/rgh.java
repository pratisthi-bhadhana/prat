package Tngg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class rgh {

	@Test(invocationCount = 2)
	 public void testGoogleTitle() throws InterruptedException {
	        
	        WebDriver driver = new ChromeDriver();
	   
	        driver.manage().window().maximize();
	      
	        driver.get("https://www.google.com/");
	        
	        
	        Thread.sleep(3000);
	        
	       
	        String actual = driver.getTitle();
	      
	        String expected = "Google";
	   
	        Assert.assertEquals(expected, actual);
	        
	  
	        driver.quit();
	 }}