package javabasics;

public class Nested_if_Else_Cond {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=300;
		String gender1= "Male";
		String gender2= "Female";
		String gender3= "Custom";
		
		/*if(a==b)//false
		{
			
			if(a==c)
			{
				System.out.println("1");
			}
			else {
				System.out.println("2");	
			}
		}
		
		else
		{
			System.out.println("3");//3
		}
	
	}
	*/
	
	/*
	  if(c>b)//true
	 
	{
		
		if(a<b)//true
		{
			System.out.println("1");//1
		}
		else {
			System.out.println("2");	
		}
	}
	
	else
	{
		System.out.println("3");
	}
*/
		if(c>b)//true
		{
			
			if(a>b)//false
			{
				System.out.println("1");
			}
			else {
				System.out.println("2");	//2
			}
		}
		
		else
		{
			System.out.println("3");
		}


		if(c>b)//true
		{
			
			if(a>b)//false
			{
				if(gender1=="Custom") {
					
				}
				
			}
			else {
				System.out.println("2");	//2
			}
		}
		
		else
		{
			System.out.println("3");
		}
	}
}


