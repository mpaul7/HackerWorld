package Day11;

import java.util.Scanner;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] scores = new int[numScores];

		for (int i = 0; i < numScores; i++){
			scores[i] = scan.nextInt();
		}
		
		scan.close();
		
		Student s = new Student(firstName, lastName, id, scores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
		
	}

}
