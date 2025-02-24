package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write2 {
	public void RangeofWriter(int initialRowCount, int endRowCount) throws IOException {
		
		File f = new File("../Demo_test1/src/test/java/File_handling/File3.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the data" );
					
		
		for (int i = initialRowCount; i <= endRowCount; i++) {
            System.out.print("Enter data for row " + i + ": ");
            String data = sc.nextLine(); 
            bw.write("Row " + i + ": " + data); 
            bw.newLine();
			
		}
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Write2 f = new Write2();
		f.RangeofWriter(2,7);
	}

}
