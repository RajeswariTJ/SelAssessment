package week1.day2;

public class RemovesDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		String output = "";
		int count = 0;
		String[] splitedWrds = text.split(" ");
		for(int i=0 ;i<splitedWrds.length;i++) {
		//System.out.println(splitedWrds[i]);
			for (int j = 0;j<splitedWrds.length;j++) {
		
		if(splitedWrds[i].equals(splitedWrds[j])) {
			
			count = count+1;
			
		}
			}
			if(count>1) {
				output = output + splitedWrds[i].replace(splitedWrds[i], "");
			}else {
				output = output + splitedWrds[i]+" ";
			}
				
			count = 0;	
			
		}		
		
		System.out.println("output : " +output);
		
		
	}

}
