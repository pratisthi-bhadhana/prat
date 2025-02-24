package File_handling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead {
	
	public void ReadDataBasedUponRowAndColumnNo( int row, int col) throws BiffException, IOException {
		File F = new File("../Demo_test1/src/test/java/File_handling/sample.xls");
		Workbook wk = Workbook.getWorkbook(F);
		Sheet ws = wk.getSheet(0);
		Cell c = ws.getCell(col,row);
		System.out.println(c.getContents());
		
			
		}
	
	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		ExcelRead f = new ExcelRead();
		f.ReadDataBasedUponRowAndColumnNo(2,2);
	}

}
