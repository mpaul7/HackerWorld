package Day6;

import java.util.Scanner;

public class Solution {

	/**
	 * @param args
	 * Given a string, S, of length N that is indexed from 0 to N-1 , print its even-indexed and 
	 * odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail). 
	 * Note 0  is considered to be an even index. 
	 */
	public static void main(String[] args) {
		String sEven = "";
		String sOdd = "";
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		for (int j = 0; j < index; j++){
			String s = scan.next();
			char[] sChar= s.toCharArray();
			for (int i = 0; i < s.length(); i++){
				if(i%2==0) sEven = sEven+sChar[i];
				else sOdd = sOdd+sChar[i];
			}
			System.out.println(sEven + " " + sOdd );
			sEven = "";
			sOdd = "";
		}
	}

}
