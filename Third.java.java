package simpleCodes;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		
		int input = 0;
		int start = 1;
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextInt();
	
		if(input % 2 != 0) {
			while(input > 0) {
				System.out.print(start+"  ");
				start = start + 2;
				input--;
			}
		}else {
			input = input - 1;
			while(input > 0) {
				System.out.print(start+"  ");
				start = start + 2;
				input--;
			}
		}
		
	}
	
}
