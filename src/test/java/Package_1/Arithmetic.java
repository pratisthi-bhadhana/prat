package Package_1;

public class Arithmetic {
	
	public int sum(int a, int b)
	{
		int c= a+b;
		System.out.println( "sum is " + c);
		return c;
	}
	
	public int sub(int c, int d)
	{
		int e = c-d;
		System.out.println("Sub is " + e);
		return e;
	}
	
	public int multi(int m1, int m2)
	{
		int M = m1*m2;
		System.out.println("Multi is " + M);
		return M;
	}
public void divide(int d1, int d2) {
	

int D = d1/d2;
System.out.println("divide is " + D);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Arithmetic at = new Arithmetic();
int sumresult =at.sum(10, 2);
int subresult=at.sub(sumresult,2);
int sumresult1= at.sum(subresult, 2);
int Multiresult= at.multi(sumresult1,2);
at.divide(Multiresult,2);
	}

}
