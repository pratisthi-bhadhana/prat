package Batch_Testing;

import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void LoginByMobileNumbber() {
		System.out.println("Login By mobile passed");
	}

	@Test
	public void LoginByEmail() {
		System.out.println("Login By email passed");
}
}