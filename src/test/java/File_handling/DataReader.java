package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
	
//BufferedReader to read the data line by line
	
	public void ReadData() throws IOException
	{
		File F = new File("../Demo_test1/2025.txt");
		FileReader Fr = new FileReader(F);
		BufferedReader b = new BufferedReader(Fr);
		String s;
		int row=0;
		while((s=b.readLine())!=null){
			row++;
			if(row==1) {
				System.out.println(s);	
			}
			
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataReader F = new DataReader();
		F.ReadData();
	}

}
