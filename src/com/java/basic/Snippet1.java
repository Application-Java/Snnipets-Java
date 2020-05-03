package com.java.basic;

public class Snippet1 {
	
	static void tab_plus_un(int[] y) {
		
		int n=y.length;
		
		for(int i=0;i<n; i=i+1) {
			
			y[i]=y[i]+1;  // porte globale
		}
		
	}
	
	 public static void main(String[] args) {
		 
		 int[] x = new int[5];  // declaration tableau vide de 5 entrées 	 
		
		 
		 for(int i=0;i<5; i=i+1) { // Boucle For commence par 0 et fini par 4    x=[0,1,2,3,4]
			 
			 x[i]=i;
			 
		 }
		 
		 for(int i=0;i<5; i=i+1) {
			 
	        	System.out.println(x[i]);
				 
			 }
			 
		 
		 tab_plus_un(x);  // apres apel : x=[1,2,3,4,5]
		 
		 System.out.println("*******************Apres apel ****************************");
		 
        for(int i=0;i<5; i=i+1) {
			 
        	System.out.println(x[i]);
			 
	    }
		 
		 
         
      }

}
