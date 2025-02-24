package Prepration;

public class q3_missingnoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4};
		int len = a.length;
		int n = 4;
		int sum=0;
		for(int i=0; i<len; i++) {
			sum = sum + a[i];
		}
		int sum1 = n*(n+1)/2;
		int missno = sum1- sum;
		System.out.println(missno);
}}