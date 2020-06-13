package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		
		double d=1.99;
		double d1=2.99;
		
		boolean b=d>d1;
		System.out.println(b);
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
	    System.out.println(b3);
	    
	    int a=90;
	    int c=30;
	    
	    if (a>c) {
	    	System.out.println("a is larger than c");
	    	
	    }else {
	    	System.out.println("a is smaller than c");
	    	
	    }
	    int expectedHours=15;
	    int actualHours=20;
	    //if expected hours are more that actual->you will succeed otherwise, please study more.
	    
	    if (actualHours>expectedHours) {
	    	System.out.println("you will succeed");
	    	
	    }else {
	    
	    	
	    	
	    	System.out.println("please study more");
	    	
	    	
	    	
	    	
	    	
	   double teaPrice=4.99;
	   double allowedPrice=3.99;
	   //if price is more that I can afford I will NOT buy
	   //if price is less or matches what I can afford then I will buy tea
	   
	   if (allowedPrice>teaPrice) {
		   
		   System.out.println("I will buy tea");
		   System.out.println("And I willl enjoy my tea");
		   
	   }else {
		   System.out.println("I cannot afford, I need to study more");
		   System.out.println("I will go back to study more");
		   
		   
	   }
	   
	      System.out.println("I keep writing some code");
	      
	      
	    }
	 
	    
	    
	
		
		
		
		

	}

}
