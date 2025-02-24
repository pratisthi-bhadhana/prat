package File_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream r = new FileInputStream("../Demo_test1/src/test/java/File_handling/File1.txt");
		FileOutputStream w = new FileOutputStream("../Demo_test1/src/test/java/File_handling/File3.txt");
		 int i;
		 while((i= r.read()) !=-1) {
			 
			 w.write((char)i);
		 }
		System.out.println("Copy Done");

	}

}
