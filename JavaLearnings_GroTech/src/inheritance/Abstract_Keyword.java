package inheritance;
abstract class Grand_Parent{
	abstract void add();
	void sub(int a,char c) {
		System.out.println("Concrete method 1");
	}
}

abstract class Parent_Abs extends Grand_Parent{
	abstract void sub();
	
	void mul(int a) {
		System.out.println("Concrete method 2");
	}
	
	void div(int a) {
		System.out.println("Concrete method 3");
	}
	
}

public  class Abstract_Keyword extends Parent_Abs{
	void mul() {
		System.out.println("Concrete method 4");
	}
	
	public static void main(String[] args) {
		Abstract_Keyword a1 = new Abstract_Keyword();
		a1.mul();
		a1.mul(10);
		a1.div(20);
		a1.add();
		a1.sub();
		a1.sub(5, 's');

	}

	
	void add() {
		System.out.println("Abstrsact method 1 -Internal logic");
		
	}

	
	void sub() {
		System.out.println("Abstrsact method 2 -Internal logic");
		
	}

}
