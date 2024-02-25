package assignments;

public class Assignment_ArithmeticOperators {
	//Assignment 7
	static void add() {
	int a=100;
		int b=200;
	    int sum= a+b;
	System.out.println(sum);
		
	} 
	
	static void subtract() {
		int a=100;
		int b=200;
	    int c= b-a;
	System.out.println("The Subtracted value is "+c);
		
	}

	static void multiply() {
		int a=100;
		int b=200;
	    int c= b*a;
	System.out.println("The Multiplication value is "+c);

	}
	
	static void divide() {
		int a=100;
		int b=200;
	    float c= a/b;
	System.out.println("The Division value is "+c);

	}
	
	static void modulus() {
		int a=100;
		int b=200;
	    double c= a%b;
		
		System.out.println("The Modulus value is "+ c);
		
		
	}
	

	public static void main(String[] args) {
		add();
		subtract();
		multiply();
		divide();
		modulus();
		

	}

}
