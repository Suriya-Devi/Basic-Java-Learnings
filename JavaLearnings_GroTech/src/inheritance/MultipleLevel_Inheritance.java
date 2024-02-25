package inheritance;
interface Parent2{
	void sub();
}
interface Parent1{
	void add();
	
}


public class MultipleLevel_Inheritance implements Parent1,Parent2{
	
	void div() {
		System.out.println("Concrete method 1");
	}
	
	static void div(int a) {
		System.out.println("Concrete method 2");
	}
	

	public static void main(String[] args) {
		MultipleLevel_Inheritance m1=new MultipleLevel_Inheritance();
		m1.add();
		m1.sub();
		m1.div();
		div(4);
	}

	@Override
	public void sub() {
		System.out.println("Real Logic 1");
		
	}

	@Override
	public void add() {
		System.out.println("Real Logic 2");
		
	}

}
