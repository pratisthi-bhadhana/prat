package File_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BWriterRowWriter {

	public void WriteData(int rowCount) throws IOException
	{
		File F = new File("../Demo_test1/Writing.txt");
		FileWriter Fr = new FileWriter(F);
		BufferedWriter b = new BufferedWriter(Fr);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data" + rowCount + "rows :");
		
		for(int i = 1; i<=rowCount; i++) {
			System.out.println("Enter data for row" + i + " : ");
			String data = s.nextLine();
			b.write(data);
			b.newLine();
						
		}
		System.out.println("Data has been writen");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BWriterRowWriter writer = new BWriterRowWriter();
		 try {
	            Scanner scanner = new Scanner(System.in);

	            System.out.print("Enter the number of rows to write: ");
	            int rowCount = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            writer.WriteData(rowCount);
	        } catch (IOException e) {
	            System.err.println("Error writing to file: " + e.getMessage());
	        }
	    }
	

}
