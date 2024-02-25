package assignments;

public class Assignment_20_IIB {
	Assignment_20_IIB(){
		System.out.println("Constructor");
	}
	

	{
		System.out.println("IIB 1");
	}
	
	{
		System.out.println("IIB 2");
	}
	static
	{
		System.out.println("SIB");
	}
	public static void main(String[] args) {
		Assignment_20_IIB a = new Assignment_20_IIB();
		Assignment_20_IIB a1 = new Assignment_20_IIB();
		
		System.out.println("Main Method");

	}

}
