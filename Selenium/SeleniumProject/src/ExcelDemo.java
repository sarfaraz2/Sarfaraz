import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\sarfaraz.ahmad\\Desktop\\TestData.xls");
		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook testDataExcel = new HSSFWorkbook(fis);
		HSSFSheet loginSheet = testDataExcel.getSheet("Login");
		
		int noOfRows = loginSheet.getPhysicalNumberOfRows();
		
		for(int i=0; i< noOfRows ; i++) {
			Row row = loginSheet.getRow(i);
			String user = row.getCell(0).getStringCellValue();
			String pass = row.getCell(1).getStringCellValue();
			System.out.println(user + "::" + pass);
		}
		

	}

}
