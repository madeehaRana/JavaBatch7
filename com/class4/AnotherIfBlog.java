package com.class4;

public class AnotherIfBlog {
	public static void main (String [] args) {
		
		/*if Yes---> good job, if not --->not good
		 * if they completed we will check score:
		 * If more than 90--->you got an A
		 * If more than 80--> you got a B
		 * anything below--> you should study more8?
		 * 
		 */
		
		boolean quiz=false;
		int score=89;
		
		if (quiz) {
			System.out.println("Good job!!!");
			if(score>=90) {
				System.out.println("You got an A");
				
			}else if(score>80) {
				System.out.println("You got a B");
			}else {
				System.out.println("You should study more");
				
			}
		}else {
			System.out.println("not good");
		}
	}

}
