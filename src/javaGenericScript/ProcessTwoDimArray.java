package javaGenericScript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProcessTwoDimArray {
	
	@Test(dataProvider = "testDataProvider")
	public void testJson(String fName, String lName, String oName, String a, String b, String c, String d, String e, String f){
				System.out.println("First Name: " + fName);
				System.out.println("Last Name: " + lName);
				System.out.println("Other Name: " + oName);
				System.out.println("BankAccount Name: " + a);
				System.out.println("NID Name: " + b);
				System.out.println("Joining date Name: " + c);
				System.out.println("**********************************************");
	}
	
	@DataProvider
	public Object [][] testDataProvider(){
		String filePath = "resources/altufaltujson.json";
		
		return Generic.getJsonDataFromFile(filePath);
	}
	
	
}
