package javabasics;

public class LogicalOperators {
// Assignment 12 - OR operators
	public static void main(String[] args) {
		int age=19;
		//char gender='M';
		int salary = 10000;
		
		//Logical OR Operator
		/*if(age>18 || gender=='M')//both conditions are true then o/p is true
		{
			System.out.println("I am eligible to vote");
		}
		else
		{
			System.out.println("I am not eligible to vote");
		}
		
		if(age<18 || gender=='C')//both conditions are false then o/p is false
		{
			System.out.println("I am eligible to vote");
		}
		else
		{
			System.out.println("I am not eligible to vote");
		}
		
		
	
		//Assignment 13 -Logical And Operator
		
		
		if(age<18 && salary==2000)//Both the conditions are false,o/p is false
		{
			System.out.println("I am eligible to vote");
		}
		else {
			System.out.println("I am not eligible to vote");
		}
	
		*/
		
		
	
		//Assignment 14 -Logical OR with NOT operator
		
		if(!(age>18 || salary>7000))
		{
			System.out.println("Ready");
		}
		else
		{
			System.out.println("Not Ready");
		}

		
		//Logical And with NOT operator
		if(!(age<18 && salary==10000)) {
			System.out.println("And with NOT operator - Ready");
		}
		else {
			System.out.println("And with NOT operator -Not Ready");
		}
		
	}

}
