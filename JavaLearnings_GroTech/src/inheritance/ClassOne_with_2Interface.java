package inheritance;
interface Two {
	void mod();
	void sub();
}

interface OneInterface extends Two{
	 void mul();
	 void div();

}
public class ClassOne_with_2Interface implements OneInterface {
	void method1() {
		System.out.println("Concrete method 1");
	}
	
	void method2() {
		System.out.println("Concrete method 2");
	}

	public static void main(String[] args) {
		ClassOne_with_2Interface c1=new ClassOne_with_2Interface();
		c1.mul();
		c1.div();
		c1.method1();
		c1.method2();
		c1.mod();
		c1.sub();

	}

	
	public void mod() {
		System.out.println("Real Logic 1");
		
	}


	public void sub() {
		System.out.println("Real Logic 2");
		
	}

	
	public void mul() {
		System.out.println("Real Logic 3");
		
	}

	
	public void div() {
		System.out.println("Real Logic 4");
		
	}

}
