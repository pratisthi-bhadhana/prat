package Looop;

public class loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int  row= 5;
		for(int i=1; i<=row; i++) {
			for(int j=row; j>=i; j--) {
				System.out.println(" ");
				
			}
			for (int k=1; k<=(2 * i - 1); k++) {
				
					
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}


