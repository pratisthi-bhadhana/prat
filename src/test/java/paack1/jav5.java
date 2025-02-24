package paack1;

public class jav5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char char1 = 'a';
        char char2 = 'z';

        int difference = findCyclicDifference(char1, char2);
        System.out.println("Cyclic difference between '" + char1 + "' and '" + char2 + "' is: " + difference);
    }

    public static int findCyclicDifference(char char1, char char2) {
        int alphabetSize = 26;
        int pos1 = char1 - 'a';
        int pos2 = char2 - 'a';

        int forwardDifference = (pos2 - pos1 + alphabetSize) % alphabetSize;
        int backwardDifference = (pos1 - pos2 + alphabetSize) % alphabetSize;

        return Math.min(forwardDifference, backwardDifference);
    }
}



