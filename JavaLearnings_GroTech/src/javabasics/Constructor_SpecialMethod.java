package javabasics;

public class Constructor_SpecialMethod {
	
	Constructor_SpecialMethod(){
		System.out.println("This is my Constructor");
	}
	
	void add() {
		System.out.println("Non-static method");
	}

	public static void main(String[] args) {
		System.out.println("This is my Main method");
		//When we create an object 2 times, constructor will get called/invoked 2 times
		Constructor_SpecialMethod c1 = new Constructor_SpecialMethod();//this is how we invoke a constructor
        c1.add();
		new Constructor_SpecialMethod();
		c1.add();
	}


}
