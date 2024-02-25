package assignments;

public class Assignment_Constructor_Overloading {
	Assignment_Constructor_Overloading()
	{
		System.out.println("Constructor 1");
	}
	
	Assignment_Constructor_Overloading(int a)
	{
		System.out.println("Constructor 2");
	}
	
	Assignment_Constructor_Overloading(boolean a,int b)
	{
		System.out.println("Constructor 3");
	}
	
	Assignment_Constructor_Overloading(double d,String s)
	{
		System.out.println("Constructor 4");
	}
	
	Assignment_Constructor_Overloading(String d,double a)
	{
		System.out.println("Constructor 5");
	}
	
	Assignment_Constructor_Overloading(char c)
	{
		System.out.println("Constructor 6");
	}
	
	Assignment_Constructor_Overloading(int a,double b,char c)
	{
		System.out.println("Constructor 7");
	}
	
	Assignment_Constructor_Overloading(char a,String s,int b)
	{
		System.out.println("Constructor 8");
	}
	
	Assignment_Constructor_Overloading(boolean B)
	{
		System.out.println("Constructor 9");
	}
	
	Assignment_Constructor_Overloading(String a)
	{
		System.out.println("Constructor 10");
	}

	public static void main(String[] args) {
		
	      new Assignment_Constructor_Overloading();
	      new Assignment_Constructor_Overloading(10);
	      new Assignment_Constructor_Overloading(false,20);
	      new Assignment_Constructor_Overloading(35.5,"Sudiksha");
	      new Assignment_Constructor_Overloading("Hanishka",72.9);
	      new Assignment_Constructor_Overloading('S');
	      new Assignment_Constructor_Overloading(50,73.1,'H');
	      new Assignment_Constructor_Overloading('v',"Selvaraj",40);
	      new Assignment_Constructor_Overloading(true);
	      new Assignment_Constructor_Overloading("Suriya");

	}
	
}
