package Batch_Testing;

import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

System.out.println("Enter first no");
int a = s.nextInt();

System.out.println("Enter second no");
int b = s.nextInt();

System.out.println(" Before swap no " + a + b);

for(int i=0;i<1;i++) {
	
	int t = a;
	a=b;
	b=t;
}

System.out.println(" After Swap " + a + b);
	}

}
