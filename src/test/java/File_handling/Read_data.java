package File_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Read_data {
	
	public void writedata() throws IOException {
	File f = new File("../Demo_test1/Write1.txt");
	FileWriter fw= new FileWriter(f);
	fw.write(" This is the First line");
	fw.close();
	
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Read_data f = new Read_data();
		f.writedata();
	}

}
