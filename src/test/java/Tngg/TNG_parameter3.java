package Tngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNG_parameter3 {
	@Parameters({"keyword"})
	@Test
	public void googlesearch( String searchdata) {
	  WebDriver driver = new ChromeDriver();
	   
      driver.manage().window().maximize();
    
      driver.get("https://www.google.com/");
      
   WebElement searchbox =  driver.findElement(By.name("q"));
   searchbox.sendKeys(searchdata);
   
  Assert.assertEquals(searchdata,searchbox.getAttribute("value"));
  
  driver.quit();
}
}