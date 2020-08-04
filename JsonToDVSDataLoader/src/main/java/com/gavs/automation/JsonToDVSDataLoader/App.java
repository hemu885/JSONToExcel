package com.gavs.automation.JsonToDVSDataLoader;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.gavs.automation.JsonToDVSDataLoader.JSONToJava.JsonToJavaConvetor;
import com.gavs.automation.JsonToDVSDataLoader.JavaToExcel.JavaToExcelLoader;

import claim.claimrules.DecisionRequest;

/**
 * Data Auto copy from JSON to DVS Excel
 * 
 * @author hemendra.c@gavstech.com
 *
 *
 */


public class App {
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {

		logger.info("----------Automatic JSON to DVS Data Copier--------");
		DecisionRequest decisionRequest = JsonToJavaConvetor.createJavaMapper();
		JavaToExcelLoader.javaToExcelDataLoader(decisionRequest);

	}
}
