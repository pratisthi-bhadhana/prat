package Looop;

public class loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5; // Number of rows for the pyramid

        for (int row = 1; row <= rows; row++) {
            // Print spaces for the left side of the pyramid
            for (int space = rows - row; space > 0; space--) {
                System.out.print(" ");
            }
            // Print asterisks for the pyramid pattern
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
