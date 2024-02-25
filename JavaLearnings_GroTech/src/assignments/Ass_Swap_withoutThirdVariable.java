package assignments;

import java.util.Scanner;

public class Ass_Swap_withoutThirdVariable {

	public static void main(String[] args) {
		int x,y;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of x ");
		x =sc.nextInt();
		System.out.println("Enter the value of y ");
		y=sc.nextInt();
		System.out.println("Before swapping the nos"+x+ "  "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping the nos"+x+ "  "+y);

	}

}
