package week1.day2;

public class oddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
		char[] arr = test.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				char upperCase = Character.toUpperCase(arr[i]);
				System.out.println(upperCase);
			}
			else
			System.out.println(arr[i]);
		}
		
		
	}

}
