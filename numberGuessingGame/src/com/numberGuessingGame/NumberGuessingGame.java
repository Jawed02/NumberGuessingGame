package com.numberGuessingGame;

import java.util.*;

public class NumberGuessingGame {     
        public static void main(String[] args) {
	
     Scanner scan = new Scanner(System.in);
 	 Random rand = new Random();
     int limit = 101;
     int random_number = rand.nextInt(limit);
    // System.out.println(random_number);
	while(true) {
     System.out.println("Enter your Number");
	 int input = scan.nextInt();
	 int difference = random_number - input;
	 if(difference == 0) {
		 System.out.println("Correct!");
		 break;
	 }
	 else if(difference < 0) {
    	 System.err.println("wrong");
     }
     else if(difference <= 5) {
    	 System.out.println("Almost there");
     }
     else if(difference <= 15) {
    	 System.out.println("You are doing great.. Try again");
     }
     else if(difference > 15) {
    	 System.out.println("try again");
     }

    	 
	}
	
scan.close();	
}
	
}
