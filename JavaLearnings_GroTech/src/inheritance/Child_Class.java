package inheritance;

abstract class Parent_Class //eg-GrotechMinds - expose with google or facebook
//abstract class - Any class which has abstract method
//An abstract class can have abstract method and concrete method as well
{
	
	abstract void add();//abstract method - Any method which does not have implementation that is body
	//Abstract method will always be non-static
	abstract void subtract();
	
	void mul()//concrete method which is non-static
	{
		System.out.println("It is a logic which I am exposing");
	}
	
	 static void modulus()//Concrete method which is static
	 {
		System.out.println("It is a logic 2 which I am exposing");
	}
	
}



public class Child_Class extends Parent_Class //GrotechMinds
{
	void add() //Concrete method - Any method which has implementation
	{
		
		System.out.println("Real Logic 1 ");
	}

	public static void main(String[] args)  //concrete method
	{
		Child_Class c1=new Child_Class();
		c1.add();
		c1.subtract();
		c1.mul();
		modulus();

	}


	
	void subtract() //concrete method
	{
		System.out.println("Real Logic 2");
		
	}

}
