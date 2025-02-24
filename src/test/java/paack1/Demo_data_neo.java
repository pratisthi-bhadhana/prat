package paack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_data_neo {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	XSSFWorkbook ExcelWBook = null;
	XSSFSheet ExcelWSheet;
	//XSSFRow Row;
	//XSSFCell Cell;

	File excelFile = new File("C:\\Users\\pratisthib\\OneDrive - XTRACAP FINTECH INDIA PRIVATE LIMITED\\Desktop\\Test_data\\neo_adata.xlsx");
	FileInputStream inputStream= null;
	try {
		inputStream = new FileInputStream(excelFile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		ExcelWBook = new XSSFWorkbook(inputStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 ExcelWSheet = ExcelWBook.getSheetAt(0);
	 int ttlRows = ExcelWSheet.getLastRowNum() + 1;
	 int ttlCells = ExcelWSheet.getRow(0).getLastCellNum();
	 for(int currentRow = 0; currentRow<ttlRows; currentRow++) {
//		 XSSFRow row = ExcelWSheet.getRow(currentRow);
	for	 (int currentCell = 0; currentCell<ttlCells; currentCell++) {
		//XSSFCell cell = row.getCell(currentCell);
		 System.out.println(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());

	 System.out.print("\t");
	 }
	System.out.println();
		}
	try {
		ExcelWBook.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}