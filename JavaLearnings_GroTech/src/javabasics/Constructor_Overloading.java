package javabasics;

public class Constructor_Overloading {
	
	 Constructor_Overloading()
	 {
		 System.out.println("1");
	 }

	 Constructor_Overloading(int a)
	 {
		 System.out.println("2");
	 }
	 
	 Constructor_Overloading(String a,int b)
	 {
		 System.out.println("3");
	 }
     
	 Constructor_Overloading(String a)
	 {
		 System.out.println("4");
	 }
	 Constructor_Overloading(String a,int b,char c)
	 {
		 System.out.println("5");
	 }
	public static void main(String[] args) {
		new Constructor_Overloading();//
		new Constructor_Overloading(100);
		new Constructor_Overloading("India",10);
		new Constructor_Overloading("Suriya");
		new Constructor_Overloading("Suriya",30,'s');

	}

}
