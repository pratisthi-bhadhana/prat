package Batch_Testing;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n, r, c, arm=0;
System.out.println("Please enter the No");
Scanner orignal_no = new Scanner(System.in);
n= orignal_no.nextInt();
c=n;

while(n>0) {
	
	r= n%10;
	
	arm= (r*r*r) + arm;
	
	n= n/10;
}

if(c==arm) {
	
	System.out.println("No is armstrong");
}
else {
	System.out.println("No is not armstrong");
}
	}

}
