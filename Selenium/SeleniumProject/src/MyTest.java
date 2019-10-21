import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyTest {

	@Test(dataProvider = "validateLoginDataProvider")
	public void validateLogin(String user, String pass) {
		String expUser = "Pra";
		String expPass = "Pass1";
		boolean result = false;
		if (expUser.equals(user) && expPass.equals(pass)) {
			result = true;
		}
		assertEquals(result, true);
		System.out.println(user + "::" + pass);

	}

	@DataProvider
	public Object[][] validateLoginDataProvider() throws IOException {

		File file = new File("C:\\Users\\sarfaraz.ahmad\\Desktop\\TestData.xls");
		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook testDataExcel = new HSSFWorkbook(fis);
		HSSFSheet loginSheet = testDataExcel.getSheet("Login");

		int noOfRows = loginSheet.getPhysicalNumberOfRows();

		Object[][] dataset = new Object[noOfRows][2];
		
		for(int i=0; i< noOfRows ; i++) {
			Row row = loginSheet.getRow(i);
			String user = row.getCell(0).getStringCellValue();
			String pass = row.getCell(1).getStringCellValue();
			dataset[i][0] = user;
			dataset[i][1] = pass;
			System.out.println(user + "::" + pass);
		}

		return dataset;
	}

}
