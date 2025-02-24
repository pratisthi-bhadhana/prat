package Batch_Testing;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

System.out.println(" First no");
int a = s.nextInt();

System.out.println(" Second no");
int b = s.nextInt();

a= a+b;
b = a-b;
a= a-b;

System.out.print(a);
System.out.print(b);

	}

}
