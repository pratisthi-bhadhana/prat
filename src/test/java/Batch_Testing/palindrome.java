package Batch_Testing;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n, r, c, s=0;
System.out.println("Enter the No ");
Scanner orignalno = new Scanner(System.in);
n= orignalno.nextInt();
c=n;

while(n>0) {
	
	r=n%10;
	
	s= (s*10) + r;
	
	n= n/10;
	
	
}
if (c==s) {
	
	System.out.println("No is palindrome");
}
else
	System.out.println("No is not palindrome");
	}

}
