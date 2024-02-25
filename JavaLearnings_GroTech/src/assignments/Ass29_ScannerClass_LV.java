package assignments;

import java.util.Scanner;

public class Ass29_ScannerClass_LV {
	
	static void add() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		int Sum =a+b;
		System.out.println("Sum is "+Sum);
	}
	
	 void sub() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		int Sub =a-b;
		System.out.println("Sub is "+Sub);
	}
	 
	 void mul() {
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the value of a");
			int a=s1.nextInt();
			System.out.println("Enter the value of b");
			int b=s1.nextInt();
			int Mul =a*b;
			System.out.println("Multiplication value is "+Mul);
		}
	 
	 static void div() {
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the value of a");
			int a=s1.nextInt();
			System.out.println("Enter the value of b");
			int b=s1.nextInt();
			double Div =a/b;
			System.out.println("Division value  is "+Div);
		}
	 
	static void modulus() {
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the value of a");
			int a=s1.nextInt();
			System.out.println("Enter the value of b");
			int b=s1.nextInt();
			double Mod =a%b;
			System.out.println("Modulus is "+Mod);
		}

	public static void main(String[] args) {
		add();
		Ass29_ScannerClass_LV a=new Ass29_ScannerClass_LV();
		a.sub();
		a.mul();
		div();
		modulus();
		

	}

}
