package paack1;

import java.util.HashMap;
import java.util.Map;

public class jav6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "programming";

	        Map<Character, Integer> duplicates = findDuplicateCharacters(input);

	        System.out.println("Duplicate characters in \"" + input + "\":");
	        for (Map.Entry<Character, Integer> entry : duplicates.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
	            }
	        }
	    }

	    public static Map<Character, Integer> findDuplicateCharacters(String input) {
	        Map<Character, Integer> characterCountMap = new HashMap<>();
	        int i = 0;

	        // Iterate through the string manually
	        try {
	            while (true) {
	                char currentChar = input.charAt(i);

	                if (characterCountMap.containsKey(currentChar)) {
	                    characterCountMap.put(currentChar, characterCountMap.get(currentChar) + 1);
	                } else {
	                    characterCountMap.put(currentChar, 1);
	                }
	                i++;
	            }
	        } catch (StringIndexOutOfBoundsException e) {
	            // End of string
	        }

	        return characterCountMap;
	    }
	}
	