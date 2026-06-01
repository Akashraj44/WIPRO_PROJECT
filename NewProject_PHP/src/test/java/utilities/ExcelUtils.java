package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcelUtils {

    public static String getData(
            int row,
            int cell)
            throws Exception {

        FileInputStream fis =
        new FileInputStream(
        "src/test/resources/LoginData.xlsx");

        Workbook wb =
        WorkbookFactory.create(fis);

        Sheet sheet =
        wb.getSheet("Sheet1");

        String value =
        sheet.getRow(row)
        .getCell(cell)
        .toString();

        wb.close();

        return value;
    }
}