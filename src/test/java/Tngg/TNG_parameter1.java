package Tngg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNG_parameter1 {
	@Parameters({"Automobile"})
	@Test
	public void testcase1 (String name) {
		System.out.println(name);
	}

}
