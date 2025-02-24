package Prepration;

public class norepeatchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "teeter";
	        for (char i : s.toCharArray()) {
	            if (s.indexOf(i) == s.lastIndexOf(i)) {
	                System.out.println("First non-repeating character is " + i);
	                break;
	            }
	        }
	    }
	}
