package test.Stringcases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestStringOperation {
	
	private static final  String testString= "claim.claimrules.DecisionRequest@5e57643e[practiceId=10007,correlationId=Claim test,explain=u05,activeInsurancePrefix=india honda,version=V4,transferType=123,scrubId=mkd23,claim=claim.claimrules.Claim@133e16fd[serviceDate=june20,claimFormat=forma1,reserved19Note=covid19,activeInsurancePrefix=string,similarIllnessDate=string,sterilization=string,invoiceId=string,additionalProperties={}],additionalProperties={}]\n";
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getClassObjectMAP(testString);
		
	//	matchingPatterName(testString);
	}
	
	private static HashMap<String, Object> getClassObjectMAP(String jsonClass) {

		HashMap<String, Object> ObjectLevel = new HashMap<String, Object>();
		String ClassName = new String();
		StringTokenizer tokenizer = new StringTokenizer(jsonClass, ",");
	
		ClassName =  matchingPatterName(tokenizer.nextToken());
		List<String> tabLevelAttibute = new ArrayList();
		while (tokenizer.hasMoreElements()) {
			StringTokenizer keyVal = new StringTokenizer(tokenizer.nextToken().trim(), "=");
			String keyElement= new String();
			String Value =new String();
			
			
			if(keyVal.hasMoreElements())
				keyElement =keyVal.nextToken().trim();
			if(keyVal.hasMoreElements())
				Value=keyVal.nextToken().trim();
			
			if(Value!=null && keyElement!=null && !isStringHaveSpecialChar(Value))
			{
				tabLevelAttibute.add("("+keyElement +"," +Value+")");
			}else {
				ClassName = matchingPatterName(Value);
				tabLevelAttibute = new ArrayList();
			}
			
				
			ObjectLevel.put(ClassName, tabLevelAttibute);
		}
	
		for (Map.Entry<String, Object> entry : ObjectLevel.entrySet()) {
			System.out.println("Class Name : " + entry.getKey() + " Attributes names : " + entry.getValue());
		}
		return ObjectLevel;

	}
	
	
	
	private static boolean isStringHaveSpecialChar(String keyString) {
		
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(keyString);
		boolean b = m.find();
		
		return b;
  
		
	}
	
	private static String matchingPatterName(String keyString) {
	Pattern pattern = Pattern.compile("claim.claimrules.(.*?)@", Pattern.DOTALL);
	Matcher matcher = pattern.matcher(keyString);
	String matchKey = new String();
	while (matcher.find()) {
		matchKey =matcher.group(1);
	}
	return matchKey;
	}
	
	

}
