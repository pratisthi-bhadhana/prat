package File_handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readFile{

	public void readFilee() throws IOException {
		// TODO Auto-generated method stub
File f = new File("../Demo_test1/2025.txt");
FileReader fr = new FileReader(f);
int a;// a is the character
while((a=fr.read())!=-1) {
	System.out.println((char)a);
}
	}
	public static void main (String[]args) throws IOException {
		readFile f = new readFile();
		f.readFilee();
	}

}
