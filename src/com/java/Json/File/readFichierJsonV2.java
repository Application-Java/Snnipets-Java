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
public class readFichierJsonV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
	    JSONParser jsonP = new JSONParser();
	      
	      try { 
	    	  
	    	  
	    	  JSONArray  jsonOArray = (JSONArray)jsonP.parse(new FileReader("C:/Users/abdel-dev/eclipse-workspace/ParseJson/person2.json"));
		         
		      for (int i = 0; i < jsonOArray.size(); i++) {
		        	 
		        	 JSONObject jsonObject = (JSONObject)jsonOArray.get(i);
		        	 
		        	  String name = (String) jsonObject.get("name");
				         
				      String age = (String) jsonObject.get("age");
				         
				      String address = (String) jsonObject.get("address");		        	 
		        	 
		         
				      System.out.println("Name :"+ name);
				         
				      System.out.println("Age: "+ age);
				         
				      System.out.println("Address: "+ address);
		         
		       } 
		      
	      } catch (FileNotFoundException e) {
	    	  
		         e.printStackTrace();
		         
		      } catch (IOException e) {
		    	  
		         e.printStackTrace();
		         
		      } catch (ParseException e)   {
		    	  
		         e.printStackTrace();
		}      
	}

}
