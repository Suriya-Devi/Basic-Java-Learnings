package javabasics;

public class LocalVariable {
	//declaration int a;

	//initialization int a =100;
	//utilisation - utilising a variable
	//implementation - whatever is present inside the method
	static void add() {
		int a=100;//Local variable ,this a is meant for only for this add method
		int a1=200;//LV
		System.out.println(a+a1);
	}
	
	void subtract() {
		int a=100;
		int a1=200;
		System.out.println(a-a1);
	}
	
	void subtract(int age,String name,char gender) {
		System.out.println(age);
		System.out.println(name);
		System.out.println(gender);
	}

	public static void main(String[] args) {
		//local variable
		int a =100;//this a is meant only for this main method
		add();
		LocalVariable l1 = new LocalVariable();
		l1.subtract();
		l1.subtract(10,"Suriya", 'H');
		

	}
/*
 * static void add() {
		int a=100;//LV is meant for this add method
		int b=200;
		System.out.println(a+b);
	}
	
	void subtract(){
		int a=50;//LV is meant for this subtract method alone
	}
	public static void main(String[] args) {
		int a=1000;//this local variable is meant for this main method

	}
 */
}
