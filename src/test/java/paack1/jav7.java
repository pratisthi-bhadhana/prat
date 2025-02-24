package paack1;

import java.util.HashMap;
import java.util.Map;

public class jav7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "programming";

        String duplicates = findAndConcatDuplicateCharacters(input);

        System.out.println("Duplicate characters in \"" + input + "\": " + duplicates);
    }

    public static String findAndConcatDuplicateCharacters(String input) {
        Map<Character, Integer> characterCountMap = new HashMap<>();
        StringBuilder duplicates = new StringBuilder();

        // Count the occurrences of each character
        for (char currentChar : input.toCharArray()) {
            characterCountMap.put(currentChar, characterCountMap.getOrDefault(currentChar, 0) + 1);
        }

        // Collect the duplicate characters
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.append(entry.getKey());
            }
        }

        return duplicates.toString();
    }
}
	
