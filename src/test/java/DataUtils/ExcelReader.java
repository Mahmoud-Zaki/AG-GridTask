package DataUtils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    static public String getGameName(){
        return getValue(0);
    }

    static public String getMayBreakDown(){
        return getValue(1);
    }
    static private String getValue(int cellIndex) {
        try {
            File file = new File("DataFiles/Sample.xlsx");
            FileInputStream fileStream = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fileStream);
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            XSSFRow row = sheet.getRow(1);
            DataFormatter formatter = new DataFormatter();
            String value = formatter.formatCellValue(row.getCell(cellIndex));
            workbook.close();
            fileStream.close();
            return value;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return "";
        }
    }
}