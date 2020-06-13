package com.class4;

public class Droid{
	  String name;
	  int batteryLevel;
	  
	public Droid(String droidName){
	  name = droidName;
	  batteryLevel = 100;
	}
	  
	public static void main(String[] args){
	  Droid codey = new Droid("Codey");
	  System.out.println(codey);
	  
	  
	}
	}
