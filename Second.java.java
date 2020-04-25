package simpleCodes;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		
		int input = 0;
		int start = 1;
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextInt();
		
		while(input>0) {
			System.out.print(start+"  ");
			start = start + 2;
			input--;
		}
		
	}
	
}
