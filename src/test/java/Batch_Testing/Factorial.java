package Batch_Testing;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, Fact = 1;
		System.out.println("Please enter the no ");
		Scanner number = new Scanner(System.in);
		n= number.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			Fact = Fact*i;
		}
		
		System.out.println("Factorial is " + Fact);
	}

}
