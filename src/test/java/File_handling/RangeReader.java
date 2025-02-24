package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RangeReader {
	
	public void ReadDataOfRange(int initial, int end) throws IOException {
		
		File f = new File("../Demo_test1/2025.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		int a= 0;
		while((s=b.readLine()) != null) {
			a++;
			if((a>=initial)&&(a<=end)) {
				System.out.println(s);
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RangeReader f = new RangeReader();
		f.ReadDataOfRange(1,2);
		
	}

}
