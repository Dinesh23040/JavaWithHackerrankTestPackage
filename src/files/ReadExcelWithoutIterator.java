package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelWithoutIterator {
	
	public static void main(String[] args) {
        try {
            // Create a FileInputStream to read the Excel file
            FileInputStream file = new FileInputStream(new File("C:\\Users\\gurramku\\Desktop\\SCB_Selenium.xlsx"));

            // Create a Workbook instance, representing the excel file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // Get the first sheet
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through each row
            for (Row row : sheet) {
                // Iterate through each cell in the row
                for (Cell cell : row) {
                    // Print the cell value
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            // Close the file
            file.close();
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
