package Tngg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNG_parameter2 {

	public class TNG_parameter1 {
		@Parameters({"Software"})
		@Test
		public void testcase2 (String name) {
			System.out.println(name);
		}

	}
}
