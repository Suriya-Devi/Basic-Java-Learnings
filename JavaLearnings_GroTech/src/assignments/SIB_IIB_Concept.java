package assignments;

public class SIB_IIB_Concept {
	
	static
	{
		System.out.println("SIB");
	}
	
	//Constructor
	SIB_IIB_Concept(){
		
		System.out.println("Constructor");
	}
	{
		System.out.println("IIB");//IIB is invoked when we create an object
	}
	
	{
		System.out.println("IIB");//IIB is invoked when we create an object
	}
	
	{
		System.out.println("IIB");//IIB is invoked when we create an object
	}

	public static void main(String[] args) {
		
		//SIB_IIB_Concept s = new SIB_IIB_Concept();or
		  new SIB_IIB_Concept();
		  new SIB_IIB_Concept();
		//SIB_IIB_Concept s1 = new SIB_IIB_Concept();
		//SIB_IIB_Concept s2 = new SIB_IIB_Concept();
		System.out.println("Main method");

	}

}
