package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	String path = "./src/test/resources/TestData.xlsx";
	public String getDataFromExcel(String sheetName, int rowNum, int celNum) throws Throwable {
		FileInputStream fis= new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rowNum).getCell(celNum).getStringCellValue();
		wb.close();
		return data;
		
	}
	
	public int getRowcount(String sheetName) throws Throwable {
		
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheetName).getLastRowNum();
		wb.close();
		return rowCount;
		
	}
	
	public void setDataIntoExcel(String sheetName, int rowNum, int celNum) throws Throwable {
		
		FileInputStream fis= new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowNum).createCell(celNum);
		
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}

}
