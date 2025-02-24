package Looop;

public class loop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for( int row =1; row<=5; row++) {
	
	for(int column= 5; column>= row;column-- ) {
		System.out.print(" ");
	}
	for (int e=1;e<=row; e++) {
		System.out.print("*");
	}
	System.out.println();
}
	}

}
