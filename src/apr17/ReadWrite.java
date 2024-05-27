package apr17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args) throws Throwable{
		// Read Path of the file
		FileInputStream fi = new FileInputStream("D:/Book1.xlsx");
		//Get wb from above file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//Get sheet from wb
		XSSFSheet ws = wb.getSheet("Emp");
		//Count no of Rows
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		for (int i=1;i<=rc;i++)
		{
			//read all rows first Cell data
			String fname = ws.getRow(i).getCell(0).getStringCellValue();
			String mname = ws.getRow(i).getCell(1).getStringCellValue();
			String lname = ws.getRow(i).getCell(2).getStringCellValue();
			int eid = (int)ws.getRow(i).getCell(3).getNumericCellValue();
			System.out.println(fname+"  "+mname+"  "+lname+"  "+eid);
			//Create Cell and write text
			ws.getRow(i).createCell(4).setCellValue("pass");
			
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}

}
