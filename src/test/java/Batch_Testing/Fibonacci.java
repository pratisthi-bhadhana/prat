package Batch_Testing;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =0, b=1, c, term;
		System.out.println("Enter the No ");
		Scanner orignal_no= new Scanner(System.in);
		term= orignal_no.nextInt();
		for(int i =1; i<=term ; i++ ) {
			
			System.out.print(a + " ");
			
			c= a+b;
			
			a=b;
			
			b=c;
		}
	}

}
