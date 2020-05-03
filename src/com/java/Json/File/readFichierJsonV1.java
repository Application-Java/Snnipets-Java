/**
 * 
 */
package com.java.Json.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author abdel-dev
 *
 */
public class readFichierJsonV1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
	      JSONParser jsonP = new JSONParser();
	      
	      try { 
	 
	    	  
	        JSONObject jsonO  = (JSONObject)jsonP.parse(new FileReader("C:/Users/abdel-dev/eclipse-workspace/Snnipets-Java/resources/person1.json"));
	          
	        String name = (String) jsonO.get("name");
	         
	         String age = (String) jsonO.get("age");
	         
	         String address = (String) jsonO.get("address");
	         
	         System.out.println("Name :"+ name);
	         
	         System.out.println("Age: "+ age);
	         
	         System.out.println("Address: "+ address);
	         
	         
	         
	       
	         
	      } catch (FileNotFoundException e) {
	    	  
	         e.printStackTrace();
	         
	      } catch (IOException e) {
	    	  
	         e.printStackTrace();
	         
	      } catch (ParseException e)   {
	    	  
	         e.printStackTrace();
	      }


	}

}
