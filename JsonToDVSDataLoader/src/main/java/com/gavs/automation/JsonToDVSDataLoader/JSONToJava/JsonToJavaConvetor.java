package com.gavs.automation.JsonToDVSDataLoader.JSONToJava;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.My.HR.input.EmpAttendanceInfo;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gavs.automation.JsonToDVSDataLoader.App;

public class JsonToJavaConvetor {
   private static final Logger logger = LogManager.getLogger(JsonToJavaConvetor.class);
   private static EmpAttendanceInfo emp;
   public static EmpAttendanceInfo createJavaMapper(){
	   
		File file=new File( "src/main/java/com/gavs/automation/resources/Jsoninput.txt");
		ObjectMapper objectmapper = new ObjectMapper();
		
		try {
			 emp = objectmapper.readValue(file, EmpAttendanceInfo.class );
			logger.info("Day Start Time : "+emp.getStarTime());
			logger.info("Day End Time : "+emp.getEndTime());
			logger.info("Shift Start Time : "+emp.getShiftStartTime());			
			logger.info("Week Avg Time : "+emp.getAvgAttendance());
			
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}


}
