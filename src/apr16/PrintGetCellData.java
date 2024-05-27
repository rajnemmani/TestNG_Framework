package apr16;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintGetCellData {

	public static void main(String[] args) throws Throwable{
		// Read path of the file
		FileInputStream fi = new FileInputStream("D:/book1.xlsx");
		//get Workbook from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//Get Sheet from wb
		XSSFSheet ws = wb.getSheet("Emp");
		//Count no of rows in the sheet
		int rc = ws.getLastRowNum();
		System.out.println("No Of rows::"+rc);
		//Print Specific row in each cell
		String fname = ws.getRow(10).getCell(0).getStringCellValue();
		String mname =ws.getRow(2).getCell(1).getStringCellValue();
		String lname = ws.getRow(3).getCell(2).getStringCellValue();
		int eid = (int) ws.getRow(12).getCell(4).getNumericCellValue();
		System.out.println(fname+"  "+mname+"  "+lname+"  "+eid);
		fi.close();
		wb.close();
		
		
		

	}

}
