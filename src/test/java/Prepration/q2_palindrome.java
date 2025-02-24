package Prepration;

public class q2_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "MAM";
int len = s.length();
String rev = "";
for(int i=0; i<len; i++) 
	rev = s.charAt(i) +rev;
	if(s.contentEquals(rev)) 
		System.out.println("Palindrome");
	
	else 
		System.out.println("Not palindrome");
	}

}


