package javabasics;

public class Method_OverLoading_Concept {
//Developing multiple methods with the same name but with 
	//different argument list is called method overloading
	
	//Static methods overloading
	static void add() {
		System.out.println("Mthod 1");
	}
	
	static void add(int a,double b,String c) {
		System.out.println("Method 2");
		
	}
	
	//non-static methods overloading
	void add(int a) {
		System.out.println("Method 3");
	}
	public static void main(String[] args) {
		
		add();
		add(100,400,"Suriya");
		
		Method_OverLoading_Concept m1 = new Method_OverLoading_Concept();
		m1.add(10);

	}

	
			
			
			
			
			
			
}
