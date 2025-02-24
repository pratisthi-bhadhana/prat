package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Datawriter {
	
	public void WriteData(int rowCount) throws IOException {
		File f = new File("../Demo_test1/src/test/java/File_handling/File2.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fw);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data for " + rowCount + " rows :");
		
		for(int i= 1;i<=rowCount; i++) {
			System.out.println("Enter data for row " + i + " : ");
			String data = s.nextLine();
			b.write(data);
			b.newLine();
		}
		b.close();
		
		}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Datawriter f = new Datawriter();
		f.WriteData(2);

	}

}
