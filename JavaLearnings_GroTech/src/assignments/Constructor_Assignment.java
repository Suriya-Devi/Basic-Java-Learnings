package assignments;
//Assignment 17 - 2 static methods,2 non-static methods and one constructor
public class Constructor_Assignment {
	//2 static methods
    static void c1() {
		System.out.println("This is C1 method");
	}

	static void c2() {
		System.out.println("This is C2 method");
	}
	//2 non static methods
	void c3() {
		System.out.println("This is C3 method");
		
	}
	void c4() {
		System.out.println("This is C4 method");
	}
	//Constructor
	Constructor_Assignment(){
		System.out.println("Constructor method");
	}
	
	public static void main(String[] args) {
		c1();
		c2();
		
		Constructor_Assignment a1 = new Constructor_Assignment();
		a1.c3();
		a1.c4();
	}

}
