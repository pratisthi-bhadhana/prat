package Tngg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class TNG_parameter {
	@Test
	@Parameters({"i","j"})
	public void add(int a, int b) {
		System.out.println("addition" + "" +  a+b);
	}
@Test
@Parameters({"i","j"})
	public void sub (int a , int b) {
		System.out.println("subtraction" + "" +( a-b));
	}
	@Test
	@Parameters({"i","j"})
	public void multiple(int a, int b) {
		
		System.out.println("multiply" + " " + a*b);
		
	}
}
