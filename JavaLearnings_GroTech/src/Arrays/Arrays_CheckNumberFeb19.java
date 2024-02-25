package Arrays;

import java.util.Scanner;

public class Arrays_CheckNumberFeb19 {

	public static void main(String[] args) {
		int number[] = new int[3];
		int no_toCheck=23,i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<3;i++) {
			System.out.println("Enter the array value");
			number[i]=sc.nextInt();
			
		}
		for(i=0;i<3;i++) {
		
		if (no_toCheck==number[i]) {
			System.out.println("I found the same number " +number[i]);
		}
		/*else {
			System.out.println("This is not the number");
		}
		*/
		
	}
	}

}
