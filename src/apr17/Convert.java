package apr17;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Convert {

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
					if(wb.getSheet("Emp").getRow(i).getCell(3).getCellType()==CellType.NUMERIC)
					{
						int celldata = (int)wb.getSheet("Emp").getRow(i).getCell(3).getNumericCellValue();
						//Convert integer type into String type
						String eid = String.valueOf(celldata);
						System.out.println(eid);
						ws.getRow(i).createCell(4).setCellValue("Fail");
					}
					
				}
				fi.close();
				FileOutputStream fo = new FileOutputStream("D:/Results.xlsx");
				wb.write(fo);
				fo.close();
				wb.close();
				


	}

}
