package testNG_code;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class readefile {
	 String path = "C:\\Users\\Akash raj\\OneDrive\\Desktop\\testfile\\newdata2.xlsx";

	    // DataProvider
	    @DataProvider(name = "userdata")
	    public Object[][] getData() {

	        return new Object[][] {

	            {"Akash","12345"},
	            {"Admin","admin123"},
	            {"Test","test123"}
	          

	        };
	    }

	    // Create file and write data
	    @Test(dataProvider = "userdata", priority = 1)
	    public void writeData(String user, String pass) throws Exception {

	        XSSFWorkbook workbook;
	        XSSFSheet sheet;

	        try {

	            FileInputStream fin = new FileInputStream(path);

	            workbook = new XSSFWorkbook(fin);

	            sheet = workbook.getSheet("Sheet1");

	            fin.close();

	        }

	        catch(Exception e) {

	            workbook = new XSSFWorkbook();

	            sheet = workbook.createSheet("Sheet1");

	            sheet.createRow(0).createCell(0)
	            .setCellValue("Username");

	            sheet.getRow(0).createCell(1)
	            .setCellValue("Password");
	        }

	        int rowCount = sheet.getPhysicalNumberOfRows();

	        sheet.createRow(rowCount)
	        .createCell(0).setCellValue(user);

	        sheet.getRow(rowCount)
	        .createCell(1).setCellValue(pass);

	        FileOutputStream fout =
	        new FileOutputStream(path);

	        workbook.write(fout);

	        fout.close();

	        workbook.close();

	        System.out.println("Written : "
	        + user + " " + pass);
	    }

	    // Read file
	    @Test(priority = 2)
	    public void readData() throws Exception {

	        FileInputStream fin =
	        new FileInputStream(path);

	        XSSFWorkbook workbook =
	        new XSSFWorkbook(fin);

	        XSSFSheet sheet =
	        workbook.getSheet("Sheet1");

	        int rows =
	        sheet.getPhysicalNumberOfRows();

	        int cols =
	        sheet.getRow(0).getLastCellNum();

	        for(int i=0;i<rows;i++) {

	            for(int j=0;j<cols;j++) {

	                System.out.print(
	                sheet.getRow(i)
	                .getCell(j)
	                .toString()+"   ");
	            }

	            System.out.println();
	        }

	        workbook.close();

	        fin.close();
	    }
	}