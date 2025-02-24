package paack1;

import java.util.HashSet;
import java.util.Set;

public class jav3 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Function to find common characters between two StringBuffers
	    public static Set<Character> findCommonCharacters(StringBuffer sb1, StringBuffer sb2) {
	        // Convert StringBuffer sb1 to a set of characters
	        Set<Character> set1 = new HashSet<>();
	        for (int i = 0; i < sb1.length(); i++) {
	            set1.add(sb1.charAt(i));
	        }
	        
	        // Convert StringBuffer sb2 to a set of characters
	        Set<Character> set2 = new HashSet<>();
	        for (int i = 0; i < sb2.length(); i++) {
	            set2.add(sb2.charAt(i));
	        }
	        
	        // Find intersection of set1 and set2
	        Set<Character> commonCharacters = new HashSet<>(set1);
	        commonCharacters.retainAll(set2);
	        
	        return commonCharacters;
	    }
	    
	    public static void main(String[] args) {
	        StringBuffer sb1 = new StringBuffer("abcdef");
	        StringBuffer sb2 = new StringBuffer("defghi");
	        
	        Set<Character> commonChars = findCommonCharacters(sb1, sb2);
	        
	        System.out.println("Common characters between sb1 and sb2:");
	        for (char ch : commonChars) {
	            System.out.print(ch + " ");
	        }
	   //     System.out.println();
	    }
	

}
