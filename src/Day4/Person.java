package Day4;

/**
 * Task Write a Person class with an instance variable,age , and a constructor
 * that takes an integer, initial age, as a parameter. The constructor must
 * assign initial age to age after confirming the argument passed as initialAge
 * is not negative; if a negative argument is passed as initialAge , the
 * constructor should set age to 0 and print Age is not valid, setting age to
 * 0.. In addition, you must write the following instance methods:
 * 
 * yearPasses() should increase the age instance variable by 1. amIOld() should
 * perform the following conditional actions: If age<13, print You are young..
 * If age>=13 and age < 18, print You are a teenager.. Otherwise, print You are
 * old..
 * 
 * To help you learn by example and complete this challenge, much of the code is
 * provided for you, but you'll be writing everything in the future. The code
 * that creates each instance of your Person class is in the main method. Don't
 * worry if you don't understand it all quite yet!
 * 
 * Note: Do not remove or alter the stub code in the editor.
 * 
 * Input Format
 * 
 * Input is handled for you by the stub code in the editor.
 * 
 * The first line contains an integer, (the number of test cases), and the
 * subsequent lines each contain an integer denoting the of a Person instance.
 * 
 * Constraints
 * 
 * 1 <= T < =4 -5 < = age <= 30
 * 
 * Output Format
 * 
 * Complete the method definitions provided in the editor so they meet the
 * specifications outlined above; the code to test your work is already in the
 * editor. If your methods are implemented correctly, each test case will print
 * 2 or 3 lines (depending on whether or not a valid initialAge was passed to
 * the constructor).
 */

public class Person {
	public int age;

	public Person(int initialAge) {
		if (initialAge > 0)
			this.age = initialAge;
		else {
			age = 0;
			System.out.println("Age is not valid, setting age to 0");
		}
	}

	public void yearPasses() {
		age++;
	}

	public void amIOld() {
		if (age < 13) {
			System.out.println("You are young.");
		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");
		} else
			System.out.println("you are old.");
	}

	public static void main(String[] args) {

		Person p = new Person(-1);
		p.amIOld();
		for(int j = 0; j < 3; j++){
			p.yearPasses();
		}
		p.amIOld();
		System.out.println();
	}

}
