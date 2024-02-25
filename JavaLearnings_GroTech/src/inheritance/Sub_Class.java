package inheritance;
class Super_Class{
	
	Super_Class(int a,double b)
	{
		System.out.println("Parent Constructor");
	}
}
public class Sub_Class extends Super_Class{
	
	Sub_Class()
	{
		//Super Calling statement is used to call the parent class constructor from the child class constructor
		//If we dont write Super calling statement ,it is implicitly present for non-para
		//super();//it is explicitly called for non-para
		super(10,65);//Super calling statement with para -explicity need to be called
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		new Sub_Class();
		

	}

}
