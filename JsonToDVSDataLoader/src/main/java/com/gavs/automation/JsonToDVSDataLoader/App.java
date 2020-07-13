package com.gavs.automation.JsonToDVSDataLoader;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.My.HR.input.EmpAttendanceInfo;
import com.gavs.automation.JsonToDVSDataLoader.JSONToJava.JsonToJavaConvetor;
import com.gavs.automation.JsonToDVSDataLoader.JavaToExcel.JavaToExcelLoader;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.info("hello from logger");
        
        EmpAttendanceInfo emp =JsonToJavaConvetor.createJavaMapper();
        JavaToExcelLoader.javaToExcelDataLoader(emp);
        
    }
}
