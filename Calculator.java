package week1.day2;

public class Calculator {
	
	public int addTwoNumbers(int a,int b) {
		int c = a+b;
		return c;
	}
	public int subTwoNumbers(int a,int b) {
		int c = a-b;
		return c;
	}
	public int mulTwoNumbers(int a,int b) {
		int c = a*b;
		return c;
	}
	public int divTwoNumbers(int a,int b) {
		int c = a/b;
		return c;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int add = calc.addTwoNumbers(12, 44);
		System.out.println("Result of Addition : "+ add);
		int sub = calc.subTwoNumbers(10, 23);
		System.out.println("Result of Subtraction : "+ sub);
		int mul = calc.mulTwoNumbers(6, 34);
		System.out.println("Result of Multiplication : "+ mul);
		int div = calc.divTwoNumbers(440, 11);
		System.out.println("Result of Division : "+ div);
		
	
		
		
		}
		}

	
		
 
		
	


