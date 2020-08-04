package com.gavs.automation.JsonToDVSDataLoader.JavaToExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.gavs.automation.properties.FileNameSpace;

import claim.claimrules.Charge;
import claim.claimrules.Claim;
import claim.claimrules.Clia;
import claim.claimrules.DecisionRequest;
import claim.claimrules.Modifier;
import claim.claimrules.Status;
import claim.claimrules.Transaction;

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
	private static HashMap<String, Object> ObjectLevel = new HashMap<String, Object>();

	@SuppressWarnings("unchecked")
	public static void javaToExcelDataLoader(Object dataObject) {

		file = new File(FileNameSpace.outputExcelPath);
	
			
		

			DecisionRequest insuranceDetails = (DecisionRequest) dataObject;
			
			Claim claim = insuranceDetails.getClaim();
			
			Charge chargs = claim.getCharges().get(0);
			Modifier modifer =chargs.getModifiers().get(0);
			Transaction transaction = chargs.getTransactions().get(0);
			Status status = chargs.getStatus();
			Clia clia = chargs.getClia();
			
		
			logger.info("All Class Name:" +matchingPatterName(insuranceDetails.toString()));
			toString(insuranceDetails,insuranceDetails.toString());
			toString(chargs,chargs.toString());
			toString(claim,claim.toString());
			toString(modifer,modifer.toString());
			toString(transaction,transaction.toString());
			toString(status,status.toString());
			toString(clia,clia.toString());
	

			
			/*
			 * Reflections reflections = new Reflections(); Set<Class<? extends
			 * DecisionRequest>> myst=reflections.getSubTypesOf(DecisionRequest.class);
			 * logger.info("Class name :"+myst.toString());
			 */
			HashMap<String, Object> tabAttributeMap = ObjectLevel;
			
			try {
				fis = new FileInputStream(file);
				wb = WorkbookFactory.create(fis);
				Iterator sheetNameLS = wb.sheetIterator();
				StringBuffer sheets = new StringBuffer();
				while (sheetNameLS.hasNext()) {
					Sheet sheet = (Sheet) sheetNameLS.next();
					sheets.append(sheet.getSheetName() + ",");
					
				}

				logger.info("Sheet name :" + sheets);

			for (Map.Entry<String, Object> entry : tabAttributeMap.entrySet()) {
				if (entry.getKey().length() > 0) {
					logger.info("Copy In Excel Key : " + entry.getKey() + " Attributes names : " + entry.getValue());
					HashMap<String, String> matchedAttributes = new HashMap<String, String>();
					 matchedAttributes = (HashMap<String, String>)entry.getValue();
					if (entry.getKey().equals("DecisionRequest")) {
						sheet = wb.getSheet("Scenarios");
						rowIndex = 7;
						cellIndex=3;
						logger.info("In Main Sheet");
					}else
					{
						
						sheet = wb.getSheet(entry.getKey());
						rowIndex = 5;
						cellIndex=2;
						logger.info("other tabs"+sheet.getSheetName());
					}
					
					row = sheet.getRow(rowIndex);

					int cellCursor = 0;
					do {
						StringTokenizer attributeToken = new StringTokenizer(row.getCell(cellIndex + cellCursor).getStringCellValue(),":");
						
						DVSAttributeName = attributeToken.nextToken();
						//DVSAttributeType = attributeToken.nextToken();

						logger.info("Avg Cell :" + DVSAttributeName);
						
						

						logger.info("Avg Cell Key :" + matchedAttributes.keySet());
						if (matchedAttributes.containsKey(DVSAttributeName)) {
							int ci = findRow(row.getCell(cellIndex + cellCursor).getStringCellValue());
							logger.info("Match index number :" + ci);
							copyDataToCell(ci, matchedAttributes.get(DVSAttributeName).toString());

						}
						cellCursor++;
					} while (row.getCell(cellIndex + cellCursor)!=null &&!row.getCell(cellIndex + cellCursor).getCellType().equals(CellType.BLANK));

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
		Row copyRow = sheet.getRow(rowIndex + 1);
		Cell coipedCell = copyRow.getCell(coulmnIndex);
		logger.info("Cell Data :" + coipedCell);
		coipedCell.setCellValue(dataValue);

	}

	private static int findRow(String cellContent) {
		Row row = sheet.getRow(rowIndex);

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

	/*private static HashMap<String, Object> getClassObjectMAP(String jsonClass) {

		
		String ClassName = new String();
		StringTokenizer tokenizer = new StringTokenizer(jsonClass, ",");

		ClassName = matchingPatterName(tokenizer.nextToken());
		HashMap<String,String> tabLevelAttibute = new HashMap<String, String>();
		while (tokenizer.hasMoreElements()) {
			StringTokenizer keyVal = new StringTokenizer(tokenizer.nextToken().trim(), "=");
			String keyElement = new String();
			String Value = new String();

			if (keyVal.hasMoreElements())
				keyElement = keyVal.nextToken().trim();
			if (keyVal.hasMoreElements())
				Value = keyVal.nextToken().trim();

			if (Value != null && keyElement != null && !isStringHaveSpecialChar(Value)) {
				tabLevelAttibute.put(keyElement ,Value );
			} else {
				ClassName = matchingPatterName(Value);
				tabLevelAttibute = new HashMap<String, String>();
			}

			ObjectLevel.put(ClassName, tabLevelAttibute);
		}

		for (Map.Entry<String, Object> entry : ObjectLevel.entrySet()) {
			System.out.println("Class Name : " + entry.getKey() + " Attributes names : " + entry.getValue());
		}
		return ObjectLevel;

	}*/

	private static boolean isStringHaveSpecialChar(String keyString) {

		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(keyString);
		boolean b = m.find();

		return b;

	}

	private static List<String> matchingPatterName(String keyString) {
		List<String> allClass= new ArrayList<String>();
		Pattern pattern = Pattern.compile("claim.claimrules.(.*?)@", Pattern.DOTALL);
		Matcher matcher = pattern.matcher(keyString);
		String matchKey = new String();
		while (matcher.find()) {
			matchKey = matcher.group(1);
			allClass.add(matchKey);
		}
		return allClass;
	}
	
	private static String toString(Object classObj,String jsonStrucureInString) {
		String className = classObj.getClass().getSimpleName();
		System.out.println("Class Name  :"+className);
		HashMap<String,String> tabLevelAttibute = new HashMap<String, String>();
		  StringBuilder result = new StringBuilder();
		  String newLine = System.getProperty("line.separator");

		  result.append( classObj.getClass().getName() );
		  result.append( " Object {" );
		  result.append(newLine);
		
		  //determine fields declared in this class only (no fields of superclass)
		  Field[] fields = classObj.getClass().getDeclaredFields();

		  //print field names paired with their values
		  for ( Field field : fields  ) {
		//    result.append("  ");
	
		    	
		    	String key =field.getName();
		    	String Value =getValueFromClassString(jsonStrucureInString,field.getName());
		    	
		    	if(!(field.getType().toGenericString().contains("claim.claimrules") || field.getType().toGenericString().contains("Map")))
		    	{ //  result.append("  "+ key);
		     // result.append("  "+Value);
		    //  System.out.println("Type :"+field.getType());
		      tabLevelAttibute.put(key,Value);
		    	}
		  
		    //  result.append(": ");
		      //requires access to private field:
		    // result.append( field.get(classObj) );
		    
		    //result.append(newLine);
		  }
		  result.append("}");
		  ObjectLevel.put(className,tabLevelAttibute);
		  return result.toString();
		}
	
	private static String getValueFromClassString(String keyString, String attributeName) {
		Pattern pattern = Pattern.compile(attributeName+"(.*?),", Pattern.DOTALL);
		Matcher matcher = pattern.matcher(keyString);
		String matchKey = new String();
		while (matcher.find()) {
			matchKey = matcher.group(1);
		}
		return matchKey.replace("=", "");
	}


}
