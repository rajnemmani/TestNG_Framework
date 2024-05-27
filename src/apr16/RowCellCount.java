package apr16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowCellCount {

	public static void main(String[] args) throws Throwable {
		// Read Path of Excel file
		FileInputStream fi = new FileInputStream("D:/Book1.xlsx");
		//Get Workbook form file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//Get sheet from workbook
		XSSFSheet ws = wb.getSheet("Emp");
		//Get first row from Emp sheet
		XSSFRow row = ws.getRow(0);
		//Count no of rows in Emp sheet
		int rc = ws.getLastRowNum();
		//count no of cells in forst row
		int cc = row.getLastCellNum();
		System.out.println("No Of rows in sheet::"+rc+"     "+"No of Rows in first Column::"+cc);
		fi.close();
		wb.close();

	}

}
