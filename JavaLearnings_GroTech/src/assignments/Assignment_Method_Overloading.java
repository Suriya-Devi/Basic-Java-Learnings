package assignments;
//Assignment - 18 -4 static and non-static methods having the same name using the concept method overloading
public class Assignment_Method_Overloading {
	
	static void add(int a) {
		System.out.println("Method 1");
	}
	
	static void add(char c,double b) {
		
		System.out.println("Method 2");
	}
	
	static  void add(boolean b) {
		System.out.println("Method 3");
	}
	
	static void add(String s,int a) {
		System.out.println("Method 4");
	}
	
	void add(char c) {
		System.out.println("Method 1");
	}
	
	void add(double b) {
		System.out.println("Method 2");
	}
	
	void add(String d) {
		System.out.println("Method 3");
		
	}
	
	void add(double a,int b) {
		System.out.println("Method 4");
	}

	public static void main(String[] args) {
		System.out.println("Static Methods");
		add(10);
		add('S',200.0);
		add(true);
		add("Suriya",100);
		
		System.out.println("Non -Static Methods");
		Assignment_Method_Overloading a1 = new Assignment_Method_Overloading();
		a1.add('s');
		a1.add(10.0);
		a1.add("Suriya");
		a1.add(300,30);
		

	}

}
