package com.gavs.automation.JsonToDVSDataLoader.JavaToExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.My.HR.input.EmpAttendanceInfo;
import com.gavs.automation.JsonToDVSDataLoader.JSONToJava.JsonToJavaConvetor;


public class JavaToExcelLoader {
	
	private static final Logger logger = LogManager.getLogger(JavaToExcelLoader.class);
	
	private static Workbook wb;
	private static Sheet sheet;
	private static Row row;
	private static String avgCell;
	private static Cell endCell;
	private static Cell shiftCell;
	private static Cell startCell;
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static int rowIndex=7;
	private static int cellIndex=3;
	private static File file;
	
	   public static void javaToExcelDataLoader(Object dataObject){
			
			file=new File( "src/main/java/com/gavs/automation/resources/MyHRTest.xlsx");
			try {
				fis = new FileInputStream(file);
				wb = WorkbookFactory.create(fis);
				sheet = wb.getSheet("Scenarios");
				row = sheet.getRow(rowIndex);
				avgCell = new StringTokenizer(row.getCell(cellIndex).getStringCellValue(), ":").nextToken(); 
				endCell = row.getCell(cellIndex+1);
				shiftCell = row.getCell(cellIndex+2);
				startCell = row.getCell(cellIndex+3);
				
			    EmpAttendanceInfo emp =(EmpAttendanceInfo)dataObject;
				
			    copyDataToCell(rowIndex+1 , cellIndex,emp);
			    		
				logger.info("Avg Attendance : "+ avgCell);
				logger.info("End Attendance : "+endCell.getStringCellValue());
				logger.info("Shift Attendance : "+shiftCell.getStringCellValue());
				logger.info("Start Attendance : "+startCell.getStringCellValue());
			
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	   
	   public static void copyDataToCell(int rowIndex ,int coulmnIndex , EmpAttendanceInfo emp){
		   Row copyRow = sheet.getRow(rowIndex);
		   Cell avgCell = copyRow.getCell(coulmnIndex);
		   avgCell.setCellValue(emp.getAvgAttendance());
		   Cell endTime = copyRow.getCell(coulmnIndex+1);
		   endTime.setCellValue(emp.getEndTime());
		   Cell shiftTime = copyRow.getCell(coulmnIndex+2);
		   shiftTime.setCellValue(emp.getShiftStartTime());
		   Cell startTime = copyRow.getCell(coulmnIndex+3);
		   startTime.setCellValue(emp.getStarTime());
		   
		   try {
			fos = new FileOutputStream(file);
	     	wb.write(fos);
	     	fos.flush();
	     	fos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
	   }
	   

	   
	   
	   

}
