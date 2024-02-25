package assignments;
import java.util.*;

public class Ass27_ScannerClass_GV {
	static int a,b;
	
	void add() {
		int Sum =a+b;
		System.out.println("Sum is "+Sum);
	}
	void sub() {
		int Sub =a-b;
		System.out.println("Sub is "+Sub);
	}
	void mul() {
		int Mul =a*b;
		System.out.println("Multiplication value is "+Mul);
     }
	void div() {
		double Div =a/b;
		System.out.println("Division value  is "+Div);
	}
	void modulus() {
		double Mod =a%b;
		System.out.println("Modulus is "+Mod);
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=s1.nextInt();
		System.out.println("Enter the value of b");
		b=s1.nextInt();
		
		Ass27_ScannerClass_GV a1= new Ass27_ScannerClass_GV();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.modulus();
		

	}

}
