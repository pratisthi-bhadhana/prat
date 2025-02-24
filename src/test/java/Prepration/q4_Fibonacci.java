package Prepration;

public class q4_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =0;
int b=1;
int c;
int term = 10;

for(int i=1; i<=term; i++) {
	System.out.print(a);
	c=a+b;
	a=b;
	b=c;
}
	}

}
