package claim.testing;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import claim.claimrules.Claim;
import claim.claimrules.DecisionRequest;

public class JavaReflectionType {
	 
	private static HashMap<String,Object>  classNvalues= new HashMap();
	
	private static final String mainCliam="claim.claimrules.DecisionRequest@71d15f18[practiceId=10007,correlationId=Claim test,explain=July 27 test,activeInsurancePrefix=india honda,version=8,transferType=Json to Excel,scrubId=SB09,claim=claim.claimrules.Claim@17695df3[serviceDate=Match draw,claimFormat=hscore6,reserved19Note=covid19,activeInsurancePrefix=Test Data,similarIllnessDate=Dettole,sterilization=Hems,invoiceId=My007,charges=[claim.claimrules.Charge@6c9f5c0d[amount=10517320,id=10,diagnosisCodes=[string],fromDate=string,toDate=string,relativeValueUnit=10517320,originalAmount=10517320,outstandingAmount=10517320,procedureCode=string,modifiers=[claim.claimrules.Modifier@de3a06f[id=MSB,chargeable=MsbChs,printable=string,additionalProperties={}]],units=10,note=string,unlistedPxException=string,printable=TennisPrint,epsdtFlag=prEPSD,officeVisitFlag=trimOffice,anesthesiaTimeSheetData=claim.claimrules.AnesthesiaTimeSheetData@76b10754[procedureCode=Sproced,additionalProperties={}],epsdt=thEPS,status=claim.claimrules.Status@2bea5ab4[primaryDenied=PrimeryDenied,additionalProperties={}],transactions=[claim.claimrules.Transaction@3d8314f0[amount=10517320,id=10,transferType=SBTransfer,type=transactions  $SB,additionalProperties={}]],submissionOverrides=[claim.claimrules.SubmissionOverride@2df32bf7[formName=string,formAttributes=[claim.claimrules.FormAttribute@530612ba[name=string,value=string,additionalProperties={}]],additionalProperties={}]],clia=claim.claimrules.Clia@2a40cd94[requiredYN=string,additionalProperties={}],revenueCode=string,additionalProperties={}]],additionalProperties={}],additionalProperties={}]\n"; 
	static DecisionRequest dr = new DecisionRequest();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String match = getValueFromClassString(mainCliam, "correlationId");
		
//	Claim claim = dr.getClaim();
		//String classmatch = toString(dr);
		
		
		
		//System.out.println("Value Got Matches : "+classmatch);
		System.out.println("Class List : "+classNvalues);
		
	}
	
	
	
	private static String toString(Object classObj) {
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
		    result.append("  ");
		    try {
		    	
		    	String key =field.getName();
		    	String Value =getValueFromClassString(mainCliam,field.getName());
		    	
		    	if(!(field.getType().toGenericString().contains("claim.claimrules") || field.getType().toGenericString().contains("Map")))
		    	{   result.append("  "+ key);
		      result.append("  "+Value);
		      System.out.println("Type :"+field.getType());
		      tabLevelAttibute.put(key,Value);
		    	}
		  
		      result.append(": ");
		      //requires access to private field:
		     result.append( field.get(classObj) );
		    } catch ( IllegalAccessException ex ) {
		      System.out.println(ex);
		    }
		    result.append(newLine);
		  }
		  result.append("}");
		  classNvalues.put(className,tabLevelAttibute);
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
