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
public class readFichierJsonV3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		JSONParser jsonP = new JSONParser();

		try { 

			/* 3er version */

			JSONObject jsonObject  = (JSONObject)jsonP.parse(new FileReader("C:/Users/abdel-dev/eclipse-workspace/ParseJson/person3.json")); 

			String name = (String) jsonObject.get("name");

			String age = (String) jsonObject.get("age");

			String address = (String) jsonObject.get("address");

			System.out.println("Name :"+ name);

			System.out.println("Age: "+ age);

			System.out.println("Address: "+ address);

			JSONArray jsonOArray = (JSONArray)jsonObject.get("niveaux");

			for (int i = 0; i < jsonOArray.size(); i++) {

				JSONObject jsonObjectBis = (JSONObject)jsonOArray.get(i);

				String key = (String) jsonObjectBis.get("key");

				String val = (String) jsonObjectBis.get("val");     	 


				System.out.println("Key :"+ key);

				System.out.println("Val: "+ val);			         


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
