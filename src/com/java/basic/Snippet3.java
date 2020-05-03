package com.java.basic;



class a {
	
	int val1=3;
	
	
}

public class Snippet3 {
	
	static void setClassA(a c){
		
		c.val1=4;
		
	}

	public static void main(String[] args) {
		
		 a b= new a();
		 
		 System.out.println("Avant la modification "+b.val1);
		 
		 setClassA(b);
		 
		 System.out.println("Apres la modification "+b.val1);

	}

}
