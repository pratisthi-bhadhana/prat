package Prepration;

public class rever_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="delldell";
		int len = s.length();
		String result = "";
	for(int i =0;i<len;i++) {
		String ch = "" + s.charAt(i);
		
		if (result.contains(ch)) {
continue;
		}
		result+=ch;
	}
	System.out.println(result);
}
}