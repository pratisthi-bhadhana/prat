package Batch_Testing;

import org.testng.annotations.Test;

public class HomeSeceenTest {

@Test
	public void LaunchApp() {
		System.out.println("App launch is completed");
	}
	
@Test
	public void VerifyTitle() {
		System.out.println("Title is verified");
	}
	
@Test
	public void VerifyLogo() {
		System.out.println("Logo is verified");
	}
}
