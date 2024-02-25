package practice;

import java.util.Scanner;

public class Prime_Number {
	
	public static void main(String[] args) {
		//isPrime(50);
		//To check the given number is prime or not
		/* System.out.println("Enter a number ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			primeCal(n);
			}
		   static void primeCal(int num)
		   {
			int count=0;
			for(int i=1;i<=num;i++)
			{
			   if(num%i==0)
			   {
			        count++;	        
			   }
			}
			if(count==2)
			       System.out.println("prime number ");
			else
			System.out.println("Not a prime number "); */

		//To Find Prime Numbers Between 1 to n Numbers
			int i,count;
            System.out.print("Enter n value : ");
	   Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
            System.out.println("Prime numbers between 1 to "+n+" are ");
	for(int j=2;j<=n;j++)
	{
	    count=0;
	for( i=1;i<=j;i++)
	{
	   if(j%i==0)
	   {
		   
	        count++;   
	       //System.out.println(count +" "+j);
	   }
	}
	if(count==2)
	       System.out.print(j+"  ");    
	
	}
	}

}
