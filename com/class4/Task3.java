package com.class4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter your city");
		String cityName=scan.nextLine();
		
		System.out.println("Please enter tempreature");
		int temp=scan.nextInt();
		
		
		int convertedTemp=(temp-32)*5/9;
		System.out.println("The tempreature in city"+cityName+"is"+ convertedTemp);
		
		
		

	}

}
