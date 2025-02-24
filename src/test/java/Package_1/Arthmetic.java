package Package_1;

public class Arthmetic {
	
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum is " + c);
		return c;
	}
	
	public int sub (int d, int e)
	{
		int f = d-e;
				
				System.out.println(" sub is" + f);
		return f;
	}
	public void multi(int r1, int r2) {
		int result;
		result= r1*r2;
		System.out.println("Final result " + result);
		//return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arthmetic ob = new Arthmetic();
		int resultsum= ob.sum(10,2);
		int resultsub = ob.sub(8, 2);
		ob.multi(resultsum,resultsub);
	}

}
