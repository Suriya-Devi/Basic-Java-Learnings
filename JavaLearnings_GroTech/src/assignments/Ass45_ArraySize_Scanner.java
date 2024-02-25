package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Ass45_ArraySize_Scanner {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n= sc.nextInt();
		int age[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value of an array");
			age[i]= sc.nextInt();
			
		}
		Arrays.sort(age);
		System.out.println(Arrays.toString(age));
	}

}
