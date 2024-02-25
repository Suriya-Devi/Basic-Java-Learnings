package assignments;

import java.util.Scanner;

public class Ass_Factorial_Scanner {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			fact = fact*i;
			
		}
		System.out.println("The factorial of a number "+n+ " is "+fact);

	}

}
