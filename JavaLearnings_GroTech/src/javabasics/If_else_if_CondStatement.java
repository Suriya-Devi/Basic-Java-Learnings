package javabasics;

public class If_else_if_CondStatement {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		
	if(a<b) //true -Any first condition is true,that will be executed and remaining
			//will be ignored by java
		{
		System.out.println("1");
		}
			
		
		
		else if(a!=b)//true
	    {
			
			System.out.println("2");	
		}
		
		else 
		{
			
			System.out.println("3");
			
		}
	
		
	
	
	/*	if(a<b) 
		{
			System.out.println("2");	
			
		}

		else if(a!=b)//true
	    {
			
			System.out.println("2");	
		}
		
		else if(a<=b)//true
	    {
			
			System.out.println("2");	
		}
		else 
		{
			
			System.out.println("3");
			
		}
		*/
		
	}

}
