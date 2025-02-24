package File_handling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;

import jxl.Sheet;
import jxl.Workbook;


public class ExcelFilehandling {

	public void readExcelData() throws Exception, IOException {
		
	
	File F = new File("../Demo_test1/src/test/java/File_handling/User.xls");
	Workbook wk = Workbook.getWorkbook(F);
	Sheet ws = wk.getSheet(0);
	int r= ws.getRows();
	int c = ws.getColumns();
	
	for(int i= 0; i< r; i++) 
	{
	for(int j=0; j< c ; j++)
	{
		Cell c1 = ws.getCell(j,i);
		System.out.println(c1.getContents());
	}
	}
	}
	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub

		ExcelFilehandling e = new ExcelFilehandling();
		e.readExcelData();
	}

}
