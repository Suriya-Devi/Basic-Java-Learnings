package assignments;

import java.util.Scanner;
//Swapping of numbers using third variable
public class Ass_Swap_Twonos_withthird {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y" );
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before Swapping "  );
		System.out.println("X="+x+ " "+ "Y="+y );
		z=x;
		x=y;
		y=z;
		System.out.println("After Swapping "  );
		System.out.println("X="+x+ " "+ "Y="+y );
	}

}
