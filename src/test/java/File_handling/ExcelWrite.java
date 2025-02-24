package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelWrite {

	public void WriteData(int row, int column) throws BiffException, IOException, RowsExceededException, WriteException {
	

		File f = new File("../Demo_test1/src/test/java/File_handling/User.xls");
		
		WritableWorkbook wk = Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("new",1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		
		for(int i=0; i<=row; i++) {
			for(int j=0; j<=column; j++) {
				System.out.print("For row" + (i+1) + "For column" + (j+1) + ":" );
				String data= sc.nextLine();
				Label L = new Label(j,i,data);
				ws.addCell(L);
				
			}
		}
		
	wk.write();
	wk.close();
		
	}
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, JXLException {
		// TODO Auto-generated method stub
		ExcelWrite ew = new ExcelWrite();
		ew.WriteData(1,1);
	}

}
