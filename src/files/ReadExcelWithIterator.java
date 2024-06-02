package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelWithIterator {

	public static void main(String[] args) {
		try {
			// Create a FileInputStream to read the Excel file
			FileInputStream file = new FileInputStream(new File("C:\\Users\\gurramku\\Desktop\\SCB_Selenium.xlsx"));

			//==========================
			
			// Create a Workbook instance, representing the excel file
			//Workbook workbook = WorkbookFactory.create(file);

			// Get the first sheet
			//Sheet sheet = workbook.getSheetAt(0);
			
			//====================or===============
			
			// Create a Workbook instance, representing the excel file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // Get the first sheet
            XSSFSheet sheet = workbook.getSheetAt(0);

            //=====================================

			// Get the iterator to iterate over rows
			Iterator<Row> rowIterator = sheet.iterator();

			// Iterate through each row
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();

				// Get the iterator to iterate over cells of the row
				Iterator<Cell> cellIterator = row.cellIterator();

				// Iterate through each cell in the row
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();

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
