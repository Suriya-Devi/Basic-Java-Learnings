package inheritance;

public class City_Class extends State_Class{
	void mul() {
		System.out.println("Multiplication");
	}
	
	void div() {
		System.out.println("Division");
	}

	public static void main(String[] args) {
		add();
       City_Class c1=new City_Class();
       c1.div();
       c1.mul();
       c1.sub();
       


	}

}
