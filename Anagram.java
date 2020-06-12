package week1.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss"; 
		int count = 0;
		if(text1.length() == text2.length()) {
		System.out.println("Length of the strings in "+ text1+" and "+text2+" are same");
		}
		
		char[] arr1 = text1.toCharArray();
		char[] arr2 = text2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		System.out.println("After sorting the text1 - "+text1);
		for (int i = 0 ;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("After sorting the text2 - "+text2);
		for (int i = 0 ;i<arr1.length;i++) {
			System.out.println(arr2[i]);
		}
		
		for (int i = 0 ;i<arr1.length;i++) {
			
			if(arr1[i]==arr2[i]) {
				count = count +1 ;
				
			}else {
				System.out.println("Both the arrays are not having same values");	
				break;
			}
		}
		if (count ==5) {
			System.out.println("both the arrays has same value");	
		}
		
	}

}
