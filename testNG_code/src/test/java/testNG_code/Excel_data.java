package testNG_code;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	// access file(read file)
	//sheet
	//row
	//column
	public class Excel_data{
	 
	    // DataProvider Method
	 
	    @DataProvider(name = "testdata")
	 
	    public Object[][] getData() throws Exception {
	 
	        FileInputStream file =new FileInputStream("C:\\Users\\Akash raj\\OneDrive\\Desktop\\testfile\\testdata.xlsx");
	 
	        XSSFWorkbook workbook =new XSSFWorkbook(file);
	 
	        XSSFSheet sheet =workbook.getSheet("Sheet1");
	 
	        int rows = sheet.getPhysicalNumberOfRows();// total rpws count=4
	        int cols = sheet.getRow(0).getLastCellNum();// 0....4
	 
	        Object[][] data = new Object[rows - 1][cols];
	 
	        for (int i = 1; i < rows; i++) {
	 
	            for (int j = 0; j < cols; j++) {
	 
	                data[i - 1][j] =
	                sheet.getRow(i).getCell(j).toString();
	            }
	        }
	 
	        workbook.close();
	 
	        return data;
	    }
	 
	    // Test Method
	 
	    @Test(dataProvider = "testdata")
	 
	    public void loginTest(String user1,
	                          String pass1) {
	 
	        System.out.println("Username : " + user1);
	 
	        System.out.println("Password : " + pass1);
	 
	        System.out.println("Login Successful");
	    }
	}
