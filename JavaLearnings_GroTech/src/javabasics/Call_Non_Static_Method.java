package javabasics;

public class Call_Non_Static_Method {
	
	void add() {
		int a=100;
		int b=200;
		
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		//How to call Non-static Methods? 
		//By creating the object with the help of its reference variable
		Call_Non_Static_Method c1 = new Call_Non_Static_Method();
		c1.add();

	}

}
