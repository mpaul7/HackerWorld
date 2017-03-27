package Day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	           phoneBook.put(name, phone);
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            if(phoneBook.containsKey(s)){
	            	System.out.println(s +"=" + phoneBook.get(s));
	            }else System.out.println("Not found");
	        }
	        in.close();

	}

}
