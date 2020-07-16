package com.gavs.automation.JsonToDVSDataLoader.JavaToExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.My.HR.input.EmpAttendanceInfo;

public class JavaToExcelLoader {

	private static final Logger logger = LogManager.getLogger(JavaToExcelLoader.class);

	private static Workbook wb;
	private static Sheet sheet;
	private static Row row;
	private static String DVSAttributeName;	
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static int rowIndex = 7;
	private static int cellIndex = 3;
	private static File file;

	
	
	public static void javaToExcelDataLoader(Object dataObject) {

		file = new File("src/main/java/com/gavs/automation/resources/MyHRTest.xlsx");
		try {
			fis = new FileInputStream(file);
			wb = WorkbookFactory.create(fis);
			sheet = wb.getSheet("Scenarios");
			row = sheet.getRow(rowIndex);
			
			EmpAttendanceInfo emp = (EmpAttendanceInfo) dataObject;
			HashMap<String, Object> tabAttributeMap =getClassObjectMAP(emp.toString());
			
			for(int cellCursor=0 ; cellCursor<4;cellCursor++)
			{
			DVSAttributeName = new StringTokenizer(row.getCell(cellIndex+cellCursor).getStringCellValue(), ":").nextToken();	
			
			logger.info("Avg Cell :"+DVSAttributeName);	
			
			logger.info("Avg Cell Key :"+tabAttributeMap.keySet());
			if(tabAttributeMap.containsKey(DVSAttributeName)){
				int ci = findRow(row.getCell(cellIndex+cellCursor).getStringCellValue());
				logger.info("Match index number :"+ci);
				copyDataToCell(ci,tabAttributeMap.get(DVSAttributeName).toString());
				
			}
			
			}
	
			
			try {
				fos = new FileOutputStream(file);
				wb.write(fos);
				fos.flush();
				fos.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		

		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void copyDataToCell(int coulmnIndex, String dataValue) {
		Row copyRow = sheet.getRow(rowIndex+1);
		Cell coipedCell = copyRow.getCell(coulmnIndex);
		logger.info("Cell Data :"+ coipedCell);
		coipedCell.setCellValue(dataValue);
		
	}

	private static int findRow(String cellContent) {
		Row row =sheet.getRow(rowIndex);
		
		for (Cell cell : row) {
				if (cell.getCellType() == CellType.STRING) {
					if (cell.getRichStringCellValue().getString().trim().equals(cellContent)) {
						logger.info("*******************" + cell.getColumnIndex());
						return cell.getColumnIndex();
					}
				}
			}
		
		return 0;
	}
	
	private static HashMap<String, Object> getClassObjectMAP(String jsonClass) {

		HashMap<String, Object> ObjectLevel = new HashMap<>();
		String ClassName;
		StringTokenizer tokenizer = new StringTokenizer(jsonClass, "=,[]");
		ClassName = tokenizer.nextToken();
		while (tokenizer.hasMoreElements()) {
			ObjectLevel.put(tokenizer.nextToken().trim(), tokenizer.nextToken().trim());
		}
		logger.info("JSON Root Element :" + ClassName);
		logger.info(ClassName + "  :All Element -" + ObjectLevel);
		
		return ObjectLevel;

	}

}
