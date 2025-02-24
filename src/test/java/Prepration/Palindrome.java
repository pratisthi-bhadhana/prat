package Prepration;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "MAM";
int len = str.length();
String rev = "";
for (int i=0; i<len;i++) 
	rev= str.charAt(i) + rev;

if (str.contentEquals(rev)) 
	System.out.println("Palindrome");

else
	System.out.println("Not Palindrome");
}}