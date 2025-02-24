package paack1;

public class Missing_noarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,4};
		int len = a.length;
		int n = 4;

		int sum =0;
		 for(int i=0; i<len ;i++) {
			 sum = sum + a[i] ;
			 
			}
		int sum1 = n*(n+1)/2;
		int missingno = sum1-sum;
		System.out.println(missingno);
	}}