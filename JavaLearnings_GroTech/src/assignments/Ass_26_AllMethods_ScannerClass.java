package assignments;

import java.util.Scanner;
//Assignment 26 - Declare & initialise all type of scanners
public class Ass_26_AllMethods_ScannerClass {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of n9");
		String n9 = s1.nextLine();
		System.out.println("Enter the value of n1");
		int n1= s1.nextInt();
		System.out.println("Enter the value of n2");
		byte n2=s1.nextByte();
		System.out.println("Enter the value of n3");
		short n3=s1.nextShort();
		System.out.println("Enter the value of n4");
		long n4=s1.nextLong();
		
		System.out.println("Enter the value of n5");
		float n5=s1.nextFloat();
		System.out.println("Enter the value of n6");
		double n6=s1.nextDouble();
		System.out.println("Enter the value of n7");
		String n7 =s1.next();
		System.out.println("Enter the value of n8");
		boolean n8=s1.nextBoolean();
		

	}

}
