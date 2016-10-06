package javaGenericScript;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Generic {
     public static void main(String[] args) {

    getJsonDataFromFile();
    
    	 
     }
     public static Object[][] getJsonDataFromFile(){
    	 JSONParser parser = new JSONParser();

    		try {

    			

    			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("resources/All InputForTestcases.json"));

    			System.out.println(jsonArray.size());
    			
    			Object [][] data = new Object[jsonArray.size()][];
    			
    			for(int i = 0; i < jsonArray.size(); i++){
    				System.out.println("\n\n" + "Info for Employee"+ " " + (i+1)+"\n" );
    				JSONObject jsonObject = (JSONObject)jsonArray.get(i);
    				Iterator<String> keys = (Iterator<String>) jsonObject.keySet().iterator();
    			    while (keys.hasNext()) {
    			        String key = keys.next();
    			        Object value = jsonObject.get(key);
    			        System.out.println( key + ":" + value + "" );
    			       
    			    }
    			
    				
//    				System.out.println(jsonObject.get("firstName"));
//    				System.out.println(jsonObject.get("lastName"));
//    				System.out.println(jsonObject.get("otherName"));
//    				System.out.println(jsonObject.get("bankAccount"));
//    				System.out.println(jsonObject.get("NID"));
//    				System.out.println(jsonObject.get("email"));
//    				System.out.println(jsonObject.get("teamName"));
//    				System.out.println(jsonObject.get("projectName"));
//    				
    				
//    				data[i][0] = jsonObject.get("firstName");
//    				data[i][1] = jsonObject.get("lastName");
//    				data[i][2] = jsonObject.get("otherName");
//    				data[i][3] = jsonObject.get("bankAccount");
//    				data[i][4] = jsonObject.get("NID");
//    				data[i][5] = jsonObject.get("email");
//    				data[i][6] = jsonObject.get("teamName");
//    				data[i][7] = jsonObject.get("projectName");
    			
    				
    			}
    			
    			return data;
    			

    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		} catch (IOException e) {
    			e.printStackTrace();
    		} catch (ParseException e) {
    			e.printStackTrace();
    		}

    		return null;
     }
    	  
    	    
    	   

}