package Prepration;

public class q1_reversstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "VeD";
int len = s.length();
String rev = "";
for(int i=len-1; i>=0; i--) {
	rev = rev + s.charAt(i);
	
}
System.out.println(rev);
	}

}
