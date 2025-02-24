package Batch_Testing;

public class dbugg1 extends dbugg {

	public void m3() {
		System.out.println("I am M3");
	}
	
	public void m4() {
		System.out.println("I am M4");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" I am final");
		dbugg1 r = new dbugg1();
		r.m1();
		r.m3();
		
	}

}
