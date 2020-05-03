package com.java.basic;
/**
 * 
 */

/**
 * @author abdel-dev
 *
 */
public class Snippet2 {	
	
	//, parametres scalaires ou parametres objets
	
   static void plus_un(int x) {
		
		x=x+1;  // porte locale 
		
		System.out.println("La valeur de x a l'interieur de la fonction plus_un : "+x);
		
		
	}
   
   static int plus_un_bis(int x) {
		
		x=x+1;  // porte locale
		
		return  x;
		
		
	}

	public static void main(String[] args) {
		
		int x=1;
		
		System.out.println("La valeur de x avant l' apel de la fonction plus_un : "+x);
		
		//plus_un(x);
		
		x=plus_un_bis(x);
		
		System.out.println("La valeur de x apres l'apel de la fonction plus_un : "+x);
		

	}

}
