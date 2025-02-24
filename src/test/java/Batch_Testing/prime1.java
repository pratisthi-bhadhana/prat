package Batch_Testing;

import java.util.Scanner;

public class prime1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

System.out.println("Enter a no");
int num = s.nextInt();
int isPrime=1;
if (num < 2) {
	isPrime=0;
}
else {
	for (int i =2; i<=Math.sqrt(num);i++) {
		if(num%i ==0) {
			isPrime=0;
			break;
		}
	}
}
	
if (isPrime==1) {
	System.out.println("prime no");
}
else {
	System.out.println("Not a prime no");
}
	}

}
