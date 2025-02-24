package Tngg;

import org.testng.annotations.Test;

public class TNG_grouping {
@Test(groups= "software company")
	public void infosys() {
		System.out.println("Welcome to Infosys");
	}
	@Test(groups= "software company")
	public void wipro() {
		System.out.println("Welcome to Wipro");
	}

@Test(groups= "automobile company")
public void maruti() {
	System.out.println("Welcome to Maruti");
}

@Test(groups= "automobile company")
public void skoda() {
	System.out.println("Welcome to Skoda");
}
}
