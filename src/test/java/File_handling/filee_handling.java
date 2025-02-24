package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class filee_handling {

	public void readFile() throws IOException {
		// TODO Auto-generated method stub
File f = new File("../Demo_test1/2025.txt");
FileReader fr = new FileReader(f);
BufferedReader b = new BufferedReader(fr);

String s;

while((s=b.readLine())!= null)
{
	System.out.println(s);
}

	}


public static void main (String[]args) throws IOException {
	filee_handling f = new filee_handling();
	f.readFile();
}}
