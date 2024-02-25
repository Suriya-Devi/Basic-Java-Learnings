package javabasics;

public class GlobalVariable_ArithOperator {

	static int n1=100;//GV
	static int n2=200;//GV
	
	static void add() {
		int sum=n1+n2;
		System.out.println(sum);
	}
	
	static void sub() {
		System.out.println(n2-n1);
	}
	
	
	static void mul() {
		System.out.println(n1*n2);
		
	}
	
	static void div() {
		System.out.println(n1/n2);
	}
	
	static void modulus() {
		double Mod = n1%n2;
		System.out.println(Mod);
		
	}
	public static void main(String[] args) {
	
		add();
		sub();
		mul();
		div();
		modulus();
	}

}
