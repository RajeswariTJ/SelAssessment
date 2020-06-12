package week1.day2;

import java.util.Arrays;

public class SecondLargest {
	
	public static void main(String[] args) {
	
	 int[] data = {3,2,11,4,6,7};
	 Arrays.sort(data);
	 System.out.println("After Ascending:");
	 for(int i=0;i<data.length;i++) {
	 System.out.println(data[i]);
	}
	 int scndLargest = data.length-2;
	 System.out.println("Second Largest no. : " + data[scndLargest]);
	}
}
