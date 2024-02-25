package assignments;

import java.util.Scanner;

public class Ass_Divisibleby3and5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			
		if(i%3==0) {
			System.out.println("The number "+i+ " is divisible by 3");
		
		if(i%5==0) {
			System.out.println("The number "+i+ " is divisible by 5");
			
		if(i%3==0 && i%5==0) {
			System.out.println("The number "+i+ " is divisible by both 3 and 5");
		}
		}
		}
	}

}
}
