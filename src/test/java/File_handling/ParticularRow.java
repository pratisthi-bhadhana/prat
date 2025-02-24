package File_handling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ParticularRow {
	
	public void ReadDataBasedUponRowNo (int row) throws BiffException, IOException {
		File F = new File("../Demo_test1/src/test/java/File_handling/sample.xls");
		Workbook wk = Workbook.getWorkbook(F);
		Sheet ws = wk.getSheet(0);
		int r= ws.getRows();
		int c = ws.getColumns();
		for(int i=0;i<r;i++) {
			if(i==row) {
				for(int j=0; j<c;j++) {
					Cell C = ws.getCell(j,row);
					System.out.println(C.getContents());
				}
			}
		}
	}

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		ParticularRow F = new ParticularRow();
		F.ReadDataBasedUponRowNo(1);
	}

}
