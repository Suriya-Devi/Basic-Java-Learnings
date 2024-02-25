package practice;

public class Demo {
	static void add() {
		System.out.println("1");
	}

	static void add(int a) {
		System.out.println("2");
	}

	static void add(int a, double b) {
		System.out.println("3");
	}

	static void add(String s) {
		System.out.println("4");
	}

	void add(char c) {
		System.out.println("5");
	}

	void add(int b, char c) {
		System.out.println("6");
	}

	void add(int a, double b, char c) {
		System.out.println("7");
	}

	void add(String s, int a) {
		System.out.println("8");
	}

	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println("Non-static methods");
		d1.add('g');
		d1.add(10, 's');
		d1.add("Suriya", 10);
		d1.add(0, 0.0, 'd');
		System.out.println("Static Methods");
		add();
		add(30);
		add(20,90);
		add("Sudi");
		
	}

}
