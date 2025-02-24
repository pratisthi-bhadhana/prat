package paack1;

import java.util.ArrayList;
import java.util.List;

public class jav4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "appple";
        String str2 = "appla";

        List<Character> unequalChars = findUnequalCharacters(str1, str2);

        System.out.println("Characters causing inequality:");
        for (Character ch : unequalChars) {
            System.out.println(ch);
        }
    }

    public static List<Character> findUnequalCharacters(String str1, String str2) {
        List<Character> unequalChars = new ArrayList<>();
        int minLength = Math.min(str1.length(), str2.length());

        // Compare characters at each position up to the length of the shorter string
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                unequalChars.add(str1.charAt(i));
                unequalChars.add(str2.charAt(i));
            }
        }

        // If one string is longer, add the extra characters from the longer string
        if (str1.length() > minLength) {
            for (int i = minLength; i < str1.length(); i++) {
                unequalChars.add(str1.charAt(i));
            }
        } else if (str2.length() > minLength) {
            for (int i = minLength; i < str2.length(); i++) {
                unequalChars.add(str2.charAt(i));
            }
        }

        return unequalChars;
    }

	

}
