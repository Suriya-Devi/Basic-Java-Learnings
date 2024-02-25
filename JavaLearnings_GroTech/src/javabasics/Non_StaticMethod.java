package javabasics;

public class Non_StaticMethod {
	void add() {
		int a=100;
		int b=200;
		System.out.println(b+a);
	}
	public static void main(String[] args) {
		subtract();
		Non_StaticMethod n1 = new Non_StaticMethod();//to call many non - static methods,
		//we can create the single object with the help of its reference variable
		n1.add();
		

	}
	
	static void subtract() {
		int a=100;
		int b=200;
		System.out.println(b-a);
	}

}
