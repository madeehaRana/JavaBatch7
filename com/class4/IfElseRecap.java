package com.class4;

public class IfElseRecap {
	public static void main(String[] args) {
		
		/* Class schedule
		 * if tuesday---> SDLC
		 * if wednesday ---> java review
		 * if thursday--->sdlc
		 * if saturday----> java coding
		 * if sunday ---> my favorite java coding
		 * 
		
		 */
		
		int day=4;
		
		if (day==2) {
			System.out.println("SDLC Class");
		}else if(day==3) {
			System.out.println("Review Class");
		}else if (day==4) {
			System.out.println("SDLC class");
		}else if (day==6) {
			System.out.println("Java Coding");
		}else if(day==7){
			System.out.println("Favorite Java class");
			
		}else {
			System.out.println("There is no class at school");
		}
	}

}
