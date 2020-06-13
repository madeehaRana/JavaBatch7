package com.class3;

import java.util.Scanner;
class Main {
  public static void main (String []args){
    Scanner input=new Scanner(System.in);
    System.out.println("What is your name?");
    String name=input.nextLine();
    System.out.println("Your name is" + name);
    
  }

}