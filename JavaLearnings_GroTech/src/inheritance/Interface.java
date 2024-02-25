package inheritance;

interface One{
	void add();
	void subtract();
}

public class Interface implements One {
	
	void method1() {
		System.out.println("Concrete method 1");
	}
	
	void method2() {
		System.out.println("Concrete method 2");
	}
	public static void main(String[] args) {
		Interface i = new Interface();
		i.add();
		i.subtract();
		i.method1();
		i.method2();

	}

	@Override
	public void add() {
		
		System.out.println("Real Logic 1");
	}

	@Override
	public void subtract() {
		System.out.println("Real Logic 2");
		
	}

}
