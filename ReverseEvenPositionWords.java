package week1.day2;

public class ReverseEvenPositionWords {
	public static void main(String[] args) {
		
		String givenWrd = "I am a software tester";
		String[] split = givenWrd.split(" ");
		
		String reverse="";
		for (int i=0; i<split.length; i++) {
			
			if(i%2!=0) {			
			
			for (int j = split[i].length()-1;j>=0;j--) {
				reverse = reverse + split[i].charAt(j);
			}
			reverse = reverse + " ";
			}
			else
			{
				reverse = reverse + split[i]+" ";
			}
			
		}
		System.out.println(reverse);
		
		}

}
