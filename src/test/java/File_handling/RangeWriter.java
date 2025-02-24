package File_handling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class RangeWriter {

	public void ReadDataBasedUponRange(int initial, int end) throws BiffException, IOException {
		File F = new File("../Demo_test1/src/test/java/File_handling/User.xls");
		Workbook wk = Workbook.getWorkbook(F);
		Sheet ws = wk.getSheet(0);
		int r= ws.getRows();
		int c = ws.getColumns();
	
		for(int i=initial;i<=end;i++) {
			 
				for(int j=0; j<c;j++) {
					Cell C = ws.getCell(j,i);
					System.out.print(C.getContents() +  "\t");
	}
		System.out.println();		
		}}
	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		RangeWriter F = new RangeWriter();
		F.ReadDataBasedUponRange(1, 2);
	}

}
