package week3.w3_assignments;

import java.util.HashSet;
import java.util.Set;

public class PaypalIndia {
	
	public static void main(String[] args) {
		
		String str = "Paypal India";
		char[] chrArr = str.toCharArray();
		
		Set<Character> charSet = new HashSet<Character>();
		Set<Character> dupCharSet =new  HashSet<Character>();
		
		for (Character eachChar : chrArr) {
			if(charSet.contains(eachChar)) {
			dupCharSet.add(eachChar);
			}else {
				charSet.add(eachChar);	
			}
			
		}
		
		System.out.println("\ncharset elements");
		for(Character eachCharSet : charSet) {
			System.out.println(eachCharSet);
		}
		
		System.out.println("\ndupcharset elements");
		for(Character eachDupCharSet : dupCharSet) {
			System.out.println(eachDupCharSet);
		}
		
		dupCharSet.containsAll(charSet);
		charSet.removeAll(dupCharSet);
		
		
		// print without space
		System.out.println("\nprint the characters if not empty space");
		for(Character eachCharSet : charSet) {
			if(!eachCharSet.equals(' ')) {
				System.out.println(eachCharSet);
			}
		}
		
		
	
		
	}

}
