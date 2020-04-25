package simpleCodes;

import java.util.Scanner;

public class First {
	
	public static void main(String[] args) {
	
		double a=0, b=0;
		double result=0;
		String typeofOperation;
		
		Scanner sc = new Scanner(System.in);
	
		//System.out.println("Enter the Numbers :");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		//System.out.println("Enter type of operation");
		
		typeofOperation = sc.next();
		
		if(typeofOperation.equalsIgnoreCase("addition")) {
			result = a + b;
		}else if(typeofOperation.equalsIgnoreCase("subtraction")) {
			result = a - b;
		}else if(typeofOperation.equalsIgnoreCase("multiplication")) {
			result = a * b;
		}else if(typeofOperation.equalsIgnoreCase("division")) {
			result = a / b;
		}else {
			System.out.println("Invalid Type of Operation!!!");
		}
		
		//System.out.println("Result is = "+result);
		System.out.println(result);
		
		
	}
	
}
