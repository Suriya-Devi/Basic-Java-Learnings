package javabasics;

import java.util.Scanner;

public class Multiply_tables4 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s1.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%4==0) {
				System.out.println(i);
			}
		}

	}

}
