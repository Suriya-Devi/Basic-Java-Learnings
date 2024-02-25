package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//using for loop
		int i,fact=1;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of num");
		int num = s1.nextInt();
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of a given number "+num+" is "+fact);

	}

}

