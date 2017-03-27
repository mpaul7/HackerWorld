package Day13;

import java.util.Scanner;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String title = scan.nextLine();
		String author = scan.nextLine();
		int price = scan.nextInt();
		Book new_novel = new MyBook(title, author, price);
		new_novel.display();
		

	}

}
