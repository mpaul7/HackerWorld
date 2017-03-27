package Day3;

import java.util.Scanner;


/**
 * @author mpaul7
 * Task
Given an integer,n , perform the following conditional actions:

    If n is odd, print Weird
    If n is even and in the inclusive range of 2 to 5, print Not Weird
    If n is even and in the inclusive range of 6 to 20 , print Weird
    If n is even and greater than 20, print Not Weird
    Complete the stub code provided in your editor to print whether or not n is weird.
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      // Check the logic of While loop
	      if ((n <1) || (n > 100)){ 
	      do{
	    	  System.out.println("entring do loop");
	           n =scan.nextInt();
	      }while((n <1) || (n > 100));
	   }
	      scan.close();
	      String ans="";
	          
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	     
	            if ((n%2 == 1) || (n >=6 && n <= 20)) {
	               ans = "Weird";
	            }
	            else if ((n >=2 && n <= 5) || (n > 20)) {
	               ans = "Not Weird";
	            }
	          
	          System.out.println(ans);
	      }
}
	     
		
	 
	 



