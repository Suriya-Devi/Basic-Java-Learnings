package javabasics;

public class GlobalVariable {
	
	static int age;
	static double salary=9003.34;
	       char gender = 'M';//declaration and initialisation of gender variable with char datatype
	       

	 void add() {
		 int a=100;
		 int b=200;
		 System.out.println(a+b);
		
	}
	
	static void subtract(){
		
		System.out.println(age);
		System.out.println(salary);
		
	}
	public static void main(String[] args) {
		System.out.println(age);
		System.out.println(salary);
		GlobalVariable g=new GlobalVariable();
	    System.out.println(g.gender);
	    subtract();

	}

}
