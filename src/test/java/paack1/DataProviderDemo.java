package paack1;

import java.io.FileInputStream;

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

public class DataProviderDemo {

	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test(dataProvider="searchDataProvider")
	public void searchKey(String keyword) {
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(keyword);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	@DataProvider(name = "searchDataProvider")
	public Object [][] searchDataProviderMethod(){
		String fileName="C:\\Users\\pratisthib\\OneDrive - XTRACAP FINTECH INDIA PRIVATE LIMITED\\Desktop\\SearchData.xlsx";
		Object[][] searchData= getExcelData(fileName,"Sheet1");
		//Object[][]searchData= new Object[2][1];
		//searchData [0][0]="Taj Mahal";
	//	searchData [1][0]="India Gate";
		return searchData;
	}
		public String [][] getExcelData(String fileName,String sheetName)
		{
			String[][] data= null;
			//open file
			try {
			FileInputStream inputStream= new FileInputStream(fileName);
			
			//create workbook
			XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
			XSSFSheet excelSheet=workBook.getSheet(sheetName);
			
			//get total no of row
			int ttlRows= excelSheet.getLastRowNum()+ 1;
			int ttlCells= excelSheet.getRow(0).getLastCellNum();
			data= new String[ttlRows-1][ttlCells];
			for (int CurrentRow=1; CurrentRow<ttlRows;CurrentRow++)
			{
				for(int currentCell=0; currentCell<ttlCells;currentCell++) {
					data[CurrentRow-1][currentCell]=excelSheet.getRow(CurrentRow).getCell(currentCell).getStringCellValue();
				}
			}
			
			workBook.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			return data;
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
