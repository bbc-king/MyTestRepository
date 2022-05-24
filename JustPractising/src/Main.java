import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			
		//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
		//For example, if the input is 12345, the output should be 54321.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int num1 = scanner.nextInt();//2
		int num2 = scanner.nextInt();//7
		int res = 1;
		
		System.out.println("Choose what number will be power, 1-st or 2-end");
		int choice = scanner.nextInt();
		
		if (choice == 2) {
			
			for(int i= 0 ; i< num2 ;i++) {
				res = res * num1;
				System.out.println(res);
							
				
			};
		
			
		} else if (choice ==1) {
			for(int i= 0 ; i< num1 ;i++) {
				res = res * num2;
				System.out.println(res);
							
				
			};
		
		}
		
		
		
	}
}

