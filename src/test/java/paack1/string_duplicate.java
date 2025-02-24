package paack1;

public class string_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = new String("Automation");
	        int count = 0;
	        char[] ch = str.toCharArray();
	        
	        System.out.println("Duplicate characters are:");

	        for (int i = 0; i < ch.length; i++) {
	            for (int j = i + 1; j < ch.length; j++) {
	                if (ch[i] == ch[j]) {
	                    System.out.println(ch[j]);
	                    count++;
	                    // To avoid counting the same character again
	                    ch[j] = '\0'; // Set the character to null after counting
	                }}
	}

}}
