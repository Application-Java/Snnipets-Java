package com.java.basic;

public class Snippet5 {

   static void bonjour() {
		
	   System.out.println("Bonjour"); // c'est une procedure car elle n'envoi pas de retour (void)
		
	}
   
   static int multiplication(int a,int b) {
		
	   return a*b;  // c'est une fonction car il envoi un return 
		
	}
   
   
	
	public static void main(String[] args) {
		
		
		// bonjour();
		
		int resultat;	
		
		
		resultat=multiplication(3,5);	
		
		
		System.out.println(resultat);
		
		
		 
		 

	}

}
