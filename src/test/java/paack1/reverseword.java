package paack1;

public class reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Dev is my prayers";
        String[] words = s.split(" "); // Split the string into words
        //words = ["Dev", "is", "my", "prayers"];
        StringBuilder reversedString = new StringBuilder();
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse().toString()).append(" ");
        }
        
        // Remove the trailing space and print the result
        System.out.println(reversedString.toString().trim());
}
	
	}

