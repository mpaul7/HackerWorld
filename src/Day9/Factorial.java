package Day9;

import java.util.Scanner;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 0;
		
		Scanner scan = new Scanner(System.in); int n = scan.nextInt();
		 
		factorial = calculateFactorial(n);
		System.out.println("factorial is = " + factorial);
	}

	private static int calculateFactorial(int n) {
        int fact;
		if (n == 1)
			return 1;
		fact = n * calculateFactorial(n-1);
		return fact;
	}
}
