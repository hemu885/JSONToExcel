package com.gavs.automation.JsonToDVSDataLoader.JSONToJava;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gavs.automation.properties.FileNameSpace;

import claim.claimrules.DecisionRequest;





public class JsonToJavaConvetor {
   private static final Logger logger = LogManager.getLogger(JsonToJavaConvetor.class);
   private static DecisionRequest decisionRequest;
   
 //  private static Claim cliam;
   public static DecisionRequest createJavaMapper(){
	   
	 

		File file=new File(FileNameSpace.inputJsonPath);
		ObjectMapper objectmapper = new ObjectMapper();
		
	
		try {
			decisionRequest = objectmapper.readValue(file, DecisionRequest.class );
			
			//insuranceDetails = (DecisionRequest)insuranceDetails.getAdditionalProperties();
		
			logger.info("Scrub Id  : "+ decisionRequest.getScrubId());
		logger.info("Correlation Id: "+ decisionRequest.getCorrelationId());
		logger.info("Shift Start Time : "+decisionRequest.toString());			
	//	logger.info("Clam Charges "+decisionRequest.getClaim().getCharges());
	//		logger.info("All Artibute "+"\n"+ decisionRequest.getRefData().getRules2EnabledRules());
		
			
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
		return decisionRequest;
	}


}
