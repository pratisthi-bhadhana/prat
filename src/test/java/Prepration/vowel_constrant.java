package Prepration;

public class vowel_constrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "My name is Pratisthi";
int count=0;
int vcount=0;
int ccount=0;
int len = s.length();

	for(int i=0; i<len;i++) {
		if(s.charAt(i)!=' ') {
			count++;
		}
		if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='o' || (s.charAt(i)=='i' )){
			vcount++;
		}
		else {
			ccount++;
		}
	}
	
	System.out.println("no of character is " + count);
	System.out.println("no of vowel is " + vcount);
	System.out.println("no of vowel is " + ccount);
	}

}
