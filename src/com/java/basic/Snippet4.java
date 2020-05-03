package com.java.basic;

public class Snippet4 {
	
   static void setString(String b ) {
		
		b=new String("HelloUpdate");  //porte locale
		
		
	}

	public static void main(String[] args) {
		
		String s1 =new String("Hello");
		
	    System.out.println("Avant la modification "+s1);
		
	    setString(s1);
	    
	    System.out.println("Apres la modification "+s1);

	}

}
