package Batch_Testing;

public class dbugg {

	public void m1(){
		this.m2();
	System.out.println("I am method M1");
	}
	
	public void m2(){
		System.out.println("I am method M2");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I am main method");
		dbugg d =  new dbugg();
		d.m1();
		System.out.println("This is the end");
		
	}

}
